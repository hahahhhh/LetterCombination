package entity.keyboard;

public class KeyBoard_Stage2 extends KeyBoard_Stage1 {
    @Override
    public KeyBoard_Stage1 dial(int... is) {
        StringBuilder sb = new StringBuilder();
        for (int i : is) {
            if (i == 1 || i == 0) continue;
            if (i > 99) {
                result.clear();
                result.add("Your Input is out of valid range,we only accept 0 to 99 as parameters");
                return this;
            }
            sb.append(i);
        }
        combine("", sb.toString());
        return this;
    }
}

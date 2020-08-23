package entity.keyboard;

public class KeyBoard_Stage2 extends KeyBoard_Stage1 {
    @Override
    public KeyBoard_Stage1 dial(int... is) {
        StringBuilder sb = new StringBuilder();
        for (int i : is) {
            if (i > 99) {
                result.clear();
                result.add("Your Input is out of valid range,we only accept 0 to 99 as parameters");
                return this;
            }
            char[] tmp = Integer.toString(i).toCharArray();
            for (char c:tmp){
                if (c=='1' || c == '0') continue;
                sb.append(c);
            }
        }
        combine("", sb.toString());
        return this;
    }
}

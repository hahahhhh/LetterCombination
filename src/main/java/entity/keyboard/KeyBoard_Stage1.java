package entity.keyboard;

import entity.key.Key;

import java.util.ArrayList;
import java.util.List;

public class KeyBoard_Stage1 {
    protected final List<String> result = new ArrayList<String>();

    public KeyBoard_Stage1 dial(int... is) {
        StringBuilder sb = new StringBuilder();
        for (int i : is) {
            if (i == 1 || i == 0) continue;
            if (i > 9) {
                result.clear();
                result.add("Your Input is out of valid range,we only accept 0 to 9 as parameters");
                return this;
            }
            sb.append(i);
        }
        combine("", sb.toString());
        return this;
    }

    public String output() {
        StringBuilder sb = new StringBuilder();
        for (String s : this.result) {
            sb.append(s).append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    public void clear() {
        result.clear();
    }

    private String getString(String s) {
        int i = Integer.parseInt(s);
        Key key = new Key(i);
        return key.toString();
    }

    protected void combine(String sGroup, String nums) {
        if (nums.length() == 0) {
            result.add(sGroup);
        } else {
            String num = nums.substring(0, 1);
            String letters = getString(num);
            for (int i = 0; i < letters.length(); i++) {
                String letter = getString(num).substring(i, i + 1);
                combine(sGroup + letter, nums.substring(1));
            }
        }
    }


}

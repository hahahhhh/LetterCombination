package entity;

import java.util.ArrayList;
import java.util.List;

public class KeyBoard {
    private final List<String> result = new ArrayList<String>();

    public KeyBoard dial(int... is) {
        StringBuilder sb = new StringBuilder();
        for (int i : is) {
            if (i == 1 || i == 0) continue;
            if (i > 99) {
                result.clear();
                result.add("Your Input is out of valid range");
                return this;
            }
            sb.append(i);
        }
        backtrack("", sb.toString());
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

    private void backtrack(String sGroup, String nums) {
        if (nums.length() == 0) {
            result.add(sGroup);
        } else {
            String num = nums.substring(0, 1);
            String letters = getString(num);
            for (int i = 0; i < letters.length(); i++) {
                String letter = getString(num).substring(i, i + 1);
                backtrack(sGroup + letter, nums.substring(1));
            }
        }
    }


}

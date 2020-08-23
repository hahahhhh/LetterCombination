package Stage1_test;

import entity.keyboard.KeyBoard_Stage1;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LetterCombinationTest_ZeroToNine {
    KeyBoard_Stage1 keyBoard = null;
    String unvalid = "Your Input is out of valid range,we only accept 0 to 9 as parameters";
    String blank = "";

    /*
     * Input is a Integer Array.
     * Range is 0 to 9
     * */
    @Before
    public void init() {
        keyBoard = new KeyBoard_Stage1();
    }

    @Test
    public void LetterCombinationTest_WithoutZeroAndOne() {
        int[] input1 = {2};
        String expectedResult1 = "a b c";

        Assert.assertEquals(expectedResult1, keyBoard.dial(input1).output());
        keyBoard.clear();

        int[] input2 = {2, 3};
        String expectedResult2 = "ad ae af bd be bf cd ce cf";
        Assert.assertEquals(expectedResult2, keyBoard.dial(input2).output());
        keyBoard.clear();

        int[] input3 = {4,5};
        String expectedResult3 = "gj gk gl hj hk hl ij ik il";
        Assert.assertEquals(expectedResult3, keyBoard.dial(input3).output());
        keyBoard.clear();

        int[] input4 = {9, 8, 7};
        String expectedResult4 = "wtp wtq wtr wts wup wuq wur wus wvp wvq wvr wvs " +
                "xtp xtq xtr xts xup xuq xur xus xvp xvq xvr xvs ytp ytq ytr yts " +
                "yup yuq yur yus yvp yvq yvr yvs stp stq str sts sup suq sur sus " +
                "svp svq svr svs";
        Assert.assertEquals(expectedResult4, keyBoard.dial(input4).output());
        keyBoard.clear();

        int[] input5 = {2,100};
        Assert.assertEquals(unvalid, keyBoard.dial(input5).output());

    }

    @Test
    public void LetterCombinationTest_WithZeroAndOne() {
        int[] input1 = {0};
        Assert.assertEquals(blank, keyBoard.dial(input1).output());
        keyBoard.clear();

        int[] input2 = {1};
        Assert.assertEquals(blank, keyBoard.dial(input2).output());
        keyBoard.clear();

        int[] input3 = {0, 1};
        Assert.assertEquals(blank, keyBoard.dial(input3).output());
        keyBoard.clear();

        int[] input4 = {1, 5};
        String expectedResult1 = "j k l";
        Assert.assertEquals(expectedResult1, keyBoard.dial(input4).output());
        keyBoard.clear();

        int[] input5 = {0, 5};
        String expectedResult3 = "j k l";
        Assert.assertEquals(expectedResult3, keyBoard.dial(input5).output());
        keyBoard.clear();


        int[] input6 = {0, 1, 3, 6};
        String expectedResult2 = "dm dn do em en eo fm fn fo";
        Assert.assertEquals(expectedResult2, keyBoard.dial(input6).output());
        keyBoard.clear();

        int[] intput6 = {0, 100, 1};
        Assert.assertEquals(unvalid, keyBoard.dial(intput6).output());


    }

}

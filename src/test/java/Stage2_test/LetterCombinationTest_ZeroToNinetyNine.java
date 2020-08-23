package Stage2_test;

import entity.keyboard.KeyBoard_Stage1;
import entity.keyboard.KeyBoard_Stage2;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LetterCombinationTest_ZeroToNinetyNine {
    KeyBoard_Stage1 keyBoard = null;
    String unvalid = "Your Input is out of valid range,we only accept 0 to 99 as parameters";
    String blank = "";

    /*
     * Input is a Integer Array.
     * Range is 0 to 99
     * */
    @Before
    public void init() {
        keyBoard = new KeyBoard_Stage2();
    }


    @Test
    public void LetterCombinationTest_ZeroToNinetyNine_WithoutZeroAndOne() {
        int[] input1 = {99};
        String expectedResult1 = "ww wx wy ws xw xx xy xs yw yx yy ys sw sx sy ss";
        Assert.assertEquals(expectedResult1, keyBoard.dial(input1).output());
        keyBoard.clear();

        int[] input2 = {54};
        String expectedResult2 = "jg jh ji kg kh ki lg lh li";
        Assert.assertEquals(expectedResult2, keyBoard.dial(input2).output());
        keyBoard.clear();

        int[] input3 = {100};
        Assert.assertEquals(unvalid, keyBoard.dial(input3).output());
        keyBoard.clear();

        int[] input4 = {6, 99};
        String expectedResult3 = "mww mwx mwy mws mxw mxx mxy mxs myw myx myy mys msw msx msy mss" +
                " nww nwx nwy nws nxw nxx nxy nxs nyw nyx nyy nys nsw nsx nsy nss" +
                " oww owx owy ows oxw oxx oxy oxs oyw oyx oyy oys osw osx osy oss";
        Assert.assertEquals(expectedResult3, keyBoard.dial(input4).output());

    }

    @Test
    public void LetterCombinationTest_ZeroToNinetyNine_WithZeroAndOne() {

        int[] input1 = {0};
        Assert.assertEquals(blank, keyBoard.dial(input1).output());
        keyBoard.clear();

        int[] input2 = {1};
        Assert.assertEquals(blank, keyBoard.dial(input2).output());
        keyBoard.clear();

        int[] input3 = {0, 1, 100};
        Assert.assertEquals(unvalid, keyBoard.dial(input3).output());
        keyBoard.clear();

        int[] input4 = {100};
        Assert.assertEquals(unvalid, keyBoard.dial(input4).output());
        keyBoard.clear();

        int[] input5 = {0, 99};
        String expectedResult1 = "ww wx wy ws xw xx xy xs yw yx yy ys sw sx sy ss";
        Assert.assertEquals(expectedResult1, keyBoard.dial(input5).output());
        keyBoard.clear();

        int[] input6 = {0, 6, 99};
        String expectedResult2 = "mww mwx mwy mws mxw mxx mxy mxs myw myx myy mys msw msx msy mss" +
                " nww nwx nwy nws nxw nxx nxy nxs nyw nyx nyy nys nsw nsx nsy nss" +
                " oww owx owy ows oxw oxx oxy oxs oyw oyx oyy oys osw osx osy oss";
        Assert.assertEquals(expectedResult2, keyBoard.dial(input6).output());

    }
}

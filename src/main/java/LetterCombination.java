import entity.KeyBoard;

public class LetterCombination {
    public static void main(String[] args) {
        KeyBoard keyBoard = new KeyBoard();
        int[] arr = {1,2,3};
        System.out.println(keyBoard.dial(arr).output());
    }
}

package entity.key;

public class
Key {
    private String kString;

    public Key(int i) {
        switch (i) {
            case 2:
                this.kString = "abc";
                break;
            case 3:
                this.kString = "def";
                break;
            case 4:
                this.kString = "ghi";
                break;
            case 5:
                this.kString = "jkl";
                break;
            case 6:
                this.kString = "mno";
                break;
            case 7:
                this.kString = "pqrs";
                break;
            case 8:
                this.kString = "tuv";
                break;
            case 9:
                this.kString = "wxys";
                break;
        }
    }

    @Override
    public String toString() {
        return kString;
    }

}

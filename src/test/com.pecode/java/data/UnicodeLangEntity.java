package data;

public class UnicodeLangEntity {
    private char firstLetter;
    private int lettersCount;

    public UnicodeLangEntity(char firstLetter, int lettersCount) {
        this.firstLetter = firstLetter;
        this.lettersCount = lettersCount;
    }

    public char getFirstLetter() {
        return firstLetter;
    }

    public void setFirstLetter(char firstLetter) {
        this.firstLetter = firstLetter;
    }

    public int getLettersCount() {
        return lettersCount;
    }

    public void setLettersCount(int lettersCount) {
        this.lettersCount = lettersCount;
    }
}

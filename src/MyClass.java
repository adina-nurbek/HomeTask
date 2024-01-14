import java.util.Arrays;

public class MyClass {
    private int number;
    private String word;
    public int[] array;

    public MyClass() {
    }

    public MyClass(int number, String word, int[] array) {
        this.number = number;
        this.word = word;
        this.array = array;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "number=" + number +
                ", word='" + word + '\'' +
                ", array=" + Arrays.toString(array) +
                '}';
    }


}
package kz.example;

public class MyArrayDataException  extends RuntimeException {
    int i;
    int j;
    String s;
    public MyArrayDataException(String s, int i, int j) {
        super("array element is not a number: "+ s +" i="+ i + ", j=" + j);
    }
}

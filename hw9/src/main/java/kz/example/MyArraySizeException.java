package kz.example;

public class MyArraySizeException extends RuntimeException {

    public MyArraySizeException() {
        super("array size does not match 4x4");
    }
}

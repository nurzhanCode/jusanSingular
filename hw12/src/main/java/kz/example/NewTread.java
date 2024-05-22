package kz.example;

import static java.lang.Math.sin;

public class NewTread extends Thread {
    int size;
    float[] arr = new float[size];

    public NewTread(int size, float[] arr) {
        this.size = size;
        this.arr = arr;
    }
    @Override
    public void run() {
        for ( int i = 0; i < size; i++ ) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }
}

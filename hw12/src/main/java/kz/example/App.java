package kz.example;


public class App {
    static final int size= 10000000;
    static final int h = size / 2;
    static float[] arr = new float[size];
    static float[] a1 = new float[h];
    static float[] a2 = new float[h];

    public static void main( String[] args ) {

        long a = System.currentTimeMillis();
        for ( int i = 0; i < size; i++ ) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        long b = System.currentTimeMillis();
        System.out.println( "time:" + (b - a) );


        long t1 = System.currentTimeMillis();
        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);

        NewTread tread1 = new NewTread(h,a1);
        NewTread tread2 = new NewTread(h,a2);
        tread1.start();
        tread2.start();

        try {
            tread1.join();
            tread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);

        long t2 = System.currentTimeMillis();
        System.out.println( "time:" + (t2 - t1) );


    }
}

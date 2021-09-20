package Ch1.Ch1_1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Sattolo {
    private Sattolo() { }

    public static void cycle(Object[] a) {
        int n = a.length;
        for(int i = n; i > 1; i--) {
            int r = (int)(Math.random() * (i - 1));
            Object swap = a[r];
            a[r] = a[i - 1];
            a[i - 1] = swap;
        }
    }

    public static void main(String[] args) {
        String[] a = StdIn.readAllStrings();

        Sattolo.cycle(a);

        for(int i = 0; i < a.length; i++)
            StdOut.println(a[i]);
    }
}

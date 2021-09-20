package Ch1.Ch1_2;


import edu.princeton.cs.algs4.*;

public class AccumulatorTest {

    public static void main(String[] args) {
        
        int T = Integer.parseInt(args[0]);
        Accumulator a = new Accumulator();
        for(int t = 0; t < T; t++) {
            a.addDataValue(StdRandom.uniform());
        }
        StdOut.println(a);

    }
}

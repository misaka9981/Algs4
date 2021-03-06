package Ch1.Ch1_2;

import edu.princeton.cs.algs4.*;;

public class FlipsMax {
    
    public static Counter max(Counter x, Counter y) {
        if(x.tally() > y.tally()) {
            return x;
        }
        return y;
    }

    public static void main(String[] args) {
        int T = Integer.parseInt(args[0]);
        Counter heads = new Counter("heads");
        Counter tails = new Counter("tails");
        for(int t = 0; t < T; t++) {
            if(StdRandom.bernoulli(.5))
                heads.increment();
            else
                tails.increment();
        }
        
        if(heads.tally() == tails.tally())
            StdOut.println("Tie");
        else
            StdOut.println(max(heads, tails) + " wins");
    }

}

package Ch1.Ch1_2;

import edu.princeton.cs.algs4.*;

public class WhiteList {
    public static void main(String[] args) {
        int[] w = In.readInts(args[0]);
        StaticSETofInts seTofInts = new StaticSETofInts(w);
        while(!StdIn.isEmpty()) {
            // 读取键，如果不在白名单中则打印它
            int key = StdIn.readInt();
            if(!seTofInts.contains(key))
                StdOut.println(key);
        }
    }
}

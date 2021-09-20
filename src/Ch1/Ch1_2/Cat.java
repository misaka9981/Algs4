package Ch1.Ch1_2;

import edu.princeton.cs.algs4.*;

public class Cat {

    public static void main(String[] args) {
        // 将所有输入文件复制到输出流（最后一个参数）中
        Out out = new Out(args[args.length - 1]);
        for(int i = 0; i < args.length - 1; i++) {
            // 将第 i 个输入文件复制到输出流中
            In in = new In(args[i]);
            String str = in.readAll();
            out.println(str);
            in.close();
        }
        out.close();

    }
}

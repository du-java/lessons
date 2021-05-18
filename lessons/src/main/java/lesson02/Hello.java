package lesson02;

public class Hello {
    public static void main(String[] args) {

        byte b1 = 1;
        byte b2 = 1;

        byte b3 = (byte) (b1 + b2);

        long l1 = 2150000000L;

        int i1 = 2_140_000_000;

        float f1 = 3.5f;
        float f2 = 3.5f;
        float f3 = 3.5f;

        byte b4 = (byte) (f1 + f2 + f3);

        long l2 = (long) (l1 + f1);

        {
            int x, y = 2, z = 1;
//            x = (y = 1) + (z = 1);
            y = 1;
            z = 2;
            x = y + z;
        }
//        x = y + z;

        short s1 = (short) 54123;
        // byte 128 64 32 16 8421

        //        0  1  0  1 1001

        //        0  0  0  0 0000

        //        0  64 0  16 8001 = 89

        // 0000
        // 8421
        // 0000

        // 0010
        // 8421
        // 0+0+2+0 = 2
        //
        // 1111
        // 8421
        // 8+4+2+1 = 0-15

        double a = 0.02;
        double b = 0.03;
        double c = b - a;
        System.out.println(c);
        c = (b * 100 - a * 100) / 100;
        System.out.println(c);

        System.out.println(s1);
    }
}

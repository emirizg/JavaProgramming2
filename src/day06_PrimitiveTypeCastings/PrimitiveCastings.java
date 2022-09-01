package day06_PrimitiveTypeCastings;

public class PrimitiveCastings {

    public static void main(String[] args){

        // double > float > long > int > short > byte
        // smaller primitives can be directly assigned to larger primitive type
        // larger primitives can NOT be directly assigned to smaller primitive types, need to be casted manually

        byte a= 100;
        short b =a;
       // short b = (short)a;
        //   (short)a

        int c= b;
        // int c = (int)b that is compiler does in background, implicit casting can be done automaticly

        long d= c;
        //  long(c)

        float e = d;
        double f= e;

        System.out.println("--------------------------");

        int x= 55;
        short y= (short)x; // explicit casting, you must do manually every single time, by yourself

        System.out.println(x + " : " + y);

        long j= 1000_000;
        short k= (short)j;

        System.out.println(j + " : " + k);

        double l = 2.5;
        float m = (float)l;

        System.out.println(l + " : " + m);

        double n = 10.8;
        int s = (int)n; // it will take only integer part : 10

        System.out.println(n +" : "+ s );

        System.out.println("----------------------");

        double d1=20.5;
        short s1= (short) d1;

        System.out.println(d1+" : "+s1);

        float f1=30.5F;
        long l1= (long) f1;



    }

}

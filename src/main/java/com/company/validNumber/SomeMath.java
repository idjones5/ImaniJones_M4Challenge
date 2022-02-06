package com.company.validNumber;

public class SomeMath {

    public static int total5(int x, int y, int z, int a, int b){
        return x + y + z + a + b;
    }

    public static int average5(int x, int y, int z, int a, int b){
        double avg = ((x + y + z + a + b) / 5);
        return (int) avg;
    }

    public static double largest5(double x, double y, double z, double a, double b){
        return Math.max(Math.max(Math.max(Math.max(x,y),z),a),b);


    }

    public static void main(String[] args) {

        System.out.println(total5(1,2,3,4,5));
        System.out.println(average5(1,3,5,7,9));
        System.out.println(largest5(42.0,35.1,2.3,40.2,15.6));

    }
}

package com.hemanth.inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box = new Box(12, 20, 10);
//        System.out.println(box.getL());
//        Box b1 = new Box(box); // can pass another box's instance variable
//        Box b2 = new Box(12);//this might be cube
//        Box b3 = new Box(); //no parameters

        // ----from here inheritance instances----
        BoxWeight boxWeight1 = new BoxWeight(5000, 50);
        System.out.println(boxWeight1.getL());
        System.out.println(boxWeight1.h);
        System.out.println(boxWeight1.weight);
        System.out.println(boxWeight1.w);

        BoxPrice boxPrice1 = new BoxPrice(boxWeight1, 3000);
        System.out.println(boxPrice1.getL());
        System.out.println(boxPrice1.h);
        System.out.println(boxPrice1.weight);
        System.out.println(boxPrice1.w);
        System.out.println(boxPrice1.cost);
        System.out.println(boxPrice1.cost + boxPrice1.weight);

        BoxPrice bPrice = new BoxPrice();
        System.out.println(bPrice.weight);
    }
}

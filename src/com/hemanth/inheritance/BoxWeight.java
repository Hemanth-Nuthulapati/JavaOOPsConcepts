package com.hemanth.inheritance;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight() {
        super();
        this.weight = -1;
    }

    public BoxWeight(double l , double h, double w, double weight) {
        super(l, h, w);
        this.weight = weight;
    }

   public BoxWeight(BoxWeight other){
        super(other);
        this.weight = other.weight;
   }

   public BoxWeight(double side, double weight){
        super(side);
        this.weight = weight;
   }

//    public static void main(String[] args) {
//        Box b = new BoxWeight(120, 30, 24, 49);
//        System.out.println(b.getL());
//    }
}

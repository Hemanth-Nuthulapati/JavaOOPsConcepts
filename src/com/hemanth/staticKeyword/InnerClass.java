package com.hemanth.staticKeyword;

public class InnerClass {
    static class Test{
        String name;

        public Test(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Test{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Hemanth");
        Test b = new Test("Pirate");

        System.out.println(a.name);
        System.out.println(b.name);

        System.out.println(a);   // this will invoke toString() method...
    }
}


//we cannot create Static classes like we always create normal classes
//But, create a static class inside a normal class i.e., inner static class
//which is created like above code... below code is not acceptable

//static class OuterClass{
//
//}

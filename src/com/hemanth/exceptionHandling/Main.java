package com.hemanth.exceptionHandling;

public class Main {
    public static void main(String[] args) {
         int a = 5;
         int b = 0;
         try {
//            Main.divide(a, b);
            String name = "rose";
            if(name.equals("rose")){
                throw new CustomException("this is hemanth");
            }
         }catch (CustomException e){
             System.out.println(e.getMessage());
         }
         catch (ArithmeticException e){
             System.out.println(e.getMessage());
         }
         catch (Exception e){
             System.out.println("This normal exception");
         }finally {
             System.out.println("This Block always execute irrespective of the Exception");
         }
    }
    static int divide(int a, int b) throws ArithmeticException{
        if(b == 0){
            throw new ArithmeticException("you cannot divide any number with ZERO!!!");
        }
        return a / b;
    }
}

package com.hemanth.enumExample;

public class Main {
    public static void main(String[] args) {
        FoodOrder order = new FoodOrder(1);
        order.trackOrder(); //Default one will be given as output

        order.UpdateStatus(OrderStatus.ACCEPTED);
        order.trackOrder();

        order.UpdateStatus(OrderStatus.COOKING);
        order.trackOrder();

        order.UpdateStatus(OrderStatus.DELIVERED);
        order.trackOrder();
    }
}

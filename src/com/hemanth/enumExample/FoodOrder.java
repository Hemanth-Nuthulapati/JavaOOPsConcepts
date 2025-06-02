package com.hemanth.enumExample;

public class FoodOrder {
    private int orderId;
    private OrderStatus status;

    public FoodOrder(int orderId) {
        this.orderId = orderId;
        status = OrderStatus.PLACED; //Default status
    }

    public void UpdateStatus(OrderStatus newStatus) {
        this.status = newStatus;
        System.out.println("Order #" + this.orderId + " Status Updated to " + this.status);
    }

    public void trackOrder(){
        switch (status){
            case PLACED -> System.out.println("Order is placed successfully!!");
            case COOKING -> System.out.println("your food is being prepared");
            case ACCEPTED -> System.out.println("your order is accepted!!!");
            case OUT_FOR_DELIVERY -> System.out.println("Delivery person is on the way");
            case DELIVERED -> System.out.println("Your Order is delivered");
            case CANCELLED -> System.out.println("your order is cancelled");
        }
    }
}

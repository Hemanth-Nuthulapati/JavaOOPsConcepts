package com.hemanth.polymorphism;
/*Example:---
Imagine you call a Customer Support number (say, 1800-HELP-ME).
The person who answers depends on:
📞 You always dial the same number (CustomerSupport).
🧑‍💼 But who actually answers — Billing, Tech, or Sales — depends on your request.
 */
// java's system decides which particular method to run in the run time

class CustomerSupport{
    void assist(){
        System.out.println("How can i help you?");
    }
}
class BillingSupport extends CustomerSupport{
    @Override
    void assist() {
        System.out.println("Billing department here. Let's talk money!");
    }
}
class TechSupport extends CustomerSupport{
    @Override
    void assist() {
        System.out.println("Tech department here. Let's fix stuff!");
    }
}
class SalesSupport extends CustomerSupport{
    @Override
    void assist() {
        System.out.println("Sales department here. Let's make a deal!");
    }
}

public class DynamicMethodDispatch {

    public static void main(String[] args) {
        CustomerSupport customerSupport;

        customerSupport = new CustomerSupport();
        customerSupport.assist();

        customerSupport = new BillingSupport();
        customerSupport.assist();

        customerSupport = new TechSupport();
        customerSupport.assist();

        customerSupport = new SalesSupport();
        customerSupport.assist();
    }
}

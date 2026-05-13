package chapter4.Section1_Class_Definitions.Ex_4_0_4_Billing_system;

public class BillingDialog {

    public static void main(String[] args) {
        System.out.println("Welcome to the law offices of");
        System.out.println("Saul Goodman");
        Bill yourBill = new Bill();
        yourBill.inputTimeWorked();
        yourBill.updateFee();
        yourBill.outputBill();
        System.out.println("We have placed a lien on your house.");
        System.out.println("It has been a pleasure to serve you.");
    }
}

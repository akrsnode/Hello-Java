package tst.classes.ex;

public class Payment {
    private String name;
    private double curPaid;
    private double priceToPay;
    private double overPaid;

    private boolean isPaid;

    public Payment(String name) {
        this.name = name;
    }

    public Payment(String name, double price) {
        this.name = name;
        this.priceToPay = price;
    }

    public void payForProduct(double money) {
        if (!isPaid) {
            curPaid = money;
            if (money == priceToPay) {
                priceToPay = 0;
                isPaid = true;
            } else if (money < priceToPay) {
                priceToPay -= money;
            } else {
                isPaid = true;
                overPaid = money - priceToPay;
            }
        }
    }

    public void getRaport() {
        if (isPaid) {
            System.out.println("Payment is finished.");
        } else {
            System.out.println("You need to pay "+priceToPay+"!");
        }

        if (overPaid>0) {
            System.out.println("You get back "+overPaid);
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getCurPaid() {
        return curPaid;
    }

    public double getPriceToPay() {
        return priceToPay;
    }

    public double getOverPaid() {
        return overPaid;
    }

    public boolean isPaid() {
        return isPaid;
    }
}

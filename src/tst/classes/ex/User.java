package tst.classes.ex;

public class User {

    private String id;
    private String firstName;
    private String lastName;
    private Payment [] payments = new Payment[3];

    public User(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void addPayment(Payment newPayment) {
        for (int i=0; i< payments.length; i++) {
            if (payments[i] == null) {
                payments[i] = newPayment;
                break;
            } else {
                System.out.println("Error: no more free payment slots.");
            }
        }
    }

    public void getPayment() {
        for (int i=0; i< payments.length; i++) {
            System.out.println(this.payments[i]);
        }
    }
}

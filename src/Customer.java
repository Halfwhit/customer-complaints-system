public class Customer {

    private int customerId;
    private String customerName;
    private String customerAddress;
    private String customerEmail;
    private String customerPhone;

    Customer(int customerId, String name, String address, String email, String phone){

    }

    public int getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    @Override
    public String toString() {
        return new String("CUSTOMER NAME: " +getCustomerName()
                                + "CUSTOMER ADDRESS: " +getCustomerAddress()
                                + "CUSTOMER EMAIL: " +getCustomerEmail()
                                + "CUSTOMER PHONE: " +getCustomerPhone());
    }
}

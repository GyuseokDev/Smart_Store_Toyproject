package Customer_Data;

public class Customer {
    private static int customerNum= 1000;
    private int serialNO;
    private String customerName;
    private String customerID;
    private int customerSpentTime;
    private int customerPayment;

    public Customer(){};


    public Customer(String customerName, String customerID, int customerSpentTime, int customerPayment){
        this.customerName = customerName;
        this.customerID = customerID;
        this.customerSpentTime = customerSpentTime;
        this.customerPayment = customerPayment;
        customerNum++;
        serialNO = customerNum;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public int getCustomerSpentTime() {
        return customerSpentTime;
    }

    public void setCustomerSpentTime(int customerSpentTime) {
        this.customerSpentTime = customerSpentTime;
    }

    public int getCustomerPayment() {
        return customerPayment;
    }

    public void setCustomerPayment(int customerPayment) {
        this.customerPayment = customerPayment;
    }

    public int getSerialNO() {
        return serialNO;
    }
}

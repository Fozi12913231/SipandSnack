package com.cust.sipnsnack.ManagerDashboard;

public class MyDeliveredOrders {
    private String customerUsername;
    private String customerName;
    private String customerPhoneNo;
    private String customerAddress;
    private String paymentType;
    private String totalQty;
    private String totalBill;
    private String acceptedBy;
    private String bikerUsername;
    private String bikerName;
    private String bikerPhoneNo;
    private String orderDate;
    private String orderTime;
    private String receiptImage;
    private String dbKey;
    private String addressType;

    public MyDeliveredOrders(String customerUsername, String customerName, String customerPhoneNo,
                             String customerAddress, String paymentType, String totalQty,
                             String totalBill, String acceptedBy, String bikerUsername,
                             String bikerName, String bikerPhoneNo, String orderDate,
                             String orderTime, String receiptImage, String dbKey, String adrType) {
        this.customerUsername = customerUsername;
        this.customerName = customerName;
        this.customerPhoneNo = customerPhoneNo;
        this.customerAddress = customerAddress;
        this.paymentType = paymentType;
        this.totalQty = totalQty;
        this.totalBill = totalBill;
        this.acceptedBy = acceptedBy;
        this.bikerUsername = bikerUsername;
        this.bikerName = bikerName;
        this.bikerPhoneNo = bikerPhoneNo;
        this.orderDate = orderDate;
        this.orderTime = orderTime;
        this.receiptImage = receiptImage;
        this.dbKey = dbKey;
        this.addressType = adrType;
    }

    public String getCustomerUsername() {
        return customerUsername;
    }

    public void setCustomerUsername(String customerUsername) {
        this.customerUsername = customerUsername;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPhoneNo() {
        return customerPhoneNo;
    }

    public void setCustomerPhoneNo(String customerPhoneNo) {
        this.customerPhoneNo = customerPhoneNo;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getTotalQty() {
        return totalQty;
    }

    public void setTotalQty(String totalQty) {
        this.totalQty = totalQty;
    }

    public String getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(String totalBill) {
        this.totalBill = totalBill;
    }

    public String getAcceptedBy() {
        return acceptedBy;
    }

    public void setAcceptedBy(String acceptedBy) {
        this.acceptedBy = acceptedBy;
    }

    public String getBikerUsername() {
        return bikerUsername;
    }

    public void setBikerUsername(String bikerUsername) {
        this.bikerUsername = bikerUsername;
    }

    public String getBikerName() {
        return bikerName;
    }

    public void setBikerName(String bikerName) {
        this.bikerName = bikerName;
    }

    public String getBikerPhoneNo() {
        return bikerPhoneNo;
    }

    public void setBikerPhoneNo(String bikerPhoneNo) {
        this.bikerPhoneNo = bikerPhoneNo;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public String getReceiptImage() {
        return receiptImage;
    }

    public void setReceiptImage(String receiptImage) {
        this.receiptImage = receiptImage;
    }

    public String getDbKey() {
        return dbKey;
    }

    public void setDbKey(String dbKey) {
        this.dbKey = dbKey;
    }

    public String getAddressType() {
        return addressType;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }
}

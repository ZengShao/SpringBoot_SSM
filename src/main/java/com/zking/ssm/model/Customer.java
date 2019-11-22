package com.zking.ssm.model;

import java.io.Serializable;
import java.util.Date;

public class Customer implements Serializable {
    private Long customerId;

    private String customerUsername;

    private String customerName;

    private Long customerTel;

    private String customerPassword;

    private String customerSalt;

    private Integer customerLevel;

    private String customerIdNumber;

    private String customerAddress;

    private String customerBank;

    private String customerBorrowMoney;

    private Long customerPeriods;

    private Date customerTime;

    private String customerStatus;

    private String customerBankPhoto;

    private String customerCardPhoto;

    public Customer(Long customerId, String customerUsername, String customerName, Long customerTel, String customerPassword, String customerSalt, Integer customerLevel, String customerIdNumber, String customerAddress, String customerBank, String customerBorrowMoney, Long customerPeriods, Date customerTime, String customerStatus, String customerBankPhoto, String customerCardPhoto) {
        this.customerId = customerId;
        this.customerUsername = customerUsername;
        this.customerName = customerName;
        this.customerTel = customerTel;
        this.customerPassword = customerPassword;
        this.customerSalt = customerSalt;
        this.customerLevel = customerLevel;
        this.customerIdNumber = customerIdNumber;
        this.customerAddress = customerAddress;
        this.customerBank = customerBank;
        this.customerBorrowMoney = customerBorrowMoney;
        this.customerPeriods = customerPeriods;
        this.customerTime = customerTime;
        this.customerStatus = customerStatus;
        this.customerBankPhoto = customerBankPhoto;
        this.customerCardPhoto = customerCardPhoto;
    }

    public Customer() {
        super();
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
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

    public Long getCustomerTel() {
        return customerTel;
    }

    public void setCustomerTel(Long customerTel) {
        this.customerTel = customerTel;
    }

    public String getCustomerPassword() {
        return customerPassword;
    }

    public void setCustomerPassword(String customerPassword) {
        this.customerPassword = customerPassword;
    }

    public String getCustomerSalt() {
        return customerSalt;
    }

    public void setCustomerSalt(String customerSalt) {
        this.customerSalt = customerSalt;
    }

    public Integer getCustomerLevel() {
        return customerLevel;
    }

    public void setCustomerLevel(Integer customerLevel) {
        this.customerLevel = customerLevel;
    }

    public String getCustomerIdNumber() {
        return customerIdNumber;
    }

    public void setCustomerIdNumber(String customerIdNumber) {
        this.customerIdNumber = customerIdNumber;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerBank() {
        return customerBank;
    }

    public void setCustomerBank(String customerBank) {
        this.customerBank = customerBank;
    }

    public String getCustomerBorrowMoney() {
        return customerBorrowMoney;
    }

    public void setCustomerBorrowMoney(String customerBorrowMoney) {
        this.customerBorrowMoney = customerBorrowMoney;
    }

    public Long getCustomerPeriods() {
        return customerPeriods;
    }

    public void setCustomerPeriods(Long customerPeriods) {
        this.customerPeriods = customerPeriods;
    }

    public Date getCustomerTime() {
        return customerTime;
    }

    public void setCustomerTime(Date customerTime) {
        this.customerTime = customerTime;
    }

    public String getCustomerStatus() {
        return customerStatus;
    }

    public void setCustomerStatus(String customerStatus) {
        this.customerStatus = customerStatus;
    }

    public String getCustomerBankPhoto() {
        return customerBankPhoto;
    }

    public void setCustomerBankPhoto(String customerBankPhoto) {
        this.customerBankPhoto = customerBankPhoto;
    }

    public String getCustomerCardPhoto() {
        return customerCardPhoto;
    }

    public void setCustomerCardPhoto(String customerCardPhoto) {
        this.customerCardPhoto = customerCardPhoto;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        if (customerId != null ? !customerId.equals(customer.customerId) : customer.customerId != null) return false;
        if (customerUsername != null ? !customerUsername.equals(customer.customerUsername) : customer.customerUsername != null)
            return false;
        if (customerName != null ? !customerName.equals(customer.customerName) : customer.customerName != null)
            return false;
        if (customerTel != null ? !customerTel.equals(customer.customerTel) : customer.customerTel != null)
            return false;
        if (customerPassword != null ? !customerPassword.equals(customer.customerPassword) : customer.customerPassword != null)
            return false;
        if (customerSalt != null ? !customerSalt.equals(customer.customerSalt) : customer.customerSalt != null)
            return false;
        if (customerLevel != null ? !customerLevel.equals(customer.customerLevel) : customer.customerLevel != null)
            return false;
        if (customerIdNumber != null ? !customerIdNumber.equals(customer.customerIdNumber) : customer.customerIdNumber != null)
            return false;
        if (customerAddress != null ? !customerAddress.equals(customer.customerAddress) : customer.customerAddress != null)
            return false;
        if (customerBank != null ? !customerBank.equals(customer.customerBank) : customer.customerBank != null)
            return false;
        if (customerBorrowMoney != null ? !customerBorrowMoney.equals(customer.customerBorrowMoney) : customer.customerBorrowMoney != null)
            return false;
        if (customerPeriods != null ? !customerPeriods.equals(customer.customerPeriods) : customer.customerPeriods != null)
            return false;
        if (customerTime != null ? !customerTime.equals(customer.customerTime) : customer.customerTime != null)
            return false;
        if (customerStatus != null ? !customerStatus.equals(customer.customerStatus) : customer.customerStatus != null)
            return false;
        if (customerBankPhoto != null ? !customerBankPhoto.equals(customer.customerBankPhoto) : customer.customerBankPhoto != null)
            return false;
        return customerCardPhoto != null ? customerCardPhoto.equals(customer.customerCardPhoto) : customer.customerCardPhoto == null;
    }

    @Override
    public int hashCode() {
        int result = customerId != null ? customerId.hashCode() : 0;
        result = 31 * result + (customerUsername != null ? customerUsername.hashCode() : 0);
        result = 31 * result + (customerName != null ? customerName.hashCode() : 0);
        result = 31 * result + (customerTel != null ? customerTel.hashCode() : 0);
        result = 31 * result + (customerPassword != null ? customerPassword.hashCode() : 0);
        result = 31 * result + (customerSalt != null ? customerSalt.hashCode() : 0);
        result = 31 * result + (customerLevel != null ? customerLevel.hashCode() : 0);
        result = 31 * result + (customerIdNumber != null ? customerIdNumber.hashCode() : 0);
        result = 31 * result + (customerAddress != null ? customerAddress.hashCode() : 0);
        result = 31 * result + (customerBank != null ? customerBank.hashCode() : 0);
        result = 31 * result + (customerBorrowMoney != null ? customerBorrowMoney.hashCode() : 0);
        result = 31 * result + (customerPeriods != null ? customerPeriods.hashCode() : 0);
        result = 31 * result + (customerTime != null ? customerTime.hashCode() : 0);
        result = 31 * result + (customerStatus != null ? customerStatus.hashCode() : 0);
        result = 31 * result + (customerBankPhoto != null ? customerBankPhoto.hashCode() : 0);
        result = 31 * result + (customerCardPhoto != null ? customerCardPhoto.hashCode() : 0);
        return result;
    }
}
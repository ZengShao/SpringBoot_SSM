package com.zking.ssm.model;

import java.util.Date;

public class Customer {
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
}
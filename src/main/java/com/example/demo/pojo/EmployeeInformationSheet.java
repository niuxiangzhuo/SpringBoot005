package com.example.demo.pojo;

public class EmployeeInformationSheet {
    private String accountId;
    private String passwords;
    private String theName;
    private PositionInformationSheet positionInformationSheet;
    private String contactPhoneNumber;
    private String recordOfFormalSchooling;

    public EmployeeInformationSheet() {
    }

    public EmployeeInformationSheet(String accountId, String passwords, String theName, PositionInformationSheet positionInformationSheet, String contactPhoneNumber, String recordOfFormalSchooling) {
        this.accountId = accountId;
        this.passwords = passwords;
        this.theName = theName;
        this.positionInformationSheet = positionInformationSheet;
        this.contactPhoneNumber = contactPhoneNumber;
        this.recordOfFormalSchooling = recordOfFormalSchooling;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getPasswords() {
        return passwords;
    }

    public void setPasswords(String passwords) {
        this.passwords = passwords;
    }

    public String getTheName() {
        return theName;
    }

    public void setTheName(String theName) {
        this.theName = theName;
    }

    public PositionInformationSheet getPositionInformationSheet() {
        return positionInformationSheet;
    }

    public void setPositionInformationSheet(PositionInformationSheet positionInformationSheet) {
        this.positionInformationSheet = positionInformationSheet;
    }

    public String getContactPhoneNumber() {
        return contactPhoneNumber;
    }

    public void setContactPhoneNumber(String contactPhoneNumber) {
        this.contactPhoneNumber = contactPhoneNumber;
    }

    public String getRecordOfFormalSchooling() {
        return recordOfFormalSchooling;
    }

    public void setRecordOfFormalSchooling(String recordOfFormalSchooling) {
        this.recordOfFormalSchooling = recordOfFormalSchooling;
    }

    @Override
    public String toString() {
        return "EmployeeInformationSheet{" +
                "accountId='" + accountId + '\'' +
                ", passwords='" + passwords + '\'' +
                ", theName='" + theName + '\'' +
                ", positionInformationSheet=" + positionInformationSheet +
                ", contactPhoneNumber='" + contactPhoneNumber + '\'' +
                ", recordOfFormalSchooling='" + recordOfFormalSchooling + '\'' +
                '}';
    }
}

package com.wmcg.budgetingproject.data;

import com.opencsv.bean.CsvBindByPosition;

public class BankDataBean {
    @CsvBindByPosition(position = 2)
    private String accountIdentifier;

    @CsvBindByPosition(position = 3)
    private String transactionDate;

    @CsvBindByPosition(position = 5)
    private String transactionDesc;

    @CsvBindByPosition(position = 7)
    private float withdrawalAmount;

    @CsvBindByPosition(position = 8)
    private float depositAmount;

    public String getAccountIdentifier() {
        return accountIdentifier;
    }

    public void setAccountIdentifier(String _accountIdentifier) {
        accountIdentifier = _accountIdentifier;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String _transactionDate) {
        transactionDate = _transactionDate;
    }

    public String getTransactionDesc() {
        return transactionDesc;
    }

    public void setTransactionDesc(String _transactionDesc) {
        transactionDesc = _transactionDesc;
    }

    public float getWithdrawalAmount() {
        return withdrawalAmount;
    }

    public void setWithdrawalAmount(float _withdrawalAmount) {
        withdrawalAmount = _withdrawalAmount;
    }

    public float getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(float _depositAmount) {
        depositAmount = _depositAmount;
    }

    @Override
    public String toString(){
        return "Transaction with " + transactionDesc
                + " on " + transactionDate
                + " from account " + accountIdentifier
                + " for $" + (withdrawalAmount - depositAmount);
    }
}

package com.vzoom.charge.model.sync;

import java.math.BigDecimal;
import java.util.Date;

public class SyncRecord {
    private String sycnId;

    private String voucherId;

    private String danjuType;

    private String accountBook;

    private String accountsOrgnId;

    private String billCycle;

    private String voucherWord;

    private String voucherNumber;

    private Date syncTime;

    private Date fDate;

    private BigDecimal financeCheckStatus;

    private Date financeCheckTime;

    private String syncUserId;

    private String syncType;

    private String remark;

    private BigDecimal syncStatus;

    private String syncMessage;

    private String projectIds;

    private String billBalanceRecordId;

    public String getSycnId() {
        return sycnId;
    }

    public void setSycnId(String sycnId) {
        this.sycnId = sycnId == null ? null : sycnId.trim();
    }

    public String getVoucherId() {
        return voucherId;
    }

    public void setVoucherId(String voucherId) {
        this.voucherId = voucherId == null ? null : voucherId.trim();
    }

    public String getDanjuType() {
        return danjuType;
    }

    public void setDanjuType(String danjuType) {
        this.danjuType = danjuType == null ? null : danjuType.trim();
    }

    public String getAccountBook() {
        return accountBook;
    }

    public void setAccountBook(String accountBook) {
        this.accountBook = accountBook == null ? null : accountBook.trim();
    }

    public String getAccountsOrgnId() {
        return accountsOrgnId;
    }

    public void setAccountsOrgnId(String accountsOrgnId) {
        this.accountsOrgnId = accountsOrgnId == null ? null : accountsOrgnId.trim();
    }

    public String getBillCycle() {
        return billCycle;
    }

    public void setBillCycle(String billCycle) {
        this.billCycle = billCycle == null ? null : billCycle.trim();
    }

    public String getVoucherWord() {
        return voucherWord;
    }

    public void setVoucherWord(String voucherWord) {
        this.voucherWord = voucherWord == null ? null : voucherWord.trim();
    }

    public String getVoucherNumber() {
        return voucherNumber;
    }

    public void setVoucherNumber(String voucherNumber) {
        this.voucherNumber = voucherNumber == null ? null : voucherNumber.trim();
    }

    public Date getSyncTime() {
        return syncTime;
    }

    public void setSyncTime(Date syncTime) {
        this.syncTime = syncTime;
    }

    public Date getfDate() {
        return fDate;
    }

    public void setfDate(Date fDate) {
        this.fDate = fDate;
    }

    public BigDecimal getFinanceCheckStatus() {
        return financeCheckStatus;
    }

    public void setFinanceCheckStatus(BigDecimal financeCheckStatus) {
        this.financeCheckStatus = financeCheckStatus;
    }

    public Date getFinanceCheckTime() {
        return financeCheckTime;
    }

    public void setFinanceCheckTime(Date financeCheckTime) {
        this.financeCheckTime = financeCheckTime;
    }

    public String getSyncUserId() {
        return syncUserId;
    }

    public void setSyncUserId(String syncUserId) {
        this.syncUserId = syncUserId == null ? null : syncUserId.trim();
    }

    public String getSyncType() {
        return syncType;
    }

    public void setSyncType(String syncType) {
        this.syncType = syncType == null ? null : syncType.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public BigDecimal getSyncStatus() {
        return syncStatus;
    }

    public void setSyncStatus(BigDecimal syncStatus) {
        this.syncStatus = syncStatus;
    }

    public String getSyncMessage() {
        return syncMessage;
    }

    public void setSyncMessage(String syncMessage) {
        this.syncMessage = syncMessage == null ? null : syncMessage.trim();
    }

    public String getProjectIds() {
        return projectIds;
    }

    public void setProjectIds(String projectIds) {
        this.projectIds = projectIds == null ? null : projectIds.trim();
    }

    public String getBillBalanceRecordId() {
        return billBalanceRecordId;
    }

    public void setBillBalanceRecordId(String billBalanceRecordId) {
        this.billBalanceRecordId = billBalanceRecordId == null ? null : billBalanceRecordId.trim();
    }
}
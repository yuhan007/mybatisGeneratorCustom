package com.vzoom.charge.model.sync;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SyncRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SyncRecordExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andSycnIdIsNull() {
            addCriterion("SYCN_ID is null");
            return (Criteria) this;
        }

        public Criteria andSycnIdIsNotNull() {
            addCriterion("SYCN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSycnIdEqualTo(String value) {
            addCriterion("SYCN_ID =", value, "sycnId");
            return (Criteria) this;
        }

        public Criteria andSycnIdNotEqualTo(String value) {
            addCriterion("SYCN_ID <>", value, "sycnId");
            return (Criteria) this;
        }

        public Criteria andSycnIdGreaterThan(String value) {
            addCriterion("SYCN_ID >", value, "sycnId");
            return (Criteria) this;
        }

        public Criteria andSycnIdGreaterThanOrEqualTo(String value) {
            addCriterion("SYCN_ID >=", value, "sycnId");
            return (Criteria) this;
        }

        public Criteria andSycnIdLessThan(String value) {
            addCriterion("SYCN_ID <", value, "sycnId");
            return (Criteria) this;
        }

        public Criteria andSycnIdLessThanOrEqualTo(String value) {
            addCriterion("SYCN_ID <=", value, "sycnId");
            return (Criteria) this;
        }

        public Criteria andSycnIdLike(String value) {
            addCriterion("SYCN_ID like", value, "sycnId");
            return (Criteria) this;
        }

        public Criteria andSycnIdNotLike(String value) {
            addCriterion("SYCN_ID not like", value, "sycnId");
            return (Criteria) this;
        }

        public Criteria andSycnIdIn(List<String> values) {
            addCriterion("SYCN_ID in", values, "sycnId");
            return (Criteria) this;
        }

        public Criteria andSycnIdNotIn(List<String> values) {
            addCriterion("SYCN_ID not in", values, "sycnId");
            return (Criteria) this;
        }

        public Criteria andSycnIdBetween(String value1, String value2) {
            addCriterion("SYCN_ID between", value1, value2, "sycnId");
            return (Criteria) this;
        }

        public Criteria andSycnIdNotBetween(String value1, String value2) {
            addCriterion("SYCN_ID not between", value1, value2, "sycnId");
            return (Criteria) this;
        }

        public Criteria andVoucherIdIsNull() {
            addCriterion("VOUCHER_ID is null");
            return (Criteria) this;
        }

        public Criteria andVoucherIdIsNotNull() {
            addCriterion("VOUCHER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andVoucherIdEqualTo(String value) {
            addCriterion("VOUCHER_ID =", value, "voucherId");
            return (Criteria) this;
        }

        public Criteria andVoucherIdNotEqualTo(String value) {
            addCriterion("VOUCHER_ID <>", value, "voucherId");
            return (Criteria) this;
        }

        public Criteria andVoucherIdGreaterThan(String value) {
            addCriterion("VOUCHER_ID >", value, "voucherId");
            return (Criteria) this;
        }

        public Criteria andVoucherIdGreaterThanOrEqualTo(String value) {
            addCriterion("VOUCHER_ID >=", value, "voucherId");
            return (Criteria) this;
        }

        public Criteria andVoucherIdLessThan(String value) {
            addCriterion("VOUCHER_ID <", value, "voucherId");
            return (Criteria) this;
        }

        public Criteria andVoucherIdLessThanOrEqualTo(String value) {
            addCriterion("VOUCHER_ID <=", value, "voucherId");
            return (Criteria) this;
        }

        public Criteria andVoucherIdLike(String value) {
            addCriterion("VOUCHER_ID like", value, "voucherId");
            return (Criteria) this;
        }

        public Criteria andVoucherIdNotLike(String value) {
            addCriterion("VOUCHER_ID not like", value, "voucherId");
            return (Criteria) this;
        }

        public Criteria andVoucherIdIn(List<String> values) {
            addCriterion("VOUCHER_ID in", values, "voucherId");
            return (Criteria) this;
        }

        public Criteria andVoucherIdNotIn(List<String> values) {
            addCriterion("VOUCHER_ID not in", values, "voucherId");
            return (Criteria) this;
        }

        public Criteria andVoucherIdBetween(String value1, String value2) {
            addCriterion("VOUCHER_ID between", value1, value2, "voucherId");
            return (Criteria) this;
        }

        public Criteria andVoucherIdNotBetween(String value1, String value2) {
            addCriterion("VOUCHER_ID not between", value1, value2, "voucherId");
            return (Criteria) this;
        }

        public Criteria andDanjuTypeIsNull() {
            addCriterion("DANJU_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andDanjuTypeIsNotNull() {
            addCriterion("DANJU_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDanjuTypeEqualTo(String value) {
            addCriterion("DANJU_TYPE =", value, "danjuType");
            return (Criteria) this;
        }

        public Criteria andDanjuTypeNotEqualTo(String value) {
            addCriterion("DANJU_TYPE <>", value, "danjuType");
            return (Criteria) this;
        }

        public Criteria andDanjuTypeGreaterThan(String value) {
            addCriterion("DANJU_TYPE >", value, "danjuType");
            return (Criteria) this;
        }

        public Criteria andDanjuTypeGreaterThanOrEqualTo(String value) {
            addCriterion("DANJU_TYPE >=", value, "danjuType");
            return (Criteria) this;
        }

        public Criteria andDanjuTypeLessThan(String value) {
            addCriterion("DANJU_TYPE <", value, "danjuType");
            return (Criteria) this;
        }

        public Criteria andDanjuTypeLessThanOrEqualTo(String value) {
            addCriterion("DANJU_TYPE <=", value, "danjuType");
            return (Criteria) this;
        }

        public Criteria andDanjuTypeLike(String value) {
            addCriterion("DANJU_TYPE like", value, "danjuType");
            return (Criteria) this;
        }

        public Criteria andDanjuTypeNotLike(String value) {
            addCriterion("DANJU_TYPE not like", value, "danjuType");
            return (Criteria) this;
        }

        public Criteria andDanjuTypeIn(List<String> values) {
            addCriterion("DANJU_TYPE in", values, "danjuType");
            return (Criteria) this;
        }

        public Criteria andDanjuTypeNotIn(List<String> values) {
            addCriterion("DANJU_TYPE not in", values, "danjuType");
            return (Criteria) this;
        }

        public Criteria andDanjuTypeBetween(String value1, String value2) {
            addCriterion("DANJU_TYPE between", value1, value2, "danjuType");
            return (Criteria) this;
        }

        public Criteria andDanjuTypeNotBetween(String value1, String value2) {
            addCriterion("DANJU_TYPE not between", value1, value2, "danjuType");
            return (Criteria) this;
        }

        public Criteria andAccountBookIsNull() {
            addCriterion("ACCOUNT_BOOK is null");
            return (Criteria) this;
        }

        public Criteria andAccountBookIsNotNull() {
            addCriterion("ACCOUNT_BOOK is not null");
            return (Criteria) this;
        }

        public Criteria andAccountBookEqualTo(String value) {
            addCriterion("ACCOUNT_BOOK =", value, "accountBook");
            return (Criteria) this;
        }

        public Criteria andAccountBookNotEqualTo(String value) {
            addCriterion("ACCOUNT_BOOK <>", value, "accountBook");
            return (Criteria) this;
        }

        public Criteria andAccountBookGreaterThan(String value) {
            addCriterion("ACCOUNT_BOOK >", value, "accountBook");
            return (Criteria) this;
        }

        public Criteria andAccountBookGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNT_BOOK >=", value, "accountBook");
            return (Criteria) this;
        }

        public Criteria andAccountBookLessThan(String value) {
            addCriterion("ACCOUNT_BOOK <", value, "accountBook");
            return (Criteria) this;
        }

        public Criteria andAccountBookLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNT_BOOK <=", value, "accountBook");
            return (Criteria) this;
        }

        public Criteria andAccountBookLike(String value) {
            addCriterion("ACCOUNT_BOOK like", value, "accountBook");
            return (Criteria) this;
        }

        public Criteria andAccountBookNotLike(String value) {
            addCriterion("ACCOUNT_BOOK not like", value, "accountBook");
            return (Criteria) this;
        }

        public Criteria andAccountBookIn(List<String> values) {
            addCriterion("ACCOUNT_BOOK in", values, "accountBook");
            return (Criteria) this;
        }

        public Criteria andAccountBookNotIn(List<String> values) {
            addCriterion("ACCOUNT_BOOK not in", values, "accountBook");
            return (Criteria) this;
        }

        public Criteria andAccountBookBetween(String value1, String value2) {
            addCriterion("ACCOUNT_BOOK between", value1, value2, "accountBook");
            return (Criteria) this;
        }

        public Criteria andAccountBookNotBetween(String value1, String value2) {
            addCriterion("ACCOUNT_BOOK not between", value1, value2, "accountBook");
            return (Criteria) this;
        }

        public Criteria andAccountsOrgnIdIsNull() {
            addCriterion("ACCOUNTS_ORGN_ID is null");
            return (Criteria) this;
        }

        public Criteria andAccountsOrgnIdIsNotNull() {
            addCriterion("ACCOUNTS_ORGN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAccountsOrgnIdEqualTo(String value) {
            addCriterion("ACCOUNTS_ORGN_ID =", value, "accountsOrgnId");
            return (Criteria) this;
        }

        public Criteria andAccountsOrgnIdNotEqualTo(String value) {
            addCriterion("ACCOUNTS_ORGN_ID <>", value, "accountsOrgnId");
            return (Criteria) this;
        }

        public Criteria andAccountsOrgnIdGreaterThan(String value) {
            addCriterion("ACCOUNTS_ORGN_ID >", value, "accountsOrgnId");
            return (Criteria) this;
        }

        public Criteria andAccountsOrgnIdGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNTS_ORGN_ID >=", value, "accountsOrgnId");
            return (Criteria) this;
        }

        public Criteria andAccountsOrgnIdLessThan(String value) {
            addCriterion("ACCOUNTS_ORGN_ID <", value, "accountsOrgnId");
            return (Criteria) this;
        }

        public Criteria andAccountsOrgnIdLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNTS_ORGN_ID <=", value, "accountsOrgnId");
            return (Criteria) this;
        }

        public Criteria andAccountsOrgnIdLike(String value) {
            addCriterion("ACCOUNTS_ORGN_ID like", value, "accountsOrgnId");
            return (Criteria) this;
        }

        public Criteria andAccountsOrgnIdNotLike(String value) {
            addCriterion("ACCOUNTS_ORGN_ID not like", value, "accountsOrgnId");
            return (Criteria) this;
        }

        public Criteria andAccountsOrgnIdIn(List<String> values) {
            addCriterion("ACCOUNTS_ORGN_ID in", values, "accountsOrgnId");
            return (Criteria) this;
        }

        public Criteria andAccountsOrgnIdNotIn(List<String> values) {
            addCriterion("ACCOUNTS_ORGN_ID not in", values, "accountsOrgnId");
            return (Criteria) this;
        }

        public Criteria andAccountsOrgnIdBetween(String value1, String value2) {
            addCriterion("ACCOUNTS_ORGN_ID between", value1, value2, "accountsOrgnId");
            return (Criteria) this;
        }

        public Criteria andAccountsOrgnIdNotBetween(String value1, String value2) {
            addCriterion("ACCOUNTS_ORGN_ID not between", value1, value2, "accountsOrgnId");
            return (Criteria) this;
        }

        public Criteria andBillCycleIsNull() {
            addCriterion("BILL_CYCLE is null");
            return (Criteria) this;
        }

        public Criteria andBillCycleIsNotNull() {
            addCriterion("BILL_CYCLE is not null");
            return (Criteria) this;
        }

        public Criteria andBillCycleEqualTo(String value) {
            addCriterion("BILL_CYCLE =", value, "billCycle");
            return (Criteria) this;
        }

        public Criteria andBillCycleNotEqualTo(String value) {
            addCriterion("BILL_CYCLE <>", value, "billCycle");
            return (Criteria) this;
        }

        public Criteria andBillCycleGreaterThan(String value) {
            addCriterion("BILL_CYCLE >", value, "billCycle");
            return (Criteria) this;
        }

        public Criteria andBillCycleGreaterThanOrEqualTo(String value) {
            addCriterion("BILL_CYCLE >=", value, "billCycle");
            return (Criteria) this;
        }

        public Criteria andBillCycleLessThan(String value) {
            addCriterion("BILL_CYCLE <", value, "billCycle");
            return (Criteria) this;
        }

        public Criteria andBillCycleLessThanOrEqualTo(String value) {
            addCriterion("BILL_CYCLE <=", value, "billCycle");
            return (Criteria) this;
        }

        public Criteria andBillCycleLike(String value) {
            addCriterion("BILL_CYCLE like", value, "billCycle");
            return (Criteria) this;
        }

        public Criteria andBillCycleNotLike(String value) {
            addCriterion("BILL_CYCLE not like", value, "billCycle");
            return (Criteria) this;
        }

        public Criteria andBillCycleIn(List<String> values) {
            addCriterion("BILL_CYCLE in", values, "billCycle");
            return (Criteria) this;
        }

        public Criteria andBillCycleNotIn(List<String> values) {
            addCriterion("BILL_CYCLE not in", values, "billCycle");
            return (Criteria) this;
        }

        public Criteria andBillCycleBetween(String value1, String value2) {
            addCriterion("BILL_CYCLE between", value1, value2, "billCycle");
            return (Criteria) this;
        }

        public Criteria andBillCycleNotBetween(String value1, String value2) {
            addCriterion("BILL_CYCLE not between", value1, value2, "billCycle");
            return (Criteria) this;
        }

        public Criteria andVoucherWordIsNull() {
            addCriterion("VOUCHER_WORD is null");
            return (Criteria) this;
        }

        public Criteria andVoucherWordIsNotNull() {
            addCriterion("VOUCHER_WORD is not null");
            return (Criteria) this;
        }

        public Criteria andVoucherWordEqualTo(String value) {
            addCriterion("VOUCHER_WORD =", value, "voucherWord");
            return (Criteria) this;
        }

        public Criteria andVoucherWordNotEqualTo(String value) {
            addCriterion("VOUCHER_WORD <>", value, "voucherWord");
            return (Criteria) this;
        }

        public Criteria andVoucherWordGreaterThan(String value) {
            addCriterion("VOUCHER_WORD >", value, "voucherWord");
            return (Criteria) this;
        }

        public Criteria andVoucherWordGreaterThanOrEqualTo(String value) {
            addCriterion("VOUCHER_WORD >=", value, "voucherWord");
            return (Criteria) this;
        }

        public Criteria andVoucherWordLessThan(String value) {
            addCriterion("VOUCHER_WORD <", value, "voucherWord");
            return (Criteria) this;
        }

        public Criteria andVoucherWordLessThanOrEqualTo(String value) {
            addCriterion("VOUCHER_WORD <=", value, "voucherWord");
            return (Criteria) this;
        }

        public Criteria andVoucherWordLike(String value) {
            addCriterion("VOUCHER_WORD like", value, "voucherWord");
            return (Criteria) this;
        }

        public Criteria andVoucherWordNotLike(String value) {
            addCriterion("VOUCHER_WORD not like", value, "voucherWord");
            return (Criteria) this;
        }

        public Criteria andVoucherWordIn(List<String> values) {
            addCriterion("VOUCHER_WORD in", values, "voucherWord");
            return (Criteria) this;
        }

        public Criteria andVoucherWordNotIn(List<String> values) {
            addCriterion("VOUCHER_WORD not in", values, "voucherWord");
            return (Criteria) this;
        }

        public Criteria andVoucherWordBetween(String value1, String value2) {
            addCriterion("VOUCHER_WORD between", value1, value2, "voucherWord");
            return (Criteria) this;
        }

        public Criteria andVoucherWordNotBetween(String value1, String value2) {
            addCriterion("VOUCHER_WORD not between", value1, value2, "voucherWord");
            return (Criteria) this;
        }

        public Criteria andVoucherNumberIsNull() {
            addCriterion("VOUCHER_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andVoucherNumberIsNotNull() {
            addCriterion("VOUCHER_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andVoucherNumberEqualTo(String value) {
            addCriterion("VOUCHER_NUMBER =", value, "voucherNumber");
            return (Criteria) this;
        }

        public Criteria andVoucherNumberNotEqualTo(String value) {
            addCriterion("VOUCHER_NUMBER <>", value, "voucherNumber");
            return (Criteria) this;
        }

        public Criteria andVoucherNumberGreaterThan(String value) {
            addCriterion("VOUCHER_NUMBER >", value, "voucherNumber");
            return (Criteria) this;
        }

        public Criteria andVoucherNumberGreaterThanOrEqualTo(String value) {
            addCriterion("VOUCHER_NUMBER >=", value, "voucherNumber");
            return (Criteria) this;
        }

        public Criteria andVoucherNumberLessThan(String value) {
            addCriterion("VOUCHER_NUMBER <", value, "voucherNumber");
            return (Criteria) this;
        }

        public Criteria andVoucherNumberLessThanOrEqualTo(String value) {
            addCriterion("VOUCHER_NUMBER <=", value, "voucherNumber");
            return (Criteria) this;
        }

        public Criteria andVoucherNumberLike(String value) {
            addCriterion("VOUCHER_NUMBER like", value, "voucherNumber");
            return (Criteria) this;
        }

        public Criteria andVoucherNumberNotLike(String value) {
            addCriterion("VOUCHER_NUMBER not like", value, "voucherNumber");
            return (Criteria) this;
        }

        public Criteria andVoucherNumberIn(List<String> values) {
            addCriterion("VOUCHER_NUMBER in", values, "voucherNumber");
            return (Criteria) this;
        }

        public Criteria andVoucherNumberNotIn(List<String> values) {
            addCriterion("VOUCHER_NUMBER not in", values, "voucherNumber");
            return (Criteria) this;
        }

        public Criteria andVoucherNumberBetween(String value1, String value2) {
            addCriterion("VOUCHER_NUMBER between", value1, value2, "voucherNumber");
            return (Criteria) this;
        }

        public Criteria andVoucherNumberNotBetween(String value1, String value2) {
            addCriterion("VOUCHER_NUMBER not between", value1, value2, "voucherNumber");
            return (Criteria) this;
        }

        public Criteria andSyncTimeIsNull() {
            addCriterion("SYNC_TIME is null");
            return (Criteria) this;
        }

        public Criteria andSyncTimeIsNotNull() {
            addCriterion("SYNC_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andSyncTimeEqualTo(Date value) {
            addCriterion("SYNC_TIME =", value, "syncTime");
            return (Criteria) this;
        }

        public Criteria andSyncTimeNotEqualTo(Date value) {
            addCriterion("SYNC_TIME <>", value, "syncTime");
            return (Criteria) this;
        }

        public Criteria andSyncTimeGreaterThan(Date value) {
            addCriterion("SYNC_TIME >", value, "syncTime");
            return (Criteria) this;
        }

        public Criteria andSyncTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("SYNC_TIME >=", value, "syncTime");
            return (Criteria) this;
        }

        public Criteria andSyncTimeLessThan(Date value) {
            addCriterion("SYNC_TIME <", value, "syncTime");
            return (Criteria) this;
        }

        public Criteria andSyncTimeLessThanOrEqualTo(Date value) {
            addCriterion("SYNC_TIME <=", value, "syncTime");
            return (Criteria) this;
        }

        public Criteria andSyncTimeIn(List<Date> values) {
            addCriterion("SYNC_TIME in", values, "syncTime");
            return (Criteria) this;
        }

        public Criteria andSyncTimeNotIn(List<Date> values) {
            addCriterion("SYNC_TIME not in", values, "syncTime");
            return (Criteria) this;
        }

        public Criteria andSyncTimeBetween(Date value1, Date value2) {
            addCriterion("SYNC_TIME between", value1, value2, "syncTime");
            return (Criteria) this;
        }

        public Criteria andSyncTimeNotBetween(Date value1, Date value2) {
            addCriterion("SYNC_TIME not between", value1, value2, "syncTime");
            return (Criteria) this;
        }

        public Criteria andFDateIsNull() {
            addCriterion("F_DATE is null");
            return (Criteria) this;
        }

        public Criteria andFDateIsNotNull() {
            addCriterion("F_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andFDateEqualTo(Date value) {
            addCriterion("F_DATE =", value, "fDate");
            return (Criteria) this;
        }

        public Criteria andFDateNotEqualTo(Date value) {
            addCriterion("F_DATE <>", value, "fDate");
            return (Criteria) this;
        }

        public Criteria andFDateGreaterThan(Date value) {
            addCriterion("F_DATE >", value, "fDate");
            return (Criteria) this;
        }

        public Criteria andFDateGreaterThanOrEqualTo(Date value) {
            addCriterion("F_DATE >=", value, "fDate");
            return (Criteria) this;
        }

        public Criteria andFDateLessThan(Date value) {
            addCriterion("F_DATE <", value, "fDate");
            return (Criteria) this;
        }

        public Criteria andFDateLessThanOrEqualTo(Date value) {
            addCriterion("F_DATE <=", value, "fDate");
            return (Criteria) this;
        }

        public Criteria andFDateIn(List<Date> values) {
            addCriterion("F_DATE in", values, "fDate");
            return (Criteria) this;
        }

        public Criteria andFDateNotIn(List<Date> values) {
            addCriterion("F_DATE not in", values, "fDate");
            return (Criteria) this;
        }

        public Criteria andFDateBetween(Date value1, Date value2) {
            addCriterion("F_DATE between", value1, value2, "fDate");
            return (Criteria) this;
        }

        public Criteria andFDateNotBetween(Date value1, Date value2) {
            addCriterion("F_DATE not between", value1, value2, "fDate");
            return (Criteria) this;
        }

        public Criteria andFinanceCheckStatusIsNull() {
            addCriterion("FINANCE_CHECK_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andFinanceCheckStatusIsNotNull() {
            addCriterion("FINANCE_CHECK_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andFinanceCheckStatusEqualTo(BigDecimal value) {
            addCriterion("FINANCE_CHECK_STATUS =", value, "financeCheckStatus");
            return (Criteria) this;
        }

        public Criteria andFinanceCheckStatusNotEqualTo(BigDecimal value) {
            addCriterion("FINANCE_CHECK_STATUS <>", value, "financeCheckStatus");
            return (Criteria) this;
        }

        public Criteria andFinanceCheckStatusGreaterThan(BigDecimal value) {
            addCriterion("FINANCE_CHECK_STATUS >", value, "financeCheckStatus");
            return (Criteria) this;
        }

        public Criteria andFinanceCheckStatusGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FINANCE_CHECK_STATUS >=", value, "financeCheckStatus");
            return (Criteria) this;
        }

        public Criteria andFinanceCheckStatusLessThan(BigDecimal value) {
            addCriterion("FINANCE_CHECK_STATUS <", value, "financeCheckStatus");
            return (Criteria) this;
        }

        public Criteria andFinanceCheckStatusLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FINANCE_CHECK_STATUS <=", value, "financeCheckStatus");
            return (Criteria) this;
        }

        public Criteria andFinanceCheckStatusIn(List<BigDecimal> values) {
            addCriterion("FINANCE_CHECK_STATUS in", values, "financeCheckStatus");
            return (Criteria) this;
        }

        public Criteria andFinanceCheckStatusNotIn(List<BigDecimal> values) {
            addCriterion("FINANCE_CHECK_STATUS not in", values, "financeCheckStatus");
            return (Criteria) this;
        }

        public Criteria andFinanceCheckStatusBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FINANCE_CHECK_STATUS between", value1, value2, "financeCheckStatus");
            return (Criteria) this;
        }

        public Criteria andFinanceCheckStatusNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FINANCE_CHECK_STATUS not between", value1, value2, "financeCheckStatus");
            return (Criteria) this;
        }

        public Criteria andFinanceCheckTimeIsNull() {
            addCriterion("FINANCE_CHECK_TIME is null");
            return (Criteria) this;
        }

        public Criteria andFinanceCheckTimeIsNotNull() {
            addCriterion("FINANCE_CHECK_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andFinanceCheckTimeEqualTo(Date value) {
            addCriterion("FINANCE_CHECK_TIME =", value, "financeCheckTime");
            return (Criteria) this;
        }

        public Criteria andFinanceCheckTimeNotEqualTo(Date value) {
            addCriterion("FINANCE_CHECK_TIME <>", value, "financeCheckTime");
            return (Criteria) this;
        }

        public Criteria andFinanceCheckTimeGreaterThan(Date value) {
            addCriterion("FINANCE_CHECK_TIME >", value, "financeCheckTime");
            return (Criteria) this;
        }

        public Criteria andFinanceCheckTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("FINANCE_CHECK_TIME >=", value, "financeCheckTime");
            return (Criteria) this;
        }

        public Criteria andFinanceCheckTimeLessThan(Date value) {
            addCriterion("FINANCE_CHECK_TIME <", value, "financeCheckTime");
            return (Criteria) this;
        }

        public Criteria andFinanceCheckTimeLessThanOrEqualTo(Date value) {
            addCriterion("FINANCE_CHECK_TIME <=", value, "financeCheckTime");
            return (Criteria) this;
        }

        public Criteria andFinanceCheckTimeIn(List<Date> values) {
            addCriterion("FINANCE_CHECK_TIME in", values, "financeCheckTime");
            return (Criteria) this;
        }

        public Criteria andFinanceCheckTimeNotIn(List<Date> values) {
            addCriterion("FINANCE_CHECK_TIME not in", values, "financeCheckTime");
            return (Criteria) this;
        }

        public Criteria andFinanceCheckTimeBetween(Date value1, Date value2) {
            addCriterion("FINANCE_CHECK_TIME between", value1, value2, "financeCheckTime");
            return (Criteria) this;
        }

        public Criteria andFinanceCheckTimeNotBetween(Date value1, Date value2) {
            addCriterion("FINANCE_CHECK_TIME not between", value1, value2, "financeCheckTime");
            return (Criteria) this;
        }

        public Criteria andSyncUserIdIsNull() {
            addCriterion("SYNC_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andSyncUserIdIsNotNull() {
            addCriterion("SYNC_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSyncUserIdEqualTo(String value) {
            addCriterion("SYNC_USER_ID =", value, "syncUserId");
            return (Criteria) this;
        }

        public Criteria andSyncUserIdNotEqualTo(String value) {
            addCriterion("SYNC_USER_ID <>", value, "syncUserId");
            return (Criteria) this;
        }

        public Criteria andSyncUserIdGreaterThan(String value) {
            addCriterion("SYNC_USER_ID >", value, "syncUserId");
            return (Criteria) this;
        }

        public Criteria andSyncUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("SYNC_USER_ID >=", value, "syncUserId");
            return (Criteria) this;
        }

        public Criteria andSyncUserIdLessThan(String value) {
            addCriterion("SYNC_USER_ID <", value, "syncUserId");
            return (Criteria) this;
        }

        public Criteria andSyncUserIdLessThanOrEqualTo(String value) {
            addCriterion("SYNC_USER_ID <=", value, "syncUserId");
            return (Criteria) this;
        }

        public Criteria andSyncUserIdLike(String value) {
            addCriterion("SYNC_USER_ID like", value, "syncUserId");
            return (Criteria) this;
        }

        public Criteria andSyncUserIdNotLike(String value) {
            addCriterion("SYNC_USER_ID not like", value, "syncUserId");
            return (Criteria) this;
        }

        public Criteria andSyncUserIdIn(List<String> values) {
            addCriterion("SYNC_USER_ID in", values, "syncUserId");
            return (Criteria) this;
        }

        public Criteria andSyncUserIdNotIn(List<String> values) {
            addCriterion("SYNC_USER_ID not in", values, "syncUserId");
            return (Criteria) this;
        }

        public Criteria andSyncUserIdBetween(String value1, String value2) {
            addCriterion("SYNC_USER_ID between", value1, value2, "syncUserId");
            return (Criteria) this;
        }

        public Criteria andSyncUserIdNotBetween(String value1, String value2) {
            addCriterion("SYNC_USER_ID not between", value1, value2, "syncUserId");
            return (Criteria) this;
        }

        public Criteria andSyncTypeIsNull() {
            addCriterion("SYNC_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSyncTypeIsNotNull() {
            addCriterion("SYNC_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSyncTypeEqualTo(String value) {
            addCriterion("SYNC_TYPE =", value, "syncType");
            return (Criteria) this;
        }

        public Criteria andSyncTypeNotEqualTo(String value) {
            addCriterion("SYNC_TYPE <>", value, "syncType");
            return (Criteria) this;
        }

        public Criteria andSyncTypeGreaterThan(String value) {
            addCriterion("SYNC_TYPE >", value, "syncType");
            return (Criteria) this;
        }

        public Criteria andSyncTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SYNC_TYPE >=", value, "syncType");
            return (Criteria) this;
        }

        public Criteria andSyncTypeLessThan(String value) {
            addCriterion("SYNC_TYPE <", value, "syncType");
            return (Criteria) this;
        }

        public Criteria andSyncTypeLessThanOrEqualTo(String value) {
            addCriterion("SYNC_TYPE <=", value, "syncType");
            return (Criteria) this;
        }

        public Criteria andSyncTypeLike(String value) {
            addCriterion("SYNC_TYPE like", value, "syncType");
            return (Criteria) this;
        }

        public Criteria andSyncTypeNotLike(String value) {
            addCriterion("SYNC_TYPE not like", value, "syncType");
            return (Criteria) this;
        }

        public Criteria andSyncTypeIn(List<String> values) {
            addCriterion("SYNC_TYPE in", values, "syncType");
            return (Criteria) this;
        }

        public Criteria andSyncTypeNotIn(List<String> values) {
            addCriterion("SYNC_TYPE not in", values, "syncType");
            return (Criteria) this;
        }

        public Criteria andSyncTypeBetween(String value1, String value2) {
            addCriterion("SYNC_TYPE between", value1, value2, "syncType");
            return (Criteria) this;
        }

        public Criteria andSyncTypeNotBetween(String value1, String value2) {
            addCriterion("SYNC_TYPE not between", value1, value2, "syncType");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andSyncStatusIsNull() {
            addCriterion("SYNC_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andSyncStatusIsNotNull() {
            addCriterion("SYNC_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andSyncStatusEqualTo(BigDecimal value) {
            addCriterion("SYNC_STATUS =", value, "syncStatus");
            return (Criteria) this;
        }

        public Criteria andSyncStatusNotEqualTo(BigDecimal value) {
            addCriterion("SYNC_STATUS <>", value, "syncStatus");
            return (Criteria) this;
        }

        public Criteria andSyncStatusGreaterThan(BigDecimal value) {
            addCriterion("SYNC_STATUS >", value, "syncStatus");
            return (Criteria) this;
        }

        public Criteria andSyncStatusGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SYNC_STATUS >=", value, "syncStatus");
            return (Criteria) this;
        }

        public Criteria andSyncStatusLessThan(BigDecimal value) {
            addCriterion("SYNC_STATUS <", value, "syncStatus");
            return (Criteria) this;
        }

        public Criteria andSyncStatusLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SYNC_STATUS <=", value, "syncStatus");
            return (Criteria) this;
        }

        public Criteria andSyncStatusIn(List<BigDecimal> values) {
            addCriterion("SYNC_STATUS in", values, "syncStatus");
            return (Criteria) this;
        }

        public Criteria andSyncStatusNotIn(List<BigDecimal> values) {
            addCriterion("SYNC_STATUS not in", values, "syncStatus");
            return (Criteria) this;
        }

        public Criteria andSyncStatusBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SYNC_STATUS between", value1, value2, "syncStatus");
            return (Criteria) this;
        }

        public Criteria andSyncStatusNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SYNC_STATUS not between", value1, value2, "syncStatus");
            return (Criteria) this;
        }

        public Criteria andSyncMessageIsNull() {
            addCriterion("SYNC_MESSAGE is null");
            return (Criteria) this;
        }

        public Criteria andSyncMessageIsNotNull() {
            addCriterion("SYNC_MESSAGE is not null");
            return (Criteria) this;
        }

        public Criteria andSyncMessageEqualTo(String value) {
            addCriterion("SYNC_MESSAGE =", value, "syncMessage");
            return (Criteria) this;
        }

        public Criteria andSyncMessageNotEqualTo(String value) {
            addCriterion("SYNC_MESSAGE <>", value, "syncMessage");
            return (Criteria) this;
        }

        public Criteria andSyncMessageGreaterThan(String value) {
            addCriterion("SYNC_MESSAGE >", value, "syncMessage");
            return (Criteria) this;
        }

        public Criteria andSyncMessageGreaterThanOrEqualTo(String value) {
            addCriterion("SYNC_MESSAGE >=", value, "syncMessage");
            return (Criteria) this;
        }

        public Criteria andSyncMessageLessThan(String value) {
            addCriterion("SYNC_MESSAGE <", value, "syncMessage");
            return (Criteria) this;
        }

        public Criteria andSyncMessageLessThanOrEqualTo(String value) {
            addCriterion("SYNC_MESSAGE <=", value, "syncMessage");
            return (Criteria) this;
        }

        public Criteria andSyncMessageLike(String value) {
            addCriterion("SYNC_MESSAGE like", value, "syncMessage");
            return (Criteria) this;
        }

        public Criteria andSyncMessageNotLike(String value) {
            addCriterion("SYNC_MESSAGE not like", value, "syncMessage");
            return (Criteria) this;
        }

        public Criteria andSyncMessageIn(List<String> values) {
            addCriterion("SYNC_MESSAGE in", values, "syncMessage");
            return (Criteria) this;
        }

        public Criteria andSyncMessageNotIn(List<String> values) {
            addCriterion("SYNC_MESSAGE not in", values, "syncMessage");
            return (Criteria) this;
        }

        public Criteria andSyncMessageBetween(String value1, String value2) {
            addCriterion("SYNC_MESSAGE between", value1, value2, "syncMessage");
            return (Criteria) this;
        }

        public Criteria andSyncMessageNotBetween(String value1, String value2) {
            addCriterion("SYNC_MESSAGE not between", value1, value2, "syncMessage");
            return (Criteria) this;
        }

        public Criteria andProjectIdsIsNull() {
            addCriterion("PROJECT_IDS is null");
            return (Criteria) this;
        }

        public Criteria andProjectIdsIsNotNull() {
            addCriterion("PROJECT_IDS is not null");
            return (Criteria) this;
        }

        public Criteria andProjectIdsEqualTo(String value) {
            addCriterion("PROJECT_IDS =", value, "projectIds");
            return (Criteria) this;
        }

        public Criteria andProjectIdsNotEqualTo(String value) {
            addCriterion("PROJECT_IDS <>", value, "projectIds");
            return (Criteria) this;
        }

        public Criteria andProjectIdsGreaterThan(String value) {
            addCriterion("PROJECT_IDS >", value, "projectIds");
            return (Criteria) this;
        }

        public Criteria andProjectIdsGreaterThanOrEqualTo(String value) {
            addCriterion("PROJECT_IDS >=", value, "projectIds");
            return (Criteria) this;
        }

        public Criteria andProjectIdsLessThan(String value) {
            addCriterion("PROJECT_IDS <", value, "projectIds");
            return (Criteria) this;
        }

        public Criteria andProjectIdsLessThanOrEqualTo(String value) {
            addCriterion("PROJECT_IDS <=", value, "projectIds");
            return (Criteria) this;
        }

        public Criteria andProjectIdsLike(String value) {
            addCriterion("PROJECT_IDS like", value, "projectIds");
            return (Criteria) this;
        }

        public Criteria andProjectIdsNotLike(String value) {
            addCriterion("PROJECT_IDS not like", value, "projectIds");
            return (Criteria) this;
        }

        public Criteria andProjectIdsIn(List<String> values) {
            addCriterion("PROJECT_IDS in", values, "projectIds");
            return (Criteria) this;
        }

        public Criteria andProjectIdsNotIn(List<String> values) {
            addCriterion("PROJECT_IDS not in", values, "projectIds");
            return (Criteria) this;
        }

        public Criteria andProjectIdsBetween(String value1, String value2) {
            addCriterion("PROJECT_IDS between", value1, value2, "projectIds");
            return (Criteria) this;
        }

        public Criteria andProjectIdsNotBetween(String value1, String value2) {
            addCriterion("PROJECT_IDS not between", value1, value2, "projectIds");
            return (Criteria) this;
        }

        public Criteria andBillBalanceRecordIdIsNull() {
            addCriterion("BILL_BALANCE_RECORD_ID is null");
            return (Criteria) this;
        }

        public Criteria andBillBalanceRecordIdIsNotNull() {
            addCriterion("BILL_BALANCE_RECORD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBillBalanceRecordIdEqualTo(String value) {
            addCriterion("BILL_BALANCE_RECORD_ID =", value, "billBalanceRecordId");
            return (Criteria) this;
        }

        public Criteria andBillBalanceRecordIdNotEqualTo(String value) {
            addCriterion("BILL_BALANCE_RECORD_ID <>", value, "billBalanceRecordId");
            return (Criteria) this;
        }

        public Criteria andBillBalanceRecordIdGreaterThan(String value) {
            addCriterion("BILL_BALANCE_RECORD_ID >", value, "billBalanceRecordId");
            return (Criteria) this;
        }

        public Criteria andBillBalanceRecordIdGreaterThanOrEqualTo(String value) {
            addCriterion("BILL_BALANCE_RECORD_ID >=", value, "billBalanceRecordId");
            return (Criteria) this;
        }

        public Criteria andBillBalanceRecordIdLessThan(String value) {
            addCriterion("BILL_BALANCE_RECORD_ID <", value, "billBalanceRecordId");
            return (Criteria) this;
        }

        public Criteria andBillBalanceRecordIdLessThanOrEqualTo(String value) {
            addCriterion("BILL_BALANCE_RECORD_ID <=", value, "billBalanceRecordId");
            return (Criteria) this;
        }

        public Criteria andBillBalanceRecordIdLike(String value) {
            addCriterion("BILL_BALANCE_RECORD_ID like", value, "billBalanceRecordId");
            return (Criteria) this;
        }

        public Criteria andBillBalanceRecordIdNotLike(String value) {
            addCriterion("BILL_BALANCE_RECORD_ID not like", value, "billBalanceRecordId");
            return (Criteria) this;
        }

        public Criteria andBillBalanceRecordIdIn(List<String> values) {
            addCriterion("BILL_BALANCE_RECORD_ID in", values, "billBalanceRecordId");
            return (Criteria) this;
        }

        public Criteria andBillBalanceRecordIdNotIn(List<String> values) {
            addCriterion("BILL_BALANCE_RECORD_ID not in", values, "billBalanceRecordId");
            return (Criteria) this;
        }

        public Criteria andBillBalanceRecordIdBetween(String value1, String value2) {
            addCriterion("BILL_BALANCE_RECORD_ID between", value1, value2, "billBalanceRecordId");
            return (Criteria) this;
        }

        public Criteria andBillBalanceRecordIdNotBetween(String value1, String value2) {
            addCriterion("BILL_BALANCE_RECORD_ID not between", value1, value2, "billBalanceRecordId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
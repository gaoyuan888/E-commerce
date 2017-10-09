package com.qunar.flight.cms.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ProductSaleStatExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductSaleStatExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andChannelIdIsNull() {
            addCriterion("channel_id is null");
            return (Criteria) this;
        }

        public Criteria andChannelIdIsNotNull() {
            addCriterion("channel_id is not null");
            return (Criteria) this;
        }

        public Criteria andChannelIdEqualTo(String value) {
            addCriterion("channel_id =", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotEqualTo(String value) {
            addCriterion("channel_id <>", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdGreaterThan(String value) {
            addCriterion("channel_id >", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdGreaterThanOrEqualTo(String value) {
            addCriterion("channel_id >=", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLessThan(String value) {
            addCriterion("channel_id <", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLessThanOrEqualTo(String value) {
            addCriterion("channel_id <=", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLike(String value) {
            addCriterion("channel_id like", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotLike(String value) {
            addCriterion("channel_id not like", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdIn(List<String> values) {
            addCriterion("channel_id in", values, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotIn(List<String> values) {
            addCriterion("channel_id not in", values, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdBetween(String value1, String value2) {
            addCriterion("channel_id between", value1, value2, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotBetween(String value1, String value2) {
            addCriterion("channel_id not between", value1, value2, "channelId");
            return (Criteria) this;
        }

        public Criteria andAimDateIsNull() {
            addCriterion("aim_date is null");
            return (Criteria) this;
        }

        public Criteria andAimDateIsNotNull() {
            addCriterion("aim_date is not null");
            return (Criteria) this;
        }

        public Criteria andAimDateEqualTo(Date value) {
            addCriterionForJDBCDate("aim_date =", value, "aimDate");
            return (Criteria) this;
        }

        public Criteria andAimDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("aim_date <>", value, "aimDate");
            return (Criteria) this;
        }

        public Criteria andAimDateGreaterThan(Date value) {
            addCriterionForJDBCDate("aim_date >", value, "aimDate");
            return (Criteria) this;
        }

        public Criteria andAimDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("aim_date >=", value, "aimDate");
            return (Criteria) this;
        }

        public Criteria andAimDateLessThan(Date value) {
            addCriterionForJDBCDate("aim_date <", value, "aimDate");
            return (Criteria) this;
        }

        public Criteria andAimDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("aim_date <=", value, "aimDate");
            return (Criteria) this;
        }

        public Criteria andAimDateIn(List<Date> values) {
            addCriterionForJDBCDate("aim_date in", values, "aimDate");
            return (Criteria) this;
        }

        public Criteria andAimDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("aim_date not in", values, "aimDate");
            return (Criteria) this;
        }

        public Criteria andAimDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("aim_date between", value1, value2, "aimDate");
            return (Criteria) this;
        }

        public Criteria andAimDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("aim_date not between", value1, value2, "aimDate");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(Integer value) {
            addCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(Integer value) {
            addCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(Integer value) {
            addCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(Integer value) {
            addCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(Integer value) {
            addCriterion("product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<Integer> values) {
            addCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<Integer> values) {
            addCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(Integer value1, Integer value2) {
            addCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(Integer value1, Integer value2) {
            addCriterion("product_id not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andSaleProductCountIsNull() {
            addCriterion("sale_product_count is null");
            return (Criteria) this;
        }

        public Criteria andSaleProductCountIsNotNull() {
            addCriterion("sale_product_count is not null");
            return (Criteria) this;
        }

        public Criteria andSaleProductCountEqualTo(Integer value) {
            addCriterion("sale_product_count =", value, "saleProductCount");
            return (Criteria) this;
        }

        public Criteria andSaleProductCountNotEqualTo(Integer value) {
            addCriterion("sale_product_count <>", value, "saleProductCount");
            return (Criteria) this;
        }

        public Criteria andSaleProductCountGreaterThan(Integer value) {
            addCriterion("sale_product_count >", value, "saleProductCount");
            return (Criteria) this;
        }

        public Criteria andSaleProductCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("sale_product_count >=", value, "saleProductCount");
            return (Criteria) this;
        }

        public Criteria andSaleProductCountLessThan(Integer value) {
            addCriterion("sale_product_count <", value, "saleProductCount");
            return (Criteria) this;
        }

        public Criteria andSaleProductCountLessThanOrEqualTo(Integer value) {
            addCriterion("sale_product_count <=", value, "saleProductCount");
            return (Criteria) this;
        }

        public Criteria andSaleProductCountIn(List<Integer> values) {
            addCriterion("sale_product_count in", values, "saleProductCount");
            return (Criteria) this;
        }

        public Criteria andSaleProductCountNotIn(List<Integer> values) {
            addCriterion("sale_product_count not in", values, "saleProductCount");
            return (Criteria) this;
        }

        public Criteria andSaleProductCountBetween(Integer value1, Integer value2) {
            addCriterion("sale_product_count between", value1, value2, "saleProductCount");
            return (Criteria) this;
        }

        public Criteria andSaleProductCountNotBetween(Integer value1, Integer value2) {
            addCriterion("sale_product_count not between", value1, value2, "saleProductCount");
            return (Criteria) this;
        }

        public Criteria andWithdrawalProductCountIsNull() {
            addCriterion("withdrawal_product_count is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawalProductCountIsNotNull() {
            addCriterion("withdrawal_product_count is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawalProductCountEqualTo(Integer value) {
            addCriterion("withdrawal_product_count =", value, "withdrawalProductCount");
            return (Criteria) this;
        }

        public Criteria andWithdrawalProductCountNotEqualTo(Integer value) {
            addCriterion("withdrawal_product_count <>", value, "withdrawalProductCount");
            return (Criteria) this;
        }

        public Criteria andWithdrawalProductCountGreaterThan(Integer value) {
            addCriterion("withdrawal_product_count >", value, "withdrawalProductCount");
            return (Criteria) this;
        }

        public Criteria andWithdrawalProductCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("withdrawal_product_count >=", value, "withdrawalProductCount");
            return (Criteria) this;
        }

        public Criteria andWithdrawalProductCountLessThan(Integer value) {
            addCriterion("withdrawal_product_count <", value, "withdrawalProductCount");
            return (Criteria) this;
        }

        public Criteria andWithdrawalProductCountLessThanOrEqualTo(Integer value) {
            addCriterion("withdrawal_product_count <=", value, "withdrawalProductCount");
            return (Criteria) this;
        }

        public Criteria andWithdrawalProductCountIn(List<Integer> values) {
            addCriterion("withdrawal_product_count in", values, "withdrawalProductCount");
            return (Criteria) this;
        }

        public Criteria andWithdrawalProductCountNotIn(List<Integer> values) {
            addCriterion("withdrawal_product_count not in", values, "withdrawalProductCount");
            return (Criteria) this;
        }

        public Criteria andWithdrawalProductCountBetween(Integer value1, Integer value2) {
            addCriterion("withdrawal_product_count between", value1, value2, "withdrawalProductCount");
            return (Criteria) this;
        }

        public Criteria andWithdrawalProductCountNotBetween(Integer value1, Integer value2) {
            addCriterion("withdrawal_product_count not between", value1, value2, "withdrawalProductCount");
            return (Criteria) this;
        }

        public Criteria andSaleAmountIsNull() {
            addCriterion("sale_amount is null");
            return (Criteria) this;
        }

        public Criteria andSaleAmountIsNotNull() {
            addCriterion("sale_amount is not null");
            return (Criteria) this;
        }

        public Criteria andSaleAmountEqualTo(BigDecimal value) {
            addCriterion("sale_amount =", value, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andSaleAmountNotEqualTo(BigDecimal value) {
            addCriterion("sale_amount <>", value, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andSaleAmountGreaterThan(BigDecimal value) {
            addCriterion("sale_amount >", value, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andSaleAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sale_amount >=", value, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andSaleAmountLessThan(BigDecimal value) {
            addCriterion("sale_amount <", value, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andSaleAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sale_amount <=", value, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andSaleAmountIn(List<BigDecimal> values) {
            addCriterion("sale_amount in", values, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andSaleAmountNotIn(List<BigDecimal> values) {
            addCriterion("sale_amount not in", values, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andSaleAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sale_amount between", value1, value2, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andSaleAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sale_amount not between", value1, value2, "saleAmount");
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
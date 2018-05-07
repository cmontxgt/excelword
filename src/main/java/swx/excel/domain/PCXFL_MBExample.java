package swx.excel.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PCXFL_MBExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PCXFL_MBExample() {
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

        public Criteria andPcxflBmIsNull() {
            addCriterion("PCXFL_BM is null");
            return (Criteria) this;
        }

        public Criteria andPcxflBmIsNotNull() {
            addCriterion("PCXFL_BM is not null");
            return (Criteria) this;
        }

        public Criteria andPcxflBmEqualTo(String value) {
            addCriterion("PCXFL_BM =", value, "pcxflBm");
            return (Criteria) this;
        }

        public Criteria andPcxflBmNotEqualTo(String value) {
            addCriterion("PCXFL_BM <>", value, "pcxflBm");
            return (Criteria) this;
        }

        public Criteria andPcxflBmGreaterThan(String value) {
            addCriterion("PCXFL_BM >", value, "pcxflBm");
            return (Criteria) this;
        }

        public Criteria andPcxflBmGreaterThanOrEqualTo(String value) {
            addCriterion("PCXFL_BM >=", value, "pcxflBm");
            return (Criteria) this;
        }

        public Criteria andPcxflBmLessThan(String value) {
            addCriterion("PCXFL_BM <", value, "pcxflBm");
            return (Criteria) this;
        }

        public Criteria andPcxflBmLessThanOrEqualTo(String value) {
            addCriterion("PCXFL_BM <=", value, "pcxflBm");
            return (Criteria) this;
        }

        public Criteria andPcxflBmLike(String value) {
            addCriterion("PCXFL_BM like", value, "pcxflBm");
            return (Criteria) this;
        }

        public Criteria andPcxflBmNotLike(String value) {
            addCriterion("PCXFL_BM not like", value, "pcxflBm");
            return (Criteria) this;
        }

        public Criteria andPcxflBmIn(List<String> values) {
            addCriterion("PCXFL_BM in", values, "pcxflBm");
            return (Criteria) this;
        }

        public Criteria andPcxflBmNotIn(List<String> values) {
            addCriterion("PCXFL_BM not in", values, "pcxflBm");
            return (Criteria) this;
        }

        public Criteria andPcxflBmBetween(String value1, String value2) {
            addCriterion("PCXFL_BM between", value1, value2, "pcxflBm");
            return (Criteria) this;
        }

        public Criteria andPcxflBmNotBetween(String value1, String value2) {
            addCriterion("PCXFL_BM not between", value1, value2, "pcxflBm");
            return (Criteria) this;
        }

        public Criteria andPcxflMcIsNull() {
            addCriterion("PCXFL_MC is null");
            return (Criteria) this;
        }

        public Criteria andPcxflMcIsNotNull() {
            addCriterion("PCXFL_MC is not null");
            return (Criteria) this;
        }

        public Criteria andPcxflMcEqualTo(String value) {
            addCriterion("PCXFL_MC =", value, "pcxflMc");
            return (Criteria) this;
        }

        public Criteria andPcxflMcNotEqualTo(String value) {
            addCriterion("PCXFL_MC <>", value, "pcxflMc");
            return (Criteria) this;
        }

        public Criteria andPcxflMcGreaterThan(String value) {
            addCriterion("PCXFL_MC >", value, "pcxflMc");
            return (Criteria) this;
        }

        public Criteria andPcxflMcGreaterThanOrEqualTo(String value) {
            addCriterion("PCXFL_MC >=", value, "pcxflMc");
            return (Criteria) this;
        }

        public Criteria andPcxflMcLessThan(String value) {
            addCriterion("PCXFL_MC <", value, "pcxflMc");
            return (Criteria) this;
        }

        public Criteria andPcxflMcLessThanOrEqualTo(String value) {
            addCriterion("PCXFL_MC <=", value, "pcxflMc");
            return (Criteria) this;
        }

        public Criteria andPcxflMcLike(String value) {
            addCriterion("PCXFL_MC like", value, "pcxflMc");
            return (Criteria) this;
        }

        public Criteria andPcxflMcNotLike(String value) {
            addCriterion("PCXFL_MC not like", value, "pcxflMc");
            return (Criteria) this;
        }

        public Criteria andPcxflMcIn(List<String> values) {
            addCriterion("PCXFL_MC in", values, "pcxflMc");
            return (Criteria) this;
        }

        public Criteria andPcxflMcNotIn(List<String> values) {
            addCriterion("PCXFL_MC not in", values, "pcxflMc");
            return (Criteria) this;
        }

        public Criteria andPcxflMcBetween(String value1, String value2) {
            addCriterion("PCXFL_MC between", value1, value2, "pcxflMc");
            return (Criteria) this;
        }

        public Criteria andPcxflMcNotBetween(String value1, String value2) {
            addCriterion("PCXFL_MC not between", value1, value2, "pcxflMc");
            return (Criteria) this;
        }

        public Criteria andPcxflFbmIsNull() {
            addCriterion("PCXFL_FBM is null");
            return (Criteria) this;
        }

        public Criteria andPcxflFbmIsNotNull() {
            addCriterion("PCXFL_FBM is not null");
            return (Criteria) this;
        }

        public Criteria andPcxflFbmEqualTo(String value) {
            addCriterion("PCXFL_FBM =", value, "pcxflFbm");
            return (Criteria) this;
        }

        public Criteria andPcxflFbmNotEqualTo(String value) {
            addCriterion("PCXFL_FBM <>", value, "pcxflFbm");
            return (Criteria) this;
        }

        public Criteria andPcxflFbmGreaterThan(String value) {
            addCriterion("PCXFL_FBM >", value, "pcxflFbm");
            return (Criteria) this;
        }

        public Criteria andPcxflFbmGreaterThanOrEqualTo(String value) {
            addCriterion("PCXFL_FBM >=", value, "pcxflFbm");
            return (Criteria) this;
        }

        public Criteria andPcxflFbmLessThan(String value) {
            addCriterion("PCXFL_FBM <", value, "pcxflFbm");
            return (Criteria) this;
        }

        public Criteria andPcxflFbmLessThanOrEqualTo(String value) {
            addCriterion("PCXFL_FBM <=", value, "pcxflFbm");
            return (Criteria) this;
        }

        public Criteria andPcxflFbmLike(String value) {
            addCriterion("PCXFL_FBM like", value, "pcxflFbm");
            return (Criteria) this;
        }

        public Criteria andPcxflFbmNotLike(String value) {
            addCriterion("PCXFL_FBM not like", value, "pcxflFbm");
            return (Criteria) this;
        }

        public Criteria andPcxflFbmIn(List<String> values) {
            addCriterion("PCXFL_FBM in", values, "pcxflFbm");
            return (Criteria) this;
        }

        public Criteria andPcxflFbmNotIn(List<String> values) {
            addCriterion("PCXFL_FBM not in", values, "pcxflFbm");
            return (Criteria) this;
        }

        public Criteria andPcxflFbmBetween(String value1, String value2) {
            addCriterion("PCXFL_FBM between", value1, value2, "pcxflFbm");
            return (Criteria) this;
        }

        public Criteria andPcxflFbmNotBetween(String value1, String value2) {
            addCriterion("PCXFL_FBM not between", value1, value2, "pcxflFbm");
            return (Criteria) this;
        }

        public Criteria andFzIsNull() {
            addCriterion("FZ is null");
            return (Criteria) this;
        }

        public Criteria andFzIsNotNull() {
            addCriterion("FZ is not null");
            return (Criteria) this;
        }

        public Criteria andFzEqualTo(BigDecimal value) {
            addCriterion("FZ =", value, "fz");
            return (Criteria) this;
        }

        public Criteria andFzNotEqualTo(BigDecimal value) {
            addCriterion("FZ <>", value, "fz");
            return (Criteria) this;
        }

        public Criteria andFzGreaterThan(BigDecimal value) {
            addCriterion("FZ >", value, "fz");
            return (Criteria) this;
        }

        public Criteria andFzGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FZ >=", value, "fz");
            return (Criteria) this;
        }

        public Criteria andFzLessThan(BigDecimal value) {
            addCriterion("FZ <", value, "fz");
            return (Criteria) this;
        }

        public Criteria andFzLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FZ <=", value, "fz");
            return (Criteria) this;
        }

        public Criteria andFzIn(List<BigDecimal> values) {
            addCriterion("FZ in", values, "fz");
            return (Criteria) this;
        }

        public Criteria andFzNotIn(List<BigDecimal> values) {
            addCriterion("FZ not in", values, "fz");
            return (Criteria) this;
        }

        public Criteria andFzBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FZ between", value1, value2, "fz");
            return (Criteria) this;
        }

        public Criteria andFzNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FZ not between", value1, value2, "fz");
            return (Criteria) this;
        }

        public Criteria andPclbBmIsNull() {
            addCriterion("PCLB_BM is null");
            return (Criteria) this;
        }

        public Criteria andPclbBmIsNotNull() {
            addCriterion("PCLB_BM is not null");
            return (Criteria) this;
        }

        public Criteria andPclbBmEqualTo(String value) {
            addCriterion("PCLB_BM =", value, "pclbBm");
            return (Criteria) this;
        }

        public Criteria andPclbBmNotEqualTo(String value) {
            addCriterion("PCLB_BM <>", value, "pclbBm");
            return (Criteria) this;
        }

        public Criteria andPclbBmGreaterThan(String value) {
            addCriterion("PCLB_BM >", value, "pclbBm");
            return (Criteria) this;
        }

        public Criteria andPclbBmGreaterThanOrEqualTo(String value) {
            addCriterion("PCLB_BM >=", value, "pclbBm");
            return (Criteria) this;
        }

        public Criteria andPclbBmLessThan(String value) {
            addCriterion("PCLB_BM <", value, "pclbBm");
            return (Criteria) this;
        }

        public Criteria andPclbBmLessThanOrEqualTo(String value) {
            addCriterion("PCLB_BM <=", value, "pclbBm");
            return (Criteria) this;
        }

        public Criteria andPclbBmLike(String value) {
            addCriterion("PCLB_BM like", value, "pclbBm");
            return (Criteria) this;
        }

        public Criteria andPclbBmNotLike(String value) {
            addCriterion("PCLB_BM not like", value, "pclbBm");
            return (Criteria) this;
        }

        public Criteria andPclbBmIn(List<String> values) {
            addCriterion("PCLB_BM in", values, "pclbBm");
            return (Criteria) this;
        }

        public Criteria andPclbBmNotIn(List<String> values) {
            addCriterion("PCLB_BM not in", values, "pclbBm");
            return (Criteria) this;
        }

        public Criteria andPclbBmBetween(String value1, String value2) {
            addCriterion("PCLB_BM between", value1, value2, "pclbBm");
            return (Criteria) this;
        }

        public Criteria andPclbBmNotBetween(String value1, String value2) {
            addCriterion("PCLB_BM not between", value1, value2, "pclbBm");
            return (Criteria) this;
        }

        public Criteria andSxIsNull() {
            addCriterion("SX is null");
            return (Criteria) this;
        }

        public Criteria andSxIsNotNull() {
            addCriterion("SX is not null");
            return (Criteria) this;
        }

        public Criteria andSxEqualTo(BigDecimal value) {
            addCriterion("SX =", value, "sx");
            return (Criteria) this;
        }

        public Criteria andSxNotEqualTo(BigDecimal value) {
            addCriterion("SX <>", value, "sx");
            return (Criteria) this;
        }

        public Criteria andSxGreaterThan(BigDecimal value) {
            addCriterion("SX >", value, "sx");
            return (Criteria) this;
        }

        public Criteria andSxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SX >=", value, "sx");
            return (Criteria) this;
        }

        public Criteria andSxLessThan(BigDecimal value) {
            addCriterion("SX <", value, "sx");
            return (Criteria) this;
        }

        public Criteria andSxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SX <=", value, "sx");
            return (Criteria) this;
        }

        public Criteria andSxIn(List<BigDecimal> values) {
            addCriterion("SX in", values, "sx");
            return (Criteria) this;
        }

        public Criteria andSxNotIn(List<BigDecimal> values) {
            addCriterion("SX not in", values, "sx");
            return (Criteria) this;
        }

        public Criteria andSxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SX between", value1, value2, "sx");
            return (Criteria) this;
        }

        public Criteria andSxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SX not between", value1, value2, "sx");
            return (Criteria) this;
        }

        public Criteria andSftjIsNull() {
            addCriterion("SFTJ is null");
            return (Criteria) this;
        }

        public Criteria andSftjIsNotNull() {
            addCriterion("SFTJ is not null");
            return (Criteria) this;
        }

        public Criteria andSftjEqualTo(String value) {
            addCriterion("SFTJ =", value, "sftj");
            return (Criteria) this;
        }

        public Criteria andSftjNotEqualTo(String value) {
            addCriterion("SFTJ <>", value, "sftj");
            return (Criteria) this;
        }

        public Criteria andSftjGreaterThan(String value) {
            addCriterion("SFTJ >", value, "sftj");
            return (Criteria) this;
        }

        public Criteria andSftjGreaterThanOrEqualTo(String value) {
            addCriterion("SFTJ >=", value, "sftj");
            return (Criteria) this;
        }

        public Criteria andSftjLessThan(String value) {
            addCriterion("SFTJ <", value, "sftj");
            return (Criteria) this;
        }

        public Criteria andSftjLessThanOrEqualTo(String value) {
            addCriterion("SFTJ <=", value, "sftj");
            return (Criteria) this;
        }

        public Criteria andSftjLike(String value) {
            addCriterion("SFTJ like", value, "sftj");
            return (Criteria) this;
        }

        public Criteria andSftjNotLike(String value) {
            addCriterion("SFTJ not like", value, "sftj");
            return (Criteria) this;
        }

        public Criteria andSftjIn(List<String> values) {
            addCriterion("SFTJ in", values, "sftj");
            return (Criteria) this;
        }

        public Criteria andSftjNotIn(List<String> values) {
            addCriterion("SFTJ not in", values, "sftj");
            return (Criteria) this;
        }

        public Criteria andSftjBetween(String value1, String value2) {
            addCriterion("SFTJ between", value1, value2, "sftj");
            return (Criteria) this;
        }

        public Criteria andSftjNotBetween(String value1, String value2) {
            addCriterion("SFTJ not between", value1, value2, "sftj");
            return (Criteria) this;
        }

        public Criteria andPcxflBzIsNull() {
            addCriterion("PCXFL_BZ is null");
            return (Criteria) this;
        }

        public Criteria andPcxflBzIsNotNull() {
            addCriterion("PCXFL_BZ is not null");
            return (Criteria) this;
        }

        public Criteria andPcxflBzEqualTo(String value) {
            addCriterion("PCXFL_BZ =", value, "pcxflBz");
            return (Criteria) this;
        }

        public Criteria andPcxflBzNotEqualTo(String value) {
            addCriterion("PCXFL_BZ <>", value, "pcxflBz");
            return (Criteria) this;
        }

        public Criteria andPcxflBzGreaterThan(String value) {
            addCriterion("PCXFL_BZ >", value, "pcxflBz");
            return (Criteria) this;
        }

        public Criteria andPcxflBzGreaterThanOrEqualTo(String value) {
            addCriterion("PCXFL_BZ >=", value, "pcxflBz");
            return (Criteria) this;
        }

        public Criteria andPcxflBzLessThan(String value) {
            addCriterion("PCXFL_BZ <", value, "pcxflBz");
            return (Criteria) this;
        }

        public Criteria andPcxflBzLessThanOrEqualTo(String value) {
            addCriterion("PCXFL_BZ <=", value, "pcxflBz");
            return (Criteria) this;
        }

        public Criteria andPcxflBzLike(String value) {
            addCriterion("PCXFL_BZ like", value, "pcxflBz");
            return (Criteria) this;
        }

        public Criteria andPcxflBzNotLike(String value) {
            addCriterion("PCXFL_BZ not like", value, "pcxflBz");
            return (Criteria) this;
        }

        public Criteria andPcxflBzIn(List<String> values) {
            addCriterion("PCXFL_BZ in", values, "pcxflBz");
            return (Criteria) this;
        }

        public Criteria andPcxflBzNotIn(List<String> values) {
            addCriterion("PCXFL_BZ not in", values, "pcxflBz");
            return (Criteria) this;
        }

        public Criteria andPcxflBzBetween(String value1, String value2) {
            addCriterion("PCXFL_BZ between", value1, value2, "pcxflBz");
            return (Criteria) this;
        }

        public Criteria andPcxflBzNotBetween(String value1, String value2) {
            addCriterion("PCXFL_BZ not between", value1, value2, "pcxflBz");
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
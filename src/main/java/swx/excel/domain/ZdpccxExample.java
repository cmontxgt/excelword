package swx.excel.domain;

import java.util.ArrayList;
import java.util.List;

public class ZdpccxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZdpccxExample() {
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

        public Criteria andZdpcCxbmIsNull() {
            addCriterion("ZDPC_CXBM is null");
            return (Criteria) this;
        }

        public Criteria andZdpcCxbmIsNotNull() {
            addCriterion("ZDPC_CXBM is not null");
            return (Criteria) this;
        }

        public Criteria andZdpcCxbmEqualTo(String value) {
            addCriterion("ZDPC_CXBM =", value, "zdpcCxbm");
            return (Criteria) this;
        }

        public Criteria andZdpcCxbmNotEqualTo(String value) {
            addCriterion("ZDPC_CXBM <>", value, "zdpcCxbm");
            return (Criteria) this;
        }

        public Criteria andZdpcCxbmGreaterThan(String value) {
            addCriterion("ZDPC_CXBM >", value, "zdpcCxbm");
            return (Criteria) this;
        }

        public Criteria andZdpcCxbmGreaterThanOrEqualTo(String value) {
            addCriterion("ZDPC_CXBM >=", value, "zdpcCxbm");
            return (Criteria) this;
        }

        public Criteria andZdpcCxbmLessThan(String value) {
            addCriterion("ZDPC_CXBM <", value, "zdpcCxbm");
            return (Criteria) this;
        }

        public Criteria andZdpcCxbmLessThanOrEqualTo(String value) {
            addCriterion("ZDPC_CXBM <=", value, "zdpcCxbm");
            return (Criteria) this;
        }

        public Criteria andZdpcCxbmLike(String value) {
            addCriterion("ZDPC_CXBM like", value, "zdpcCxbm");
            return (Criteria) this;
        }

        public Criteria andZdpcCxbmNotLike(String value) {
            addCriterion("ZDPC_CXBM not like", value, "zdpcCxbm");
            return (Criteria) this;
        }

        public Criteria andZdpcCxbmIn(List<String> values) {
            addCriterion("ZDPC_CXBM in", values, "zdpcCxbm");
            return (Criteria) this;
        }

        public Criteria andZdpcCxbmNotIn(List<String> values) {
            addCriterion("ZDPC_CXBM not in", values, "zdpcCxbm");
            return (Criteria) this;
        }

        public Criteria andZdpcCxbmBetween(String value1, String value2) {
            addCriterion("ZDPC_CXBM between", value1, value2, "zdpcCxbm");
            return (Criteria) this;
        }

        public Criteria andZdpcCxbmNotBetween(String value1, String value2) {
            addCriterion("ZDPC_CXBM not between", value1, value2, "zdpcCxbm");
            return (Criteria) this;
        }

        public Criteria andDwbmIsNull() {
            addCriterion("DWBM is null");
            return (Criteria) this;
        }

        public Criteria andDwbmIsNotNull() {
            addCriterion("DWBM is not null");
            return (Criteria) this;
        }

        public Criteria andDwbmEqualTo(String value) {
            addCriterion("DWBM =", value, "dwbm");
            return (Criteria) this;
        }

        public Criteria andDwbmNotEqualTo(String value) {
            addCriterion("DWBM <>", value, "dwbm");
            return (Criteria) this;
        }

        public Criteria andDwbmGreaterThan(String value) {
            addCriterion("DWBM >", value, "dwbm");
            return (Criteria) this;
        }

        public Criteria andDwbmGreaterThanOrEqualTo(String value) {
            addCriterion("DWBM >=", value, "dwbm");
            return (Criteria) this;
        }

        public Criteria andDwbmLessThan(String value) {
            addCriterion("DWBM <", value, "dwbm");
            return (Criteria) this;
        }

        public Criteria andDwbmLessThanOrEqualTo(String value) {
            addCriterion("DWBM <=", value, "dwbm");
            return (Criteria) this;
        }

        public Criteria andDwbmLike(String value) {
            addCriterion("DWBM like", value, "dwbm");
            return (Criteria) this;
        }

        public Criteria andDwbmNotLike(String value) {
            addCriterion("DWBM not like", value, "dwbm");
            return (Criteria) this;
        }

        public Criteria andDwbmIn(List<String> values) {
            addCriterion("DWBM in", values, "dwbm");
            return (Criteria) this;
        }

        public Criteria andDwbmNotIn(List<String> values) {
            addCriterion("DWBM not in", values, "dwbm");
            return (Criteria) this;
        }

        public Criteria andDwbmBetween(String value1, String value2) {
            addCriterion("DWBM between", value1, value2, "dwbm");
            return (Criteria) this;
        }

        public Criteria andDwbmNotBetween(String value1, String value2) {
            addCriterion("DWBM not between", value1, value2, "dwbm");
            return (Criteria) this;
        }

        public Criteria andZdpcCxmcIsNull() {
            addCriterion("ZDPC_CXMC is null");
            return (Criteria) this;
        }

        public Criteria andZdpcCxmcIsNotNull() {
            addCriterion("ZDPC_CXMC is not null");
            return (Criteria) this;
        }

        public Criteria andZdpcCxmcEqualTo(String value) {
            addCriterion("ZDPC_CXMC =", value, "zdpcCxmc");
            return (Criteria) this;
        }

        public Criteria andZdpcCxmcNotEqualTo(String value) {
            addCriterion("ZDPC_CXMC <>", value, "zdpcCxmc");
            return (Criteria) this;
        }

        public Criteria andZdpcCxmcGreaterThan(String value) {
            addCriterion("ZDPC_CXMC >", value, "zdpcCxmc");
            return (Criteria) this;
        }

        public Criteria andZdpcCxmcGreaterThanOrEqualTo(String value) {
            addCriterion("ZDPC_CXMC >=", value, "zdpcCxmc");
            return (Criteria) this;
        }

        public Criteria andZdpcCxmcLessThan(String value) {
            addCriterion("ZDPC_CXMC <", value, "zdpcCxmc");
            return (Criteria) this;
        }

        public Criteria andZdpcCxmcLessThanOrEqualTo(String value) {
            addCriterion("ZDPC_CXMC <=", value, "zdpcCxmc");
            return (Criteria) this;
        }

        public Criteria andZdpcCxmcLike(String value) {
            addCriterion("ZDPC_CXMC like", value, "zdpcCxmc");
            return (Criteria) this;
        }

        public Criteria andZdpcCxmcNotLike(String value) {
            addCriterion("ZDPC_CXMC not like", value, "zdpcCxmc");
            return (Criteria) this;
        }

        public Criteria andZdpcCxmcIn(List<String> values) {
            addCriterion("ZDPC_CXMC in", values, "zdpcCxmc");
            return (Criteria) this;
        }

        public Criteria andZdpcCxmcNotIn(List<String> values) {
            addCriterion("ZDPC_CXMC not in", values, "zdpcCxmc");
            return (Criteria) this;
        }

        public Criteria andZdpcCxmcBetween(String value1, String value2) {
            addCriterion("ZDPC_CXMC between", value1, value2, "zdpcCxmc");
            return (Criteria) this;
        }

        public Criteria andZdpcCxmcNotBetween(String value1, String value2) {
            addCriterion("ZDPC_CXMC not between", value1, value2, "zdpcCxmc");
            return (Criteria) this;
        }

        public Criteria andZdpcCxsmIsNull() {
            addCriterion("ZDPC_CXSM is null");
            return (Criteria) this;
        }

        public Criteria andZdpcCxsmIsNotNull() {
            addCriterion("ZDPC_CXSM is not null");
            return (Criteria) this;
        }

        public Criteria andZdpcCxsmEqualTo(String value) {
            addCriterion("ZDPC_CXSM =", value, "zdpcCxsm");
            return (Criteria) this;
        }

        public Criteria andZdpcCxsmNotEqualTo(String value) {
            addCriterion("ZDPC_CXSM <>", value, "zdpcCxsm");
            return (Criteria) this;
        }

        public Criteria andZdpcCxsmGreaterThan(String value) {
            addCriterion("ZDPC_CXSM >", value, "zdpcCxsm");
            return (Criteria) this;
        }

        public Criteria andZdpcCxsmGreaterThanOrEqualTo(String value) {
            addCriterion("ZDPC_CXSM >=", value, "zdpcCxsm");
            return (Criteria) this;
        }

        public Criteria andZdpcCxsmLessThan(String value) {
            addCriterion("ZDPC_CXSM <", value, "zdpcCxsm");
            return (Criteria) this;
        }

        public Criteria andZdpcCxsmLessThanOrEqualTo(String value) {
            addCriterion("ZDPC_CXSM <=", value, "zdpcCxsm");
            return (Criteria) this;
        }

        public Criteria andZdpcCxsmLike(String value) {
            addCriterion("ZDPC_CXSM like", value, "zdpcCxsm");
            return (Criteria) this;
        }

        public Criteria andZdpcCxsmNotLike(String value) {
            addCriterion("ZDPC_CXSM not like", value, "zdpcCxsm");
            return (Criteria) this;
        }

        public Criteria andZdpcCxsmIn(List<String> values) {
            addCriterion("ZDPC_CXSM in", values, "zdpcCxsm");
            return (Criteria) this;
        }

        public Criteria andZdpcCxsmNotIn(List<String> values) {
            addCriterion("ZDPC_CXSM not in", values, "zdpcCxsm");
            return (Criteria) this;
        }

        public Criteria andZdpcCxsmBetween(String value1, String value2) {
            addCriterion("ZDPC_CXSM between", value1, value2, "zdpcCxsm");
            return (Criteria) this;
        }

        public Criteria andZdpcCxsmNotBetween(String value1, String value2) {
            addCriterion("ZDPC_CXSM not between", value1, value2, "zdpcCxsm");
            return (Criteria) this;
        }

        public Criteria andZdpcCxlxIsNull() {
            addCriterion("ZDPC_CXLX is null");
            return (Criteria) this;
        }

        public Criteria andZdpcCxlxIsNotNull() {
            addCriterion("ZDPC_CXLX is not null");
            return (Criteria) this;
        }

        public Criteria andZdpcCxlxEqualTo(String value) {
            addCriterion("ZDPC_CXLX =", value, "zdpcCxlx");
            return (Criteria) this;
        }

        public Criteria andZdpcCxlxNotEqualTo(String value) {
            addCriterion("ZDPC_CXLX <>", value, "zdpcCxlx");
            return (Criteria) this;
        }

        public Criteria andZdpcCxlxGreaterThan(String value) {
            addCriterion("ZDPC_CXLX >", value, "zdpcCxlx");
            return (Criteria) this;
        }

        public Criteria andZdpcCxlxGreaterThanOrEqualTo(String value) {
            addCriterion("ZDPC_CXLX >=", value, "zdpcCxlx");
            return (Criteria) this;
        }

        public Criteria andZdpcCxlxLessThan(String value) {
            addCriterion("ZDPC_CXLX <", value, "zdpcCxlx");
            return (Criteria) this;
        }

        public Criteria andZdpcCxlxLessThanOrEqualTo(String value) {
            addCriterion("ZDPC_CXLX <=", value, "zdpcCxlx");
            return (Criteria) this;
        }

        public Criteria andZdpcCxlxLike(String value) {
            addCriterion("ZDPC_CXLX like", value, "zdpcCxlx");
            return (Criteria) this;
        }

        public Criteria andZdpcCxlxNotLike(String value) {
            addCriterion("ZDPC_CXLX not like", value, "zdpcCxlx");
            return (Criteria) this;
        }

        public Criteria andZdpcCxlxIn(List<String> values) {
            addCriterion("ZDPC_CXLX in", values, "zdpcCxlx");
            return (Criteria) this;
        }

        public Criteria andZdpcCxlxNotIn(List<String> values) {
            addCriterion("ZDPC_CXLX not in", values, "zdpcCxlx");
            return (Criteria) this;
        }

        public Criteria andZdpcCxlxBetween(String value1, String value2) {
            addCriterion("ZDPC_CXLX between", value1, value2, "zdpcCxlx");
            return (Criteria) this;
        }

        public Criteria andZdpcCxlxNotBetween(String value1, String value2) {
            addCriterion("ZDPC_CXLX not between", value1, value2, "zdpcCxlx");
            return (Criteria) this;
        }

        public Criteria andZdpcCxIsNull() {
            addCriterion("ZDPC_CX is null");
            return (Criteria) this;
        }

        public Criteria andZdpcCxIsNotNull() {
            addCriterion("ZDPC_CX is not null");
            return (Criteria) this;
        }

        public Criteria andZdpcCxEqualTo(String value) {
            addCriterion("ZDPC_CX =", value, "zdpcCx");
            return (Criteria) this;
        }

        public Criteria andZdpcCxNotEqualTo(String value) {
            addCriterion("ZDPC_CX <>", value, "zdpcCx");
            return (Criteria) this;
        }

        public Criteria andZdpcCxGreaterThan(String value) {
            addCriterion("ZDPC_CX >", value, "zdpcCx");
            return (Criteria) this;
        }

        public Criteria andZdpcCxGreaterThanOrEqualTo(String value) {
            addCriterion("ZDPC_CX >=", value, "zdpcCx");
            return (Criteria) this;
        }

        public Criteria andZdpcCxLessThan(String value) {
            addCriterion("ZDPC_CX <", value, "zdpcCx");
            return (Criteria) this;
        }

        public Criteria andZdpcCxLessThanOrEqualTo(String value) {
            addCriterion("ZDPC_CX <=", value, "zdpcCx");
            return (Criteria) this;
        }

        public Criteria andZdpcCxLike(String value) {
            addCriterion("ZDPC_CX like", value, "zdpcCx");
            return (Criteria) this;
        }

        public Criteria andZdpcCxNotLike(String value) {
            addCriterion("ZDPC_CX not like", value, "zdpcCx");
            return (Criteria) this;
        }

        public Criteria andZdpcCxIn(List<String> values) {
            addCriterion("ZDPC_CX in", values, "zdpcCx");
            return (Criteria) this;
        }

        public Criteria andZdpcCxNotIn(List<String> values) {
            addCriterion("ZDPC_CX not in", values, "zdpcCx");
            return (Criteria) this;
        }

        public Criteria andZdpcCxBetween(String value1, String value2) {
            addCriterion("ZDPC_CX between", value1, value2, "zdpcCx");
            return (Criteria) this;
        }

        public Criteria andZdpcCxNotBetween(String value1, String value2) {
            addCriterion("ZDPC_CX not between", value1, value2, "zdpcCx");
            return (Criteria) this;
        }

        public Criteria andZdpcCxcsIsNull() {
            addCriterion("ZDPC_CXCS is null");
            return (Criteria) this;
        }

        public Criteria andZdpcCxcsIsNotNull() {
            addCriterion("ZDPC_CXCS is not null");
            return (Criteria) this;
        }

        public Criteria andZdpcCxcsEqualTo(String value) {
            addCriterion("ZDPC_CXCS =", value, "zdpcCxcs");
            return (Criteria) this;
        }

        public Criteria andZdpcCxcsNotEqualTo(String value) {
            addCriterion("ZDPC_CXCS <>", value, "zdpcCxcs");
            return (Criteria) this;
        }

        public Criteria andZdpcCxcsGreaterThan(String value) {
            addCriterion("ZDPC_CXCS >", value, "zdpcCxcs");
            return (Criteria) this;
        }

        public Criteria andZdpcCxcsGreaterThanOrEqualTo(String value) {
            addCriterion("ZDPC_CXCS >=", value, "zdpcCxcs");
            return (Criteria) this;
        }

        public Criteria andZdpcCxcsLessThan(String value) {
            addCriterion("ZDPC_CXCS <", value, "zdpcCxcs");
            return (Criteria) this;
        }

        public Criteria andZdpcCxcsLessThanOrEqualTo(String value) {
            addCriterion("ZDPC_CXCS <=", value, "zdpcCxcs");
            return (Criteria) this;
        }

        public Criteria andZdpcCxcsLike(String value) {
            addCriterion("ZDPC_CXCS like", value, "zdpcCxcs");
            return (Criteria) this;
        }

        public Criteria andZdpcCxcsNotLike(String value) {
            addCriterion("ZDPC_CXCS not like", value, "zdpcCxcs");
            return (Criteria) this;
        }

        public Criteria andZdpcCxcsIn(List<String> values) {
            addCriterion("ZDPC_CXCS in", values, "zdpcCxcs");
            return (Criteria) this;
        }

        public Criteria andZdpcCxcsNotIn(List<String> values) {
            addCriterion("ZDPC_CXCS not in", values, "zdpcCxcs");
            return (Criteria) this;
        }

        public Criteria andZdpcCxcsBetween(String value1, String value2) {
            addCriterion("ZDPC_CXCS between", value1, value2, "zdpcCxcs");
            return (Criteria) this;
        }

        public Criteria andZdpcCxcsNotBetween(String value1, String value2) {
            addCriterion("ZDPC_CXCS not between", value1, value2, "zdpcCxcs");
            return (Criteria) this;
        }

        public Criteria andFpztBhIsNull() {
            addCriterion("FPZT_BH is null");
            return (Criteria) this;
        }

        public Criteria andFpztBhIsNotNull() {
            addCriterion("FPZT_BH is not null");
            return (Criteria) this;
        }

        public Criteria andFpztBhEqualTo(String value) {
            addCriterion("FPZT_BH =", value, "fpztBh");
            return (Criteria) this;
        }

        public Criteria andFpztBhNotEqualTo(String value) {
            addCriterion("FPZT_BH <>", value, "fpztBh");
            return (Criteria) this;
        }

        public Criteria andFpztBhGreaterThan(String value) {
            addCriterion("FPZT_BH >", value, "fpztBh");
            return (Criteria) this;
        }

        public Criteria andFpztBhGreaterThanOrEqualTo(String value) {
            addCriterion("FPZT_BH >=", value, "fpztBh");
            return (Criteria) this;
        }

        public Criteria andFpztBhLessThan(String value) {
            addCriterion("FPZT_BH <", value, "fpztBh");
            return (Criteria) this;
        }

        public Criteria andFpztBhLessThanOrEqualTo(String value) {
            addCriterion("FPZT_BH <=", value, "fpztBh");
            return (Criteria) this;
        }

        public Criteria andFpztBhLike(String value) {
            addCriterion("FPZT_BH like", value, "fpztBh");
            return (Criteria) this;
        }

        public Criteria andFpztBhNotLike(String value) {
            addCriterion("FPZT_BH not like", value, "fpztBh");
            return (Criteria) this;
        }

        public Criteria andFpztBhIn(List<String> values) {
            addCriterion("FPZT_BH in", values, "fpztBh");
            return (Criteria) this;
        }

        public Criteria andFpztBhNotIn(List<String> values) {
            addCriterion("FPZT_BH not in", values, "fpztBh");
            return (Criteria) this;
        }

        public Criteria andFpztBhBetween(String value1, String value2) {
            addCriterion("FPZT_BH between", value1, value2, "fpztBh");
            return (Criteria) this;
        }

        public Criteria andFpztBhNotBetween(String value1, String value2) {
            addCriterion("FPZT_BH not between", value1, value2, "fpztBh");
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
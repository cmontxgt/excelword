package swx.excel.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class XT_PC_PCX_MBExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XT_PC_PCX_MBExample() {
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

        public Criteria andPcxBmIsNull() {
            addCriterion("PCX_BM is null");
            return (Criteria) this;
        }

        public Criteria andPcxBmIsNotNull() {
            addCriterion("PCX_BM is not null");
            return (Criteria) this;
        }

        public Criteria andPcxBmEqualTo(String value) {
            addCriterion("PCX_BM =", value, "pcxBm");
            return (Criteria) this;
        }

        public Criteria andPcxBmNotEqualTo(String value) {
            addCriterion("PCX_BM <>", value, "pcxBm");
            return (Criteria) this;
        }

        public Criteria andPcxBmGreaterThan(String value) {
            addCriterion("PCX_BM >", value, "pcxBm");
            return (Criteria) this;
        }

        public Criteria andPcxBmGreaterThanOrEqualTo(String value) {
            addCriterion("PCX_BM >=", value, "pcxBm");
            return (Criteria) this;
        }

        public Criteria andPcxBmLessThan(String value) {
            addCriterion("PCX_BM <", value, "pcxBm");
            return (Criteria) this;
        }

        public Criteria andPcxBmLessThanOrEqualTo(String value) {
            addCriterion("PCX_BM <=", value, "pcxBm");
            return (Criteria) this;
        }

        public Criteria andPcxBmLike(String value) {
            addCriterion("PCX_BM like", value, "pcxBm");
            return (Criteria) this;
        }

        public Criteria andPcxBmNotLike(String value) {
            addCriterion("PCX_BM not like", value, "pcxBm");
            return (Criteria) this;
        }

        public Criteria andPcxBmIn(List<String> values) {
            addCriterion("PCX_BM in", values, "pcxBm");
            return (Criteria) this;
        }

        public Criteria andPcxBmNotIn(List<String> values) {
            addCriterion("PCX_BM not in", values, "pcxBm");
            return (Criteria) this;
        }

        public Criteria andPcxBmBetween(String value1, String value2) {
            addCriterion("PCX_BM between", value1, value2, "pcxBm");
            return (Criteria) this;
        }

        public Criteria andPcxBmNotBetween(String value1, String value2) {
            addCriterion("PCX_BM not between", value1, value2, "pcxBm");
            return (Criteria) this;
        }

        public Criteria andPcxMcIsNull() {
            addCriterion("PCX_MC is null");
            return (Criteria) this;
        }

        public Criteria andPcxMcIsNotNull() {
            addCriterion("PCX_MC is not null");
            return (Criteria) this;
        }

        public Criteria andPcxMcEqualTo(String value) {
            addCriterion("PCX_MC =", value, "pcxMc");
            return (Criteria) this;
        }

        public Criteria andPcxMcNotEqualTo(String value) {
            addCriterion("PCX_MC <>", value, "pcxMc");
            return (Criteria) this;
        }

        public Criteria andPcxMcGreaterThan(String value) {
            addCriterion("PCX_MC >", value, "pcxMc");
            return (Criteria) this;
        }

        public Criteria andPcxMcGreaterThanOrEqualTo(String value) {
            addCriterion("PCX_MC >=", value, "pcxMc");
            return (Criteria) this;
        }

        public Criteria andPcxMcLessThan(String value) {
            addCriterion("PCX_MC <", value, "pcxMc");
            return (Criteria) this;
        }

        public Criteria andPcxMcLessThanOrEqualTo(String value) {
            addCriterion("PCX_MC <=", value, "pcxMc");
            return (Criteria) this;
        }

        public Criteria andPcxMcLike(String value) {
            addCriterion("PCX_MC like", value, "pcxMc");
            return (Criteria) this;
        }

        public Criteria andPcxMcNotLike(String value) {
            addCriterion("PCX_MC not like", value, "pcxMc");
            return (Criteria) this;
        }

        public Criteria andPcxMcIn(List<String> values) {
            addCriterion("PCX_MC in", values, "pcxMc");
            return (Criteria) this;
        }

        public Criteria andPcxMcNotIn(List<String> values) {
            addCriterion("PCX_MC not in", values, "pcxMc");
            return (Criteria) this;
        }

        public Criteria andPcxMcBetween(String value1, String value2) {
            addCriterion("PCX_MC between", value1, value2, "pcxMc");
            return (Criteria) this;
        }

        public Criteria andPcxMcNotBetween(String value1, String value2) {
            addCriterion("PCX_MC not between", value1, value2, "pcxMc");
            return (Criteria) this;
        }

        public Criteria andFzlxIsNull() {
            addCriterion("FZLX is null");
            return (Criteria) this;
        }

        public Criteria andFzlxIsNotNull() {
            addCriterion("FZLX is not null");
            return (Criteria) this;
        }

        public Criteria andFzlxEqualTo(String value) {
            addCriterion("FZLX =", value, "fzlx");
            return (Criteria) this;
        }

        public Criteria andFzlxNotEqualTo(String value) {
            addCriterion("FZLX <>", value, "fzlx");
            return (Criteria) this;
        }

        public Criteria andFzlxGreaterThan(String value) {
            addCriterion("FZLX >", value, "fzlx");
            return (Criteria) this;
        }

        public Criteria andFzlxGreaterThanOrEqualTo(String value) {
            addCriterion("FZLX >=", value, "fzlx");
            return (Criteria) this;
        }

        public Criteria andFzlxLessThan(String value) {
            addCriterion("FZLX <", value, "fzlx");
            return (Criteria) this;
        }

        public Criteria andFzlxLessThanOrEqualTo(String value) {
            addCriterion("FZLX <=", value, "fzlx");
            return (Criteria) this;
        }

        public Criteria andFzlxLike(String value) {
            addCriterion("FZLX like", value, "fzlx");
            return (Criteria) this;
        }

        public Criteria andFzlxNotLike(String value) {
            addCriterion("FZLX not like", value, "fzlx");
            return (Criteria) this;
        }

        public Criteria andFzlxIn(List<String> values) {
            addCriterion("FZLX in", values, "fzlx");
            return (Criteria) this;
        }

        public Criteria andFzlxNotIn(List<String> values) {
            addCriterion("FZLX not in", values, "fzlx");
            return (Criteria) this;
        }

        public Criteria andFzlxBetween(String value1, String value2) {
            addCriterion("FZLX between", value1, value2, "fzlx");
            return (Criteria) this;
        }

        public Criteria andFzlxNotBetween(String value1, String value2) {
            addCriterion("FZLX not between", value1, value2, "fzlx");
            return (Criteria) this;
        }

        public Criteria andFzGdIsNull() {
            addCriterion("FZ_GD is null");
            return (Criteria) this;
        }

        public Criteria andFzGdIsNotNull() {
            addCriterion("FZ_GD is not null");
            return (Criteria) this;
        }

        public Criteria andFzGdEqualTo(BigDecimal value) {
            addCriterion("FZ_GD =", value, "fzGd");
            return (Criteria) this;
        }

        public Criteria andFzGdNotEqualTo(BigDecimal value) {
            addCriterion("FZ_GD <>", value, "fzGd");
            return (Criteria) this;
        }

        public Criteria andFzGdGreaterThan(BigDecimal value) {
            addCriterion("FZ_GD >", value, "fzGd");
            return (Criteria) this;
        }

        public Criteria andFzGdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FZ_GD >=", value, "fzGd");
            return (Criteria) this;
        }

        public Criteria andFzGdLessThan(BigDecimal value) {
            addCriterion("FZ_GD <", value, "fzGd");
            return (Criteria) this;
        }

        public Criteria andFzGdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FZ_GD <=", value, "fzGd");
            return (Criteria) this;
        }

        public Criteria andFzGdIn(List<BigDecimal> values) {
            addCriterion("FZ_GD in", values, "fzGd");
            return (Criteria) this;
        }

        public Criteria andFzGdNotIn(List<BigDecimal> values) {
            addCriterion("FZ_GD not in", values, "fzGd");
            return (Criteria) this;
        }

        public Criteria andFzGdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FZ_GD between", value1, value2, "fzGd");
            return (Criteria) this;
        }

        public Criteria andFzGdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FZ_GD not between", value1, value2, "fzGd");
            return (Criteria) this;
        }

        public Criteria andFzQszIsNull() {
            addCriterion("FZ_QSZ is null");
            return (Criteria) this;
        }

        public Criteria andFzQszIsNotNull() {
            addCriterion("FZ_QSZ is not null");
            return (Criteria) this;
        }

        public Criteria andFzQszEqualTo(BigDecimal value) {
            addCriterion("FZ_QSZ =", value, "fzQsz");
            return (Criteria) this;
        }

        public Criteria andFzQszNotEqualTo(BigDecimal value) {
            addCriterion("FZ_QSZ <>", value, "fzQsz");
            return (Criteria) this;
        }

        public Criteria andFzQszGreaterThan(BigDecimal value) {
            addCriterion("FZ_QSZ >", value, "fzQsz");
            return (Criteria) this;
        }

        public Criteria andFzQszGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FZ_QSZ >=", value, "fzQsz");
            return (Criteria) this;
        }

        public Criteria andFzQszLessThan(BigDecimal value) {
            addCriterion("FZ_QSZ <", value, "fzQsz");
            return (Criteria) this;
        }

        public Criteria andFzQszLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FZ_QSZ <=", value, "fzQsz");
            return (Criteria) this;
        }

        public Criteria andFzQszIn(List<BigDecimal> values) {
            addCriterion("FZ_QSZ in", values, "fzQsz");
            return (Criteria) this;
        }

        public Criteria andFzQszNotIn(List<BigDecimal> values) {
            addCriterion("FZ_QSZ not in", values, "fzQsz");
            return (Criteria) this;
        }

        public Criteria andFzQszBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FZ_QSZ between", value1, value2, "fzQsz");
            return (Criteria) this;
        }

        public Criteria andFzQszNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FZ_QSZ not between", value1, value2, "fzQsz");
            return (Criteria) this;
        }

        public Criteria andFzJszIsNull() {
            addCriterion("FZ_JSZ is null");
            return (Criteria) this;
        }

        public Criteria andFzJszIsNotNull() {
            addCriterion("FZ_JSZ is not null");
            return (Criteria) this;
        }

        public Criteria andFzJszEqualTo(BigDecimal value) {
            addCriterion("FZ_JSZ =", value, "fzJsz");
            return (Criteria) this;
        }

        public Criteria andFzJszNotEqualTo(BigDecimal value) {
            addCriterion("FZ_JSZ <>", value, "fzJsz");
            return (Criteria) this;
        }

        public Criteria andFzJszGreaterThan(BigDecimal value) {
            addCriterion("FZ_JSZ >", value, "fzJsz");
            return (Criteria) this;
        }

        public Criteria andFzJszGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FZ_JSZ >=", value, "fzJsz");
            return (Criteria) this;
        }

        public Criteria andFzJszLessThan(BigDecimal value) {
            addCriterion("FZ_JSZ <", value, "fzJsz");
            return (Criteria) this;
        }

        public Criteria andFzJszLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FZ_JSZ <=", value, "fzJsz");
            return (Criteria) this;
        }

        public Criteria andFzJszIn(List<BigDecimal> values) {
            addCriterion("FZ_JSZ in", values, "fzJsz");
            return (Criteria) this;
        }

        public Criteria andFzJszNotIn(List<BigDecimal> values) {
            addCriterion("FZ_JSZ not in", values, "fzJsz");
            return (Criteria) this;
        }

        public Criteria andFzJszBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FZ_JSZ between", value1, value2, "fzJsz");
            return (Criteria) this;
        }

        public Criteria andFzJszNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FZ_JSZ not between", value1, value2, "fzJsz");
            return (Criteria) this;
        }

        public Criteria andGxlbBmIsNull() {
            addCriterion("GXLB_BM is null");
            return (Criteria) this;
        }

        public Criteria andGxlbBmIsNotNull() {
            addCriterion("GXLB_BM is not null");
            return (Criteria) this;
        }

        public Criteria andGxlbBmEqualTo(String value) {
            addCriterion("GXLB_BM =", value, "gxlbBm");
            return (Criteria) this;
        }

        public Criteria andGxlbBmNotEqualTo(String value) {
            addCriterion("GXLB_BM <>", value, "gxlbBm");
            return (Criteria) this;
        }

        public Criteria andGxlbBmGreaterThan(String value) {
            addCriterion("GXLB_BM >", value, "gxlbBm");
            return (Criteria) this;
        }

        public Criteria andGxlbBmGreaterThanOrEqualTo(String value) {
            addCriterion("GXLB_BM >=", value, "gxlbBm");
            return (Criteria) this;
        }

        public Criteria andGxlbBmLessThan(String value) {
            addCriterion("GXLB_BM <", value, "gxlbBm");
            return (Criteria) this;
        }

        public Criteria andGxlbBmLessThanOrEqualTo(String value) {
            addCriterion("GXLB_BM <=", value, "gxlbBm");
            return (Criteria) this;
        }

        public Criteria andGxlbBmLike(String value) {
            addCriterion("GXLB_BM like", value, "gxlbBm");
            return (Criteria) this;
        }

        public Criteria andGxlbBmNotLike(String value) {
            addCriterion("GXLB_BM not like", value, "gxlbBm");
            return (Criteria) this;
        }

        public Criteria andGxlbBmIn(List<String> values) {
            addCriterion("GXLB_BM in", values, "gxlbBm");
            return (Criteria) this;
        }

        public Criteria andGxlbBmNotIn(List<String> values) {
            addCriterion("GXLB_BM not in", values, "gxlbBm");
            return (Criteria) this;
        }

        public Criteria andGxlbBmBetween(String value1, String value2) {
            addCriterion("GXLB_BM between", value1, value2, "gxlbBm");
            return (Criteria) this;
        }

        public Criteria andGxlbBmNotBetween(String value1, String value2) {
            addCriterion("GXLB_BM not between", value1, value2, "gxlbBm");
            return (Criteria) this;
        }

        public Criteria andGxlbMcIsNull() {
            addCriterion("GXLB_MC is null");
            return (Criteria) this;
        }

        public Criteria andGxlbMcIsNotNull() {
            addCriterion("GXLB_MC is not null");
            return (Criteria) this;
        }

        public Criteria andGxlbMcEqualTo(String value) {
            addCriterion("GXLB_MC =", value, "gxlbMc");
            return (Criteria) this;
        }

        public Criteria andGxlbMcNotEqualTo(String value) {
            addCriterion("GXLB_MC <>", value, "gxlbMc");
            return (Criteria) this;
        }

        public Criteria andGxlbMcGreaterThan(String value) {
            addCriterion("GXLB_MC >", value, "gxlbMc");
            return (Criteria) this;
        }

        public Criteria andGxlbMcGreaterThanOrEqualTo(String value) {
            addCriterion("GXLB_MC >=", value, "gxlbMc");
            return (Criteria) this;
        }

        public Criteria andGxlbMcLessThan(String value) {
            addCriterion("GXLB_MC <", value, "gxlbMc");
            return (Criteria) this;
        }

        public Criteria andGxlbMcLessThanOrEqualTo(String value) {
            addCriterion("GXLB_MC <=", value, "gxlbMc");
            return (Criteria) this;
        }

        public Criteria andGxlbMcLike(String value) {
            addCriterion("GXLB_MC like", value, "gxlbMc");
            return (Criteria) this;
        }

        public Criteria andGxlbMcNotLike(String value) {
            addCriterion("GXLB_MC not like", value, "gxlbMc");
            return (Criteria) this;
        }

        public Criteria andGxlbMcIn(List<String> values) {
            addCriterion("GXLB_MC in", values, "gxlbMc");
            return (Criteria) this;
        }

        public Criteria andGxlbMcNotIn(List<String> values) {
            addCriterion("GXLB_MC not in", values, "gxlbMc");
            return (Criteria) this;
        }

        public Criteria andGxlbMcBetween(String value1, String value2) {
            addCriterion("GXLB_MC between", value1, value2, "gxlbMc");
            return (Criteria) this;
        }

        public Criteria andGxlbMcNotBetween(String value1, String value2) {
            addCriterion("GXLB_MC not between", value1, value2, "gxlbMc");
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

        public Criteria andZdpccxIsNull() {
            addCriterion("ZDPCCX is null");
            return (Criteria) this;
        }

        public Criteria andZdpccxIsNotNull() {
            addCriterion("ZDPCCX is not null");
            return (Criteria) this;
        }

        public Criteria andZdpccxEqualTo(String value) {
            addCriterion("ZDPCCX =", value, "zdpccx");
            return (Criteria) this;
        }

        public Criteria andZdpccxNotEqualTo(String value) {
            addCriterion("ZDPCCX <>", value, "zdpccx");
            return (Criteria) this;
        }

        public Criteria andZdpccxGreaterThan(String value) {
            addCriterion("ZDPCCX >", value, "zdpccx");
            return (Criteria) this;
        }

        public Criteria andZdpccxGreaterThanOrEqualTo(String value) {
            addCriterion("ZDPCCX >=", value, "zdpccx");
            return (Criteria) this;
        }

        public Criteria andZdpccxLessThan(String value) {
            addCriterion("ZDPCCX <", value, "zdpccx");
            return (Criteria) this;
        }

        public Criteria andZdpccxLessThanOrEqualTo(String value) {
            addCriterion("ZDPCCX <=", value, "zdpccx");
            return (Criteria) this;
        }

        public Criteria andZdpccxLike(String value) {
            addCriterion("ZDPCCX like", value, "zdpccx");
            return (Criteria) this;
        }

        public Criteria andZdpccxNotLike(String value) {
            addCriterion("ZDPCCX not like", value, "zdpccx");
            return (Criteria) this;
        }

        public Criteria andZdpccxIn(List<String> values) {
            addCriterion("ZDPCCX in", values, "zdpccx");
            return (Criteria) this;
        }

        public Criteria andZdpccxNotIn(List<String> values) {
            addCriterion("ZDPCCX not in", values, "zdpccx");
            return (Criteria) this;
        }

        public Criteria andZdpccxBetween(String value1, String value2) {
            addCriterion("ZDPCCX between", value1, value2, "zdpccx");
            return (Criteria) this;
        }

        public Criteria andZdpccxNotBetween(String value1, String value2) {
            addCriterion("ZDPCCX not between", value1, value2, "zdpccx");
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

        public Criteria andPcxLxIsNull() {
            addCriterion("PCX_LX is null");
            return (Criteria) this;
        }

        public Criteria andPcxLxIsNotNull() {
            addCriterion("PCX_LX is not null");
            return (Criteria) this;
        }

        public Criteria andPcxLxEqualTo(BigDecimal value) {
            addCriterion("PCX_LX =", value, "pcxLx");
            return (Criteria) this;
        }

        public Criteria andPcxLxNotEqualTo(BigDecimal value) {
            addCriterion("PCX_LX <>", value, "pcxLx");
            return (Criteria) this;
        }

        public Criteria andPcxLxGreaterThan(BigDecimal value) {
            addCriterion("PCX_LX >", value, "pcxLx");
            return (Criteria) this;
        }

        public Criteria andPcxLxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PCX_LX >=", value, "pcxLx");
            return (Criteria) this;
        }

        public Criteria andPcxLxLessThan(BigDecimal value) {
            addCriterion("PCX_LX <", value, "pcxLx");
            return (Criteria) this;
        }

        public Criteria andPcxLxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PCX_LX <=", value, "pcxLx");
            return (Criteria) this;
        }

        public Criteria andPcxLxIn(List<BigDecimal> values) {
            addCriterion("PCX_LX in", values, "pcxLx");
            return (Criteria) this;
        }

        public Criteria andPcxLxNotIn(List<BigDecimal> values) {
            addCriterion("PCX_LX not in", values, "pcxLx");
            return (Criteria) this;
        }

        public Criteria andPcxLxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PCX_LX between", value1, value2, "pcxLx");
            return (Criteria) this;
        }

        public Criteria andPcxLxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PCX_LX not between", value1, value2, "pcxLx");
            return (Criteria) this;
        }

        public Criteria andPcxBzIsNull() {
            addCriterion("PCX_BZ is null");
            return (Criteria) this;
        }

        public Criteria andPcxBzIsNotNull() {
            addCriterion("PCX_BZ is not null");
            return (Criteria) this;
        }

        public Criteria andPcxBzEqualTo(String value) {
            addCriterion("PCX_BZ =", value, "pcxBz");
            return (Criteria) this;
        }

        public Criteria andPcxBzNotEqualTo(String value) {
            addCriterion("PCX_BZ <>", value, "pcxBz");
            return (Criteria) this;
        }

        public Criteria andPcxBzGreaterThan(String value) {
            addCriterion("PCX_BZ >", value, "pcxBz");
            return (Criteria) this;
        }

        public Criteria andPcxBzGreaterThanOrEqualTo(String value) {
            addCriterion("PCX_BZ >=", value, "pcxBz");
            return (Criteria) this;
        }

        public Criteria andPcxBzLessThan(String value) {
            addCriterion("PCX_BZ <", value, "pcxBz");
            return (Criteria) this;
        }

        public Criteria andPcxBzLessThanOrEqualTo(String value) {
            addCriterion("PCX_BZ <=", value, "pcxBz");
            return (Criteria) this;
        }

        public Criteria andPcxBzLike(String value) {
            addCriterion("PCX_BZ like", value, "pcxBz");
            return (Criteria) this;
        }

        public Criteria andPcxBzNotLike(String value) {
            addCriterion("PCX_BZ not like", value, "pcxBz");
            return (Criteria) this;
        }

        public Criteria andPcxBzIn(List<String> values) {
            addCriterion("PCX_BZ in", values, "pcxBz");
            return (Criteria) this;
        }

        public Criteria andPcxBzNotIn(List<String> values) {
            addCriterion("PCX_BZ not in", values, "pcxBz");
            return (Criteria) this;
        }

        public Criteria andPcxBzBetween(String value1, String value2) {
            addCriterion("PCX_BZ between", value1, value2, "pcxBz");
            return (Criteria) this;
        }

        public Criteria andPcxBzNotBetween(String value1, String value2) {
            addCriterion("PCX_BZ not between", value1, value2, "pcxBz");
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
package swx.excel.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PcxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PcxExample() {
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

        public Criteria andPcxbmIsNull() {
            addCriterion("PCXBM is null");
            return (Criteria) this;
        }

        public Criteria andPcxbmIsNotNull() {
            addCriterion("PCXBM is not null");
            return (Criteria) this;
        }

        public Criteria andPcxbmEqualTo(String value) {
            addCriterion("PCXBM =", value, "pcxbm");
            return (Criteria) this;
        }

        public Criteria andPcxbmNotEqualTo(String value) {
            addCriterion("PCXBM <>", value, "pcxbm");
            return (Criteria) this;
        }

        public Criteria andPcxbmGreaterThan(String value) {
            addCriterion("PCXBM >", value, "pcxbm");
            return (Criteria) this;
        }

        public Criteria andPcxbmGreaterThanOrEqualTo(String value) {
            addCriterion("PCXBM >=", value, "pcxbm");
            return (Criteria) this;
        }

        public Criteria andPcxbmLessThan(String value) {
            addCriterion("PCXBM <", value, "pcxbm");
            return (Criteria) this;
        }

        public Criteria andPcxbmLessThanOrEqualTo(String value) {
            addCriterion("PCXBM <=", value, "pcxbm");
            return (Criteria) this;
        }

        public Criteria andPcxbmLike(String value) {
            addCriterion("PCXBM like", value, "pcxbm");
            return (Criteria) this;
        }

        public Criteria andPcxbmNotLike(String value) {
            addCriterion("PCXBM not like", value, "pcxbm");
            return (Criteria) this;
        }

        public Criteria andPcxbmIn(List<String> values) {
            addCriterion("PCXBM in", values, "pcxbm");
            return (Criteria) this;
        }

        public Criteria andPcxbmNotIn(List<String> values) {
            addCriterion("PCXBM not in", values, "pcxbm");
            return (Criteria) this;
        }

        public Criteria andPcxbmBetween(String value1, String value2) {
            addCriterion("PCXBM between", value1, value2, "pcxbm");
            return (Criteria) this;
        }

        public Criteria andPcxbmNotBetween(String value1, String value2) {
            addCriterion("PCXBM not between", value1, value2, "pcxbm");
            return (Criteria) this;
        }

        public Criteria andPcxmcIsNull() {
            addCriterion("PCXMC is null");
            return (Criteria) this;
        }

        public Criteria andPcxmcIsNotNull() {
            addCriterion("PCXMC is not null");
            return (Criteria) this;
        }

        public Criteria andPcxmcEqualTo(String value) {
            addCriterion("PCXMC =", value, "pcxmc");
            return (Criteria) this;
        }

        public Criteria andPcxmcNotEqualTo(String value) {
            addCriterion("PCXMC <>", value, "pcxmc");
            return (Criteria) this;
        }

        public Criteria andPcxmcGreaterThan(String value) {
            addCriterion("PCXMC >", value, "pcxmc");
            return (Criteria) this;
        }

        public Criteria andPcxmcGreaterThanOrEqualTo(String value) {
            addCriterion("PCXMC >=", value, "pcxmc");
            return (Criteria) this;
        }

        public Criteria andPcxmcLessThan(String value) {
            addCriterion("PCXMC <", value, "pcxmc");
            return (Criteria) this;
        }

        public Criteria andPcxmcLessThanOrEqualTo(String value) {
            addCriterion("PCXMC <=", value, "pcxmc");
            return (Criteria) this;
        }

        public Criteria andPcxmcLike(String value) {
            addCriterion("PCXMC like", value, "pcxmc");
            return (Criteria) this;
        }

        public Criteria andPcxmcNotLike(String value) {
            addCriterion("PCXMC not like", value, "pcxmc");
            return (Criteria) this;
        }

        public Criteria andPcxmcIn(List<String> values) {
            addCriterion("PCXMC in", values, "pcxmc");
            return (Criteria) this;
        }

        public Criteria andPcxmcNotIn(List<String> values) {
            addCriterion("PCXMC not in", values, "pcxmc");
            return (Criteria) this;
        }

        public Criteria andPcxmcBetween(String value1, String value2) {
            addCriterion("PCXMC between", value1, value2, "pcxmc");
            return (Criteria) this;
        }

        public Criteria andPcxmcNotBetween(String value1, String value2) {
            addCriterion("PCXMC not between", value1, value2, "pcxmc");
            return (Criteria) this;
        }

        public Criteria andPcxflbmIsNull() {
            addCriterion("PCXFLBM is null");
            return (Criteria) this;
        }

        public Criteria andPcxflbmIsNotNull() {
            addCriterion("PCXFLBM is not null");
            return (Criteria) this;
        }

        public Criteria andPcxflbmEqualTo(String value) {
            addCriterion("PCXFLBM =", value, "pcxflbm");
            return (Criteria) this;
        }

        public Criteria andPcxflbmNotEqualTo(String value) {
            addCriterion("PCXFLBM <>", value, "pcxflbm");
            return (Criteria) this;
        }

        public Criteria andPcxflbmGreaterThan(String value) {
            addCriterion("PCXFLBM >", value, "pcxflbm");
            return (Criteria) this;
        }

        public Criteria andPcxflbmGreaterThanOrEqualTo(String value) {
            addCriterion("PCXFLBM >=", value, "pcxflbm");
            return (Criteria) this;
        }

        public Criteria andPcxflbmLessThan(String value) {
            addCriterion("PCXFLBM <", value, "pcxflbm");
            return (Criteria) this;
        }

        public Criteria andPcxflbmLessThanOrEqualTo(String value) {
            addCriterion("PCXFLBM <=", value, "pcxflbm");
            return (Criteria) this;
        }

        public Criteria andPcxflbmLike(String value) {
            addCriterion("PCXFLBM like", value, "pcxflbm");
            return (Criteria) this;
        }

        public Criteria andPcxflbmNotLike(String value) {
            addCriterion("PCXFLBM not like", value, "pcxflbm");
            return (Criteria) this;
        }

        public Criteria andPcxflbmIn(List<String> values) {
            addCriterion("PCXFLBM in", values, "pcxflbm");
            return (Criteria) this;
        }

        public Criteria andPcxflbmNotIn(List<String> values) {
            addCriterion("PCXFLBM not in", values, "pcxflbm");
            return (Criteria) this;
        }

        public Criteria andPcxflbmBetween(String value1, String value2) {
            addCriterion("PCXFLBM between", value1, value2, "pcxflbm");
            return (Criteria) this;
        }

        public Criteria andPcxflbmNotBetween(String value1, String value2) {
            addCriterion("PCXFLBM not between", value1, value2, "pcxflbm");
            return (Criteria) this;
        }

        public Criteria andPcmbbmIsNull() {
            addCriterion("PCMBBM is null");
            return (Criteria) this;
        }

        public Criteria andPcmbbmIsNotNull() {
            addCriterion("PCMBBM is not null");
            return (Criteria) this;
        }

        public Criteria andPcmbbmEqualTo(String value) {
            addCriterion("PCMBBM =", value, "pcmbbm");
            return (Criteria) this;
        }

        public Criteria andPcmbbmNotEqualTo(String value) {
            addCriterion("PCMBBM <>", value, "pcmbbm");
            return (Criteria) this;
        }

        public Criteria andPcmbbmGreaterThan(String value) {
            addCriterion("PCMBBM >", value, "pcmbbm");
            return (Criteria) this;
        }

        public Criteria andPcmbbmGreaterThanOrEqualTo(String value) {
            addCriterion("PCMBBM >=", value, "pcmbbm");
            return (Criteria) this;
        }

        public Criteria andPcmbbmLessThan(String value) {
            addCriterion("PCMBBM <", value, "pcmbbm");
            return (Criteria) this;
        }

        public Criteria andPcmbbmLessThanOrEqualTo(String value) {
            addCriterion("PCMBBM <=", value, "pcmbbm");
            return (Criteria) this;
        }

        public Criteria andPcmbbmLike(String value) {
            addCriterion("PCMBBM like", value, "pcmbbm");
            return (Criteria) this;
        }

        public Criteria andPcmbbmNotLike(String value) {
            addCriterion("PCMBBM not like", value, "pcmbbm");
            return (Criteria) this;
        }

        public Criteria andPcmbbmIn(List<String> values) {
            addCriterion("PCMBBM in", values, "pcmbbm");
            return (Criteria) this;
        }

        public Criteria andPcmbbmNotIn(List<String> values) {
            addCriterion("PCMBBM not in", values, "pcmbbm");
            return (Criteria) this;
        }

        public Criteria andPcmbbmBetween(String value1, String value2) {
            addCriterion("PCMBBM between", value1, value2, "pcmbbm");
            return (Criteria) this;
        }

        public Criteria andPcmbbmNotBetween(String value1, String value2) {
            addCriterion("PCMBBM not between", value1, value2, "pcmbbm");
            return (Criteria) this;
        }

        public Criteria andPcxlxIsNull() {
            addCriterion("PCXLX is null");
            return (Criteria) this;
        }

        public Criteria andPcxlxIsNotNull() {
            addCriterion("PCXLX is not null");
            return (Criteria) this;
        }

        public Criteria andPcxlxEqualTo(BigDecimal value) {
            addCriterion("PCXLX =", value, "pcxlx");
            return (Criteria) this;
        }

        public Criteria andPcxlxNotEqualTo(BigDecimal value) {
            addCriterion("PCXLX <>", value, "pcxlx");
            return (Criteria) this;
        }

        public Criteria andPcxlxGreaterThan(BigDecimal value) {
            addCriterion("PCXLX >", value, "pcxlx");
            return (Criteria) this;
        }

        public Criteria andPcxlxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PCXLX >=", value, "pcxlx");
            return (Criteria) this;
        }

        public Criteria andPcxlxLessThan(BigDecimal value) {
            addCriterion("PCXLX <", value, "pcxlx");
            return (Criteria) this;
        }

        public Criteria andPcxlxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PCXLX <=", value, "pcxlx");
            return (Criteria) this;
        }

        public Criteria andPcxlxIn(List<BigDecimal> values) {
            addCriterion("PCXLX in", values, "pcxlx");
            return (Criteria) this;
        }

        public Criteria andPcxlxNotIn(List<BigDecimal> values) {
            addCriterion("PCXLX not in", values, "pcxlx");
            return (Criteria) this;
        }

        public Criteria andPcxlxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PCXLX between", value1, value2, "pcxlx");
            return (Criteria) this;
        }

        public Criteria andPcxlxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PCXLX not between", value1, value2, "pcxlx");
            return (Criteria) this;
        }

        public Criteria andPcfsIsNull() {
            addCriterion("PCFS is null");
            return (Criteria) this;
        }

        public Criteria andPcfsIsNotNull() {
            addCriterion("PCFS is not null");
            return (Criteria) this;
        }

        public Criteria andPcfsEqualTo(String value) {
            addCriterion("PCFS =", value, "pcfs");
            return (Criteria) this;
        }

        public Criteria andPcfsNotEqualTo(String value) {
            addCriterion("PCFS <>", value, "pcfs");
            return (Criteria) this;
        }

        public Criteria andPcfsGreaterThan(String value) {
            addCriterion("PCFS >", value, "pcfs");
            return (Criteria) this;
        }

        public Criteria andPcfsGreaterThanOrEqualTo(String value) {
            addCriterion("PCFS >=", value, "pcfs");
            return (Criteria) this;
        }

        public Criteria andPcfsLessThan(String value) {
            addCriterion("PCFS <", value, "pcfs");
            return (Criteria) this;
        }

        public Criteria andPcfsLessThanOrEqualTo(String value) {
            addCriterion("PCFS <=", value, "pcfs");
            return (Criteria) this;
        }

        public Criteria andPcfsLike(String value) {
            addCriterion("PCFS like", value, "pcfs");
            return (Criteria) this;
        }

        public Criteria andPcfsNotLike(String value) {
            addCriterion("PCFS not like", value, "pcfs");
            return (Criteria) this;
        }

        public Criteria andPcfsIn(List<String> values) {
            addCriterion("PCFS in", values, "pcfs");
            return (Criteria) this;
        }

        public Criteria andPcfsNotIn(List<String> values) {
            addCriterion("PCFS not in", values, "pcfs");
            return (Criteria) this;
        }

        public Criteria andPcfsBetween(String value1, String value2) {
            addCriterion("PCFS between", value1, value2, "pcfs");
            return (Criteria) this;
        }

        public Criteria andPcfsNotBetween(String value1, String value2) {
            addCriterion("PCFS not between", value1, value2, "pcfs");
            return (Criteria) this;
        }

        public Criteria andPcjlbmIsNull() {
            addCriterion("PCJLBM is null");
            return (Criteria) this;
        }

        public Criteria andPcjlbmIsNotNull() {
            addCriterion("PCJLBM is not null");
            return (Criteria) this;
        }

        public Criteria andPcjlbmEqualTo(String value) {
            addCriterion("PCJLBM =", value, "pcjlbm");
            return (Criteria) this;
        }

        public Criteria andPcjlbmNotEqualTo(String value) {
            addCriterion("PCJLBM <>", value, "pcjlbm");
            return (Criteria) this;
        }

        public Criteria andPcjlbmGreaterThan(String value) {
            addCriterion("PCJLBM >", value, "pcjlbm");
            return (Criteria) this;
        }

        public Criteria andPcjlbmGreaterThanOrEqualTo(String value) {
            addCriterion("PCJLBM >=", value, "pcjlbm");
            return (Criteria) this;
        }

        public Criteria andPcjlbmLessThan(String value) {
            addCriterion("PCJLBM <", value, "pcjlbm");
            return (Criteria) this;
        }

        public Criteria andPcjlbmLessThanOrEqualTo(String value) {
            addCriterion("PCJLBM <=", value, "pcjlbm");
            return (Criteria) this;
        }

        public Criteria andPcjlbmLike(String value) {
            addCriterion("PCJLBM like", value, "pcjlbm");
            return (Criteria) this;
        }

        public Criteria andPcjlbmNotLike(String value) {
            addCriterion("PCJLBM not like", value, "pcjlbm");
            return (Criteria) this;
        }

        public Criteria andPcjlbmIn(List<String> values) {
            addCriterion("PCJLBM in", values, "pcjlbm");
            return (Criteria) this;
        }

        public Criteria andPcjlbmNotIn(List<String> values) {
            addCriterion("PCJLBM not in", values, "pcjlbm");
            return (Criteria) this;
        }

        public Criteria andPcjlbmBetween(String value1, String value2) {
            addCriterion("PCJLBM between", value1, value2, "pcjlbm");
            return (Criteria) this;
        }

        public Criteria andPcjlbmNotBetween(String value1, String value2) {
            addCriterion("PCJLBM not between", value1, value2, "pcjlbm");
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

        public Criteria andXhIsNull() {
            addCriterion("XH is null");
            return (Criteria) this;
        }

        public Criteria andXhIsNotNull() {
            addCriterion("XH is not null");
            return (Criteria) this;
        }

        public Criteria andXhEqualTo(BigDecimal value) {
            addCriterion("XH =", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotEqualTo(BigDecimal value) {
            addCriterion("XH <>", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhGreaterThan(BigDecimal value) {
            addCriterion("XH >", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("XH >=", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhLessThan(BigDecimal value) {
            addCriterion("XH <", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhLessThanOrEqualTo(BigDecimal value) {
            addCriterion("XH <=", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhIn(List<BigDecimal> values) {
            addCriterion("XH in", values, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotIn(List<BigDecimal> values) {
            addCriterion("XH not in", values, "xh");
            return (Criteria) this;
        }

        public Criteria andXhBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XH between", value1, value2, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XH not between", value1, value2, "xh");
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

        public Criteria andBzIsNull() {
            addCriterion("BZ is null");
            return (Criteria) this;
        }

        public Criteria andBzIsNotNull() {
            addCriterion("BZ is not null");
            return (Criteria) this;
        }

        public Criteria andBzEqualTo(String value) {
            addCriterion("BZ =", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotEqualTo(String value) {
            addCriterion("BZ <>", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThan(String value) {
            addCriterion("BZ >", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThanOrEqualTo(String value) {
            addCriterion("BZ >=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThan(String value) {
            addCriterion("BZ <", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThanOrEqualTo(String value) {
            addCriterion("BZ <=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLike(String value) {
            addCriterion("BZ like", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotLike(String value) {
            addCriterion("BZ not like", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzIn(List<String> values) {
            addCriterion("BZ in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotIn(List<String> values) {
            addCriterion("BZ not in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzBetween(String value1, String value2) {
            addCriterion("BZ between", value1, value2, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotBetween(String value1, String value2) {
            addCriterion("BZ not between", value1, value2, "bz");
            return (Criteria) this;
        }

        public Criteria andMrzIsNull() {
            addCriterion("MRZ is null");
            return (Criteria) this;
        }

        public Criteria andMrzIsNotNull() {
            addCriterion("MRZ is not null");
            return (Criteria) this;
        }

        public Criteria andMrzEqualTo(String value) {
            addCriterion("MRZ =", value, "mrz");
            return (Criteria) this;
        }

        public Criteria andMrzNotEqualTo(String value) {
            addCriterion("MRZ <>", value, "mrz");
            return (Criteria) this;
        }

        public Criteria andMrzGreaterThan(String value) {
            addCriterion("MRZ >", value, "mrz");
            return (Criteria) this;
        }

        public Criteria andMrzGreaterThanOrEqualTo(String value) {
            addCriterion("MRZ >=", value, "mrz");
            return (Criteria) this;
        }

        public Criteria andMrzLessThan(String value) {
            addCriterion("MRZ <", value, "mrz");
            return (Criteria) this;
        }

        public Criteria andMrzLessThanOrEqualTo(String value) {
            addCriterion("MRZ <=", value, "mrz");
            return (Criteria) this;
        }

        public Criteria andMrzLike(String value) {
            addCriterion("MRZ like", value, "mrz");
            return (Criteria) this;
        }

        public Criteria andMrzNotLike(String value) {
            addCriterion("MRZ not like", value, "mrz");
            return (Criteria) this;
        }

        public Criteria andMrzIn(List<String> values) {
            addCriterion("MRZ in", values, "mrz");
            return (Criteria) this;
        }

        public Criteria andMrzNotIn(List<String> values) {
            addCriterion("MRZ not in", values, "mrz");
            return (Criteria) this;
        }

        public Criteria andMrzBetween(String value1, String value2) {
            addCriterion("MRZ between", value1, value2, "mrz");
            return (Criteria) this;
        }

        public Criteria andMrzNotBetween(String value1, String value2) {
            addCriterion("MRZ not between", value1, value2, "mrz");
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
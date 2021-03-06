package com.xyh.domain;

import java.util.ArrayList;
import java.util.List;

public class PlayitemsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PlayitemsExample() {
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

        public Criteria andPlayprojectIsNull() {
            addCriterion("playProject is null");
            return (Criteria) this;
        }

        public Criteria andPlayprojectIsNotNull() {
            addCriterion("playProject is not null");
            return (Criteria) this;
        }

        public Criteria andPlayprojectEqualTo(String value) {
            addCriterion("playProject =", value, "playproject");
            return (Criteria) this;
        }

        public Criteria andPlayprojectNotEqualTo(String value) {
            addCriterion("playProject <>", value, "playproject");
            return (Criteria) this;
        }

        public Criteria andPlayprojectGreaterThan(String value) {
            addCriterion("playProject >", value, "playproject");
            return (Criteria) this;
        }

        public Criteria andPlayprojectGreaterThanOrEqualTo(String value) {
            addCriterion("playProject >=", value, "playproject");
            return (Criteria) this;
        }

        public Criteria andPlayprojectLessThan(String value) {
            addCriterion("playProject <", value, "playproject");
            return (Criteria) this;
        }

        public Criteria andPlayprojectLessThanOrEqualTo(String value) {
            addCriterion("playProject <=", value, "playproject");
            return (Criteria) this;
        }

        public Criteria andPlayprojectLike(String value) {
            addCriterion("playProject like", value, "playproject");
            return (Criteria) this;
        }

        public Criteria andPlayprojectNotLike(String value) {
            addCriterion("playProject not like", value, "playproject");
            return (Criteria) this;
        }

        public Criteria andPlayprojectIn(List<String> values) {
            addCriterion("playProject in", values, "playproject");
            return (Criteria) this;
        }

        public Criteria andPlayprojectNotIn(List<String> values) {
            addCriterion("playProject not in", values, "playproject");
            return (Criteria) this;
        }

        public Criteria andPlayprojectBetween(String value1, String value2) {
            addCriterion("playProject between", value1, value2, "playproject");
            return (Criteria) this;
        }

        public Criteria andPlayprojectNotBetween(String value1, String value2) {
            addCriterion("playProject not between", value1, value2, "playproject");
            return (Criteria) this;
        }

        public Criteria andIntroduceIsNull() {
            addCriterion("introduce is null");
            return (Criteria) this;
        }

        public Criteria andIntroduceIsNotNull() {
            addCriterion("introduce is not null");
            return (Criteria) this;
        }

        public Criteria andIntroduceEqualTo(String value) {
            addCriterion("introduce =", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceNotEqualTo(String value) {
            addCriterion("introduce <>", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceGreaterThan(String value) {
            addCriterion("introduce >", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceGreaterThanOrEqualTo(String value) {
            addCriterion("introduce >=", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceLessThan(String value) {
            addCriterion("introduce <", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceLessThanOrEqualTo(String value) {
            addCriterion("introduce <=", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceLike(String value) {
            addCriterion("introduce like", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceNotLike(String value) {
            addCriterion("introduce not like", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceIn(List<String> values) {
            addCriterion("introduce in", values, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceNotIn(List<String> values) {
            addCriterion("introduce not in", values, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceBetween(String value1, String value2) {
            addCriterion("introduce between", value1, value2, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceNotBetween(String value1, String value2) {
            addCriterion("introduce not between", value1, value2, "introduce");
            return (Criteria) this;
        }

        public Criteria andPlaytimeIsNull() {
            addCriterion("playtime is null");
            return (Criteria) this;
        }

        public Criteria andPlaytimeIsNotNull() {
            addCriterion("playtime is not null");
            return (Criteria) this;
        }

        public Criteria andPlaytimeEqualTo(Integer value) {
            addCriterion("playtime =", value, "playtime");
            return (Criteria) this;
        }

        public Criteria andPlaytimeNotEqualTo(Integer value) {
            addCriterion("playtime <>", value, "playtime");
            return (Criteria) this;
        }

        public Criteria andPlaytimeGreaterThan(Integer value) {
            addCriterion("playtime >", value, "playtime");
            return (Criteria) this;
        }

        public Criteria andPlaytimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("playtime >=", value, "playtime");
            return (Criteria) this;
        }

        public Criteria andPlaytimeLessThan(Integer value) {
            addCriterion("playtime <", value, "playtime");
            return (Criteria) this;
        }

        public Criteria andPlaytimeLessThanOrEqualTo(Integer value) {
            addCriterion("playtime <=", value, "playtime");
            return (Criteria) this;
        }

        public Criteria andPlaytimeIn(List<Integer> values) {
            addCriterion("playtime in", values, "playtime");
            return (Criteria) this;
        }

        public Criteria andPlaytimeNotIn(List<Integer> values) {
            addCriterion("playtime not in", values, "playtime");
            return (Criteria) this;
        }

        public Criteria andPlaytimeBetween(Integer value1, Integer value2) {
            addCriterion("playtime between", value1, value2, "playtime");
            return (Criteria) this;
        }

        public Criteria andPlaytimeNotBetween(Integer value1, Integer value2) {
            addCriterion("playtime not between", value1, value2, "playtime");
            return (Criteria) this;
        }

        public Criteria andPictureIsNull() {
            addCriterion("picture is null");
            return (Criteria) this;
        }

        public Criteria andPictureIsNotNull() {
            addCriterion("picture is not null");
            return (Criteria) this;
        }

        public Criteria andPictureEqualTo(String value) {
            addCriterion("picture =", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotEqualTo(String value) {
            addCriterion("picture <>", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThan(String value) {
            addCriterion("picture >", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThanOrEqualTo(String value) {
            addCriterion("picture >=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThan(String value) {
            addCriterion("picture <", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThanOrEqualTo(String value) {
            addCriterion("picture <=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLike(String value) {
            addCriterion("picture like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotLike(String value) {
            addCriterion("picture not like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureIn(List<String> values) {
            addCriterion("picture in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotIn(List<String> values) {
            addCriterion("picture not in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureBetween(String value1, String value2) {
            addCriterion("picture between", value1, value2, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotBetween(String value1, String value2) {
            addCriterion("picture not between", value1, value2, "picture");
            return (Criteria) this;
        }

        public Criteria andCoordinateIsNull() {
            addCriterion("coordinate is null");
            return (Criteria) this;
        }

        public Criteria andCoordinateIsNotNull() {
            addCriterion("coordinate is not null");
            return (Criteria) this;
        }

        public Criteria andCoordinateEqualTo(String value) {
            addCriterion("coordinate =", value, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateNotEqualTo(String value) {
            addCriterion("coordinate <>", value, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateGreaterThan(String value) {
            addCriterion("coordinate >", value, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateGreaterThanOrEqualTo(String value) {
            addCriterion("coordinate >=", value, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateLessThan(String value) {
            addCriterion("coordinate <", value, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateLessThanOrEqualTo(String value) {
            addCriterion("coordinate <=", value, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateLike(String value) {
            addCriterion("coordinate like", value, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateNotLike(String value) {
            addCriterion("coordinate not like", value, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateIn(List<String> values) {
            addCriterion("coordinate in", values, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateNotIn(List<String> values) {
            addCriterion("coordinate not in", values, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateBetween(String value1, String value2) {
            addCriterion("coordinate between", value1, value2, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateNotBetween(String value1, String value2) {
            addCriterion("coordinate not between", value1, value2, "coordinate");
            return (Criteria) this;
        }

        public Criteria andPeopleIsNull() {
            addCriterion("people is null");
            return (Criteria) this;
        }

        public Criteria andPeopleIsNotNull() {
            addCriterion("people is not null");
            return (Criteria) this;
        }

        public Criteria andPeopleEqualTo(Integer value) {
            addCriterion("people =", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleNotEqualTo(Integer value) {
            addCriterion("people <>", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleGreaterThan(Integer value) {
            addCriterion("people >", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleGreaterThanOrEqualTo(Integer value) {
            addCriterion("people >=", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleLessThan(Integer value) {
            addCriterion("people <", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleLessThanOrEqualTo(Integer value) {
            addCriterion("people <=", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleIn(List<Integer> values) {
            addCriterion("people in", values, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleNotIn(List<Integer> values) {
            addCriterion("people not in", values, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleBetween(Integer value1, Integer value2) {
            addCriterion("people between", value1, value2, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleNotBetween(Integer value1, Integer value2) {
            addCriterion("people not between", value1, value2, "people");
            return (Criteria) this;
        }

        public Criteria andFitpeopleIsNull() {
            addCriterion("fitpeople is null");
            return (Criteria) this;
        }

        public Criteria andFitpeopleIsNotNull() {
            addCriterion("fitpeople is not null");
            return (Criteria) this;
        }

        public Criteria andFitpeopleEqualTo(String value) {
            addCriterion("fitpeople =", value, "fitpeople");
            return (Criteria) this;
        }

        public Criteria andFitpeopleNotEqualTo(String value) {
            addCriterion("fitpeople <>", value, "fitpeople");
            return (Criteria) this;
        }

        public Criteria andFitpeopleGreaterThan(String value) {
            addCriterion("fitpeople >", value, "fitpeople");
            return (Criteria) this;
        }

        public Criteria andFitpeopleGreaterThanOrEqualTo(String value) {
            addCriterion("fitpeople >=", value, "fitpeople");
            return (Criteria) this;
        }

        public Criteria andFitpeopleLessThan(String value) {
            addCriterion("fitpeople <", value, "fitpeople");
            return (Criteria) this;
        }

        public Criteria andFitpeopleLessThanOrEqualTo(String value) {
            addCriterion("fitpeople <=", value, "fitpeople");
            return (Criteria) this;
        }

        public Criteria andFitpeopleLike(String value) {
            addCriterion("fitpeople like", value, "fitpeople");
            return (Criteria) this;
        }

        public Criteria andFitpeopleNotLike(String value) {
            addCriterion("fitpeople not like", value, "fitpeople");
            return (Criteria) this;
        }

        public Criteria andFitpeopleIn(List<String> values) {
            addCriterion("fitpeople in", values, "fitpeople");
            return (Criteria) this;
        }

        public Criteria andFitpeopleNotIn(List<String> values) {
            addCriterion("fitpeople not in", values, "fitpeople");
            return (Criteria) this;
        }

        public Criteria andFitpeopleBetween(String value1, String value2) {
            addCriterion("fitpeople between", value1, value2, "fitpeople");
            return (Criteria) this;
        }

        public Criteria andFitpeopleNotBetween(String value1, String value2) {
            addCriterion("fitpeople not between", value1, value2, "fitpeople");
            return (Criteria) this;
        }

        public Criteria andStidegreIsNull() {
            addCriterion("stidegre is null");
            return (Criteria) this;
        }

        public Criteria andStidegreIsNotNull() {
            addCriterion("stidegre is not null");
            return (Criteria) this;
        }

        public Criteria andStidegreEqualTo(Integer value) {
            addCriterion("stidegre =", value, "stidegre");
            return (Criteria) this;
        }

        public Criteria andStidegreNotEqualTo(Integer value) {
            addCriterion("stidegre <>", value, "stidegre");
            return (Criteria) this;
        }

        public Criteria andStidegreGreaterThan(Integer value) {
            addCriterion("stidegre >", value, "stidegre");
            return (Criteria) this;
        }

        public Criteria andStidegreGreaterThanOrEqualTo(Integer value) {
            addCriterion("stidegre >=", value, "stidegre");
            return (Criteria) this;
        }

        public Criteria andStidegreLessThan(Integer value) {
            addCriterion("stidegre <", value, "stidegre");
            return (Criteria) this;
        }

        public Criteria andStidegreLessThanOrEqualTo(Integer value) {
            addCriterion("stidegre <=", value, "stidegre");
            return (Criteria) this;
        }

        public Criteria andStidegreIn(List<Integer> values) {
            addCriterion("stidegre in", values, "stidegre");
            return (Criteria) this;
        }

        public Criteria andStidegreNotIn(List<Integer> values) {
            addCriterion("stidegre not in", values, "stidegre");
            return (Criteria) this;
        }

        public Criteria andStidegreBetween(Integer value1, Integer value2) {
            addCriterion("stidegre between", value1, value2, "stidegre");
            return (Criteria) this;
        }

        public Criteria andStidegreNotBetween(Integer value1, Integer value2) {
            addCriterion("stidegre not between", value1, value2, "stidegre");
            return (Criteria) this;
        }

        public Criteria andFireIsNull() {
            addCriterion("fire is null");
            return (Criteria) this;
        }

        public Criteria andFireIsNotNull() {
            addCriterion("fire is not null");
            return (Criteria) this;
        }

        public Criteria andFireEqualTo(Integer value) {
            addCriterion("fire =", value, "fire");
            return (Criteria) this;
        }

        public Criteria andFireNotEqualTo(Integer value) {
            addCriterion("fire <>", value, "fire");
            return (Criteria) this;
        }

        public Criteria andFireGreaterThan(Integer value) {
            addCriterion("fire >", value, "fire");
            return (Criteria) this;
        }

        public Criteria andFireGreaterThanOrEqualTo(Integer value) {
            addCriterion("fire >=", value, "fire");
            return (Criteria) this;
        }

        public Criteria andFireLessThan(Integer value) {
            addCriterion("fire <", value, "fire");
            return (Criteria) this;
        }

        public Criteria andFireLessThanOrEqualTo(Integer value) {
            addCriterion("fire <=", value, "fire");
            return (Criteria) this;
        }

        public Criteria andFireIn(List<Integer> values) {
            addCriterion("fire in", values, "fire");
            return (Criteria) this;
        }

        public Criteria andFireNotIn(List<Integer> values) {
            addCriterion("fire not in", values, "fire");
            return (Criteria) this;
        }

        public Criteria andFireBetween(Integer value1, Integer value2) {
            addCriterion("fire between", value1, value2, "fire");
            return (Criteria) this;
        }

        public Criteria andFireNotBetween(Integer value1, Integer value2) {
            addCriterion("fire not between", value1, value2, "fire");
            return (Criteria) this;
        }

        public Criteria andLineupIsNull() {
            addCriterion("lineup is null");
            return (Criteria) this;
        }

        public Criteria andLineupIsNotNull() {
            addCriterion("lineup is not null");
            return (Criteria) this;
        }

        public Criteria andLineupEqualTo(Integer value) {
            addCriterion("lineup =", value, "lineup");
            return (Criteria) this;
        }

        public Criteria andLineupNotEqualTo(Integer value) {
            addCriterion("lineup <>", value, "lineup");
            return (Criteria) this;
        }

        public Criteria andLineupGreaterThan(Integer value) {
            addCriterion("lineup >", value, "lineup");
            return (Criteria) this;
        }

        public Criteria andLineupGreaterThanOrEqualTo(Integer value) {
            addCriterion("lineup >=", value, "lineup");
            return (Criteria) this;
        }

        public Criteria andLineupLessThan(Integer value) {
            addCriterion("lineup <", value, "lineup");
            return (Criteria) this;
        }

        public Criteria andLineupLessThanOrEqualTo(Integer value) {
            addCriterion("lineup <=", value, "lineup");
            return (Criteria) this;
        }

        public Criteria andLineupIn(List<Integer> values) {
            addCriterion("lineup in", values, "lineup");
            return (Criteria) this;
        }

        public Criteria andLineupNotIn(List<Integer> values) {
            addCriterion("lineup not in", values, "lineup");
            return (Criteria) this;
        }

        public Criteria andLineupBetween(Integer value1, Integer value2) {
            addCriterion("lineup between", value1, value2, "lineup");
            return (Criteria) this;
        }

        public Criteria andLineupNotBetween(Integer value1, Integer value2) {
            addCriterion("lineup not between", value1, value2, "lineup");
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
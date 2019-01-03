package com.matthew.dao;

import org.springframework.data.jpa.domain.Specification;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.matthew.model.User;
import com.matthew.util.SpecSearchCriteria;

public class UserSpecification implements Specification<User> {

	private static final long serialVersionUID = 1L;
	
	private SpecSearchCriteria criteria;

	public UserSpecification(final SpecSearchCriteria criteria) {
		super();
		this.criteria = criteria;
	}

	public SpecSearchCriteria getCriteria() {
		return criteria;
	}

	@Override
	public Predicate toPredicate(final Root<User> root, final CriteriaQuery<?> query, final CriteriaBuilder builder) {
		switch (criteria.getOperation()) {
		case EQUALITY:
			return builder.and(builder.equal(root.get(criteria.getId()), criteria.getIdValue()), builder.equal(root.get(criteria.getName()), criteria.getNameValue()));
		default:
			return null;
		}
	}

}
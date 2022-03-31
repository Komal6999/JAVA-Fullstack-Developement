package com.hcl.repository;

import org.springframework.data.repository.CrudRepository;

import com.hcl.model.FeedbackEntity;

public interface FeedbackRepository extends CrudRepository<FeedbackEntity, Long> {

}

package com.digitalinnovationone.Kubernetes.persistence;

import org.springframework.data.repository.CrudRepository;

import com.digitalinnovationone.Kubernetes.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {

}

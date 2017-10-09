package io.pivotal.demo.SpringPerson.repository;

import org.springframework.data.repository.CrudRepository;

import io.pivotal.demo.SpringPerson.domain.Person;

public interface PersonRepository extends CrudRepository<Person, String> {

}

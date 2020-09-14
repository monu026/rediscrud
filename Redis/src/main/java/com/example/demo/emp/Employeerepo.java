package com.example.demo.emp;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Employeerepo extends CrudRepository<Employee, String> {

}

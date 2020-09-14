package com.example.demo.emp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    Employeerepo employeerepo;
    public void add(Employee employee) {
        employeerepo.save(employee);
    }
    public Employee get(String id) {
        return employeerepo.findById(id).get();
    }
    public List<Employee> getAll() {
        List<Employee> lst = new ArrayList<Employee> ();
        employeerepo.findAll().forEach(emp -> lst.add(emp));
        return lst;
    }
    public void delete(String id) {
        employeerepo.deleteById(id);
    }
    public void edit(String id, String newname) {
        Employee employee = employeerepo.findById(id).get();
        employee.setName(newname);
        employeerepo.save(employee);
    }
}

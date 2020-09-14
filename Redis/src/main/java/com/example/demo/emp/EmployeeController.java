package com.example.demo.emp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @RequestMapping(value = "/emp")
    public List<Employee> getall() {
        return employeeService.getAll();
    }
    @GetMapping(value = "/emp/{id}")
    public Employee getbyID(@PathVariable("id") String id) {
        return employeeService.get(id);
    }
    @DeleteMapping(value = "/emp/{id}")
    public void del(@PathVariable("id") String id) {
        employeeService.delete(id);
    }
    @PostMapping(value = "/emp")
    public void save(@RequestBody Employee employee) {
        employeeService.add(employee);
    }
    @PutMapping(value = "/emp/{id}/{new_name}")
    public void edit(@PathVariable("id") String id, @PathVariable("new_name") String new_name) {
        employeeService.edit(id, new_name);
    }

}

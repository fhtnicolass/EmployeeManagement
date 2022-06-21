
package app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.repository.EmployeeRepository;
import app.model.Employee;

@RestController
@RequestMapping("/api/v")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;
    
    
    //get all employees
    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }
}
package de.tbo.services.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import de.tbo.services.model.Employee;

import java.util.List;

@FeignClient(name = "employee")
public interface EmployeeClient {

    @GetMapping("/department/{departmentId}")
    List<Employee> findByDepartment(@PathVariable("departmentId") String departmentId);

    @GetMapping("/department-with-delay/{departmentId}")
    List<Employee> findByDepartmentWithDelay(@PathVariable("departmentId") String departmentId);
}

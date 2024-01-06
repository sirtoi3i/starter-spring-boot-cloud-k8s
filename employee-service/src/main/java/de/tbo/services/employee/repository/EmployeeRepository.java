package de.tbo.services.employee.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import de.tbo.services.employee.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, String> {

    List<Employee> findByDepartmentId(String departmentId);

    List<Employee> findByOrganizationId(String organizationId);

}

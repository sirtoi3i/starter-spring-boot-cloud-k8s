package de.tbo.services.department.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import de.tbo.services.department.model.Department;

public interface DepartmentRepository extends CrudRepository<Department, String> {

	List<Department> findByOrganizationId(String organizationId);
	
}

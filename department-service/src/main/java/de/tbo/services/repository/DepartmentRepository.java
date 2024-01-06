package de.tbo.services.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import de.tbo.services.model.Department;

public interface DepartmentRepository extends CrudRepository<Department, String> {

	List<Department> findByOrganizationId(String organizationId);
	
}

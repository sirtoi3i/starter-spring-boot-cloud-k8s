package de.tbo.services.organization.repository;

import org.springframework.data.repository.CrudRepository;

import de.tbo.services.organization.model.Organization;

public interface OrganizationRepository extends CrudRepository<Organization, String> {
	
}

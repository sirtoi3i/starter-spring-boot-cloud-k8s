package de.tbo.services.organization.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import de.tbo.services.organization.model.Employee;

@FeignClient(name = "employee")
public interface EmployeeClient {

    @GetMapping("/organization/{organizationId}")
    List<Employee> findByOrganization(@PathVariable("organizationId") String organizationId);

}

package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.model.EmployeeDTO;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeApiController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("")
	public List<Employee> getAllEmployees() {
		return employeeService.findAllEmployees();
	}

	@GetMapping("/{employeeId}")
	public Optional<Employee> getEmployeeById(@PathVariable(name = "employeeId") String idFromUrl) {
		return employeeService.findEmployeeById(idFromUrl);
	}

	@GetMapping("/address/{address}")
	public List<Employee> getAllEmployeesByAddress(@PathVariable(name = "address") String addressFromUrl) {
		return employeeService.findAllEmployeesByAddress(addressFromUrl);
	}

	@GetMapping("/search_query={nameOrAddress}")
	public List<Employee> getAllEmployeesByNameOrAddress(
			@PathVariable(name = "nameOrAddress") String nameOrAddressFromUrl) {
		return employeeService.findAllEmployeesByNameOrAddress(nameOrAddressFromUrl);
	}

	@PostMapping("/add")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee newEmployee) {
		employeeService.addEmployee(newEmployee);
		return ResponseEntity.ok().body(newEmployee);
	}

	@PutMapping("/{employeeId}/edit")
	public ResponseEntity<Employee> editEmployee(@PathVariable(name = "employeeId") String idFromUrl,
			@RequestBody Employee editedEmployee) {
		employeeService.editEmployee(idFromUrl, editedEmployee);
		return ResponseEntity.ok().body(editedEmployee);
	}

	@DeleteMapping("/{employeeId}/delete")
	public ResponseEntity<Employee> deleteEmployee(@PathVariable(name = "employeeId") String idFromUrl) {
		employeeService.deleteEmployeeById(idFromUrl);
		return ResponseEntity.ok().build();
	}

	@GetMapping("/projectName={projectName}")
	public List<EmployeeDTO> getAllEmployeesByProjectName(
			@PathVariable(name = "projectName") String projectNameFromUrl) {
		return employeeService.findAllEmployeesByProjectName(projectNameFromUrl);
	}
}

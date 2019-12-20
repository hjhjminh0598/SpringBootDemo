package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.model.EmployeeDTO;
import com.example.demo.repo.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepository;

	@PersistenceContext
	private EntityManager entityManager;

	@Autowired
	private EmployeeCacheService employeeCacheService;

	public List<Employee> findAllEmployees() {
		List<Employee> listEmpsFromCache = employeeCacheService.findAllEmployeesFromCache();
		if (!listEmpsFromCache.isEmpty()) {
			System.out.println("Load from cache");
			return listEmpsFromCache;
		} else {
			System.out.println("Load from db");
			employeeCacheService.putEmployeeFromDbToCache(employeeRepository.findAll());
			return employeeRepository.findAll();
		}
	}

	public Optional<Employee> findEmployeeById(String id) {
		return employeeRepository.findById(id);
	}

	@SuppressWarnings("unchecked")
	public List<EmployeeDTO> findAllEmployeesByProjectName(String projectNameFromUrl) {
		String projectName = projectNameFromUrl.replace("+", " ");
		String sqlString = "SELECT n.*, dean.tenda, dean.mada FROM nhanvien n INNER JOIN dean ON dean.tenda = :projectName AND n.PHG = dean.PHG";
		try {
			List<EmployeeDTO> listResult = new ArrayList<EmployeeDTO>();
			javax.persistence.Query query = entityManager.createNativeQuery(sqlString, "EmployeeDTOMapping");
			query.setParameter("projectName", projectName);
			listResult = (List<EmployeeDTO>) query.getResultList();
			return listResult;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public List<Employee> findAllEmployeesByNameOrAddress(String nameOrAddressFromUrl) {
		String nameOrAddressQuery = nameOrAddressFromUrl.replace("+", " ");
		return employeeRepository.findAllEmployeesByNameOrAddress(nameOrAddressQuery, nameOrAddressQuery,
				nameOrAddressQuery, nameOrAddressQuery);
	}

	public List<Employee> findAllEmployeesByAddress(String addressFromUrl) {
		String address = addressFromUrl.replace("+", " ");
		return employeeRepository.findAllEmployeesByAddress(address);
	}

	public void addEmployee(Employee employee) {
		employeeRepository.save(employee);
	}

	public void editEmployee(String id, Employee employee) {
		String idEmployeeReturn = employee.getId();
		if (idEmployeeReturn.equals(id))
			employeeRepository.save(employee);
	}

	public void deleteEmployeeById(String id) {
		employeeRepository.deleteById(id);
	}

}

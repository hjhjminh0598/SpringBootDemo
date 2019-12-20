package com.example.demo.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;

@Service
public class EmployeeCacheService {

	@Value("${time.expire.cache.second}")
	private int timeExpireCache;

	@Value("${size.cache}")
	private int SIZE_CACHE;

	private Map<String, Employee> mapEmps = new ConcurrentHashMap<String, Employee>();

	public void putEmployeeFromDbToCache(List<Employee> listEmps) {
		Cache<String, Employee> cacheEmps = Caffeine.newBuilder().expireAfterWrite(timeExpireCache, TimeUnit.SECONDS)
				.maximumSize(SIZE_CACHE).build();
		for (Employee employee : listEmps) {
			String empId = employee.getId();
			cacheEmps.put(empId, employee);
		}
		this.mapEmps = cacheEmps.asMap();
	}

	public List<Employee> findAllEmployeesFromCache() {
		List<Employee> listEmps = new CopyOnWriteArrayList<Employee>();
		for (String key : mapEmps.keySet())
			listEmps.add(mapEmps.get(key));
		return listEmps;
	}
}

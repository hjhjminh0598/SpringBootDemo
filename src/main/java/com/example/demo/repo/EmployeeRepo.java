package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, String> {

	List<Employee> findAllEmployeesByAddress(String address);

//	@Query("Select n from nhanvien n where n.tennv like concat('%', :firstname, '%') or n.tenlot like concat('%', :midname, '%') or n.honv like concat('%', :lastname, '%')")
//	List<Employee> findAllEmployeesByFirstNameOrLastNameOrMidName(@Param("firstname") String firstName,
//			@Param("midname") String midName, @Param("lastname") String lastName);

	@Query(value = "Select * from nhanvien n where n.tennv like concat('%',:firstname,'%') or"
			+ " n.tenlot like concat('%',:midname,'%') or n.honv like concat('%',:lastname,'%')"
			+ " or n.dchi like concat('%',:address,'%')", nativeQuery = true)
	List<Employee> findAllEmployeesByNameOrAddress(@Param("firstname") String firstName,
			@Param("midname") String midName, @Param("lastname") String lastName, @Param("address") String address);
}

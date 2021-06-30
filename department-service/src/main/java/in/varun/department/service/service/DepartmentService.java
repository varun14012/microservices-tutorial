package in.varun.department.service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.varun.department.service.entity.Department;
import in.varun.department.service.repo.DepartmentRepo;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService {

	@Autowired
	private DepartmentRepo repo;

	public Department saveDepartment(Department department) {
		log.info("In saveDepartment service");
		return repo.save(department);
	}

	public Department getDepartment(Long departmentId) {
		log.info("In getDepartment Service");
		return repo.findByDepartmentId(departmentId);
	}

}

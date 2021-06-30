package in.varun.department.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.varun.department.service.entity.Department;
import in.varun.department.service.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("departments")
@Slf4j
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;

	@PostMapping("/")
	public Department saveDepartment(@RequestBody Department department) {
		log.info("In saveDepartment controller");

		return departmentService.saveDepartment(department);

	}

	@GetMapping("/{id}")
	public Department getDepartment(@PathVariable("id") Long departmentId) {
		log.info("In getDepartment controller");
		return departmentService.getDepartment(departmentId);

	}
}

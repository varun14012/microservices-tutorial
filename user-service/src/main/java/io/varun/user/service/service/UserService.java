package io.varun.user.service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import io.varun.user.service.entity.User;
import io.varun.user.service.repo.UserRepo;
import io.varun.user.service.vo.Department;
import io.varun.user.service.vo.ResponseTemplateVO;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {

	@Autowired
	private UserRepo repo;

	@Autowired
	private RestTemplate restTemplate;

	public User saveUser(User user) {
		log.info("In save User Service");
		return repo.save(user);
	}

	public User findUser(Long userId) {
		log.info("In get User Service");
		return repo.findUserByUserId(userId);
	}

	public ResponseTemplateVO getUserWithDepartment(Long userId) {

		ResponseTemplateVO responseTemplateVO = new ResponseTemplateVO();
		responseTemplateVO.setUser(repo.findUserByUserId(userId));

		Department department = restTemplate.getForObject(
				"http://localhost:9001/departments/" + responseTemplateVO.getUser().getDepartmentId(),
				Department.class);

		responseTemplateVO.setDepartment(department);

		return responseTemplateVO;
	}

}

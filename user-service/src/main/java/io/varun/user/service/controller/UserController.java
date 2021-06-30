package io.varun.user.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.varun.user.service.entity.User;
import io.varun.user.service.service.UserService;
import io.varun.user.service.vo.ResponseTemplateVO;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("users")
@Slf4j
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/")
	public User saveUser(@RequestBody User user) {
		log.info("In Save User controller");
		return userService.saveUser(user);

	}

//	@GetMapping("/{id}")
//	public User findUser(@PathVariable("id") Long userId) {
//		log.info("In get User controller");
//		return userService.findUser(userId);
//	}

	@GetMapping("/{id}")
	public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") Long userId) {
		log.info("In get User controller");
		return userService.getUserWithDepartment(userId);

	}
}

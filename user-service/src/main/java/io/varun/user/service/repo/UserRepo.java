package io.varun.user.service.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.varun.user.service.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
	User findUserByUserId(Long userId);

}

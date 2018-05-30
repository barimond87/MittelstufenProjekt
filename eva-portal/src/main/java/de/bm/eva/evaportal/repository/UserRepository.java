package de.bm.eva.evaportal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import de.bm.eva.evaportal.persistence.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
//
//	@Query(value = "SELECT * FROM user WHERE username = ?1", nativeQuery = true)
//	public List<User> findAllUsers(String username);

	public User findByUsername(String username);
	
}

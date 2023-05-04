package in.dibya.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.dibya.entity.User;


public interface UserRepo extends JpaRepository<User, Integer> {

	
	public User findByEmail(String email);
}

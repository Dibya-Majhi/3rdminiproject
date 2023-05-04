package in.dibya.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.dibya.entity.Post;


public interface PostRepo extends JpaRepository<Post, Integer> {

}

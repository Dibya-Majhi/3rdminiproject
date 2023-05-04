package in.dibya.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.dibya.entity.Comment;


public interface CommentRepo extends JpaRepository<Comment, Integer> {

}

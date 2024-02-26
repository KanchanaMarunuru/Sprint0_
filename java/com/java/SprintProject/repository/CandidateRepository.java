
package com.java.SprintProject.repository;
 
import org.springframework.data.jpa.repository.JpaRepository;
 
import com.java.SprintProject.entity.Candidate;
 
public interface CandidateRepository  extends JpaRepository<Candidate, Long>{
 
	//User findByUsername(String username);
 
}

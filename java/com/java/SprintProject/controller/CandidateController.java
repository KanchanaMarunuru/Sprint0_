
package com.java.SprintProject.controller;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
import com.java.SprintProject.entity.Candidate;
import com.java.SprintProject.repository.CandidateRepository;
 
 
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "http://localhost:4200/")
@RestController
public class CandidateController {
 
	@Autowired
	private CandidateRepository candidateRepository;
	
	ResponseEntity<?> response;
	
	//create candidate rest api
	@PostMapping("/candidate")
	public Candidate createCandidate(@RequestBody Candidate candidate) {
	  return candidateRepository.save(candidate);
	}
 
	//get all candidates
	 @GetMapping("/candidate")
	 public List<Candidate>getAllcandidates(){
			return candidateRepository.findAll();
		}
}
 
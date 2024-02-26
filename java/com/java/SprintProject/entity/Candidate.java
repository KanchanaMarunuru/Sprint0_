
package com.java.SprintProject.entity;
 
import java.time.LocalDateTime;
 
import com.fasterxml.jackson.annotation.JsonFormat;
 
import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;

import jakarta.persistence.GenerationType;

import jakarta.persistence.Id;

import jakarta.persistence.Table;
 
@Entity

@Table(name="candidate")

public class Candidate {
 
	@Id

	@GeneratedValue(strategy=GenerationType.IDENTITY)

	private Long recId;

	private Long candidateNo;

	private String candidateName;

	private int score;

	private int rank;

	@JsonFormat(pattern="dd/MM/yyyy HH:mm:ss")

	private LocalDateTime updateDate;

	public Long getRecId() {

		return recId;

	}

	public void setRecId(Long recId) {

		this.recId = recId;

	}

	public Long getCandidateNo() {

		return candidateNo;

	}

	public void setCandidateNo(Long candidateNo) {

		this.candidateNo = candidateNo;

	}

	public String getCandidateName() {

		return candidateName;

	}

	public void setCandidateName(String candidateName) {

		this.candidateName = candidateName;

	}

	public int getScore() {

		return score;

	}

	public void setScore(int score) {

		this.score = score;

	}

	public int getRank() {

		return rank;

	}

	public void setRank(int rank) {

		this.rank = rank;

	}

	public LocalDateTime getUpdateDate() {

		return updateDate;

	}

	public void setUpdateDate(LocalDateTime updateDate) {

		this.updateDate = updateDate;

	}
 
	

}

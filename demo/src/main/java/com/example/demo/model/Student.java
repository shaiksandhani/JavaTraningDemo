/**
 * 
 */
package com.example.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Hp
 *
 */
@Entity
@Data
@Table(name = "student")
@Getter
@Setter
@NoArgsConstructor

public class Student {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int id;
	private String firstName;
	private String lastName;
	private String branch;
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE, mappedBy = "student")
    @JoinColumn(name = "university_id", nullable = false)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private University university;

	public Student(int id, String firstName, String lastName, String branch, University university) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.branch = branch;
		this.university = university;
	}
}

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
@Table(name = "university")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class University {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String uName;
	private String place;
	private int pinCode;
	@OneToOne(targetEntity = Student.class,fetch = FetchType.LAZY,cascade =  CascadeType.ALL)
    @JoinColumn(name = "student_id")
	private Student student;

	}

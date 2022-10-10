package com.rahmetdonmez.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="team")
public class Team {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Column(name="department")
	private String department;
	
	@Column(name="name")
	private String name;
	
	@Column(name="info")
	private String info;
	
	@OneToOne(mappedBy ="team",cascade = CascadeType.ALL,orphanRemoval = true) 
	private Captain captain;
	
	
	
	public Captain getCaptain() {
		return captain;
	}

	public void setCaptain(Captain captain) {
		this.captain = captain;
	}
	
	 @OneToMany(mappedBy = "team",cascade = CascadeType.ALL,orphanRemoval = true)
	  private Set<Student> students=new HashSet<>();
	 public void addStudent(Student student) {
			students.add(student);
		}
	 public void removeStudent(Student student) {
			students.remove(student);
		}
	/*
	 * @OneToMany(mappedBy = "team",cascade = CascadeType.ALL,orphanRemoval = true)
	 * private Set<Student> students=new HashSet<>();
	 * 
	 * @OneToOne(mappedBy ="team") private Captain captain;
	 
	
	public void addStudent(Student student) {
		students.add(student);
	}
	public void removeStudent(Student student) {
		students.remove(student);
	}

	

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	public Captain getCaptain() {
		return captain;
	}

	public void setCaptain(Captain captain) {
		this.captain = captain;
		captain.setTeam(this);
	}
	*/
	public int getId() {
		return id;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	
	

}

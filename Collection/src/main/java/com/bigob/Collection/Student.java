package com.bigob.Collection;

import java.util.Comparator;

public class Student implements Comparator<Student> {

	private Integer id;
	private String name;

	public Integer getId() {
		return id;
	}

	public Student setId(Integer id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public Student setName(String name) {
		this.name = name;
		return this;
	}
	
	@Override
	public String toString() {
		return "ID : "+id+" Name : "+name;
	}

	@Override
	public int compare(Student o1, Student o2) {
		return (o1.id - o2.id > 0) ? -1 : 1;
	}
}

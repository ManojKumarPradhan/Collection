package com.bigob.Collection;

public class Student1 implements Comparable<Student1>{

	private Integer id;
	private String name;

	public Integer getId() {
		return id;
	}

	public Student1 setId(Integer id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public Student1 setName(String name) {
		this.name = name;
		return this;
	}
	
	@Override
	public int compareTo(Student1 o) {
		return this.id-o.id;
	}
	
	@Override
	public String toString() {
		return "Id : "+id+" Name : "+name;
	}

}

package com.bigob.Collection;

public class Student3 {

	private Integer id;
	private String name;
	public Integer getId() {
		return id;
	}
	public Student3 setId(Integer id) {
		this.id = id;
		return this;
	}
	public String getName() {
		return name;
	}
	public Student3 setName(String name) {
		this.name = name;
		return this;
	}
	@Override
	public String toString() {
		return "Student3 [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		System.out.println("hashcode");
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student3 other = (Student3) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}

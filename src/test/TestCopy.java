package test;

import org.junit.Test;
import org.springframework.beans.BeanUtils;

public class TestCopy {
	@Test
	public void testss(){
		Student stu=new Student(1,"张三");
		Teacher te=new Teacher();
		BeanUtils.copyProperties(stu, te);
		System.out.println(te);
	}

}
class Student{
	int id=2;
	String name;
	public Student(){
		
		
	}
	public Student(int id,String name){
		this.id=id;
		this.name=name;
	}
	public int getId() {
		return id;
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
}
class Teacher{
	int id;
	public Teacher(){
		
	}

	public String toString(){
		return id+"";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}

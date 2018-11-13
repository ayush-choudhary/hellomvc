package my;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

@Entity
public class Employee {
@Id
@GeneratedValue(strategy=GenerationType.SEQUENCE)
//@Min(value = 2,message="Must Be a length of two")
int eid;@Size(max=3,min=2,message="Must be in the range of")

private String name;
@Max(value=58,message="Employee Age")
private int age;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", name=" + name + ", age=" + age + "]";
}




}

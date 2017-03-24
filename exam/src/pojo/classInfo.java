package pojo;

import java.util.HashSet;
import java.util.Set;

//班级信息
//classinfo(id,className,createTime)
public class classInfo extends basicPojo{
 private String className;//班级名称
 //班级的学生
 private Set<user> students=new HashSet<user>(0);
public String getClassName() {
	return className;
}
public void setClassName(String className) {
	this.className = className;
}
public Set<user> getStudents() {
	return students;
}
public void setStudents(Set<user> students) {
	this.students = students;
}
 
 
 
 
}

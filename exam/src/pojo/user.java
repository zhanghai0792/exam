package pojo;
//user(id,createTime,name,pwd,noId,class_id,type)
public class user extends basicPojo{
private String name;
private String pwd;
private String noId;//学生用学号，教师用职工号
private classInfo classInfo;//属于那个班级
private Integer type;//用户类型 0为学生，1为教师

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPwd() {
	return pwd;
}
public void setPwd(String pwd) {
	this.pwd = pwd;
}
public String getNoId() {
	return noId;
}
public void setNoId(String noId) {
	this.noId = noId;
}
public classInfo getClassInfo() {
	return classInfo;
}
public void setClassInfo(classInfo classInfo) {
	this.classInfo = classInfo;
}
public int getType() {
	return type;
}
public void setType(int type) {
	this.type = type;
}


}

package pojo;

import java.util.Date;
//loginDetail(id,createTime,stu_id,course_id,ip,cookieValue,entryTime,exitTime)
public class loginDetail extends basicPojo{
  private user student;//那个学生
  private course course;//考试科目
  private String ip;//ip值
  private String cookieValue;//当前上传的cookie值
  private Date entryTime;//每次进入页面时间
  private Date exitTime;//每次离开页面时间
  
  
  
public user getStudent() {
	return student;
}
public void setStudent(user student) {
	this.student = student;
}
public course getCourse() {
	return course;
}
public void setCourse(course course) {
	this.course = course;
}
public String getIp() {
	return ip;
}
public void setIp(String ip) {
	this.ip = ip;
}
public String getCookieValue() {
	return cookieValue;
}
public void setCookieValue(String cookieValue) {
	this.cookieValue = cookieValue;
}
public Date getEntryTime() {
	return entryTime;
}
public void setEntryTime(Date entryTime) {
	this.entryTime = entryTime;
}
public Date getExitTime() {
	return exitTime;
}
public void setExitTime(Date exitTime) {
	this.exitTime = exitTime;
}

  
}

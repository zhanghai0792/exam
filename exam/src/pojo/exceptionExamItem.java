package pojo;

import java.util.Date;

//考试中出现异常的考生信息
//exceptionExamItem(id,createTime,stu_id,teacher_id,preIp,currentIp,dealTime,preCookieValue,currentCookieValue)
public class exceptionExamItem extends basicPojo {
   private user student;
   private user teacher;
   private String preIp;//异常前的Ip
   private String currentIp;//当前的Ip;
   private Date dealTime;//教师的处理时间
   private String preCookieValue;//异常前的Ip
   private String currentCookieValue;//异常前的Ip
   
   
   
public user getStudent() {
	return student;
}
public void setStudent(user student) {
	this.student = student;
}
public user getTeacher() {
	return teacher;
}
public void setTeacher(user teacher) {
	this.teacher = teacher;
}
public String getPreIp() {
	return preIp;
}
public void setPreIp(String preIp) {
	this.preIp = preIp;
}
public String getCurrentIp() {
	return currentIp;
}
public void setCurrentIp(String currentIp) {
	this.currentIp = currentIp;
}
public Date getDealTime() {
	return dealTime;
}
public void setDealTime(Date dealTime) {
	this.dealTime = dealTime;
}
public String getPreCookieValue() {
	return preCookieValue;
}
public void setPreCookieValue(String preCookieValue) {
	this.preCookieValue = preCookieValue;
}
public String getCurrentCookieValue() {
	return currentCookieValue;
}
public void setCurrentCookieValue(String currentCookieValue) {
	this.currentCookieValue = currentCookieValue;
}
  
   
}

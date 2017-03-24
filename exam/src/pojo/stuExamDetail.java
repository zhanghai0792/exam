package pojo;

import java.util.Date;

//每个学生的考试细则
//stuExamDetail(id,createTime,stu_id,startTime,endTime,cookieValue,ip,examQuest_id)
public class stuExamDetail extends basicPojo{
 private user student;
 private Date starTime;
 private Date endTime;
 //系统产生的随机校验值,防止别人上传试题
 private String cookieValue;//第一次登录服务器产生的
 private String ip;//第一次登录的IP值
 //考的是哪套试题
 private examQuestFile question;
 
 
public user getStudent() {
	return student;
}
public void setStudent(user student) {
	this.student = student;
}
public Date getStarTime() {
	return starTime;
}
public void setStarTime(Date starTime) {
	this.starTime = starTime;
}
public Date getEndTime() {
	return endTime;
}
public void setEndTime(Date endTime) {
	this.endTime = endTime;
}
public String getCookieValue() {
	return cookieValue;
}
public void setCookieValue(String cookieValue) {
	this.cookieValue = cookieValue;
}
public String getIp() {
	return ip;
}
public void setIp(String ip) {
	this.ip = ip;
}
public examQuestFile getQuestion() {
	return question;
}
public void setQuestion(examQuestFile question) {
	this.question = question;
}

}

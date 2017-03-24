package pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//考试科目信息，那门课，那个班，什么老师操作，考试时间是多少等信息
//examItem(id,createTime,teacher_id,course_id,class_id,starTime,endInterval,endAlert)
//哪个班，考试那几套题目
//classExamQuestFiles(id,examItem_id,questFile_id)
public class examItem extends basicPojo{
 private user teacher;//那个老师操作的
 private course course;//什么课
 private classInfo examClass;//那个班要考试
 private Date starTime;
 private long endInterval=1000*60*100;//考试的结束时间,默认是100分钟
 private long endAlert=1000*60*95;//结束考试前5分钟提示
 //考那几套题目
 private List<examQuestFile> classExamQuestFiles=new ArrayList<examQuestFile>(0);
 
public user getTeacher() {
	return teacher;
}
public void setTeacher(user teacher) {
	this.teacher = teacher;
}
public course getCourse() {
	return course;
}
public void setCourse(course course) {
	this.course = course;
}
public classInfo getExamClass() {
	return examClass;
}
public void setExamClass(classInfo examClass) {
	this.examClass = examClass;
}
public Date getStarTime() {
	return starTime;
}
public void setStarTime(Date starTime) {
	this.starTime = starTime;
}
public long getEndInterval() {
	return endInterval;
}
public void setEndInterval(long endInterval) {
	this.endInterval = endInterval;
}
public long getEndAlert() {
	return endAlert;
}
public void setEndAlert(long endAlert) {
	this.endAlert = endAlert;
}
public List<examQuestFile> getClassExamQuestFiles() {
	return classExamQuestFiles;
}
public void setClassExamQuestFiles(List<examQuestFile> classExamQuestFiles) {
	this.classExamQuestFiles = classExamQuestFiles;
}

 
 
}

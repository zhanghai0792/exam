package pojo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
//course(id,createTime,courseName,courseNo,examFilePath,stusExamFilePath)
public class course extends basicPojo{
 
 private String courseName;//课程名
 private String courseNo;//课程编号
  // 默认为      /WEB-INF/examTeaherFiles/课程名
private String examFilePath;//考题存放的物理相对路径
 //默认以      /课程名/班级名/
 private String stusExamFilePath;//学生上传题目的班级存放的路径
 //该课程的考试题目
 private List<examQuestFile> examFiles=new ArrayList<examQuestFile>(0);
public String getCourseName() {
	return courseName;
}
public void setCourseName(String courseName) {
	this.courseName = courseName;
}
public String getCourseNo() {
	return courseNo;
}
public void setCourseNo(String courseNo) {
	this.courseNo = courseNo;
}
public String getExamFilePath() {
	return examFilePath;
}
public void setExamFilePath(String examFilePath) {
	this.examFilePath = examFilePath;
}
public String getStusExamFilePath() {
	return stusExamFilePath;
}
public void setStusExamFilePath(String stusExamFilePath) {
	this.stusExamFilePath = stusExamFilePath;
}
public List<examQuestFile> getExamFiles() {
	return examFiles;
}
public void setExamFiles(List<examQuestFile> examFiles) {
	this.examFiles = examFiles;
}

 
 
 
 
}

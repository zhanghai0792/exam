package pojo;
//一套考试题目文件
//examQuestFile(id,createTime,filePath,questName,teacher_id,course_id)
public class examQuestFile extends basicPojo{
 private String questName;//试题名称
 
  private String filePath;
  //出题人
  private user teacher;
  //是哪门课的试卷
  private course course;
  
 
  
public String getFilePath() {
	return filePath;
}
public void setFilePath(String filePath) {
	this.filePath = filePath;
}
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

public String getQuestName() {
	return questName;
}
public void setQuestName(String questName) {
	this.questName = questName;
}

  
  
  
}

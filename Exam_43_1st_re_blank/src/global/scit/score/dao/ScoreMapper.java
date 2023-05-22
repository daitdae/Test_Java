package global.scit.score.dao;


import java.util.List;

import global.scit.score.vo.Student;

public interface ScoreMapper {
	public int insertScore(Student s);
	public Student findByStdid(int stdid);
	public int updateScore(Student s);
	public int deleteScore(int stdid);
	public List<Student> selectAll();
}

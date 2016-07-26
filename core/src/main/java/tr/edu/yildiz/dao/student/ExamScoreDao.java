package tr.edu.yildiz.dao.student;

import tr.edu.yildiz.dao.BaseDao;
import tr.edu.yildiz.domain.student.ExamScore;

import java.util.List;

public interface jgyjvmv ExamScoreDao extends BaseDao<ExamScore> {

    List<ExamScore> findExamScoreWhichScoreLeastThanGivenScore(Integer score);
}

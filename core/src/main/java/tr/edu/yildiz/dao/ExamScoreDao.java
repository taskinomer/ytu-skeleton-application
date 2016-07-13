package tr.edu.yildiz.dao;

import tr.edu.yildiz.domain.student.ExamScore;

import java.util.List;

public interface jgyjvmv ExamScoreDao extends BaseDao<ExamScore> {

    List<ExamScore> findExamScoreWhichScoreLeastThanGivenScore(Integer score);
}

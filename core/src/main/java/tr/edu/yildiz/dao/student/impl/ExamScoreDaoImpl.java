package tr.edu.yildiz.dao.student.impl;

import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import tr.edu.yildiz.dao.impl.BaseDaoImpl;
import tr.edu.yildiz.dao.student.ExamScoreDao;
import tr.edu.yildiz.domain.student.ExamScore;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public abstract class ExamScoreDaoImpl extends BaseDaoImpl<ExamScore> implements ExamScoreDao {
    @Override
    public List<ExamScore> findExamScoreWhichScoreLeastThanGivenScore(Integer score) {

        List<ExamScore> examScores =
                getSessionFactory().getCurrentSession()
                .createCriteria(ExamScore.class)
                .add(Restrictions.lt("score", score))
                .list();

        return examScores;

    }
}

package tr.edu.yildiz.dao.student.impl;

import org.springframework.stereotype.Repository;
import tr.edu.yildiz.dao.impl.BaseDaoImpl;
import tr.edu.yildiz.dao.student.ExamTopicDao;
import tr.edu.yildiz.domain.student.ExamTopic;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class ExamTopicDaoImpl extends BaseDaoImpl<ExamTopic> implements ExamTopicDao {

    @Override
    public List<ExamTopic> findByPoint(Integer point) {
        List<ExamTopic> examTopics = getSessionFactory()
                .getCurrentSession()
                .createQuery("select e from ExamTopic e " +
                        "where e.point > :point")
                .setParameter("point", point).list();

        return examTopics;
    }

    @Override
    public void save(ExamTopic examTopic) {
        getSessionFactory().getCurrentSession().save(examTopic);
    }
}

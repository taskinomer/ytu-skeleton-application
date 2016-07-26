package tr.edu.yildiz.dao.student;

import tr.edu.yildiz.dao.BaseDao;
import tr.edu.yildiz.domain.student.ExamTopic;
import java.util.List;

public interface ExamTopicDao extends BaseDao<ExamTopic> {

    List<ExamTopic> findByPoint(Integer point);

    void save(ExamTopic examTopic);
}

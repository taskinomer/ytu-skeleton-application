package tr.edu.yildiz.controller.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import tr.edu.yildiz.dao.student.ExamTopicDao;
import tr.edu.yildiz.domain.student.ExamTopic;
import tr.edu.yildiz.request.ExamTopicRequest;

import java.util.List;

@Controller
@RequestMapping("/examTopic")
public class ExamTopicController {

    @Autowired
    private ExamTopicDao examTopicDao;

    @RequestMapping(value = "/gt100")
    @ResponseBody
    public List<ExamTopic> getExamTopicsWhichPointGreaterThan100() {
        return examTopicDao.findByPoint(100);
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST, consumes = "application/json")
    @ResponseBody
    public void saveExamTopic(@RequestBody ExamTopicRequest examTopicRequest) {
        ExamTopic examTopic = new ExamTopic();

        examTopic.setMaxStudent(examTopicRequest.getMax());
        examTopic.setPoint(examTopicRequest.getPoint());
        examTopic.setTopicName(examTopicRequest.getTopicName());
        examTopic.setType(examTopicRequest.getType());

        examTopicDao.save(examTopic);
    }
}

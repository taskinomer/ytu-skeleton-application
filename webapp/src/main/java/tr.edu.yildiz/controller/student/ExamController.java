package tr.edu.yildiz.controller.student;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import tr.edu.yildiz.dao.student.ExamScoreDao;
import tr.edu.yildiz.domain.student.ExamScore;

import java.util.List;

@Controller
@RequestMapping("/exam")
public class ExamController {

    @Autowired
    private ExamScoreDao examScoreDao;

    @RequestMapping(value = "/lte75", method = RequestMethod.GET)
    @ResponseBody
    public List<ExamScore> getStudentsWhichExamNoteLeastThan75() {
        List<ExamScore> examScoreList = examScoreDao.findExamScoreWhichScoreLeastThanGivenScore(75);
        return examScoreList;
    }

}

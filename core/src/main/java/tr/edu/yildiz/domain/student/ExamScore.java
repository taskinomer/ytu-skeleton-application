package tr.edu.yildiz.domain.student;

import javax.persistence.*;

@Entity
@Table(name = "exam_result")
public class ExamScore {

    @Id
    @Column(name = "STUDENT_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer studentId;

    @Column(name = "SCORE")
    private Integer score;

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}

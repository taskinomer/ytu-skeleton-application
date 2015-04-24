package tr.edu.yildiz.domain.student;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "exam_topics")
public class ExamTopic {

    @Id //  PRIMARY_KEY
    @Column(name = "TOPIC_ID")
    private Integer topicId;

    @Column(name = "TOPIC_NAME")
    private String topicName;

    @Column(name = "TYPE")
    private String type;

    @Column(name = "POINT")
    private Integer point;

    @Column(name ="MAX_STUDENT")
    private Integer maxStudent;

    public Integer getTopicId() {
        return topicId;
    }

    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public Integer getMaxStudent() {
        return maxStudent;
    }

    public void setMaxStudent(Integer maxStudent) {
        this.maxStudent = maxStudent;
    }
}

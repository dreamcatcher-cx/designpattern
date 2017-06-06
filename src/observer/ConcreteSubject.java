package observer;

/**
 * Created by chengxiao on 2017/3/23.
 * 具体的主题类
 */
public class ConcreteSubject extends Subject{
    private String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
    }
}

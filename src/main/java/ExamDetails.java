public class ExamDetails {

    private int exam_id;
    private String subject;
    private int enrolled;
    private String student_name;
    private boolean result;

    public ExamDetails() {
    }

    public ExamDetails(int exam_id, String subject, int enrolled, String student_name, boolean result) {
        this.exam_id = exam_id;
        this.subject = subject;
        this.enrolled = enrolled;
        this.student_name = student_name;
        this.result = result;
    }

    public int getExam_id() {
        return exam_id;
    }

    public void setExam_id(int exam_id) {
        this.exam_id = exam_id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getEnrolled() {
        return enrolled;
    }

    public void setEnrolled(int enrolled) {
        this.enrolled = enrolled;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "ExamDetails{" +
                "exam_id=" + exam_id +
                ", subject='" + subject + '\'' +
                ", enrolled=" + enrolled +
                ", student_name='" + student_name + '\'' +
                ", result=" + result +
                '}';
    }
}

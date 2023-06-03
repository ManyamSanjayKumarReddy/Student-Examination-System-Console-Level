import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExamService {

    List<ExamDetails> details = new ArrayList<>();

    public void addDetails(ExamDetails d){
        details.add(d);
    }

    public List<ExamDetails> getDetails(){
        return details;
    }

    public List<ExamDetails> getDetails(String text){
        String str = text.toLowerCase();

        return details.stream()
                .filter(p -> p.getStudent_name().toLowerCase().contains(str))
                .collect(Collectors.toList());
    }


    public List<ExamDetails> getEnrolledList(int value)
    {
        return details.stream().
                filter(p -> p.getEnrolled() > value)
                .collect(Collectors.toList());
    }

    public  int getCount(){
        return (int) details.stream()
                .filter(p -> p.getEnrolled() > 10)
                .count();
    }

}

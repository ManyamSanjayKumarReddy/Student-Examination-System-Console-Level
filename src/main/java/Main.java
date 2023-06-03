/*

    Examination System :
    1. Exam I'd
    2. Subject Name
    3. How Many Students Enrolled
    4. Student Name
    5. Boolean Fail or Pass


    Implemented Concepts :
        1. Constructors
        2. Constructor Overloading
        3. Creating Objects
        4. Polymorphism - Overloading concept
        5. Abstraction Concept using Private attributes

 */

import java.util.List;

public class Main {
    public static void main(String[] args){

        ExamService service = new ExamService();

        service.addDetails(new ExamDetails(4000, "C++", 40, "Sanjay", true));
        service.addDetails(new ExamDetails(4001, "Java", 79, "Priya", false));
        service.addDetails(new ExamDetails(4002, "Python", 85, "Vinay", true));
        service.addDetails(new ExamDetails(4003, "C", 52, "Madhu", true));
        service.addDetails(new ExamDetails(4004, "Ruby", 97, "Sanjay", true));
        service.addDetails(new ExamDetails(4005, "Java Script", 12, "Vinay", false));
        service.addDetails(new ExamDetails(4006, "React", 25, "Basha", true));
        service.addDetails(new ExamDetails(4007, "HTML", 59, "Sanjay", false));
        service.addDetails(new ExamDetails(4008, "PHP", 100, "Vinay", true));
        service.addDetails(new ExamDetails(4009, "Kali Linux", 105, "Kalyan", true));
        service.addDetails(new ExamDetails(4010, "Flutter", 125, "Ram", true));
        service.addDetails(new ExamDetails(4011, "Kotlin", 10, "Krishan", false));

        System.out.println("Get all the details of the Examination : ");

        List<ExamDetails> d = service.getDetails();
        for (ExamDetails D : d){
            System.out.println(D);
        }

        System.out.println(" ");
        System.out.println("List of Students who are writing the Examination : ");
        List<ExamDetails> d1 = service.getDetails();
        for (ExamDetails D : d1){
            System.out.println(D.getStudent_name());
        }

        System.out.println(" ");
        System.out.println("Get the Subjects with more than 50 Enrollments :  ");
        List<ExamDetails> d2 = service.getEnrolledList(50);
        for (ExamDetails D : d2){
            System.out.println(D.getSubject() + " got " + D.getEnrolled() + " Enrollments" );
        }

        System.out.println(" ");
        System.out.println("Get the Students Details by Name :  ");
        List<ExamDetails> d3 = service.getDetails("Sanjay");
        for (ExamDetails D : d3){
            System.out.println(D.getStudent_name() + " is writing " + D.getSubject() + " Exam" );
        }

        System.out.println(" ");
        System.out.println("Get the Subjects with more than 50 Enrollments :  ");
        List<ExamDetails> d4 = service.getEnrolledList(50);
        for (ExamDetails D : d4){
            System.out.println(D.getEnrolled());
        }

        System.out.println(" ");
        System.out.println("Get the Count of the Exam's which has more than 10 enrollments :  ");
        int d5 = service.getCount();
        System.out.println(d5);




    }
}

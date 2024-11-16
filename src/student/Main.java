package student;

public class Main {
    public static void main(String[] args) {

        //Declare
        Student student=new Student();
        float[] grades={5 ,3,4};

        //Input
        student.setName("Tan");
        student.setAge(24);
        student.setGrades(grades);

        //output
        student.get_info();

    }
}

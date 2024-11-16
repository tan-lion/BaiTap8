package student;

public class Student {
    private String name;
    private int age;
    private float[] grades;

    public Student(String name, int age, float[] grades) {
        this.name = name;
        this.age = age;
        this.grades = grades;
    }

    public Student(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float[] getGrades() {
        return grades;
    }

    public void setGrades(float[] grades) {
        this.grades = grades;
    }

    public float calculate_average() {
        if(grades.length==0){
            return 0;
        }
        float sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        return (sum / grades.length);
    }

    public void get_info() {
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.print("Grades: "+ calculate_average());

    }
}

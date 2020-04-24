package DesignCourse;

public class TestCourse {
    public static void main(String[] args) {

        Course course1 = new Course("Data Struct");
        Course course2 = new Course("Database System");

        course1.addStudent("Peter Jones");
        course1.addStudent("Kim Smith");
        course1.addStudent("Anne Kennedy");

        course2.addStudent("Peter Jones");
        course2.addStudent("Steven Smith");

        System.out.println("课程1的学生数为："+course1.getNumberOfStudents());

        String[] student = course1.getStudents();

        for(int i =0;i<course1.getNumberOfStudents();i++){
            if(student[i]==null){
                System.out.println( );
            }
            else System.out.println(student[i]+"，");
        }

        System.out.println();

        System.out.println("课程2的学生数为："+course2.getNumberOfStudents());

        course1.dropStudent("Anne Kennedy");

        String[] student1 = course1.getStudents();

        for(int i =0;i<course1.getNumberOfStudents();i++){
            if(student[i]==null){
                System.out.println( );
            }
            else System.out.println(student1[i]+"，");
        }

        
    }

}
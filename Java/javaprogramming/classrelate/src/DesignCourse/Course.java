package DesignCourse;

public class Course {

    private String   courseName;
    private String[] students = new String[100];
    private int      numberOfStudents=0;//学生数量


/**************数据域*****************/  

    public Course(String courseName){
        this.courseName  = courseName;    
    }

    /**
     * @return the courseName
     */
    public String getCourseName() {
        return courseName;
    }

    public void addStudent(String student){
        students[numberOfStudents++] = student;
    }

    public void dropStudent(String student){
        int j = numberOfStudents;
        for(int i =0;i<=j;i++){
            if(students[i]==student){
                students[i]=null;
                numberOfStudents--;//删除学生后需更改学生人数
            }
            
        }
    }

    /**
     * @return the students
     */
    public String[] getStudents() {
        return students;
    }

    /**
     * @return the numberOfStudents
     */
    public int getNumberOfStudents() {
        return numberOfStudents;
    }


}
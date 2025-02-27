package kz.bitlab.sprinttask1.db;


import java.util.ArrayList;
import java.util.List;

public class StudentManager {


    private static List<Student> studentList = new ArrayList<>();

    //all attributes of student as arguments below, to limit interaction with Student class to StudentManager

    public static List<Student> getList(){
        return studentList;
    }

    public static void addStudent( String name, String surname, int exam){
        studentList.add(new Student(name, surname, exam));
    }
    public static Student getStudentById(int id){
        return studentList.get(id);
    }

}

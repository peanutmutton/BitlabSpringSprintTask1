package kz.bitlab.sprinttask1.db;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//@NoArgsConstructor
public class Student {

 private static Long currentId = 0L;

  private   Long id;

 private String name;

 private String surname;

private int exam;

private String mark;

public Student(){

}

 public Student(String name, String surname, int exam){
   id = currentId;
   currentId ++;

   this.name = name;
   this.surname = surname;
   this.exam = exam;
   if (exam >= 90){
    mark = "A";
   } else if (exam >= 75) {
    mark = "B";
   } else if (exam >= 60) {
    mark = "C";
   } else if (exam >= 50) {
    mark = "D";
   } else if (exam >= 0) {
    mark = "F";
   }
 }

}

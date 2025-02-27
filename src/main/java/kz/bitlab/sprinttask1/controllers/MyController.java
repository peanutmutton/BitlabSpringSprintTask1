package kz.bitlab.sprinttask1.controllers;

import kz.bitlab.sprinttask1.db.Student;
import kz.bitlab.sprinttask1.db.StudentManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class MyController {

    @GetMapping(value = "/form")
    public String getForm(Model model){
        model.addAttribute("student", new Student());

        return "form";
    }

    @PostMapping(value = "/form")
    public String sendForm(@ModelAttribute Student student, Model model){

        model.addAttribute("student", student);
        StudentManager.addStudent(student.getName(), student.getSurname(), student.getExam());

        return "success";
    }



    @GetMapping(value = "/list")
    public String getList(Model model){

        StudentManager.addStudent("Dante", "Alighieri", 89);

        model.addAttribute("list", StudentManager.getList());
        model.addAttribute("dante", StudentManager.getStudentById(0));
        model.addAttribute("danteMark", StudentManager.getStudentById(0).getMark());
//        System.out.println(StudentManager.getStudentById(0).getMark());
        return "list";
    }

}

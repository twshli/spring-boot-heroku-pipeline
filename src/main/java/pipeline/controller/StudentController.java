package pipeline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pipeline.Repository.StudentRepository;
import pipeline.entity.Student;

import java.util.List;

/**
 * Created by Shli on 06/09/2017.
 */
@RestController
public class StudentController {

    @Autowired
    private StudentRepository repo;

    @RequestMapping(value = "/students", method = RequestMethod.GET)
    public List<Student> getStudents() {
        return repo.findAll();
    }
}

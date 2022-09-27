package tech.codegrill.andreas.jenkinsjob.student;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    @Override
    public List<StudentEntity> getAllStudents() {
        return studentRepository.findAll();
    }
}

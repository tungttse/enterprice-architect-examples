package edu.miu.cs544.tttruong.validator;


import edu.miu.cs544.tttruong.domain.Student;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
public class StudentValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return clazz.isAssignableFrom(Student.class);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Student student = (Student)target;

        if (student == null) {
            errors.reject(null, "Student cannot be null");
        }else {
            if (student.getName() == null || student.getName().isEmpty())
                errors.rejectValue("name",null,"getName cannot be null or empty");
        }
    }
}

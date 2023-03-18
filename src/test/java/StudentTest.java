import org.example.LancasterUniversity;
import org.example.Student;
import org.example.University;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {
    @Test
    public void createStudent(){
        Student student = new Student("1234", "John", "11", null);
        assertEquals(student.getClass(), Student.class);
    }

    @Test
    public void getStudentParams(){
        Student student = new Student("1234", "John", "Sixth Form", null);
        assertEquals("1234", student.getId());
        assertEquals("John", student.getName());
        assertEquals("Sixth Form", student.getGrade());
    }

    @Test
    public void getStudentsUniversity(){
        University lancsUniversity = new LancasterUniversity("123", "Lancaster");
        Student student = new Student("1234", "John", "Sixth Form", lancsUniversity);

        assertEquals(lancsUniversity.getId(), student.getUniversity().getId());
    }


}

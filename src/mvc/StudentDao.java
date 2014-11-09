package mvc;

import java.util.ArrayList;

public interface StudentDao {

    public void addStudent(String name, String dateOfEnrollment, Group groupOfStudent, int idNumber);

    public void removeStudent(int idNumber);

    public Student getStudentById(int idNumber);

    public ArrayList getAllStudents();

    public ArrayList getStudentsByGroup(int groupNumber);

}

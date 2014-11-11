package mvc;


import java.io.*;
import java.util.ArrayList;

public class StudentDaoSerial {

    public static void writeStudents(ArrayList<Student> students) throws IOException {
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("students"));
        outputStream.writeObject(students);
        outputStream.flush();
        outputStream.close();
    }

    public static ArrayList<Student> readStudents() throws IOException, ClassNotFoundException {
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("students"));
        ArrayList<Student> students = (ArrayList<Student>) inputStream.readObject();
        inputStream.close();
        return students;
    }

}

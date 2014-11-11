package mvc;


import java.io.*;

public class StudentDaoSerial {

    public static void writeStudents(Object o) throws IOException {
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("students"));
        outputStream.writeObject(o);
    }

    public static Object readStudents() throws IOException, ClassNotFoundException {
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("students"));
        Object o = inputStream.readObject();
        return o;
    }

}

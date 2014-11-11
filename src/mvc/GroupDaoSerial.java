package mvc;

import java.io.*;
import java.util.ArrayList;

public class GroupDaoSerial{

    public static void writeGroup(Object o) throws IOException {
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("Group"));
        outputStream.writeObject(o);
    }

    public static Object readGroup() throws IOException, ClassNotFoundException {
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("Group"));
        Object o = inputStream.readObject();
        return o;
    }


}

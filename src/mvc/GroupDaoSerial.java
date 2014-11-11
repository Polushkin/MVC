package mvc;


import java.io.*;
import java.util.ArrayList;

public class GroupDaoSerial {

    public static void writeGroup(ArrayList<Group> groups) throws IOException {
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("Group"));
        outputStream.writeObject(groups);
        outputStream.flush();
        outputStream.close();
    }

    public static ArrayList<Group> readGroup() throws IOException, ClassNotFoundException {
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("Group"));
        ArrayList<Group> groups = (ArrayList<Group>) inputStream.readObject();
        inputStream.close();
        return groups;
    }


}

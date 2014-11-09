package mvc;

import java.util.ArrayList;

public interface GroupDao {

    public void addGroup(int groupNumber);

    public void addGroup(int groupNumber, String faculty);

    public void removeGroup(int groupNumber);
    
    public Group getGroupByNumber(int groupNumber);
    
    public ArrayList getGroupsByFaculty(String faculty);
    
    public ArrayList getAllGroups();
}

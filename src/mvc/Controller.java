package mvc;


public class Controller {

    String command;

    public Controller(String reader) {
        this.command = reader;
    }

    public boolean analysisCommand() {
        String strings[];   //1 команда  2 параметр 3 остаток от строки
        strings = command.split(" ", 2);
        switch (strings[0]) {
            case "addstunent":
                break;
            case "addgroup":
                break;
            case "getstudent":
                break;
            case "getgroup":
                break;
            case "setstudent":
                break;
            case "setgroup":
                break;
            case "delstudent":
                break;
            case "delgroup":
                break;

        }
        return false;
    }

    private boolean addStudent(String s[]){

    }

    private boolean getStudent(String s[]){

    }

    private boolean delStudent(String s[]){

    }

    private boolean setStudent(String s[]){

    }

    private boolean addGroup(String s[]){

    }

    private boolean getGroup(String s[]){

    }
    private boolean setStudent(String s[]){

    }

    private boolean delStudent(String s[]){

    }

}

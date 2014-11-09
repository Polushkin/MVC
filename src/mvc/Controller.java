package mvc;


public class Controller {

    String command;

    public Controller(String reader) {
        this.command = reader;
    }

    public boolean analysisCommand() {
        String strings[];   //1 команда  2 параметр 3 остаток от строки
        strings = command.split(" ", 3);
        for (int i = 0; i < 3; i++) {
            System.out.println(strings[i]);
        }
        return false;
    }
}
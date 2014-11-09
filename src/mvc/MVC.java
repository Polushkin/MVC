package mvc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MVC {

    public static void main(String[] args) throws IOException {

        boolean isExit;
        do {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            Controller controller = new Controller(reader.readLine());
            isExit = controller.analysisCommand();
        }
        while (isExit);
    }

}

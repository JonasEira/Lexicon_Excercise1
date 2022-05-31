import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyParser {
    public MyParser(){

    }

    public String getWords() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String words = br.readLine();
            return words;
        } catch (IOException e) {
            throw e;
        }

    }

    public int getInteger() throws IOException, NumberFormatException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String words = br.readLine();
            try {
                int number = Integer.parseInt(words);
                return number;
            } catch (NumberFormatException e) {
                // Print something about numbers here
                throw e;
            }
        } catch (IOException e) {
            // Print something here
            throw e;
        }


    }
}

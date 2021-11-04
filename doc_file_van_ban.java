import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class doc_file_van_ban {
    public static void main(String[] args) throws IOException {
        // File myObj = new File("D:/study/java/file_IO/doc_file_van_ban/src/DATA.txt");
        File myObj = new File("DATA.in");
        Scanner sc = new Scanner(myObj);
        while (sc.hasNextLine()) {
            String data = sc.nextLine();
            System.out.println(data);
        }
        sc.close();
    }
}

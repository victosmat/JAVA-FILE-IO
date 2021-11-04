import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class tach_doi_va_tinh_tong {
    public static void main(String[] args) throws IOException {
        File myFile = new File("DATA.in");
        Scanner sc = new Scanner(myFile);
        String n = "";
        while (sc.hasNext()) {
            n = sc.next();
        }
        while (n.length() != 1) {
            BigInteger a = new BigInteger(n.substring(0, n.length() / 2));
            BigInteger b = new BigInteger(n.substring(n.length() / 2));
            n = String.valueOf(a.add(b));
            System.out.println(n);
        }
        sc.close();
    }
}

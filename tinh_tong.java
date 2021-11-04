import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class tinh_tong {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        long sum = 0;
        while (sc.hasNext()) {
            String s = sc.next();
            if (isNumber(s))
                sum += Integer.parseInt(s);
        }
        System.out.println(sum);
    }

    public static boolean isNumber(String s) {
        if (s.length() > 10)
            return false;
        for (char x : s.toCharArray())
            if (!Character.isDigit(x))
                return false;
        if (Long.parseLong(s) > 2147483647)
            return false;
        return true;
    }

}

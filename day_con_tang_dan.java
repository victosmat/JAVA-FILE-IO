import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class day_con_tang_dan {
    public static List<String> ketQua = new ArrayList<>();

    public static boolean check(String s) {
        String str[] = s.split(" ");
        for (int i = 0; i < str.length - 1; i++)
            if (Integer.parseInt(str[i]) > Integer.parseInt(str[i + 1]))
                return false;
        return true;
    }

    public static void Try(int i, int n, int a[], String s[]) {
        for (int j = 0; j <= 1; j++) {
            a[i] = j;
            if (i == n - 1) {
                String ans = "";
                int count = 0;
                for (int k = 0; k < n; k++)
                    if (a[k] == 1) {
                        ans += s[k] + " ";
                        count++;
                    }
                if (count < 2)
                    continue;
                if (check(ans))
                    ketQua.add(ans);
            } else
                Try(i + 1, n, a, s);
        }
    }

    public static void main(String[] args) throws IOException {
        File myFile = new File("DAYSO.in");
        Scanner sc = new Scanner(myFile);
        List<String> data = new ArrayList<>();
        while (sc.hasNextLine()) {
            data.add(sc.nextLine());
        }
        int n = Integer.parseInt(data.get(0));
        int a[] = new int[n];
        String s[] = data.get(1).split(" ");
        Try(0, n, a, s);
        Collections.sort(ketQua);
        for (String x : ketQua)
            System.out.println(x);
        sc.close();
    }
}
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class liet_ke_tu_khac_nhau {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        ArrayList<String> dsVanBan = new ArrayList<>();
        while (sc.hasNextLine()) {
            String s[] = sc.nextLine().toLowerCase().split("\\s+");
            for (String x : s)
                if (!dsVanBan.contains(x))
                    dsVanBan.add(x);
        }
        Collections.sort(dsVanBan);
        for (String x : dsVanBan)
            System.out.println(x);
    }
}

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class so_khac_nhau_trong_file_1 {
    public static void main(String[] args) throws IOException {
        File myFile = new File("DATA.in");
        Scanner sc = new Scanner(myFile);
        Map<Integer, Integer> map = new LinkedHashMap<>();
        TreeSet<Integer> values = new TreeSet<>();
        while (sc.hasNext()) {
            String s = sc.next();
            int ans = Integer.parseInt(s);
            if (map.containsKey(ans))
                map.put(ans, map.get(ans) + 1);
            else
                map.put(ans, 1);
            values.add(ans);
        }
        for (Integer x : values) {
            System.out.println(x + " " + map.get(x));
        }
        sc.close();
    }
}

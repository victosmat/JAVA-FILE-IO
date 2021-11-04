import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class thong_ke_khac_nhau_trong_file_van_ban {
    public static void main(String[] args) throws IOException {
        File myFile = new File("DATA.in");
        Scanner sc = new Scanner(myFile);
        Map<String, Integer> map = new LinkedHashMap<>();
        List<VanBan> dsVanBan = new ArrayList<>();
        int count = 0;
        while (sc.hasNextLine()) {
            String s[] = sc.nextLine().split("\\W+");
            if (count < 1)
                count++;
            else
                for (String x : s)
                    if (map.containsKey(x))
                        map.put(x, map.get(x) + 1);
                    else
                        map.put(x, 1);
        }
        for (String x : map.keySet())
            dsVanBan.add(new VanBan(x, map.get(x)));
        Collections.sort(dsVanBan, new Comparator<VanBan>() {
            public int compare(VanBan a, VanBan b) {
                if (a.count > b.count)
                    return -1;
                else if (a.count == b.count && a.tu.compareTo(b.tu) < 0)
                    return -1;
                return 1;
            }
        });
        for (VanBan x : dsVanBan)
            System.out.println(x.tu + " " + x.count);
        sc.close();
    }
}

class VanBan {
    public String tu;
    public int count;

    public VanBan(String tu, int count) {
        this.tu = tu;
        this.count = count;
    }
}

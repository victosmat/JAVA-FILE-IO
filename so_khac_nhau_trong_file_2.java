import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;

public class so_khac_nhau_trong_file_2 {
    public static void main(String[] args) throws IOException {
        DataInputStream sc = new DataInputStream(new FileInputStream("DATA.IN"));
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < 100000; ++i) {
            int n = sc.readInt();
            if (mp.containsKey(n)) {
                mp.put(n, mp.get(n) + 1);
            } else {
                mp.put(n, 1);
            }
        }
        for (int n : mp.keySet()) {
            System.out.println(n + " " + mp.get(n));
        }
        sc.close();
    }
}
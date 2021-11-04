import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class so_khac_nhau_trong_file_3 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> ds = (ArrayList<Integer>) sc.readObject();
        int a[] = new int[1000];
        for (Integer x : ds)
            a[x]++;
        for (int i = 0; i < 1000; i++)
            if (a[i] > 0)
                System.out.println(i + " " + a[i]);
        sc.close();
    }
}
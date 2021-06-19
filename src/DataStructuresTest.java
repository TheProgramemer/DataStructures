import lists.List;
import lists.arraylists.ArrayList;

public class DataStructuresTest {
    public static void main(String[] args) throws Exception {
        List<String> test = new ArrayList<>();
        test.add("Hello");
        System.out.println(test.get(0));
        test.remove(0);
        test.add("Hi");
        System.out.println(test.get(0));
        System.out.println(test.size());
    }
}

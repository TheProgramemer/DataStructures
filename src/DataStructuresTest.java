import lists.List;
import lists.arraylists.ArrayList;
import lists.linkedlists.singlylinkedlists.SinglyLinkedList;

public class DataStructuresTest {
    public static void main(String[] args) throws Exception {
        List<String> test = new SinglyLinkedList<>();
        test.add("Hello");
        System.out.println(test.get(0));
        test.remove(0);
        test.add("Hi");
        System.out.println(test.get(0));
        System.out.println(test.size());
    }
}

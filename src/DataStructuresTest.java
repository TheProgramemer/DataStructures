import lists.List;
import lists.arraylists.ArrayList;
import lists.linkedlists.doublylinkedlists.CircularDoublyLinkedList;
import lists.linkedlists.doublylinkedlists.DoublyLinkedList;
import lists.linkedlists.singlylinkedlists.CircularSinglyLinkedList;
import lists.linkedlists.singlylinkedlists.SinglyLinkedList;

public class DataStructuresTest {
    public static void main(String[] args) throws Exception {
        List<String> test = new CircularDoublyLinkedList<>();
        test.add("Hello");
        System.out.println(test.get(0));
        test.remove(0);
        test.add("Hi");
        System.out.println(test.get(0));
        System.out.println(test.size());
    }
}

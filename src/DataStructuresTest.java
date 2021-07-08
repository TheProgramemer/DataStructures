import lists.List;
import lists.arraylists.ArrayList;
import lists.linkedlists.doublylinkedlists.CircularDoublyLinkedList;
import lists.linkedlists.doublylinkedlists.DoublyLinkedList;
import lists.linkedlists.singlylinkedlists.CircularSinglyLinkedList;
import lists.linkedlists.singlylinkedlists.SinglyLinkedList;
import lists.stacks.Stack;

public class DataStructuresTest {
    public static void main(String[] args) throws Exception {
        Stack<String> test = new Stack<>();
        test.push("Hello");
        test.push("Hi");
        System.out.println(test.peek());
        System.out.println(test.pop());
        System.out.println(test.pop());
    }
}

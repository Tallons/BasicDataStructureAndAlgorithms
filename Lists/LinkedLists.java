import resources.Employee;
import java.util.LinkedList;

public class LinkedLists {

    public static void main(String[] args) {

        Employee janeAbraham = new Employee("Jane", "Abraham", 10);
        Employee nickAbraham = new Employee("Nick", "Abraham", 3);
        Employee colinAbraham = new Employee("Colin", "Abraham", 5);
        Employee carterAbraham = new Employee("Carter", "Abraham", 12);
        Employee kateAbraham = new Employee("Kate", "Abraham", 17);

        // Creates a doubly Linked List - Not synchronized
        LinkedList<Employee> list = new LinkedList<>();

        // adds to the head of the linked list
        list.addFirst(janeAbraham);
        list.addFirst(carterAbraham);
        list.addFirst(kateAbraham);
        printList(list);

        // adds to the tail of the linked list NOTE: you can also use .add() - .removeLast is more descriptive
        list.addLast(colinAbraham);
        list.addLast(nickAbraham);
        printList(list);

        // removes the head of the linked list NOTE: you can also use .remove() - .removeFirst is more descriptive
        list.removeFirst();
        printList(list);

        // removes the tail of the linked list
        list.removeLast();
        printList(list);

    }

    private static void printList(LinkedList<Employee> list) {
        System.out.print("HEAD => ");
        for (Employee employee : list) {
            System.out.print(employee + " <=> ");
        }
        System.out.print("null");
        System.out.println();
    }
}

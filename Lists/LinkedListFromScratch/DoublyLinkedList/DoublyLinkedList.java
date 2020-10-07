package FromScratch.DoublyLinkedList;

import resources.Employee;

    public class DoublyLinkedList {

        public static void main(String[] args) {

            Employee janeAbraham = new Employee("Jane", "Abraham", 10);
            Employee nickAbraham = new Employee("Nick", "Abraham", 3);
            Employee colinAbraham = new Employee("Colin", "Abraham", 5);
            Employee carterAbraham = new Employee("Carter", "Abraham", 12);
            Employee kateAbraham = new Employee("Kate", "Abraham", 17);

            EmployeeLinkedList list = new EmployeeLinkedList();
            System.out.println("list is Empty: " + list.isEmpty());

            list.addToFront(janeAbraham);
            list.addToFront(carterAbraham);
            list.addToFront(kateAbraham);

            list.addToEnd(colinAbraham);
            list.addToEnd(nickAbraham);

            System.out.println("List size: " + list.getSize());
            list.printList();

            list.removeFromFront();
            System.out.println(list.getSize());
            list.printList();

            list.removeFromEnd();
            System.out.println(list.getSize());
            list.printList();
        }
    }

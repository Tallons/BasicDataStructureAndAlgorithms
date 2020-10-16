import resources.Employee;

public class Main {

    public static void main(String[] args) {

        Employee janeAbraham = new Employee("Jane", "Abraham", 10);
        Employee nickAbraham = new Employee("Nick", "Abraham", 3);
        Employee colinAbraham = new Employee("Colin", "Abraham", 5);
        Employee carterAbraham = new Employee("Carter", "Abraham", 12);
        Employee kateAbraham = new Employee("Kate", "Abraham", 17);

        ArrayStack stack = new ArrayStack(10);

        stack.push(janeAbraham);
        stack.push(nickAbraham);
        stack.push(colinAbraham);
        stack.push(carterAbraham);
        stack.push(kateAbraham);

    }
}

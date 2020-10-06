public class ArrayList {

        // ArrayList - good for random access
        // cons - not good for inserting and/or accessing items unless you know the index

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>(); // defaults to capacity of 10

        // add to list
        employeeList.add(new Employee("Jane", "Abraham", 10));
        employeeList.add(new Employee("Nick", "Abraham", 3));
        employeeList.add(new Employee("Colin", "Abraham", 5));
        employeeList.add(new Employee("Carter", "Abraham", 12));
        employeeList.add(new Employee("Kate", "Abraham", 17));

        employeeList.forEach(employee -> System.out.println(employee));

        // equivalent to array[1]
        System.out.println(employeeList.get(1));

        System.out.println(employeeList.isEmpty());

        // set value in index
        employeeList.set(1, new Employee("Mike", "Abraham", 1));
        employeeList.forEach(employee -> System.out.println(employee));

        // equivalent to array.length()
        System.out.println(employeeList.size());

        // insert value into list
        employeeList.add(2, new Employee("Nick", "Abraham", 3));
        employeeList.forEach(employee -> System.out.println(employee));

        // convert list into array
        Object[] employeeArray = employeeList.toArray( new Employee[employeeList.size()]);
        for(var employee : employeeArray) {
            System.out.println(employee);
        }

        //returns boolean - you must override the equals method in the Employee's Class for this too work
        System.out.println(employeeList.contains(new Employee("Colin", "Abraham", 5)));

        //returns index - you must override the equals method in the Employee's Class for this too work
        System.out.println(employeeList.indexOf(new Employee("Colin", "Abraham", 5)));

        // remove from list
        employeeList.remove(2);
        employeeList.forEach(employee -> System.out.println(employee));

    }
package hashtables.challenge2;

import list.linkedlists.EmployeeLinkedList;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        LinkedList<Employee> employees = new LinkedList<>();
        employees.add(new Employee("Jane", "Jones", 123));
        employees.add(new Employee("John", "Doe", 5678));
        employees.add(new Employee("Mike", "Wilson", 45));
        employees.add(new Employee("Mary", "Smith", 5555));
        employees.add(new Employee("John", "Doe", 5678));
        employees.add(new Employee("Bill", "End", 3948));
        employees.add(new Employee("Jane", "Jones", 123));

        employees.forEach(e -> System.out.println(e));

        

//        int[] nums = new int[10];
//        int[] numsToAdd = { 59382, 43, 6894, 500, 99, -58 };
//        for (int i = 0; i < numsToAdd.length; i++) {
//            nums[hash(numsToAdd[i])] = numsToAdd[i];
//        }
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }

        removeDuplicates(employees);
    }

    public static int hash(int value) {
        return Math.abs(value % 10);
    }

    public static boolean removeDuplicates(LinkedList<Employee> employees) {
        Map removedEmployees = new HashMap<Integer, Employee>();
        ListIterator<Employee> employee1 = employees.listIterator();
        int index = 0;
        while (employee1.hasNext()) {
            Employee current = employee1.next();
            System.out.println(index);
            ListIterator<Employee> employee2 = employee1;
            while (employee2.hasNext()) {
                Employee compare = employee2.next();
                if (compare.getId() == current.getId()) {
                    removedEmployees.put(index, compare);
                }
            }
            index++;
        }
        for (int i = 0; i < removedEmployees.size(); i++) {
            System.out.println(removedEmployees.get(i));
        }
        return true;
    }

}

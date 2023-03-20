public class Employee2 {
    public class Main {
        public static void main(String[] args) {
            Employee employee1 = new Employee("A", "CSS", -50);
            Employee employee2 = new Employee("B", "HTML", 1500);

            System.out.printf("Name: %s %s%nSalary: %.2f%n%n", employee1.getFistName(), employee1.getLastName(),
                    employee1.getSalary());

            System.out.printf("Name: %s %s%nSalary: %.2f%n%n", employee2.getFistName(), employee2.getLastName(),
                    employee2.getSalary());

            System.out.printf("Name: %s %s%nSalary: %.2f%n%n", employee1.getFistName(), employee1.getLastName(),
                    employee1.getSalary() * 1.10);

            System.out.printf("Name: %s %s%nSalary: %.2f%n%n", employee2.getFistName(), employee2.getLastName(),
                    employee2.getSalary() * 1.10);

            employee1.setSalary(1200);

            System.out.printf("Name: %s %s%nSalary: %.2f%n%n", employee1.getFistName(), employee1.getLastName(),
                    employee1.getSalary() * 1.10);

            System.out.printf("Name: %s %s%nSalary: %.2f%n%n", employee2.getFistName(), employee2.getLastName(),
                    employee2.getSalary() * 1.10);
        }
    }

}

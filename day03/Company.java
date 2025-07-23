public class Company {
    public static void main(String[] args) {
        Employee[] staff = {
            new Manager("Alice", 1000),
            new Intern("Bob"),
            new Manager("Carol", 2000)
        };

        double total = 0;
        for (Employee e : staff) {
            System.out.println(e.name + ": " + e.getSalary());
            total += e.getSalary();
        }

        System.out.println("Tổng lương: " + total);
    }
}

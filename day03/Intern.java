public class Intern extends Employee {
    public Intern(String name) {
        super(name);
    }

    @Override
    public double getSalary() {
        return 1000;
    }
}

public class Manager extends Employee {
    private double bonus;
    public Manager(String name, double bonus) {
        super(name);
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return 5000 + bonus;
    }
}

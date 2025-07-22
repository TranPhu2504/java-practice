public class Student {
    String name;
    int age;
    public Student(String name, int age){
        this.name=name;
        this.age=age;
    }
    public void display(){
        System.out.println("Name: " + name +", Age: " + age);
    }
    public static void main(String[] args) {
        Student St1 = new Student("nam", 20);
        St1.display();
    }
}

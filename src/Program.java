
public class Program {
    public static void main(String[] args) {
        System.out.println(Program.getBudgets(new Person[] { new Person("John", 21, 23000), new Person("Steve", 32, 40000),
                new Person("Martin", 16, 2700) }));
    }

    public static double getBudgets(Person[] persons) {
        double totalBudget=0;
        for (int i=0;i<persons.length;i++){
            totalBudget+=persons[i].getBudget();
        }
        return totalBudget;
    }
}
class Person{
    private String name;
    private int age;
    private double budget;

    public Person(String name, int age, double budget) {
        super();
        this.name = name;
        this.age = age;
        this.budget = budget;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getBudget() {
        return budget;
    }
    public void setBudget(double budget) {
        this.budget = budget;
    }

    public static void main(String[] args) {

    }
}


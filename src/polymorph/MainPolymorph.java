package polymorph;

public class MainPolymorph {
    public static void main(String[] args) {
        Employee employee = new Employee(("Umi"));
        Manager manager = new Manager("Ahmad");
        VicePresident vicePresident = new VicePresident("joko");

        // call method
        employee.sayHello();
        manager.sayHello();
        vicePresident.sayHello();
    }
}

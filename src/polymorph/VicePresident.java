package polymorph;

public class VicePresident extends Manager{
    VicePresident(String name){
        super(name);
    }
    void sayHello(){
        System.out.println("Hello Vice President "+this.name);
    }
}

class BankAccount{
    // Encapsulated variable balance (private, not visible for users)
    private double balance; 
    // Setter for balance - access to balance through public method
    public void setBalance(double balance){
        this.balance = balance;
    }
    // Getter for balance - access to balance through public method
    public double getBalance(){
        return this.balance;
    }
};

// INHERITANCE - subclass AccountOwner aquires the properties (vars and methods) from superclass BankAccount
// Access only for non-private variables, recall the protected access modifier, which makes the members visible only to the subclasses.
class AccountOwner extends BankAccount{
    public String name;
    public int yearOfBirth;
};

// POLYMORPHISM - refers to idea "having many forms"
// Each class has its own implementation of method makeSound()

// RUNTIME POLYMORPHISM (OVERRIDING) - subclass's method override superclass method
// Overriden methods should have the same return type, access level cannot be more restrictive,
// final and static cannot be overriden, if method cannot be inherited - it cannot be evorriden,
// constructors cannot be overriden

// ABSTRACTION - abstract class represents essential features without implementation
// Every animal makes a sound (abstract makeSound()) but in a different way
abstract class Animal implements Eating {
    abstract void makeSound(); // Implementations for every animal are different, animal do not have specific sound
}
// INTERFACES - are totally abstract classes, has all methods and variables abstract (abstract keyword can be omited)
// May contain only static final variables, can extend other interfaces, classes can implement multiple interfaces
interface Eating {
    public void eat();
}
class Dog extends Animal {
    public void makeSound() { System.out.println("Woof!"); }
    public void eat() { System.out.println("*Eats dog food*"); }
}
class Cat extends Animal {
    public void makeSound() { System.out.println("Meow!"); }
    public void eat() { System.out.println("*Eats everything*"); }

    // COMPILE-TIME POLYMORPHISM (OVERLOADING) - methods have the same name but taking different parameters
    public void makeSound(int x) { System.out.println("*Purring...*"); }
}

// ENUM is a special type used to define collections of constants
enum Rank {
    SOLDIER, SERGEANT, CAPTAIN
}

public class MoreOnClasses{
    public static void printLabel(String label){
        String line = "------------------------";
        int spaces = (line.length() - 2 - label.length()) / 2;
        System.out.println(line);
        System.out.print("|");
        for(int i = 0; i < spaces; i++) System.out.print(" ");
        System.out.print(label);
        for(int i = 0; i < spaces; i++) System.out.print(" ");
        System.out.print("|\n");
        System.out.println(line);
    }
    public static void main(String[] args){

        printLabel("ENCAPSULATION");
        // ENCAPSULATION (data hiding) - set as private to hide the variable
        BankAccount account = new BankAccount();
        account.setBalance(1548.93);
        System.out.println(account.getBalance());

        printLabel("POLYMORPHISM");
        // POLYMORPHISM - both Dog and Cat extends the Animal class but use own implementation of makeSound()
        Dog Lessie = new Dog();
        Cat Snowy = new Cat();
        Lessie.makeSound();
        Snowy.makeSound();

        printLabel("OVERLOADING");
        // Use OVERLOADED method
        Snowy.makeSound(0);

        printLabel("INTERFACES");
        // Called eat() method defined in interface and implemented in Dog and Cat class
        Lessie.eat();
        Snowy.eat();

        printLabel("UPCASTING");
        // UPCASTING - cast instance of a subclass to its superclass
        Animal Cattie = new Cat();
        Cattie.makeSound();

        printLabel("DOWNCASTING");
        // DOWNCASTING - cast an object of a superclass to its sublass
        // It is manual because the process can fail - there is a chance that
        // one of the object of Animals can be a Dog
        ( (Cat)Cattie ).makeSound();

        printLabel("ANONYMOUS CLASSES");
        // ANONYMOUS CLASSES extends the existing classes on the fly
        Dog Harry = new Dog() {
            // Override applies only for Harry
            @Override public void eat(){
                System.out.println("Omnomnomnom...");
            }
        };
        Harry.eat();

        printLabel("ENUMS");
        System.out.println(Rank.CAPTAIN + " says Ahoy!");

    }
}

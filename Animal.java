public class Animal {
    public String name;
    public String type;

    //constructor

    public Animal(String name, String type){
        this.name=name;
        this.type=type;
    }
    

    //printAnimal
    public void printAnimal(){
        System.out.println("--New Animal--");
        System.out.println("Name:" + this.name);
        System.out.println("Type:" + this.type);

    }

    public void attack(User obj){
        System.out.println("---Breaking News!!---");
        System.out.println("An " + this.type + " known as the " + this.name + " attacks " + obj.name + "!");
    }
}
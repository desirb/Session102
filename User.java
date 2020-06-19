public class User {
    //attributes
    public String name;
    public String food;
    private int age;


    //methods
        //constructor
    public User(String name, int age, String food){
        this.name=name;
        setAge(age);
        this.food=food;
    }

        //setter
    public void setAge(int age){
        if(age<100){
             this.age=age;
             //System.out.println("The age has been assigned.");
        }
        else{
            System.out.println("Error! The age is not correct.");
        }
    }

    public void printUser(){
        System.out.println("----New User----");
        System.out.println("Name:" + this.name);
        System.out.println("Age:" + this.age);
        System.out.println("Favorite Food:" + this.food);
    }



    
}
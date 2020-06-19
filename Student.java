public class Student extends User {
    //public String name;
    //public int age;
    public int cohortNumber;

    //constructor

   public Student(String name, int age, String food, int cohortNumber){
        super(name, age, food);
        this.cohortNumber=cohortNumber;
    }

    //method printStudent
    public void printStudent(){
        System.out.println("----Student Profile----");
        printUser();
        System.out.println("Cohort Number:" + this.cohortNumber);
    }

}
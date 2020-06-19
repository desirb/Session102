public class Ex3 {
    
    public static void main (String args[]){

        User britley = new User("Britley", 24, "Steak");
        britley.printUser();
        
        User lyric = new User("Lyric", 1, "Milk");
        lyric.printUser();

        Student angella = new Student("Angella", 17, "Ice Cream", 10);
        angella.printStudent();

       Student david = new Student("David", 24, "Donuts", 10);
       david.printStudent();

       Animal bug = new Animal("Praying Mantis", "Insect");
       bug.printAnimal();

       Animal dog = new Animal("German Shepherd", "Dog");
       dog.printAnimal();

       bug.attack(angella);
       dog.attack(david);

    }
}
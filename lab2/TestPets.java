package pet_man_sys;


public class TestPets {
 public static void main(String[] args) {
     Person john  = new Employee("John", 30, "Engineer");
     Person alice = new PhDStudent("Alice",26,"CS","AI");

     Animal murka = new Cat("Murka", 5);
     Animal rex   = new Dog("Rex",   3);

     john.assignPet(murka);
     alice.assignPet(rex); 

     PersonRegistry reg = new PersonRegistry();
     reg.addPerson(john); reg.addPerson(alice);

     System.out.println(reg);          
     john.leavePetWith(alice);        
     System.out.println(reg);
     john.retrievePetFrom(alice);      
     System.out.println(reg);
 }
}
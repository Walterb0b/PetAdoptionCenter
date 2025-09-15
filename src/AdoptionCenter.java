import java.util.Scanner;

public class AdoptionCenter {
    public static void main(String[] args) {
    adoptioncenter();
    }

    public static void adoptioncenter(){
        //Scanner for user inputs
        Scanner sc = new Scanner(System.in);

        //Welcome message
        System.out.println("Hello and welcome to the adoption center!");
        System.out.print("How many pets would you like to register: ");
        int numberOfPets = sc.nextInt();
        sc.nextLine();

        //Create array of pets
        Pet[] pets = new Pet[numberOfPets];

System.out.println("\nThis is how the pets like to spend their time:");
for (Pet pet : pets) {
    pet.speak();
    pet.sleep();
    pet.move();
}



        //Display pets
        System.out.println("Here are all the pets:");
        for(Pet pet : pets){
            System.out.println(pet);
        }
    }
}

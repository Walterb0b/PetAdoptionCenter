import java.util.Scanner;

public class AdoptionCenter {
    public static void main(String[] args) {

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





    }
}

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Calico c = new Calico();
        System.out.println("You are at a cat cafe and you see an isolated calico cat that you would like" +"\n" + "to approach." + "\n" + "(Type 1 or 2)");
        System.out.println("1 - Let her sniff you \n2 - Stare and go pspspsps");
        Scanner scnr = new Scanner(System.in);
        int choice = scnr.nextInt();
        int goodCounter = 0;
        try{
            if (choice == 1){
                c.greet();
                goodCounter ++;
                
            } else if (choice == 2) {
                c.nope();
            } else if (choice != 1 || choice != 2){
                c.nope();
            }
            System.out.println("=======");
            System.out.println("What would you like to do next?" + "\n" + "1 - Pet!" + "\n2 - Play!" + "\n3 - give treats!");
        } catch(InputMismatchException mm){
            System.out.println("Not a valid input");
        }
        try{
            choice = scnr.nextInt();
            if (choice == 1){
                c.noTouchie();
            } else if (choice == 3){
                c.talk();
                goodCounter++;
            } else if (choice == 2){
                c.play();
                goodCounter ++;
            }
        } catch (InputMismatchException ime){
            System.out.println("Not valid input");
        }
        Scanner choiceTwo = new Scanner(System.in);
        if (goodCounter == 2){
                System.out.println("\n" + "The kitty seems quite fond of you.." + "\n" + "Lets look at her adoption info now!");
            try{
                File info = new File("kitty.txt");
                Scanner reading = new Scanner(info);
                while (reading.hasNext()) {
                    String line = reading.nextLine();
                    System.out.println(line);
                    } 
                } catch(Exception e) {
                System.out.println("dne"); 
            }   
            System.out.println("Would you like to adopt?" + "\n" + "1 - yes" + "\n" + "2 - no");
            int theChoice = choiceTwo.nextInt();
            if (theChoice == 1){
                System.out.println("Congrats! You got yourself a kitty cat!");
            } else {
                System.out.println("Oh well. Come back after reconsidering!");
                }

            } else if (goodCounter == 0) { 
                System.out.println("Your time here is over. maybe you can meet the kitty another day?");
            } else if (goodCounter == 1){
                System.out.println("The kitty eventually leaves you to go nap. Maybe you can meet her another");
            }
            System.out.println(goodCounter);
    }
}
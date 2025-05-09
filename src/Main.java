import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        ArrayList<LockerRoom> lockers = new ArrayList<>();
        LockerRoom lar107 = new LockerRoom("Rams", "SoFi", 107);
        Player one = new Player("Puca Nakua", "Wide Receiver", 12);
        Player two = new Player("Mathew Stafford", "Quarterback", 9);
        Player three = new Player("Davante Adams", "Wide receiver", 17);
        Player four = new Player("Tyler Higbee", "Tight end", 89);
        Player five = new Player("Tutu Attwell", "Wide receiver", 5);
        Player six = new Player("Kyren Williams", "running back", 23);
        lockers.add(lar107);
        ArrayList<Cafe> menu = new ArrayList<>();
        Cafe 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the home of the Los Angeles Rams! We are here to give you a tour of our facilities.");
        System.out.println("Where do you want to go? Type in one number ONLY!");
        System.out.println("1. Type 1 if you would like to go to the Stadium \n2. Type 2 if you would like to got to the Weightroom \n3. Type 3 if you would like to go to the Locker Room \n4. Type 4 if you would like to go to the cafe \n5. Type 5 if you would like to end the tour");
        int tourStart = scanner.nextInt();
        if (tourStart == 1){
            System.out.println("Welcome to Sofi stadium home of your Los Angelas Rams! During your time at the staium, we hace a couple things that you can do.");
            System.out.println("Your options are you can either go ahead and watch a home game, or you can take a tour of our stadium with one of our amazing tour guides.");
            System.out.println("1. Type 1 to tour the stadium \n2. Type 2 to watch a game \n3. Type 3 whenever you would like to end the tour to exit the tour");
            int tourStadium = scanner.nextInt();
            if (tourStadium == 1){
                System.out.println("Thank you for selecting to come on our tour. Durinng or tour, we will take you onto the field and teach you about our history.");
                
            }
            
            else if (tourStadium == 2){
                System.out.println("Select a game you want to watch:");
                System.out.println("1. Type 1 to watch 'Super Bowl LVI 13/02/2022");
                
            }
            else if (tourStadium == 3){
                System.out.println("Thank you for coming. We hope you enjoyed your time here!");
                scanner.close();
            }
        }
        else if (tourStart == 2){
            System.out.println("Select an exercise:");
        }
        else if (tourStart == 3){
            System.out.println("Select a locker");
            int lockNum = scanner.nextInt();
            for (LockerRoom l:lockers){
                if (l.getLockerNum() == lockNum){
                    System.out.println(l);
                }
            }
        }
        else if (tourStart == 4){
            System.out.println("Welcome to the café! What would you like to order?");
            System.out.println("You must only type the number to the corresponding food item you desire.");
            System.out.println("Our Menu:");
            System.out.println("4. Veggie Burger");
            System.out.println("6. Curly Fries");
            System.out.println("7. Half-Pounder Meat Burger");
            System.out.println("10. ");
            System.out.println("3726. ");
            int foodItem = scanner.nextInt();
            if (foodItem == 4){
                System.out.println();
            }
            else if (foodItem == 6){
                System.out.println();
            }
            else if (foodItem == 7){
                System.out.println();
            }
            else if (foodItem == 10){
                System.out.println();
            }
            else if (foodItem == 3726){
                System.out.println();
            }
            else {
                System.out.println("Sorry! The number you typed is not in our menu. Please review the menu and try again!");
                System.out.println("Our Menu:");
                System.out.println("4. ");
                System.out.println("6. ");
                System.out.println("7. ");
                System.out.println("10. ");
                System.out.println("3726. ");
                
            }
        }
        else if (tourStart == 5){
            System.out.println("Thank you for coming. We hope you enjoyed your time here!");
            scanner.close();
        }
    }
}
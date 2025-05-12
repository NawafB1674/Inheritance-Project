import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean touring = true;

        // Create facilities
        ArrayList<Facilities> facilities = new ArrayList<>();
        LockerRoom lockerRoom = new LockerRoom("Rams", "Locker Room", 107);
        Stadium stadium = new Stadium("Rams", "SoFi Stadium");
        Weightroom weightroom = new Weightroom("Rams", "Weight Room", "Bench Press", "Barbell");
        Cafe cafe = new Cafe("Rams", "Cafe", "Smoothie", "Veggie Burger");

        facilities.add(lockerRoom);
        facilities.add(stadium);
        facilities.add(weightroom);
        facilities.add(cafe);

        System.out.println("Welcome to the home of the Los Angeles Rams!");

        while (touring) {
            System.out.println("\nWhere do you want to go? Type the number only:");
            System.out.println("1. Stadium");
            System.out.println("2. Weightroom");
            System.out.println("3. Locker Room");
            System.out.println("4. Cafe");
            System.out.println("5. End the tour");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nWelcome to SoFi Stadium!");
                    System.out.println("1. Take a tour");
                    System.out.println("2. Watch a game");
                    System.out.println("3. Go back");

                    int stadiumChoice = scanner.nextInt();
                    if (stadiumChoice == 1) {
                        stadium.tour();
                    } else if (stadiumChoice == 2) {
                        stadium.watchGame();
                    } else {
                        System.out.println("Returning to main menu...");
                    }
                    break;

                case 2:
                    System.out.println("\nWelcome to the Weightroom!");
                    System.out.println("Exercise: " + weightroom.getExcercise());
                    System.out.println("Equipment: " + weightroom.getEquipment());
                    break;

                case 3:
                    System.out.println("\nWelcome to the Locker Room!");
                    System.out.print("Enter the locker number to open: ");
                    int lockerInput = scanner.nextInt();
                    if (lockerInput == lockerRoom.getLockerNum()) {
                        System.out.println(lockerRoom);
                    } else {
                        System.out.println("Locker not found.");
                    }
                    break;

                case 4:
                    System.out.println("\nWelcome to the Café! Here's our menu:");
                    System.out.println("1. Veggie Burger");
                    System.out.println("7. Curly Fries");
                    System.out.println("29. Half-Pounder Meat Burger");
                    System.out.println("184. Protein Smoothie");
                    System.out.println("3726. Vegan Wrap");
                    System.out.print("What would you like to order? ");

                    int foodItem = scanner.nextInt();
                    switch (foodItem) {
                        case 1:
                            System.out.println("You've selected a Veggie Burger.");
                            break;
                        case 7:
                            System.out.println("You've selected Curly Fries.");
                            break;
                        case 29:
                            System.out.println("You've selected a Half-Pounder Meat Burger.");
                            break;
                        case 184:
                            System.out.println("You've selected a Protein Smoothie.");
                            break;
                        case 3726:
                            System.out.println("You've selected a Vegan Wrap.");
                            break;
                        default:
                            System.out.println("Invalid choice. Please try again.");
                    }
                    break;

                case 5:
                    touring = false;
                    System.out.println("Thank you for coming. We hope you enjoyed your time here!");
                    break;

                default:
                    System.out.println("Invalid input. Please try again.");
            }
        }

        scanner.close();
    }
}

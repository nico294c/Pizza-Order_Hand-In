//Importing Scanner for detecting user input
import java.util.Scanner;

public class PizzaOrder {

    public static void main(String[] args) {

        //Firstly I will determine variables and initialize the scanner
        Scanner in = new Scanner(System.in);
        //Pizzas
        String pizza1 = "Margherita";   //: Tomato, cheese
        double p1Price = 39.95;
        String pizza2 = "Hawaii";   //: Tomato, cheese, ham, pineapple
        double p2Price = 49.95;
        String pizza3 = "Italiano"; //: Tomato, cheese, pepperoni
        double p3Price = 44.95;
        String pizza4 = "Valentino"; //: Tomato, cheese, kebab, pepperoni, shrimps, bearnaise sauce
        double p4Price = 59.95;
        String pizza5 = "Alibaba";  //: Tomato, cheese, ham, sausages
        double p5Price = 49.95;
        String pizza6 = "Meatlover";    //: Tomato, cheese, ham, beef, kebab, pepperoni
        double p6Price = 59.95;
        String pizza7 = "Classico"; //: Tomato, cheese, ham
        double p7Price = 44.95;
        String pizza8 = "Speciale"; //: Tomato, cheese, kebab, beef, onion, chili
        double p8Price = 59.95;
        String pizza9 = "Vegetarian"; //: Tomato, cheese, onion, mushrooms, red pepper
        double p9Price = 54.95;
        String pizza10 = "Seafood"; //: Tomato, cheese, crab, clams, shrimps
        double p10Price = 54.95;
        //Toppings
        String topping1 = "Cheese ";
        String topping2 = "Ham ";
        String topping3 = "Pineapple ";
        String topping4 = "Pepperoni ";
        String topping5 = "Kebab ";
        String topping6 = "Shrimp ";
        int toppingPrice = 5;

        //Total price that will be updated during the program
        double totalPrice = 0;

        //Welcome the customer
        System.out.println("Welcome to the local pizza place \"Pizza-Order Hand-In\"!");
        System.out.println("Please enter your name:");

        String name = in.next();
        System.out.println("You've entered the name: " + name);
        System.out.println("\nWould you like to see the menu card, " + name + " (y/n)?");

        //Create a loop to check whether or not the user input is valid.
        String menuAccept = in.next();
        while(!menuAccept.equals("y")){
            if(menuAccept.equals("n")) {
                System.out.println("I understand. I hope you'll visit another day, " + name + "!");
                System.exit(1);
            }
            else{
                System.out.println("Sorry I didn't quite understand that input, please try again:");
                menuAccept = in.next();
            }
        }
        //If user input is valid/answers yes, present the menu and continue the code.
        //Print out the menu card

        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("|                                      Menu card                                     |");
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.printf("| 1. " + pizza1 + ": Tomato, cheese                                            %2.2f DKK |", p1Price);
        System.out.printf("\n| 2. " + pizza2 + ": Tomato, cheese, ham, pineapple                                %2.2f DKK |", p2Price);
        System.out.printf("\n| 3. " + pizza3 + ": Tomato, cheese, pepperoni                                   %2.2f DKK |", p3Price);
        System.out.printf("\n| 4. " + pizza4 + ": Tomato, cheese, kebab, pepperoni, shrimps, bearnaise sauce %2.2f DKK |", p4Price);
        System.out.printf("\n| 5. " + pizza5 + ": Tomato, cheese, ham, sausages                                %2.2f DKK |", p5Price);
        System.out.printf("\n| 6. " + pizza6 + ": Tomato, cheese, ham, beef, kebab, pepperoni                %2.2f DKK |", p6Price);
        System.out.printf("\n| 7. " + pizza7 + ": Tomato, cheese, ham                                         %2.2f DKK |", p7Price);
        System.out.printf("\n| 8. " + pizza8 + ": Tomato, cheese, kebab, beef, onion, chili                   %2.2f DKK |", p8Price);
        System.out.printf("\n| 9. " + pizza9 + ": Tomato, cheese, onion, mushrooms, red pepper              %2.2f DKK |", p9Price);
        System.out.printf("\n| 10. " + pizza10 + ": Tomato, cheese, crab, clams, shrimps                        %2.2f DKK |", p10Price);
        System.out.println("\n--------------------------------------------------------------------------------------");

        //Prompt user for pizza input
        System.out.println("\nPlease enter what pizza you would like to order from 1-10");
        String pizzaOrder = "";
        int pizzaPick;
        boolean orderCheck = false;
        while(!orderCheck) {
            pizzaPick = in.nextInt();
            if(pizzaPick >= 1 && pizzaPick <= 10) {
                //If the user enters 1, assign pizza1 to pizzaOrder, and add p1price to totalPrice
                switch (pizzaPick) {
                    case (1):
                        pizzaOrder = pizza1;
                        System.out.println("You've selected pizza number " + pizzaPick + " - " + pizzaOrder);
                        totalPrice += p1Price;
                        break;
                    case (2):
                        pizzaOrder = pizza2;
                        System.out.println("You've selected pizza number " + pizzaPick + " - " + pizzaOrder);
                        totalPrice += p2Price;
                        break;
                    case (3):
                        pizzaOrder = pizza3;
                        System.out.println("You've selected pizza number " + pizzaPick + " - " + pizzaOrder);
                        totalPrice += p3Price;
                        break;
                    case (4):
                        pizzaOrder = pizza4;
                        System.out.println("You've selected pizza number " + pizzaPick + " - " + pizzaOrder);
                        totalPrice += p4Price;
                        break;
                    case (5):
                        pizzaOrder = pizza5;
                        System.out.println("You've selected pizza number " + pizzaPick + " - " + pizzaOrder);
                        totalPrice += p5Price;
                        break;
                    case (6):
                        pizzaOrder = pizza6;
                        System.out.println("You've selected pizza number " + pizzaPick + " - " + pizzaOrder);
                        totalPrice += p6Price;
                        break;
                    case (7):
                        pizzaOrder = pizza7;
                        System.out.println("You've selected pizza number " + pizzaPick + " - " + pizzaOrder);
                        totalPrice += p7Price;
                        break;
                    case (8):
                        pizzaOrder = pizza8;
                        System.out.println("You've selected pizza number " + pizzaPick + " - " + pizzaOrder);
                        totalPrice += p8Price;
                        break;
                    case (9):
                        pizzaOrder = pizza9;
                        System.out.println("You've selected pizza number " + pizzaPick + " - " + pizzaOrder);
                        totalPrice += p9Price;
                        break;
                    case (10):
                        pizzaOrder = pizza10;
                        System.out.println("You've selected pizza number " + pizzaPick + " - " + pizzaOrder);
                        totalPrice += p10Price;
                        break;
                }
                orderCheck = true;
            }
            //If the number is outside range, repromt the user.
            else{
                System.out.println("Sorry that number was invalid. Please enter a number between 1-10");
            }
        }

        //Proceed to ask the customer if they want toppings (max 3)
        System.out.println("\nWould you like extra toppings? (y/n)");
        String toppingAccept = in.next();
        String orderedToppings = "";
        int toppingPick;
        int toppingCounter = 0;
        int toppingTotal = 0;
        while(!toppingAccept.equals("n")){
            if(toppingAccept.equals("y")){
                //If user wants toppings print out the different toppings.
                System.out.println("List of toppings:");
                System.out.println("------------------------------");
                System.out.printf("1. " + topping1 + " .............. %1d DKK", toppingPrice);
                System.out.printf("\n2. "+ topping2 + " ................. %1d DKK", toppingPrice);
                System.out.printf("\n3. "+ topping3 + " ........... %1d DKK", toppingPrice);
                System.out.printf("\n4. "+ topping4 + " ........... %1d DKK", toppingPrice);
                System.out.printf("\n5. "+ topping5 + " ............... %1d DKK", toppingPrice);
                System.out.printf("\n6. "+ topping6 + " .............. %1d DKK", toppingPrice);
                System.out.println("\n------------------------------");
                System.out.println("\nPlease enter the number of the topping you want to add (max 3). Press c to cancel");
                toppingAccept = in.next().toLowerCase();
                while(!toppingAccept.equals("c")){
                    if((Integer.parseInt(toppingAccept) >= 1 && Integer.parseInt(toppingAccept) <= 6 && toppingCounter < 3)){
                        toppingPick = Integer.parseInt(toppingAccept);
                        switch (toppingPick){
                            case(1):
                                orderedToppings += topping1;
                                System.out.println("You've chosen " + orderedToppings);
                                toppingCounter++;
                                toppingTotal += toppingPrice;
                                break;

                            case(2):
                                orderedToppings += topping2;
                                System.out.println("You've chosen " + orderedToppings);
                                toppingCounter++;
                                toppingTotal += toppingPrice;
                                break;

                            case(3):
                                orderedToppings += topping3;
                                System.out.println("You've chosen " + orderedToppings);
                                toppingCounter++;
                                toppingTotal += toppingPrice;
                                break;

                            case(4):
                                orderedToppings += topping4;
                                System.out.println("You've chosen " + orderedToppings);
                                toppingCounter++;
                                toppingTotal += toppingPrice;
                                break;

                            case(5):
                                orderedToppings += topping5;
                                System.out.println("You've chosen " + orderedToppings);
                                toppingCounter++;
                                toppingTotal += toppingPrice;
                                break;

                            case(6):
                                orderedToppings += topping6;
                                System.out.println("You've chosen " + orderedToppings);
                                toppingCounter++;
                                toppingTotal += toppingPrice;
                                break;
                        }
                        //Allow the user to keep adding toppings until they're at 3.
                        if(toppingCounter < 3) {
                            System.out.println("Currently " + toppingCounter + "/3 toppings.\nIf you'd like additional toppings, please type the number of the topping you would like to add (max 3). Press c to cancel.");
                            toppingAccept = in.next();
                        }
                    }
                    //When the user has added 3 toppings, exit the loop by changing toppingAccept to c.
                    else if(toppingCounter == 3){
                        toppingAccept = "c";
                    }
                    else{
                        //If user input is invalid, repromt.
                        System.out.println("Sorry that was an invalid input. Please enter a number between 1-6 or c to cancel");
                        toppingAccept = in.next();
                    }
                }
                toppingAccept = "n";
            }
            else{
                System.out.println("Sorry I didn't understand that input. Please press y for yes, or n for no");
                toppingAccept = in.next();
            }
        }
        //Prompt the user if they would like to change the size of their pizza, presenting the base pizza price change.
        System.out.printf("\nWould you like the pizza in child size (%3.2f DKK without toppings)", totalPrice*0.75);
        System.out.printf("\nor the pizza in family size (%3.2f DKK without toppings)?\n", totalPrice*1.5);
        System.out.println("\nPress 1 for child, press 2 for family, press 3 for standard");
        int sizePick = in.nextInt();
        boolean sizeDone = false;
        while(!sizeDone){
            if(sizePick <= 3 && sizePick >= 1){
                //If the user enters a number in range, present them with the final order and total price.
                if(sizePick == 1){
                    totalPrice = totalPrice * 0.75 + toppingTotal;
                    System.out.printf("You've ordered: \"" + pizzaOrder + "\" with the toppings: " + orderedToppings + "- totaling at %3.2f DKK. We hope you enjoy!", totalPrice);
                    sizeDone = true;
                }
                else if(sizePick ==2){
                    totalPrice = totalPrice * 1.5 + toppingTotal;
                    System.out.printf("You've ordered: \"" + pizzaOrder + "\" with the toppings: " + orderedToppings + "- totaling at %3.2f DKK. We hope you enjoy!", totalPrice);
                    sizeDone = true;
                }
                else{
                    totalPrice = totalPrice + toppingTotal;
                    System.out.printf("You've ordered: \"" + pizzaOrder + "\" with the toppings: " + orderedToppings + "- totaling at %3.2f DKK. We hope you enjoy!", totalPrice);
                    sizeDone = true;
                }
            }
            else {
                System.out.println("Sorry that number wasn't one of the options, please enter a number between 1-3");
                sizePick = in.nextInt();
            }
        }
    }
}
/*Tested by Kristoffer - ran into issues I already knew would happen
I really struggled figuring out how to validate the userinput if I would need integers from the user.
Fx. when picking the pizza I tried using Integer.parseInteger(), but it would throw an error message if the user input was invalid (anything but an integer)
So I just ensured that the program would be able to run fully, and have proper input validation in the spots that I could manage.
I am not fully satisfied with how my program handles in the toppings session either.
It just feels kind of off, and ugly to me, but it was the best I could figure it out to be.
Either way I hope you enjoy my first Hand-in! 'Till next time!
 */
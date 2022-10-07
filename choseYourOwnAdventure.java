import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
 
 
public class choseYourOwnAdventure {
    public static void main(String[] args){
 
        Scanner input = new Scanner(System.in);
        
        List<String> choices = new ArrayList<>();

        System.out.println("Do you want to go outside or stay indide for recess? \n a for inside, b for outside");
        String input1 = input.nextLine();
        choices.add(input1);
        System.out.print(choices);
   
        if (input1 == "a") {
            System.out.println("Do you want to eat a snack or play a game? \n a for snack, b for play game");
            input1 = input.nextLine();
            choices.add(input1);
            if(input1 == "a")
            {
                System.out.println("Do you want to eat fruits or chips? \n a or fruits, b for chips");
                input1 = input.nextLine();
                choices.add(input1);
                if (input1 == "a") {
                    //Final statment
                } else if (input1 == "b") {
                    //Final statment
                }

            } else if (input1 == "b") {

            }
 
            
        } else if (input1 == "b") {
            System.out.println("Jumprope, basketball or draw");
            input1 = input.nextLine();
            choices.add(input1);
            if (input1 == "a") {
                input1 = input.nextLine();
                choices.add(input1);
                if (input1 == "c") {

                } else if (input1 == "b") {
                    
                }
            } else if (input1 == "b") {
                input1 = input.nextLine();
                choices.add(input1);

            } else if (input1 == "c") {
                input1 = input.nextLine();
                choices.add(input1);

            }
        }
 
        input.close();
    }
}
 


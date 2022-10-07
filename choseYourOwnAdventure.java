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
            if(input1 == "a")
            {
                System.out.println("Do you want to eat fruits or chips? \n a or fruits, b for chips");
                input1 = input.nextLine();
                
            }
 
            
        } else {
 
        }
 
        input.close();
    }
}
 


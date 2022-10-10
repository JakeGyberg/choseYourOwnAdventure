/*
Project 1.3 Choose your path

*/

import java.util.Scanner;
 
public class choseYourOwnAdventure {
    public static void main(String[] args)
    {
 
        Scanner input = new Scanner(System.in);

        // asks user the first question
        System.out.println("Do you want to go outside or stay inside for recess? \n a for inside, b for outside"); 
        String input1 = input.nextLine();
        
        if (input1 == "a") 
        {
            System.out.println("Do you want to eat a snack or play a game? \n a for snack, b for play game");
            String input2 = input.nextLine();

            if(input2 == "a")
            {
                System.out.println("Do you want to eat fruits or chips? \n a or fruits, b for chips");
                String input3 = input.nextLine();
                if (input3 == "a") 
                {
                    if(input1 == "a" && input2 == "a" && input3 == "a")
                    {
                        System.out.println("You chose to stay inside and eat fruits for your snack!");
                    }
                } 
                else if (input3 == "b") 
                {
                    if(input1 == "a" && input2 == "a" && input3 == "b")
                    {
                        System.out.println("You chose to stay inside and eat chips for your snack!");
                    }
                }

            } 
            else if (input2 == "b") 
            {
                System.out.println("Do you want to play cards or video games? \n a or cards, b for video games");
                String input4 = input.nextLine();
                if (input4 == "a") 
                {
                    if(input1 == "a" && input2 == "b" && input4 == "a")
                    {
                        System.out.println("You chose to stay inside and play cards for your game!");
                    }               
                } 
                else if (input4 == "b") 
                {
                    if(input1 == "a" && input2 == "b" && input4 == "b")
                    {
                        System.out.println("You chose to stay inside and play videogames for your game!");
                    }  
                }

            }    
        } 
        else if (input1 == "b") 
        {
            System.out.println("a for Jumprope, b for basketball or c for draw");
            String input5 = input.nextLine();
 
            if (input5 == "a") 
            {
                System.out.println("Do you want to jumprope by yourself or with a friend? \n a alone or b with friend");
                String input6 = input.nextLine();
                if (input6 == "a") 
                {
                    if(input1 == "b" && input5 == "a" && input6 == "a")
                    {
                        System.out.println("You chose to go outside and jumprope by yourself!");
                    }
                } 
                else if (input6 == "b")
                {
                    if(input1 == "b" && input5 == "a" && input6 == "b")
                    {
                        System.out.println("You chose to go ouside and jumprope with a friend!");
                    }
                }
            } 
            else if (input5 == "b") 
            {
                System.out.println("Do you want to play 1v1 (a) or on a team (b)?");
                String input7 = input.nextLine();
                if (input7 == "a") 
                {
                    if(input1 == "b" && input5 == "b" && input7 == "a")
                    {
                        System.out.println("You chose to go outside and play 1v1 basketball!");
                    }
                } 
                else if (input7 == "b")
                {
                    if(input1 == "b" && input5 == "b" && input7 == "b")
                    {
                        System.out.println("You chose to go outside and play basketball with a team!");
                    }
                }
            } 
            else if (input5 == "c") 
            {
                System.out.println("Do you want to draw with crayons (a) or colored pencils (b)?");
                 String input8 = input.nextLine();
                if (input8 == "a") 
                {
                    if(input1 == "b" && input5 == "c" && input8 == "a")
                    {
                        System.out.println("You chose to go outside and draw with crayons!");
                    }
                } 
                else if (input8 == "b")
                {
                    if(input1 == "b" && input5 == "c" && input8 == "b")
                    {
                        System.out.println("You chose to go outside and draw with colored pencils!");
                    }
                }
            }
        }
 
        input.close();
    }
}
 


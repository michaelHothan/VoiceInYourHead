
/**
 * This is where the character first lands when they enter the game.
 * Gustinville connects to ... 
 * Gustinville connects from ...
 *
 * @author Bruce Gustin
 * @version 5/7/2018 11:03AM
 */

import java.util.Scanner;

public class Gustinville implements Playable
{
    private Scanner userInput;
    String name, gender;
    
    public Gustinville(String name, String gender)
    {
        userInput = new Scanner(System.in);
        this.name = name;
        this.gender = gender;
        activity();
    }
    
    public void activity(){
        entry();
        int choice = choice();
        challenge(choice);
        exit();
        
    }
    
    public void entry(){
        System.out.println("Welcome to Gustinville, blah, blah, blah");
    }
    public int choice(){
        System.out.println("You spotted a letter in the road, what do you want to do?");
        String response = userInput.nextLine();
        int choice = 0;
        if(response.toUpperCase().contains("PICK")) choice = 1;
        return choice;
    }
    public void challenge(int choice){
        String challenge = defaultResponse();
        switch(choice){
            case 1: challenge = "Now you need to do this";
        }
        System.out.println(challenge);
    }
    public void exit(){
        System.out.println("You are moving to Davidville.");
        Playable player = new Davidville(name, gender);
    }
    
    public String defaultResponse(){
        return "";
    
    }

}

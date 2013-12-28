import java.util.*;
import java.io.*;

public class Game{
    private String name;
    private Character player;
    private Scanner scan = new Scanner(System.in);

    public Game(){
        System.out.println("Welcome to GTAStuy");
        System.out.println("Intro thingy");

        System.out.println("What is your name?: ");
        name = scan.nextLine();

        player = new Character(name);
        System.out.println(player.intro());
        tutorial();
    }

    public void tutorial(){
        System.out.println("You are late to your homeroom, but you left your lunch in your locker. What are you going to do?");
        System.out.println("1. Go to locker 2. Go to homeroom 3. Check your status");
        int choice = 0;
        choice = scan.nextInt();
        if (choice == 1){
            System.out.println("Going to your locker on 4th floor ... ");
            player.setFloor(4);
            System.out.println("You encountered your friend!");
            friends(0);
        }else if (choice == 2){
            System.out.println("Going to homeroom on 2nd floor... ");
        }else{
            System.out.println(player.status());
        }
    }
    
    public void friends(int i){
        if (i == 0){
            String prompt = "Hey, " + name + ". If you are going to your locker, can you ";
            prompt = prompt + "stop by my locker and get my tweezers";
            System.out.println(prompt);
            System.out.println("1. Say yes 2. Say no");
            int a = scan.nextInt();
            if (a==1){
                System.out.println("You got [Your friend's locker combination]");
            }else{
                System.out.println("Your friend threatened you. Now you have no choice");
                System.out.println("You got [Your friend's locker combination]");
            }
        }
    }
}

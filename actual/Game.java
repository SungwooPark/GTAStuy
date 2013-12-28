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
        }else if (choice == 2){
            System.out.println("Going to homeroom on 2nd floor... ");
        }else{
            player.status();
        }
    }
}

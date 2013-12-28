import java.util.*;
import java.io.*;

public class Game{
    private Scanner scan;
    private String name;
    private Character player;

    public Game(){
        scan = new Scanner(System.in);
        System.out.println("Welcome to GTAStuy");
        System.out.println("Intro thingy");

        System.out.println("What is your name?: ");
        name = scan.nextLine();

        player = new Character(name);
        System.out.println(player.intro());
    }
}

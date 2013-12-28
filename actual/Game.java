import java.util.*;
import java.io.*;

public class Game{
    private Scanner scan;
    private String name;

    public Game(){
        scan = new Scanner(System.in);
        System.out.println("Welcome to GTAStuy");
        System.out.println("Intro thingy");

        System.out.println("What is your name?: ");
        name = scan.nextLine();
        System.out.println(name);
    }
}

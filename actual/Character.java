import java.util.*;
import java.io.*;

public class Character {
	private int health;

	public Character (String name){
		health = 50;
		
	}
		

	public String intro () {
		String intro = "Welcome back " + name + ", we hope you enjoyed your summer, but now it is time to get back to school. You have just crossed the Tribeca and face the haunting metal doors that are the entrance to Stuy. You enter and encounter a bright flash of light........./n/n" + "          || Welcome to GTAstuy ||";
		return intro;
	}

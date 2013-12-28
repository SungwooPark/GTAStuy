import java.util.*;
import java.io.*;

public class Character {
	private int health;
        private String name;

	public Character (String name){
		health = 50;
		this.name = name;
	}
		

	public String intro () {
		String intro = "Welcome back " + name + ", we hope you enjoyed your summer"
                intro = intro + ", but now it is time to get back to school."
                intro = intro + " You have just crossed the Tribeca and face the haunting metal doors that are the entrance to Stuy."
                intro = intro + " You enter and encounter a bright flash of light.........\n\n"
                intro = intro + "          || Welcome to GTAstuy ||";
		return intro;
	}
}

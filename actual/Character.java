import java.util.*;
import java.io.*;

public class Character {
	private int health,floor;
        private String location;
        private String name;
        private Items item;

	public Character (String name){
		health = 50;
		this.name = name;
		floor = 2;
		location = "hallway";
	}
		

	public String intro () {
		String intro = "Welcome back " + name + ", we hope you enjoyed your summer";
                intro = intro + ", but now it is time to get back to school.";
                intro = intro + " You have just crossed the Tribeca and face the haunting metal doors that are the entrance to Stuy.";
                intro = intro + " You enter and encounter a bright flash of light........." + " \n \n";
                intro = intro + "          || Welcome to GTAstuy ||";
		return intro;
	}

	public String status () {
		String status = "Health: " + this.health;
		status = status + "\n" + "You are on floor: " + this.floor;
		status = status + "\n" + "You are at location: " + this.location;
		return status;
	}

	public void setFloor (int arg) {
		floor = arg;
		System.out.println("You are now on floor: " + floor);
	}
	
	public void setLocation (String arg) {
		location = arg;
		System.out.println("You are now at location: " + location);
	}

        public void addItem(String itemName){
            item.expandList(itemName);
        }
        
        public String printItemList(){
            return item.itemList();
        }
}

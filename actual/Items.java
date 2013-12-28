import java.util.*;
import java.io.*;

public class Items {
	private ArrayList<String> items = new ArrayList();

	public void expandList (String itemName) {
		items.add(itemName);
	}

        public String itemList(){
            return Arrays.toString(items.toArray());
        }
}	

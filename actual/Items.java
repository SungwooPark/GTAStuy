import java.util.*;
import java.io.*;

public class Items {
	private ArrayList[] items = new ArrayList[];

	public void expandList (String itemName) {
		items = items + itemName;
	}
	
	

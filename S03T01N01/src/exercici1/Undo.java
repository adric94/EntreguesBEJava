package exercici1;

import java.util.ArrayList;

public class Undo {
	private static Undo instance;
	private ArrayList<String> history;

	
	private Undo(){
		history = new ArrayList<String>();
	}
	public static Undo getInstance() {
		if (instance == null) {
			instance = new Undo();
		}
		
		return instance;
	}	

	public void addCommand(String command){
		history.add(command);
		
	}
	
	public void removeCommand(int index){
		if (index >= 0 && index < history.size()) {
			history.remove(index);
			
		}
	}

	public void removelastCommand(){
		if (!history.isEmpty()) {
			history.remove(history.size() -1);
		}
	}
	
	public void clearHistory() {
		history.clear();
	}
	
	public void printHistory() {
		for	(String command : history) {
			System.out.println(command);
		}
		if (history.isEmpty()) {
			System.out.println("History is empty");
			
		}
	}
	
	
}

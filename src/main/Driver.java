package main;

import controller.Controller;

public class Driver {
	

	public static void main(String[] args) {
		String levelFromProp = ReadWritePropertyFile.loadLevel();
		int level = Integer.parseInt(levelFromProp);
		Controller controller = new Controller(level);
		Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {

	        public void run() {
	        	ReadWritePropertyFile.saveLevel(controller.getLevel()+"");
	        }

			
	    }));

	}

	

}

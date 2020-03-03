package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class ReadWritePropertyFile {
	public static final String CONFIG = "config.properties";
	
	public static  String loadLevel() {
		Properties prop=new Properties(); 
		FileInputStream ip = null;
		try {
			ip = new FileInputStream(CONFIG);
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		}
		try {
			prop.load(ip);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop.getProperty("Level");
	}
	
	public static void saveLevel(String level) {
		Properties prop = new Properties();
	    OutputStream output = null;

		try {

	        output = new FileOutputStream(CONFIG);
	        prop.setProperty("Level", level);
	        prop.store(output, null);
	    } catch (IOException io) {
	        io.printStackTrace();
	    } finally {
	        if (output != null) {
	            try {
	                output.close();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
	    }
	  }
	}


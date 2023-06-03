package Driving_Tutorial_System;


import javax.swing.*;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

	public class DataBase {
		//declare a private instance to store the objects of User_Data class
		List <User_data> userInfos;
		//It is invoked when a new instance of User_DataBase is created
		public DataBase() {
		//create an empty list to store data
	    userInfos = new ArrayList<>();
	    }
		//add method 
		public void addUser(User_data userData) {
			//add the userData objects to the userInfos arraylist
		    userInfos.add(userData);
		}
		public  List<User_data> getUserDataList() {
			return userInfos;
		  
		}
		public void saveToFile(String fileName) {
		    try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
		        for (User_data userData : userInfos ) {
		            String line = userData.getName() + "," +
		                          userData.getEmail() + "," +
		                          userData.getAge() + "," +
		                          userData.getSex() + "," +
		                          userData.getDateofbirth() + "," +
		                          userData.getHeight() + "," +
		                          userData.getWeight() + "," +
		                          userData.getPassword();
		            writer.write(line);
		            writer.newLine();
		        }
		        JOptionPane.showMessageDialog(null, "Data saved successfully!");
		    } catch (IOException e) {
		        JOptionPane.showMessageDialog(null, "Error occurred while saving data: " + e.getMessage());
		    }
		}

		public void loadFromFile(String fileName) {
	        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
	            String line;
	            while ((line = reader.readLine()) != null) {
	                String[] data = line.split(",");
	                if (data.length == 8) {
	                    String name = data[0];
	                    String email = data[1];
	                    int age = Integer.parseInt(data[2]);
	                    String sex = data[3];
	                    String dateOfBirth = data[4];
	                    double height = Double.parseDouble(data[5]);
	                    double weight = Double.parseDouble(data[6]);
	                    String password = data[7];

	                    User_data userData = new User_data(name, email, age, sex, dateOfBirth, height, weight, password);
	                    addUser(userData);
	                    
	                }
	            }
	            JOptionPane.showMessageDialog(null, "Data loaded successfully!");
	        } catch (IOException e) {
	            JOptionPane.showMessageDialog(null, "Error occurred while loading data: " + e.getMessage());
	        }
	    }
	}
	

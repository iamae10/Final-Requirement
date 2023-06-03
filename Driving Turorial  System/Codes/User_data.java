package Driving_Tutorial_System;

public class User_data {
	
	     
		private String name;
		private String email;
		private int age;
		private String sex;
		private String dateofbirth;
		private double height;
		private double weight; 
		private String password; 
		
		public User_data(String name, String email, int age, String sex, String dateofbirth, double height, double weight,
				String password) {
			this.name = name;
			this.email = email;
			this.age = age;
			this.sex = sex;
			this.dateofbirth = dateofbirth;
			this.height = height;
			this.weight = weight;
			this.password = password;
		}
		

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getSex() {
			return sex;
		}

		public void setSex(String sex) {
			this.sex = sex;
		}

		public String getDateofbirth() {
			return dateofbirth;
		}

		public void setDateofbirth(String dateofbirth) {
			this.dateofbirth = dateofbirth;
		}

		public double getHeight() {
			return height;
		}

		public void setHeight(double height) {
			this.height = height;
		}

		public double getWeight() {
			return weight;
		}

		public void setWeight(double weight) {
			this.weight = weight;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

	}


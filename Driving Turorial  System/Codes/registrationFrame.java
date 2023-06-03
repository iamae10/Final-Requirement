package Driving_Tutorial_System;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JRadioButton;
import java.util.ArrayList;
import java.util.List;

	public class registrationFrame extends JFrame {
		
	    //the panel of the frame
		private JPanel contentPane;
		
		//text and password fields
		private JTextField namefield;
		private JTextField emailField;
		private JTextField ageField;
		private JRadioButton femaleRadiobtn;
		private JRadioButton maleRadiobtn;
		private JTextField dateofbirthField;
		private JTextField heightField;
		private JTextField weightField;
		private JPasswordField passwordField;
		private JPasswordField confirmpasswordField;

		//labels
		private JLabel lblEmail;
		private JLabel lblAge;
		private JLabel lblSex;
		private JLabel lblDateOfBirth;
		private JLabel lblHeight;
		private JLabel lblWeight;
		private JLabel lblPassword;
		private JLabel lblConfirmPassword;
		private JLabel lblNewLabel_9;
		
		//declares a private instance variable for User_Database 
		private DataBase userDataBase;
		
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						DataBase userDataBase = new DataBase();
						registrationFrame frame = new registrationFrame(userDataBase);
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}

		/**
		 * Create the frame.
		 */
		
		public registrationFrame(DataBase userDataBase) {
			this.userDataBase = userDataBase;
		    frameComponents();
		}
		private void frameComponents() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 810, 473);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JLabel fullnameLbl = new JLabel("Full Name");
			fullnameLbl.setFont(new Font("Tahoma", Font.PLAIN, 15));
			fullnameLbl.setBounds(347, 69, 72, 29);
			contentPane.add(fullnameLbl);
			
			namefield = new JTextField();
			namefield.setBounds(422, 75, 186, 20);
			contentPane.add(namefield);
			namefield.setColumns(10);
			
			lblNewLabel_9 = new JLabel("CREATE YOUR ACCOUNT ");
			lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 35));
			lblNewLabel_9.setBounds(369, 11, 401, 49);
			contentPane.add(lblNewLabel_9);
			
			lblEmail = new JLabel("Email");
			lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblEmail.setBounds(347, 100, 72, 29);
			contentPane.add(lblEmail);
			
			lblAge = new JLabel("Age");
			lblAge.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblAge.setBounds(347, 136, 72, 29);
			contentPane.add(lblAge);
			
			lblSex = new JLabel("Sex");
			lblSex.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblSex.setBounds(347, 173, 72, 29);
			contentPane.add(lblSex);
			
			emailField = new JTextField();
			emailField.setColumns(10);
			emailField.setBounds(422, 106, 186, 20);
			contentPane.add(emailField);
			
			ageField = new JTextField();
			ageField.setColumns(10);
			ageField.setBounds(422, 142, 186, 20);
			contentPane.add(ageField);
			
			femaleRadiobtn = new JRadioButton("Female");
			femaleRadiobtn.setBounds(422, 178, 109, 23);
			contentPane.add(femaleRadiobtn);
			femaleRadiobtn.setActionCommand("Female");
			
			maleRadiobtn = new JRadioButton("Male");
			maleRadiobtn.setBounds(544, 178, 72, 23);
			contentPane.add(maleRadiobtn);
			maleRadiobtn.setActionCommand("Male");
			
			lblDateOfBirth = new JLabel("Date Of Birth");
			lblDateOfBirth.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblDateOfBirth.setBounds(320, 214, 114, 29);
			contentPane.add(lblDateOfBirth);
			
			lblHeight = new JLabel("Height");
			lblHeight.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblHeight.setBounds(320, 254, 72, 29);
			contentPane.add(lblHeight);
			
			lblWeight = new JLabel("Weight");
			lblWeight.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblWeight.setBounds(516, 254, 72, 29);
			contentPane.add(lblWeight);
			
			dateofbirthField = new JTextField();
			dateofbirthField.setColumns(10);
			dateofbirthField.setBounds(422, 220, 186, 20);
			contentPane.add(dateofbirthField);
			
			heightField = new JTextField();
			heightField.setColumns(10);
			heightField.setBounds(370, 260, 89, 20);
			contentPane.add(heightField);
			
			weightField = new JTextField();
			weightField.setColumns(10);
			weightField.setBounds(574, 260, 89, 20);
			contentPane.add(weightField);
			
			lblPassword = new JLabel("Password");
			lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblPassword.setBounds(320, 294, 82, 29);
			contentPane.add(lblPassword);
			
			lblConfirmPassword = new JLabel("Confirm Password");
			lblConfirmPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblConfirmPassword.setBounds(320, 334, 135, 29);
			contentPane.add(lblConfirmPassword);
			
			passwordField = new JPasswordField();
			passwordField.setBounds(412, 300, 159, 20);
			contentPane.add(passwordField);
			
			confirmpasswordField = new JPasswordField();
			confirmpasswordField.setBounds(449, 340, 159, 20);
			contentPane.add(confirmpasswordField);
			
			JButton createBtn = new JButton("CREATE");
			createBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					List<User_data> dataList = new ArrayList<>();
					
					        ButtonGroup buttonGroup = new ButtonGroup();
					        buttonGroup.add(maleRadiobtn);
					        buttonGroup.add(femaleRadiobtn);

					        String fullName = namefield.getText();
					        String email = emailField.getText();
					        int age = Integer.parseInt(ageField.getText());
					        String selectedGender = buttonGroup.getSelection().getActionCommand();
					        String dateOfBirth = dateofbirthField.getText();
					        double height = Double.parseDouble(heightField.getText());
					        double weight = Double.parseDouble(weightField.getText());
					        char[] passwordChars = passwordField.getPassword();
					        String password = new String(passwordChars);
					        char[] confirmPasswordChars = confirmpasswordField.getPassword();
					        String confirmPassword = new String(confirmPasswordChars);

					        boolean checkPassword = false;
					        if (password.equals(confirmPassword)) {
					            checkPassword = true;
					            JOptionPane.showMessageDialog(registrationFrame.this, "Successful!");
					            clearFields();
					            User_data userData = new User_data(fullName, email, age, selectedGender, dateOfBirth, height, weight, password);
					            userDataBase.addUser(userData);
					          //invoke the method saveToFile to save the input to file
			                	 userDataBase.saveToFile("database.txt");
			                	 
					        } else {
					            JOptionPane.showMessageDialog(null, "The password does not match. Please try again.");
					            passwordField.setText("");
					            confirmpasswordField.setText("");
					        }
					    }
					});
			createBtn.setBounds(616, 377, 109, 34);
			contentPane.add(createBtn);
		}
		private void clearFields() {
	        namefield.setText("");
	        emailField.setText("");
	        ageField.setText("");
	        maleRadiobtn.setSelected(true);
	        dateofbirthField.setText("");
	        heightField.setText("");
	        heightField.setText("");
	        weightField.setText("");
	        heightField.setText("");
	        passwordField.setText("");
	        confirmpasswordField.setText("");
	    }
		
		}


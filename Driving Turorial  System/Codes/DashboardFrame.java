package Driving_Tutorial_System;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.CardLayout;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DashboardFrame extends JFrame {

	private JPanel contentPane;
	private CardLayout cardLayout;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DashboardFrame frame = new DashboardFrame();
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
	public DashboardFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 914, 477);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		cardLayout = new CardLayout();
		JPanel mainPanel = new JPanel();
		mainPanel.setBounds(199, 32, 609, 395);
		contentPane.add(mainPanel);
		mainPanel.setLayout(cardLayout);
		
		//buttons
		JButton btnNewButton = new JButton("dashboard");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 cardLayout.show(mainPanel, "dashboardpanel");
			}
		});
		btnNewButton.setBounds(40, 100, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("profile");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(mainPanel, "profilePanel");
			}
		});
		btnNewButton_1.setBounds(50, 144, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("modules");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 cardLayout.show(mainPanel, "modulesPanel");
			}
		});
		btnNewButton_1_1.setBounds(40, 185, 89, 23);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("quizzes");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(mainPanel, "quizzesPanel");
			}
		});
		btnNewButton_1_2.setBounds(40, 224, 89, 23);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_2_1 = new JButton("About");
		btnNewButton_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_1_2_1.setBounds(40, 271, 89, 23);
		contentPane.add(btnNewButton_1_2_1);
		
		JButton btnNewButton_1_2_2 = new JButton("log out");
		btnNewButton_1_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_1_2_2.setBounds(40, 404, 89, 23);
		contentPane.add(btnNewButton_1_2_2);
		
		//panels
		JPanel profilePanel = new JPanel();
		mainPanel.add(profilePanel, "profilePanel");
		profilePanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("profile");
		lblNewLabel.setBounds(290, 177, 134, 14);
		profilePanel.add(lblNewLabel);
		
		JPanel modulesPanel = new JPanel();
		mainPanel.add(profilePanel, "profilePanel");
		modulesPanel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("modules");
		lblNewLabel_2.setBounds(234, 189, 46, 14);
		modulesPanel.add(lblNewLabel_2);
		
		JPanel quizzesPanel = new JPanel();
		mainPanel.add(quizzesPanel, "quizzesPanel");
		quizzesPanel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("quizzes");
		lblNewLabel_1.setBounds(283, 172, 46, 14);
		quizzesPanel.add(lblNewLabel_1);
		
		JPanel dashboardpanel = new JPanel();
		mainPanel.add(dashboardpanel, "dashboardpanel");
		dashboardpanel.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("dashboard");
		lblNewLabel_3.setBounds(277, 188, 103, 14);
		dashboardpanel.add(lblNewLabel_3);
		
		
		
	
	}
}

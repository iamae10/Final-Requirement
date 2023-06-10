package Driving_Tutorial_System;

import java.awt.EventQueue;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class topicsFrame extends JFrame {

	private JPanel contentPane;
    
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					topicsFrame frame = new topicsFrame();
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
	public topicsFrame() {
		
		JFrame frame = new JFrame();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1265,825);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1249, 749);
		contentPane.add(panel);
		panel.setLayout(new CardLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1, "name_126456173691400");
		panel_1.setLayout(null);
		
		JButton getStartedbtn1 = new JButton("New button");
		getStartedbtn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		getStartedbtn1.setFocusable(false);
		getStartedbtn1.setFocusPainted(false);
		getStartedbtn1.setContentAreaFilled(false);
		getStartedbtn1.setBorderPainted(false);
		getStartedbtn1.setBounds(350, 515, 558, 127);
		panel_1.add(getStartedbtn1);
		
		JLabel module1bg = new JLabel("New label");
		module1bg.setBounds(0, 0, 1249, 749);
		panel_1.add(module1bg);
		Image img1 = new ImageIcon(this.getClass().getResource("Welcome to Module 1.png")).getImage().getScaledInstance(1249,749,Image.SCALE_DEFAULT);
		module1bg.setIcon(new ImageIcon(img1));
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2, "name_126462535221800");
		panel_2.setLayout(null);
		
		JButton nextButton = new JButton("");
		nextButton.setOpaque(false);
		nextButton.setFocusable(false);
		nextButton.setFocusTraversalKeysEnabled(false);
		nextButton.setFocusPainted(false);
		nextButton.setContentAreaFilled(false);
		nextButton.setBorderPainted(false);
		nextButton.setBounds(1095, 665, 89, 36);
		panel_2.add(nextButton);
		
		JButton backButton = new JButton("");
		backButton.setOpaque(false);
		backButton.setFocusable(false);
		backButton.setFocusTraversalKeysEnabled(false);
		backButton.setFocusPainted(false);
		backButton.setContentAreaFilled(false);
		backButton.setBorderPainted(false);
		backButton.setBounds(63, 665, 89, 36);
		panel_2.add(backButton);
		
		JLabel moduleOutline1 = new JLabel("New label");
		moduleOutline1.setBounds(0, 0, 1249, 749);
		panel_2.add(moduleOutline1);
		//module outline
		Image img2 = new ImageIcon(this.getClass().getResource("Regulatory Signs-1.png")).getImage().getScaledInstance(1249,749,Image.SCALE_DEFAULT);
		moduleOutline1.setIcon(new ImageIcon(img2));
		
		JPanel panel_3 = new JPanel();
		panel.add(panel_3, "name_126468585249000");
		panel_3.setLayout(null);
		JLabel prioritybg = new JLabel("New label");
		prioritybg.setBounds(0, 0, 1249,749);
		panel_3.add(prioritybg);
		
		//priority
		Image img3 = new ImageIcon(this.getClass().getResource("Regulatory Signs (1).png")).getImage().getScaledInstance(1249,749,Image.SCALE_DEFAULT);
		prioritybg.setIcon(new ImageIcon(img3));
		
		JPanel panel_4 = new JPanel();
		panel.add(panel_4, "name_126473616386700");
		panel_4.setLayout(null);
		
		JLabel directionalbg = new JLabel("New label");
		directionalbg.setBounds(0, 0, 1249, 749);
		panel_4.add(directionalbg);
		
		//directional
		Image img4 = new ImageIcon(this.getClass().getResource("Regulatory Signs 1.png")).getImage().getScaledInstance(1249,749,Image.SCALE_DEFAULT);
		directionalbg.setIcon(new ImageIcon(img4));
		
		JPanel panel_5 = new JPanel();
		panel.add(panel_5, "name_126478261132400");
		panel_5.setLayout(null);
		
		JLabel prohibitivebg = new JLabel("New label");
		prohibitivebg.setBounds(0, 0, 1249, 749);
		panel_5.add(prohibitivebg);
		
		//prohibitive
		Image img5 = new ImageIcon(this.getClass().getResource("Regulatory Signs 3.png")).getImage().getScaledInstance(1249,749,Image.SCALE_DEFAULT);
		prohibitivebg.setIcon(new ImageIcon(img5));
		
		JPanel panel_6 = new JPanel();
		panel.add(panel_6, "name_126483520077400");
		panel_6.setLayout(null);
		
		JLabel prohibitive2bg= new JLabel("New label");
		prohibitive2bg.setBounds(0, 0, 1249, 749);
		panel_6.add(prohibitive2bg);
		
		//prohibitive
		Image img6 = new ImageIcon(this.getClass().getResource("Regulatory Signs 4.png")).getImage().getScaledInstance(1249,749,Image.SCALE_DEFAULT);
		prohibitive2bg.setIcon(new ImageIcon(img6));
		
		JPanel panel_7 = new JPanel();
		panel.add(panel_7, "name_126488789075000");
		panel_7.setLayout(null);
		
		JLabel speedbg = new JLabel("New label");
		speedbg.setBounds(0, 0, 1249, 770);
		panel_7.add(speedbg);
		Image img7 = new ImageIcon(this.getClass().getResource("Regulatory Signs 5.png")).getImage().getScaledInstance(1249,749,Image.SCALE_DEFAULT);
		speedbg.setIcon(new ImageIcon(img7));
		
		JPanel panel_8 = new JPanel();
		panel.add(panel_8, "name_126493707549000");
		panel_8.setLayout(null);
		
		JLabel parkingbg = new JLabel("New label");
		parkingbg.setBounds(0, 0, 1249, 749);
		panel_8.add(parkingbg);
		Image img8 = new ImageIcon(this.getClass().getResource("Regulatory Signs 6.png")).getImage().getScaledInstance(1249,749,Image.SCALE_DEFAULT);
		parkingbg .setIcon(new ImageIcon(img8));
		 
		 JPanel panel_9 = new JPanel();
		 panel.add(panel_9, "name_159696756021200");
		 panel_9.setLayout(null);
		 
		 JLabel miscbg = new JLabel("New label");
		 miscbg.setBounds(0, 0, 1249, 749);
		 panel_9.add(miscbg);
		 Image img9 = new ImageIcon(this.getClass().getResource("Regulatory Signs 7.png")).getImage().getScaledInstance(1249,749,Image.SCALE_DEFAULT);
		 miscbg.setIcon(new ImageIcon(img9));
		
		
		 JPanel panel_10 = new JPanel();
		 panel.add(panel_10, "name_159710108831900");
		 panel_10.setLayout(null);
		 
		 JLabel horizontalbg = new JLabel("New label");
		 horizontalbg.setBounds(0, 0, 1249, 687);
		 panel_10.add(horizontalbg);
		 Image img10 = new ImageIcon(this.getClass().getResource("Warning Signs.png")).getImage().getScaledInstance(1249,749,Image.SCALE_DEFAULT);
		 horizontalbg.setIcon(new ImageIcon(img10));
		 
		 JPanel panel_11 = new JPanel();
		 panel.add(panel_11, "name_159716341443800");
		 panel_11.setLayout(null);
		 
		 JLabel intersectionbg = new JLabel("New label");
		 intersectionbg.setBounds(0, 0, 1249, 749);
		 panel_11.add(intersectionbg);
		 Image img11 = new ImageIcon(this.getClass().getResource("Warning Signs-1.png")).getImage().getScaledInstance(1249,749,Image.SCALE_DEFAULT);
		 intersectionbg .setIcon(new ImageIcon(img11));
		 
		 JPanel panel_12 = new JPanel();
		 panel.add(panel_12, "name_159724027116700");
		 panel_12.setLayout(null);
		 
		 JLabel advancewarningbg = new JLabel("New label");
		 advancewarningbg.setBounds(0, 0, 1249, 749);
		 panel_12.add(advancewarningbg);
		 Image img12 = new ImageIcon(this.getClass().getResource("Warning Signs-2.png")).getImage().getScaledInstance(1249,749,Image.SCALE_DEFAULT);
		 advancewarningbg.setIcon(new ImageIcon(img12));
		 
		 JPanel panel_13 = new JPanel();
		 panel.add(panel_13, "name_159732199304700");
		 panel_13.setLayout(null);
		 
		 JLabel roadwidthbg = new JLabel("New label");
		 roadwidthbg.setBounds(0, 0, 1249, 749);
		 panel_13.add(roadwidthbg);
		 Image img13 = new ImageIcon(this.getClass().getResource("Warning Signs-3.png")).getImage().getScaledInstance(1249,749,Image.SCALE_DEFAULT);
		 roadwidthbg.setIcon(new ImageIcon(img13));
		 
		 JPanel panel_14 = new JPanel();
		 panel.add(panel_14, "name_159746615040600");
		 panel_14.setLayout(null);
		 
		 JLabel roadobstaclebg = new JLabel("New label");
		 roadobstaclebg.setBounds(0, 0, 1249, 749);
		 panel_14.add(roadobstaclebg);
		 Image img14 = new ImageIcon(this.getClass().getResource("Warning Signs-4.png")).getImage().getScaledInstance(1249,749,Image.SCALE_DEFAULT);
		 roadobstaclebg.setIcon(new ImageIcon(img14));
		 
		 JPanel panel_15 = new JPanel();
		 panel.add(panel_15, "name_165157288864500");
		 panel_15.setLayout(null);
		 
		 JLabel pedestrianbg = new JLabel("New label");
		 pedestrianbg.setBounds(0, 0, 1249, 749);
		 panel_15.add(pedestrianbg);
		 Image img15 = new ImageIcon(this.getClass().getResource("Warning Signs-5.png")).getImage().getScaledInstance(1249,749,Image.SCALE_DEFAULT);
		 pedestrianbg.setIcon(new ImageIcon(img15));
		 
		 JPanel panel_16 = new JPanel();
		 panel.add(panel_16, "name_165482631448100");
		 panel_16.setLayout(null);
		 
		 JLabel railwaylevelbg = new JLabel("New label");
		 railwaylevelbg.setBounds(0, 0, 1249, 749);
		 panel_16.add(railwaylevelbg);
		 Image img16 = new ImageIcon(this.getClass().getResource("Warning Signs-6.png")).getImage().getScaledInstance(1249,749,Image.SCALE_DEFAULT);
		 railwaylevelbg.setIcon(new ImageIcon(img16));
		 
		 JPanel panel_17 = new JPanel();
		 panel.add(panel_17, "name_165508615284200");
		 panel_17.setLayout(null);
		 
		 JLabel supplementarybg = new JLabel("New label");
		 supplementarybg.setBounds(0, 0, 1249, 628);
		 panel_17.add(supplementarybg);
		 Image img17 = new ImageIcon(this.getClass().getResource("Warning Signs-7.png")).getImage().getScaledInstance(1249,749,Image.SCALE_DEFAULT);
		 supplementarybg.setIcon(new ImageIcon(img17));
		 
		 JPanel panel_18 = new JPanel();
		 panel.add(panel_18, "name_165519317486700");
		 panel_18.setLayout(null);
		 
		 JLabel otherwarningsbg = new JLabel("New label");
		 otherwarningsbg.setBounds(0, 0, 1249, 749);
		 panel_18.add(otherwarningsbg);
		 Image img18 = new ImageIcon(this.getClass().getResource("Warning Signs-8.png")).getImage().getScaledInstance(1249,749,Image.SCALE_DEFAULT);
		 otherwarningsbg.setIcon(new ImageIcon(img18));
		 
		 JPanel panel_19 = new JPanel();
		 panel.add(panel_19, "name_167043217057300");
		 panel_19.setLayout(null);
		 
		 JLabel advdirectionbg = new JLabel("New label");
		 advdirectionbg.setBounds(0, 0, 1249, 749);
		 panel_19.add(advdirectionbg);
		 Image img19 = new ImageIcon(this.getClass().getResource("Informative Signs.png")).getImage().getScaledInstance(1249,749,Image.SCALE_DEFAULT);
		 advdirectionbg.setIcon(new ImageIcon(img19));
		 
		 JPanel panel_20 = new JPanel();
		 panel.add(panel_20, "name_167052738897400");
		 panel_20.setLayout(null);
		 
		 JLabel intersectiondirecbg = new JLabel("New label");
		 intersectiondirecbg.setBounds(0, 0, 1249, 749);
		 panel_20.add(intersectiondirecbg);
		 Image img20 = new ImageIcon(this.getClass().getResource("Informative Signs-1.png")).getImage().getScaledInstance(1249,749,Image.SCALE_DEFAULT);
		 intersectiondirecbg.setIcon(new ImageIcon(img20));
		 
		 JPanel panel_21 = new JPanel();
		 panel.add(panel_21, "name_167065880527400");
		 panel_21.setLayout(null);
		 
		 JLabel reassurancedirecbg = new JLabel("New label");
		 reassurancedirecbg.setBounds(0, 0, 1249, 749);
		 panel_21.add(reassurancedirecbg);
		 Image img21 = new ImageIcon(this.getClass().getResource("Informative Signs-2.png")).getImage().getScaledInstance(1249,749,Image.SCALE_DEFAULT);
		 reassurancedirecbg.setIcon(new ImageIcon(img21));
		 
		 JPanel panel_22 = new JPanel();
		 panel.add(panel_22, "name_167095387952800");
		 panel_22.setLayout(null);
		 
		 JLabel lblNewLabel_3 = new JLabel("New label");
		 lblNewLabel_3.setBounds(0, 0, 1249, 749);
		 panel_22.add(lblNewLabel_3);
		 Image img22 = new ImageIcon(this.getClass().getResource("Informative Signs-3.png")).getImage().getScaledInstance(1249,749,Image.SCALE_DEFAULT);
		 lblNewLabel_3 .setIcon(new ImageIcon(img22));
		 
		 JPanel panel_23 = new JPanel();
		 panel.add(panel_23, "name_167122047771400");
		 panel_23.setLayout(null);
		 
		 JLabel lblNewLabel_4 = new JLabel("New label");
		 lblNewLabel_4.setBounds(0, 0, 1249, 749);
		 panel_23.add(lblNewLabel_4);
		 Image img23 = new ImageIcon(this.getClass().getResource("Informative Signs-4.png")).getImage().getScaledInstance(1249,749,Image.SCALE_DEFAULT);
		 lblNewLabel_4.setIcon(new ImageIcon(img23));
		 
		 JPanel panel_24 = new JPanel();
		 panel.add(panel_24, "name_167142355038200");
		 panel_24.setLayout(null);
		 
		 JLabel lblNewLabel_5 = new JLabel("New label");
		 lblNewLabel_5.setBounds(0, 0, 1249, 749);
		 panel_24.add(lblNewLabel_5);
		 Image img24 = new ImageIcon(this.getClass().getResource("Informative Signs-5.png")).getImage().getScaledInstance(1249,749,Image.SCALE_DEFAULT);
		 lblNewLabel_5.setIcon(new ImageIcon(img24));
		 
		 JPanel panel_25 = new JPanel();
		 panel.add(panel_25, "name_167155582884600");
		 panel_25.setLayout(null);
		 
		 JLabel lblNewLabel_6 = new JLabel("New label");
		 lblNewLabel_6.setBounds(0, 0, 1249, 749);
		 panel_25.add(lblNewLabel_6);
		 Image img25 = new ImageIcon(this.getClass().getResource("Informative Signs-6.png")).getImage().getScaledInstance(1249,749,Image.SCALE_DEFAULT);
		 lblNewLabel_6.setIcon(new ImageIcon(img25));
		 
		 JPanel panel_26 = new JPanel();
		 panel.add(panel_26, "name_167175675797100");
		 panel_26.setLayout(null);
		 
		 JLabel lblNewLabel_7 = new JLabel("New label");
		 lblNewLabel_7.setBounds(0, 0, 1249, 749);
		 panel_26.add(lblNewLabel_7);
		 Image img26 = new ImageIcon(this.getClass().getResource("Informative Signs-7.png")).getImage().getScaledInstance(1249,749,Image.SCALE_DEFAULT);
		 lblNewLabel_7 .setIcon(new ImageIcon(img26));
		 
		 JPanel panel_27 = new JPanel();
		 panel.add(panel_27, "name_167183292736400");
		 panel_27.setLayout(null);
		 
		 JLabel lblNewLabel_8 = new JLabel("New label");
		 lblNewLabel_8.setBounds(0, 0, 1249, 749);
		 panel_27.add(lblNewLabel_8);
		 Image img27 = new ImageIcon(this.getClass().getResource("Informative Signs-8.png")).getImage().getScaledInstance(1249,749,Image.SCALE_DEFAULT);
		 lblNewLabel_8.setIcon(new ImageIcon(img27));
		 
		 JPanel panel_28 = new JPanel();
		 panel.add(panel_28, "name_167192345853600");
		 panel_28.setLayout(null);
		 
		 JLabel lblNewLabel_9 = new JLabel("New label");
		 lblNewLabel_9.setBounds(0, 0, 1249, 749);
		 panel_28.add(lblNewLabel_9);
		 Image img28 = new ImageIcon(this.getClass().getResource("Warning Signs-8.png")).getImage().getScaledInstance(1249,749,Image.SCALE_DEFAULT);
		 otherwarningsbg.setIcon(new ImageIcon(img28));
		 
		 JPanel panel_29 = new JPanel();
		 panel.add(panel_29, "name_169978878338700");
		 panel_29.setLayout(null);
		 
		 JLabel lblNewLabel = new JLabel("New label");
		 lblNewLabel.setBounds(217, 263, 46, 14);
		 panel_29.add(lblNewLabel);
		 
		 JPanel panel_30 = new JPanel();
		 panel.add(panel_30, "name_169995856563600");
		 panel_30.setLayout(null);
		 
		 JLabel lblNewLabel_1 = new JLabel("New label");
		 lblNewLabel_1.setBounds(296, 307, 46, 14);
		 panel_30.add(lblNewLabel_1);
		 
		 JPanel panel_31 = new JPanel();
		 panel.add(panel_31, "name_170009193444400");
		 panel_31.setLayout(null);
		 
		 JLabel lblNewLabel_2 = new JLabel("New label");
		 lblNewLabel_2.setBounds(437, 320, 46, 14);
		 panel_31.add(lblNewLabel_2);
		 
		 JPanel panel_32 = new JPanel();
		 panel.add(panel_32, "name_170058068135600");
		 
		 JPanel panel_33 = new JPanel();
		 panel.add(panel_33, "name_170099586246300");
		 
		 JPanel panel_34 = new JPanel();
		 panel.add(panel_34, "name_170134953819600");
		 
		 JPanel panel_35 = new JPanel();
		 panel.add(panel_35, "name_170160636904900");
		 
		 JPanel panel_36 = new JPanel();
		 panel.add(panel_36, "name_170177541819900");
		 
		 JPanel panel_37 = new JPanel();
		 panel.add(panel_37, "name_170191338758600");
		 
		 JPanel panel_38 = new JPanel();
		 panel.add(panel_38, "name_170208425638200");
		 
		 JPanel panel_39 = new JPanel();
		 panel.add(panel_39, "name_170228971350200");
		 
		 JPanel panel_40 = new JPanel();
		 panel.add(panel_40, "name_170240104412900");
		 
		 JPanel panel_41 = new JPanel();
		 panel.add(panel_41, "name_170252097452100");
		        
		 
			}
		}
		
	
		
	

package Driving_Tutorial_System;

import java.awt.EventQueue;
import java.util.concurrent.atomic.AtomicInteger;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 802, 468);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Initialize the CardLayout for module1ContentsPanel
		CardLayout cardLayout = new CardLayout();
	     
		
		JPanel module1ContentsPanel = new JPanel();
		module1ContentsPanel.setBounds(113, 62, 562, 315);
		contentPane.add(module1ContentsPanel);
		module1ContentsPanel.setLayout(cardLayout);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("topic 1");
		lblNewLabel.setBounds(254, 137, 46, 14);
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("topic 2");
		lblNewLabel_1.setBounds(249, 149, 46, 14);
		panel_2.add(lblNewLabel_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("topic 3");
		lblNewLabel_2.setBounds(246, 149, 46, 14);
		panel_3.add(lblNewLabel_2);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("topic 4");
		lblNewLabel_3.setBounds(258, 147, 46, 14);
		panel_4.add(lblNewLabel_3);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("topic 5");
		lblNewLabel_4.setBounds(269, 142, 46, 14);
		panel_5.add(lblNewLabel_4);
		
		//add the panels to the main panel where cardlayout occur
		module1ContentsPanel.add(panel_1, "panel_1");
		module1ContentsPanel.add(panel_2, "panel_2");
		module1ContentsPanel.add(panel_3, "panel_3");
		module1ContentsPanel.add(panel_4, "panel_4");
		module1ContentsPanel.add(panel_5, "panel_5");
		
		//create an array or a list to store the names of your panels
		String[] panelNames = {
			    "panel_1",
			    "panel_2",
			    "panel_3",
			    "panel_4",
			    "panel_5"
			};
		
		  //this is used to enable updating the value inside the actionlistener
		  final AtomicInteger currentPanelIndex = new AtomicInteger(0);
		JButton btnNewButton = new JButton("back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (currentPanelIndex.get() > 0) {
                    currentPanelIndex.decrementAndGet();
                    cardLayout.show(module1ContentsPanel, panelNames[currentPanelIndex.get()]);
                }
            
			}
		});
		btnNewButton.setBounds(57, 388, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("next");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (currentPanelIndex.get() < panelNames.length - 1) {
                    currentPanelIndex.incrementAndGet();
                    cardLayout.show(module1ContentsPanel, panelNames[currentPanelIndex.get()]);
                }
			}
		});
		btnNewButton_2.setBounds(610, 388, 89, 23);
		contentPane.add(btnNewButton_2);
			}
		}
	
		
	


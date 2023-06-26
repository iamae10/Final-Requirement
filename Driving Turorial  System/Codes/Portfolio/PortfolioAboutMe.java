import java.awt.Container;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;

public class PortfolioAboutMe extends PortfolioBase {
    private JPanel name, myAge, interests, book, residence,personality, program;
    private JLabel label1, label2, label3, label4, label5, label6, label7, label8, background;
    private JTextArea textArea1, textArea2;

    public PortfolioAboutMe() {
        super();
        
        //close button
        Container c = frame.getContentPane();
        c.setLayout(null);

        JButton toExit = new JButton("");
        toExit.setBounds(822, 10, 18, 21);
        toExit.setForeground(new Color(0, 0, 0));
        toExit.setBackground(new Color(0, 0, 0));

        toExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        frame.getContentPane().setLayout(null);
        
        //home button
        JButton toHome = new JButton("");
        toHome.setBounds(794, 10, 18, 21);
        toHome.setForeground(Color.BLACK);
        toHome.setBackground(new Color(128, 128, 128));
        frame.getContentPane().add(toHome);
        
        toHome.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                PortfolioHome frame = new PortfolioHome();
                frame.setVisible(true);
            }
        });
            
        //age
        myAge = new JPanel();
        myAge.setBounds(38, 44, 189, 41);
        myAge.setBackground(new Color(128, 128, 128));
        frame.getContentPane().add(myAge);
        myAge.setLayout(null);

        JButton age = new JButton("AGE");
        age.setForeground(new Color(255, 255, 255));
        age.setFont(new Font("Agency FB", Font.BOLD, 12));
        age.setBounds(10, 10, 59, 21);
        age.setContentAreaFilled(false);
        age.setBorderPainted(false);
        myAge.add(age);

        label1 = new JLabel("19");
        label1.setFont(new Font("Agency FB", Font.BOLD, 19));
        label1.setForeground(new Color(255, 255, 255));
        label1.setBounds(153, 10, 26, 18);
        myAge.add(label1);
        
        //name
        name = new JPanel();
        name.setBounds(38, 108, 189, 122);
        name.setBackground(new Color(0, 0, 0));
        frame.getContentPane().add(name);
        name.setLayout(null);

        JButton btnName = new JButton("NAME");
        btnName.setForeground(new Color(255, 255, 255));
        btnName.setBounds(53, 82, 78, 40);
        btnName.setFont(new Font("Agency FB", Font.BOLD, 18));
        btnName.setContentAreaFilled(false);
        btnName.setBorderPainted(false);
        name.add(btnName);

        label2 = new JLabel("MYKIE");         
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("Agency FB", Font.BOLD, 32));
        label2.setBounds(65, 10, 102, 34);
        name.add(label2);

        label3 = new JLabel("PATOSA");
        label3.setForeground(Color.WHITE);
        label3.setFont(new Font("Agency FB", Font.BOLD, 32));
        label3.setBounds(53, 49, 102, 34);
        name.add(label3);
        
        //interests
        interests = new JPanel();
        interests.setBounds(38, 250, 389, 130);
        interests.setBackground(new Color(61, 61, 61));
        frame.getContentPane().add(interests);
        interests.setLayout(null);

        JButton btnRecentInterests = new JButton("RECENT INTERESTS");
        btnRecentInterests.setBounds(10, 49, 161, 31);
        btnRecentInterests.setForeground(Color.WHITE);
        btnRecentInterests.setFont(new Font("Agency FB", Font.BOLD, 18));
        btnRecentInterests.setContentAreaFilled(false);
        btnRecentInterests.setBorderPainted(false);
        interests.add(btnRecentInterests);

        textArea1 = new JTextArea("WATCHING MUKBANG\nAND ACTION MOVIES\n       TAEKWONDO");
        textArea1.setWrapStyleWord(true);
        textArea1.setForeground(Color.WHITE);
        textArea1.setFont(new Font("Agency FB", Font.BOLD, 18));
        textArea1.setEditable(false);
        textArea1.setBackground(new Color(61, 61, 61));
        textArea1.setBounds(249, 29, 130, 91);
        interests.add(textArea1);
        
        //favorite book
        book = new JPanel();
        book.setBounds(247, 44, 180, 186);
        book.setBackground(new Color(128, 128, 128));
        frame.getContentPane().add(book);
        book.setLayout(null);

        JButton btnFaveBook = new JButton("FAVE BOOK");
        btnFaveBook.setBounds(10, 5, 160, 37);
        btnFaveBook.setForeground(new Color(255, 255, 255));
        btnFaveBook.setFont(new Font("Agency FB", Font.BOLD, 24));
        btnFaveBook.setContentAreaFilled(false);
        btnFaveBook.setBorderPainted(false);
        book.add(btnFaveBook);

        label4 = new JLabel(" MAGNUS CHASE:");
        label4.setForeground(Color.WHITE);
        label4.setFont(new Font("Agency FB", Font.BOLD, 30));
        label4.setBounds(10, 85, 170, 58);
        book.add(label4);

        label5 = new JLabel("SHIP OF THE DEAD");
        label5.setForeground(Color.WHITE);
        label5.setFont(new Font("Agency FB", Font.BOLD, 20));
        label5.setBounds(32, 142, 125, 34);
        book.add(label5);
        
        //residence
        residence = new JPanel();
        residence.setBounds(445, 44, 215, 336);
        residence.setBackground(new Color(61, 61, 61));
        frame.getContentPane().add(residence);
        residence.setLayout(null);

        JButton btnResidence = new JButton("RESIDENCE");
        btnResidence.setBounds(0, 10, 215, 49);
        btnResidence.setForeground(Color.WHITE);
        btnResidence.setFont(new Font("Agency FB", Font.BOLD, 26));        
        btnResidence.setContentAreaFilled(false);
        btnResidence.setBorderPainted(false);
        residence.add(btnResidence);

        textArea2 = new JTextArea("I commute to school from \nthe Guadalupe Ferry Station \nor sometimes from the \nGuadalupe MRT Station");
        textArea2.setForeground(new Color(255, 255, 255));
        textArea2.setBackground(new Color(61, 61, 61));
        textArea2.setFont(new Font("Agency FB", Font.BOLD, 20));
        textArea2.setWrapStyleWord(true);
        textArea2.setEditable(false);
        textArea2.setBounds(22, 196, 168, 116);
        residence.add(textArea2);

        label6 = new JLabel("MAKATI CITY");
        label6.setForeground(Color.WHITE);
        label6.setFont(new Font("Agency FB", Font.BOLD, 36));
        label6.setBounds(32, 128, 152, 58);
        residence.add(label6);
        
        //personality
        personality = new JPanel();
        personality.setBounds(680, 44, 132, 148);
        personality.setBackground(new Color(0, 0, 0));
        frame.getContentPane().add(personality);
        personality.setLayout(null);

        JButton btnPersonality = new JButton("PERSONALITY");
        btnPersonality.setBounds(0, 5, 132, 31);
        btnPersonality.setForeground(Color.WHITE);
        btnPersonality.setFont(new Font("Agency FB", Font.BOLD, 18));
        btnPersonality.setContentAreaFilled(false);
        btnPersonality.setBorderPainted(false);
        personality.add(btnPersonality);

        label7 = new JLabel("INTP-T");
        label7.setForeground(Color.WHITE);
        label7.setFont(new Font("Agency FB", Font.BOLD, 36));
        label7.setBounds(24, 80, 85, 58);
        personality.add(label7);
        
        //program
        program = new JPanel();
        program.setBounds(680, 212, 132, 168);
        program.setBackground(new Color(128, 128, 128));
        frame.getContentPane().add(program);
        program.setLayout(null);

        JButton btnProgram = new JButton("PROGRAM");
        btnProgram.setBounds(0, 5, 132, 31);
        btnProgram.setForeground(Color.WHITE);
        btnProgram.setFont(new Font("Agency FB", Font.BOLD, 18));
        btnProgram.setContentAreaFilled(false);
        btnProgram.setBorderPainted(false);
        program.add(btnProgram);

        label8 = new JLabel("BSCS-DF");
        label8.setForeground(Color.WHITE);
        label8.setFont(new Font("Agency FB", Font.BOLD, 36));
        label8.setBounds(10, 94, 112, 64);
        program.add(label8);
        
        //background
        background = new JLabel("");
        background.setIcon(new ImageIcon("C:\\Users\\Mykie\\OneDrive\\Documents\\NetBeansProjects\\JavaApplication2\\src\\16944506258_3981d4348d_o (1).jpg"));
        background.setBounds(0, 0, 850, 415);
        
        //visibility
        label1.setVisible(false);
        label2.setVisible(false);
        label3.setVisible(false);
        label4.setVisible(false);
        label5.setVisible(false);
        label6.setVisible(false);
        label7.setVisible(false);
        label8.setVisible(false);
        textArea1.setVisible(false);
        textArea2.setVisible(false);

        //action listeners
        age.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label1.setVisible(true);
            }
        });

        btnName.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label2.setVisible(true);
                label3.setVisible(true);
            }
        });

        btnRecentInterests.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea1.setVisible(true);
            }
        });

        btnFaveBook.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label4.setVisible(true);
                label5.setVisible(true);
            }
        });

        btnResidence.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label6.setVisible(true);
                textArea2.setVisible(true);
            }
        });

        btnPersonality.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label7.setVisible(true);
            }
        });

        btnProgram.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label8.setVisible(true);
            }
        });

        c.add(toExit);
        c.add(background);
        
        frame.setVisible(true);
    }
}

        

        
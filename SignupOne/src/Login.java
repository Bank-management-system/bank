
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener
{
    JButton login,signup,clear;
    JTextField cardTextfeild;
    JPasswordField pinTextfeild;
    Login()
    {
        setLayout(null);
        setSize(800,400);
        setLocation(350,200);
        setVisible(true);
        setTitle("Welcome to Maharashtra Bank");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("iconslogo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70,10,100,100);
        add(label);
        getContentPane().setBackground(Color.white);

        JLabel text = new JLabel("Welcome to the Bank");
        add(text);
        text.setFont(new Font("Osward",Font.BOLD,38));
        text.setBounds(200,40,400,40);

        JLabel Card_No = new JLabel("Card_No : ");
        add(Card_No);
        Card_No.setFont(new Font("Raleway",Font.BOLD,28));
        Card_No.setBounds(120,150,150,40);

        JLabel Pin = new JLabel("Pin : ");
        add(Pin);
        Pin.setFont(new Font("Raleway",Font.BOLD,28));
        Pin.setBounds(120,200,150,40);

        cardTextfeild = new JTextField();
        cardTextfeild.setBounds(300,150,250,40);
        cardTextfeild.setFont(new Font("Arial",Font.BOLD,20));
        add(cardTextfeild);

        pinTextfeild = new JPasswordField();
        pinTextfeild.setBounds(300,200,250,40);
        pinTextfeild.setFont(new Font("Arial",Font.BOLD,14));
        add(pinTextfeild);

        login = new JButton("Sign In");
        login.setBounds(300,300,100,30);
        login.setForeground(Color.BLACK);
        login.setBackground(Color.WHITE);
        login.addActionListener(this);
        add(login);

        clear = new JButton("Clear");
        clear.setBounds(430,300,100,30);
        clear.setForeground(Color.BLACK);
        clear.setBackground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);

        signup = new JButton("Sign Up");
        signup.setBounds(300,350,230,30);
        signup.setForeground(Color.BLACK);
        signup.setBackground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);
    }

    public void actionPerformed(ActionEvent ae)
    {
        if (ae.getSource()==clear)
        {
            cardTextfeild.setText("");
            pinTextfeild.setText("");
        }
        else if (ae.getSource()==login)
        {

        } else if (ae.getSource()==signup)
        {

        }

    }

    public static void main(String[]args)
    {
        new Login();
    }
}

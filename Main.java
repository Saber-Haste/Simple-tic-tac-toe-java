import javax.swing.*;
// import java.awt.*;
import java.awt.event.*;

public class Main 
{
    public static void main(String arg[])
    {
        new GameWindow();
    }

}

class GameWindow implements ActionListener
{
//buttons used to interact
JButton b11,b12,b13;
JButton b21,b22,b23;
JButton b31,b32,b33;
//name of players
JLabel pl1,pl2;
JTextField p1,p2;

//turn variable sets whos turn it is
int turn=1;
GameWindow()
{
JFrame f=new JFrame("Tic-Tac-Toe");
b11 = new JButton("*");
b12 = new JButton("*");
b13 = new JButton("*");
b21 = new JButton("*");
b22 = new JButton("*");
b23 = new JButton("*");
b31 = new JButton("*");
b32 = new JButton("*");
b33 = new JButton("*");

p1 = new JTextField();
pl1 = new JLabel("Player 1:");
p2 = new JTextField();
pl2 = new JLabel("Player 2:");
pl1.setBounds(50,30,150,50);
p1.setBounds(50,70,150,30);

pl2.setBounds(50,110,150,50);
p2.setBounds(50,150,150,30);

b11.setBounds(300,50,50,50);
b12.setBounds(360,50,50,50);
b13.setBounds(420,50,50,50);
b21.setBounds(300,110,50,50);
b22.setBounds(360,110,50,50);
b23.setBounds(420,110,50,50);
b31.setBounds(300,170,50,50);
b32.setBounds(360,170,50,50);
b33.setBounds(420,170,50,50);


b11.addActionListener(this);
b12.addActionListener(this);
b13.addActionListener(this);
b21.addActionListener(this);
b22.addActionListener(this);
b23.addActionListener(this);
b31.addActionListener(this);
b32.addActionListener(this);
b33.addActionListener(this);
f.add(b11);
f.add(b12);
f.add(b13);
f.add(b21);
f.add(b22);
f.add(b23);
f.add(b31);
f.add(b32);
f.add(b33);

f.add(p1);
f.add(p2);
f.add(pl1);
f.add(pl2);

f.setSize(1000,400);
f.setLayout(null);
f.setVisible(true);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setResizable(false);
}
public void actionPerformed(ActionEvent e)
{

}


}
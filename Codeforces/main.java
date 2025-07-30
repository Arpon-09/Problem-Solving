import javax.swing.*;

public class main {
    public static void main (String [] args) {
        JFrame jframe = new JFrame("Button Example");

        JButton jbutton = new JButton("Clcik me ");
        jbutton.setBounds(100, 100, 120, 40);

        jframe.add(jbutton);

        jframe.setSize(300, 345);
        jframe.setLayout(null);
        jframe.setVisible(true);
    }
}
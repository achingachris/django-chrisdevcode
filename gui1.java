import javax.swing.*;
import java.awt.*;

class gui1 {
    public static void main(String args[]) {
        // getting the frame
        JFrame frame = new JFrame("Type In");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 500);

        // create a menu bar
        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("File");
        JMenu m2 = new JMenu("Help");
        mb.add(m1);
        mb.add(m2);
        JMenuItem m11 = new JMenuItem("Open");
        JMenuItem m22 = new JMenuItem("Save as");
        m1.add(m11);
        m1.add(m22);

        // bottom panel
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Enter Text");
        JTextField tf = new JTextField(10); //10 characters
        JButton send = new JButton("Send");
        JButton reset = new JButton("Reset");
        panel.add(label);
        panel.add(tf);
        panel.add(send);
        panel.add(reset);

        // centering text area
        JTextArea ta = new JTextArea();

        // adding into the frame
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.NORTH, mb);
        frame.getContentPane().add(BorderLayout.CENTER, ta);
        frame.setVisible(true);


    }
}
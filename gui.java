import javax.swing.*;

class gui {
    public static void main(String args[]) {
        JFrame frame = new JFrame("Java GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        JButton button = new JButton("Press");
        frame.getContentPane().add(button);
        frame.setVisible(true);
    }
}
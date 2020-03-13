import javax.swing.*;
class click {
    public static void main(String args[]) {
        JFrame f = new JFrame(); //creating a frame

        JButton b = new JButton("CLICK");
        b.setBounds(200, 150, 200, 50); //x, y, w, h
        // b.setBounds();

        f.add(b); //add button in a frame

        f.setSize(400, 500); // h and w of the frame
        f.setLayout(null);
        f.setVisible(true);
    }
}
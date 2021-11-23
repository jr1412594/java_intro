import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;
import javax.swing.plaf.basic.BasicBorders.ButtonBorder;

public class JavaLessonTwenty extends JFrame {

    public static void main(String[] args) {

        new JavaLessonTwenty();


        
    }

    public JavaLessonTwenty() {
        this.setSize(400, 400);

        this.setLocationRelativeTo(null);

        //// comented code does the same as setLocationRelativeTo(null)
        // Toolkit tk = Toolkit.getDefaultToolkit();

        // Dimension dim = tk.getScreenSize();

        // int xPos = (dim.width / 2) - (this.getWidth() / 2);
        // int yPos = (dim.height / 2) - (this.getHeight() / 2);

        // this.setLocation(xPos, yPos);

        this.setResizable(false); // will stop people from being able to resize.
        
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.setTitle("Welcome to good burger");
        
        JPanel thePanel1 = new JPanel();

    
        JLabel label1 = new JLabel("All That");    
        thePanel1.add(label1);
        
        
        JButton theButton = new JButton("Click me");
        thePanel1.add(theButton);
        
        JTextField textField1 = new JTextField("Enter text", 15);
        textField1.setRequestFocusEnabled(true);
        thePanel1.add(textField1);
        
        JTextArea textArea1 = new JTextArea(15, 20);
        textArea1.setText("This is where you add your novel \n");
        textArea1.setLineWrap(true);
        textArea1.setWrapStyleWord(true);

        textArea1.append("\nDon't put it all on the line though!");

        JScrollPane scrollBar1 = new JScrollPane(textArea1, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        thePanel1.add(scrollBar1);
        
        this.add(thePanel1);
        
        this.setVisible(true);

        textField1.requestFocus();

    }
}
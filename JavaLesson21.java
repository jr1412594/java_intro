import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;

import java.awt.event.*;

public class JavaLesson21 extends JFrame {

    JButton button1;
    JButton button2;
    JTextField textField1;
    JTextArea textArea1;
    JLabel label1;
    int buttonClicked = 0;


    public static void main(String[] args) {

        new JavaLesson21();
    }   

    public JavaLesson21() {
        // this = this JFrame;
        // set size of fram width and height
        this.setSize(400, 400);
        // set location. below will center on screen
        // can set it to different locations
        this.setLocationRelativeTo(null);
        // Sets the frame to close when prompted
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setTitle("This is the J frame");

        JPanel thePanel = new JPanel();

        label1 = new JLabel("My J Frame Title");
        thePanel.add(label1);

        button1 = new JButton("Click Counter");
        button1.setName("Button 1");
        thePanel.add(button1);

        button2 = new JButton("Clear Text Area");
        
        button2.addActionListener(new ListenForButton());
        // ListenForButton lForButton = new ListenForButton();
        button1.addActionListener(new ListenForButton());
        
        textField1 = new JTextField("Type Here!");
        textField1.setName("O.G. Text Field");
        
        textField1.addKeyListener(new ListenForKeys());
        thePanel.add(textField1);

        ListenForFocus lforFocus = new ListenForFocus();
        textField1.addFocusListener(lforFocus);
        
        thePanel.add(button2);

        textArea1 = new JTextArea(20,25);
        textArea1.setLineWrap(true);
        textArea1.setWrapStyleWord(true);

        JScrollPane scrollBar1 = new JScrollPane(textArea1, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        thePanel.add(scrollBar1);

        this.add(thePanel);
        this.setVisible(true);
    }

    private class ListenForButton implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            
            // String source = e.getSource().getClass().getSimpleName().toString();
            
            if(e.getSource() == button1) {
                
                buttonClicked++;
                textArea1.append("Button has been clicked " + buttonClicked + " Times.\n");
                // textArea1.append(source + "/n");
            
            } else if (e.getSource() == button2) {
                buttonClicked = 0;
                textArea1.setText("");
            }
        }

    }

    private class ListenForKeys implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void keyPressed(KeyEvent e) {
            char pressed = e.getKeyChar();
            textArea1.append("the key " + pressed + " has beentyped! \n");
        }

        @Override
        public void keyReleased(KeyEvent e) {
            // TODO Auto-generated method stub
            
        }

    }

    private class ListenForFocus implements FocusListener {

        @Override
        public void focusGained(FocusEvent e) {
            textArea1.append("The " + e.getComponent().getName().toString() + " Has gained focus." );
            
        }

        @Override
        public void focusLost(FocusEvent e) {
            // TODO Auto-generated method stub
            
        }

    }
}
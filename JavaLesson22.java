import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;

import javax.swing.event.ChangeEvent;

import javax.swing.event.ChangeListener;

import java.text.NumberFormat;

import javax.swing.border.*;

public class JavaLesson22 extends JFrame {

    JButton button1;
    JLabel label1, label2, label3;
    JTextField textField1, textField2;
    JCheckBox dollarSign, commaSeparator;
    JRadioButton addNums, subtractNums, multNums, divideNums;
    JSlider howManyTimes;

    double number1, number2, totalCalc;

    public static void main(String[] args) {

        new JavaLesson22();

    }

    public JavaLesson22() {

        this.setSize(400, 400);

        this.setLocationRelativeTo(null);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setTitle("BAMF Frame");

        JPanel thePanel = new JPanel();

        button1 = new JButton("Calculate");

        ListenForButton lForButton = new ListenForButton();
        button1.addActionListener(lForButton);
        button1.addActionListener(new ListenForButton());
        thePanel.add(button1);

        label1 = new JLabel("Number 1");
        
        thePanel.add(label1);

        textField1 = new JTextField("", 5);

        thePanel.add(textField1);

        label2 = new JLabel("Number 2");

        thePanel.add(label2);

        textField2 = new JTextField("",5);

        thePanel.add(textField2);

        dollarSign = new JCheckBox("Dollars");
        commaSeparator = new JCheckBox("Commas");
        commaSeparator.setSelected(true);
        
        thePanel.add(dollarSign);
        thePanel.add(commaSeparator);
        
    
        addNums = new JRadioButton("Add");
        subtractNums = new JRadioButton("Subtract");
        multNums = new JRadioButton("Multiply");
        divideNums = new JRadioButton("Divide");
        
        thePanel.add(addNums);
        thePanel.add(subtractNums);
        thePanel.add(multNums);
        thePanel.add(divideNums);

        ButtonGroup operation = new ButtonGroup();

        operation.add(addNums);
        operation.add(subtractNums);
        operation.add(multNums);
        operation.add(divideNums);

        JPanel operPanel = new JPanel();

        Border operBorder = BorderFactory.createTitledBorder("Operation");
        // Border operBorder = BorderFactory.createRaisedBevelBorder();
        // Border operBorder = BorderFactory.createBevelBorder(BevelBorder.RAISED, Color.RED, Color.BLACK);
        
        operPanel.setBorder(operBorder);

        operPanel.add(addNums);
        operPanel.add(subtractNums);
        operPanel.add(multNums);
        operPanel.add(divideNums);
        
        addNums.setSelected(true);

        thePanel.add(operPanel);

        label3 = new JLabel("Perform How Many Times?");
        thePanel.add(label3);

        howManyTimes = new JSlider(0, 100, 1);

        howManyTimes.setMinorTickSpacing(5);

        howManyTimes.setMajorTickSpacing(20);

        howManyTimes.setPaintTicks(true);

        howManyTimes.setPaintLabels(true);

        ListenForSlider lForSlider = new ListenForSlider();
        howManyTimes.addChangeListener(lForSlider);

        thePanel.add(howManyTimes);

        this.add(thePanel);
        this.setVisible(true);

        textField1.requestFocus();
    }

    private class ListenForButton implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == button1) {

                try {
                    number1 = Double.parseDouble(textField1.getText());
                    number2 = Double.parseDouble(textField2.getText());
                }
                catch(NumberFormatException except) {
                    JOptionPane.showMessageDialog(JavaLesson22.this, "Those are not numbers", "Error", JOptionPane.ERROR_MESSAGE);
                    System.exit(0);
                }
            }
            
        }

    }

    private class ListenForSlider implements ChangeListener {

        @Override
        public void stateChanged(ChangeEvent e) {
            // TODO Auto-generated method stub
            
        }

    }
}

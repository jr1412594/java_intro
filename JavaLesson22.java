import javax.swing.*;


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

    JTextArea textArea1;

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

        textArea1 = new JTextArea(5,5);

        thePanel.add(textArea1);

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

                if (addNums.isSelected()) {
                    totalCalc = addNumbers(number1, number2, howManyTimes.getValue()); 
                } 
                // else if (subtractNums.isSelected()) {
                //     totalCalc = subtracNumbers(number1, number2, howManyTimes.getValue());
                // } else if (multNums.isSelected()) {
                //     totalCalc = multiplyNumbers(number1, number2, howManyTimes.getValue());
                // } else {
                //     totalCalc = divdeNumbers(number1, number2, howManyTimes.getValue());
                // }
        
            }

            if (dollarSign.isSelected()) {
                NumberFormat numFormat = NumberFormat.getCurrencyInstance();
                JOptionPane.showMessageDialog(JavaLesson22.this, numFormat.format(totalCalc), "Solution", JOptionPane.INFORMATION_MESSAGE);
            } else if (commaSeparator.isSelected()) {
                NumberFormat numFormat = NumberFormat.getNumberInstance();
                JOptionPane.showMessageDialog(JavaLesson22.this, numFormat.format(totalCalc), "Solution", JOptionPane.INFORMATION_MESSAGE);
            } else {
                // NumberFormat numFormat = NumberFormat.getNumberInstance();
                JOptionPane.showMessageDialog(JavaLesson22.this, totalCalc, "Solution", JOptionPane.INFORMATION_MESSAGE);
            }
            
        }

    }

    // static int addNumbers(double number1, double number2, int times) {
    //     int xNum = (int) Math.round(number1);
    //     int yNum = (int) Math.round(number2);
    //     return (xNum + yNum) * times;
    // }

    private class ListenForSlider implements ChangeListener {

        @Override
        public void stateChanged(ChangeEvent e) {
            
            if(e.getSource() == howManyTimes) {
                label3.setText("Perform How Many TImes? " + howManyTimes.getValue());
            }
            
        }

    }

    public static double addNumbers(double number1, double number2, int howManyTimes) {

        double total = 0;

        int i = 1;

        while (i <= howManyTimes) {
            total = total + (number1 + number2);
            i++;
        }
        return total;
    }
    public static double subtractNumbers(double number1, double number2, int howManyTimes) {

        double total = 0;

        int i = 1;

        while (i <= howManyTimes) {
            total = total + (number1 - number2);
            i++;
        }
        return total;
    }
    public static double multiplyNumbers(double number1, double number2, int howManyTimes) {

        double total = 0;

        int i = 1;

        while (i <= howManyTimes) {
            total = total + (number1 * number2);
            i++;
        }
        return total;
    }
    public static double divideNumbers(double number1, double number2, int howManyTimes) {

        double total = 0;

        int i = 1;

        while (i <= howManyTimes) {
            total = total + (number1 / number2);
            i++;
        }
        return total;
    }

}

 import java.awt.*;
import java.awt.event.*;

public class Labnine extends Frame implements ActionListener {
    // Components
   TextField tf;
    String operator = "";
    double n1,n2, result;
     boolean hasDecimal=false;
    public Labnine() {
        // Frame settings
        setTitle("Calculator");
        setSize(400, 500);
        setLayout(new GridLayout(5, 4,2,2));

        // Create text field
        tf = new TextField();
        tf.setEditable(false);
        tf.setBackground(Color.cyan);
        add(tf);

        // Button labels
        String[] labels = {
            "AC","/","*","7",
           "8","9", "C","6",
           "5","4","-","3",
           "2","1","+","%",
           "0",".","="
        };

        // Create buttons
        Button b;

        for(String label:labels) {
             b =new Button(label);
            b.addActionListener(this);
            b.setBackground(Color.orange);
            b.setFont(new Font("Arial", Font.PLAIN, 18)); 
            add(b);
        }
     
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String buttonText = e.getActionCommand();

        if (buttonText.matches("[0-9]")) { 
        
            tf.setText(tf.getText() + buttonText);

        } else if(buttonText.equals(".")){
            if(!hasDecimal){
            tf.setText(tf.getText()+".");
            hasDecimal=true;
            }
        } else if(buttonText.equals("C")){
           String clear=tf.getText();
           if(!clear.isEmpty()){
            tf.setText(clear.substring(0,clear.length()-1));
            if(!tf.getText().contains(".")){
                hasDecimal=false;
            }
           }
        
    }else if (buttonText.equals("AC")) { // Clear everything
            tf.setText("");
          n1=n2=result=0;
            operator = "";
            hasDecimal=false;
        } else if(buttonText.equals("=")){
            
               n2 = Double.parseDouble(tf.getText());
            switch (operator) {
                case "+": result = n1+n2; break;
                case "-": result = n1-n2; break;
                case "*": result = n1*n2; break;
                case "/": result = n1/n2; break;
                case "%":result = n1%n2; break;
            }
            tf.setText(String.valueOf(result));
       }else{
        n1=Double.parseDouble(tf.getText());
        operator=buttonText;
        tf.setText("");
       }
        
    
    
    }
    public static void main(String[] args) {
        new Labnine();
    }
}
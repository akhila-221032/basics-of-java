/*import java.awt.*;
class Eventhandling{
Eventhandling(){
Frame f=new Frame();
Button b=new Button("click me");
b.setBounds(30,50,80,70);
f.add(b);
f.setSize(400,400);
f.setLayout(null);
f.setVisible(true);
}
public static void main(String[] args){
Eventhandling f1=new Eventhandling();
}
}
//............................................
import java.awt.*;
class Eventhandling{
public static void main(String[] args){
//label
Frame f=new Frame("label example");
Label l1,l2;
l1=new Label("first lablel");
l1.setBounds(50,100,100,30);
l2=new Label("second label");
l2.setBounds(50,150,100,30);
f.add(l1);
f.add(l2);
TextField t1,t2;
t1=new TextField("enter your name");
t1.setBounds(200,100,200,30);
t2=new TextField("enter yourpassword");
t2.setBounds(200,150,200,30);
f.add(t1);
f.add(t2);
f.setSize(400,500);
f.setLayout(null);
f.setVisible(true);
}
}
//..................................................


import java.awt.*;

class Eventhandling {
    Eventhandling() {
        Frame frame = new Frame();
        frame.setTitle("Registration Form");
        frame.setSize(500, 600);
        frame.setVisible(true);
        frame.setBackground(Color.cyan);
        frame.setLayout(null);

        TextField nameField = new TextField("Enter your Name:");
        nameField.setBounds(60, 50, 200, 30);
        frame.add(nameField);
	
TextField  cou = new TextField ("Enter Father name:");
        cou.setBounds(380, 50, 200, 30);
        frame.add(cou);

TextField  course = new TextField ("Enter Mother name:");
        course.setBounds(380, 100, 200, 30);
        frame.add(course);


        
        Label idLabel = new Label("Enter your ID:");
        idLabel.setBounds(60, 100, 200, 30);
        frame.add(idLabel);
TextField idField = new TextField();
        idField.setBounds(60, 130, 200, 30);
        frame.add(idField);
TextField name = new TextField("Enter University Name:");
        name.setBounds(60, 180, 230, 30);
        frame.add(name);

        Label genderLabel = new Label("ENTER YOUR GENDER:");
        genderLabel.setBounds(60, 230, 200, 30);
        frame.add(genderLabel);

        CheckboxGroup Group = new CheckboxGroup();
        Checkbox male = new Checkbox("MALE", true, Group);
        male.setBounds(60, 250, 100, 30);
        frame.add(male);

        Checkbox female = new Checkbox("FEMALE", false, Group);
        female.setBounds(200, 250, 100, 30);
        frame.add(female);

        
        Label courseLabel = new Label("Enter your Language:");
        courseLabel.setBounds(380, 190, 150, 30);
        frame.add(courseLabel);

        Checkbox cs = new Checkbox("Telugu");
        cs.setBounds(390, 230, 100, 30);
        frame.add(cs);

        Checkbox ec = new Checkbox("English");
        ec.setBounds(390, 260, 100, 30);
        frame.add(ec);

        Checkbox ee = new Checkbox("Hindhi");
        ee.setBounds(390, 300, 100, 30);
        frame.add(ee);

Label l = new Label("Create password:");
        l.setBounds(390, 350, 100, 30);
        frame.add(l);
        TextField password = new TextField();
        password.setEchoChar('.'); 
        password.setBounds(390, 390, 150, 30);
        frame.add(password);

 TextField pass = new TextField("Enter email");
       
        pass.setBounds(390, 450, 150, 30);
        frame.add(pass);

  Label addressLabel = new Label("Enter your address:");
        addressLabel.setBounds(60, 340, 200, 30);
        frame.add(addressLabel);

        TextArea addressField = new TextArea();
        addressField.setBounds(20, 370, 300, 100);
        frame.add(addressField);

  Label j= new Label("Enter your Branch:");
        j.setBounds(60, 480, 200, 30);
        frame.add(j);

	
Choice c=new Choice();
c.add("CSE");
c.add("ECE");
c.add("CIVIL");
c.add("EEE");
c.add("MECH");
c.add("MME");
c.setBounds(50,510,150,30);
frame.add(c);

Button b1=new Button();
b1.setLabel("Submit");
b1.setBackground(Color.green);
b1.setBounds(390,560,100,30);
frame.add(b1);
Button b2=new Button();
b2.setLabel("Reset");
b2.setBackground(Color.red);
b2.setBounds(200,560,100,30);
frame.add(b2);


}
    public static void main(String[] args) {
        Eventhandling eventhandling = new Eventhandling();
    }
}*/

//..............................................
import java.awt.*;
import java.awt.event.*;
class Eventhandling extends Frame {
    Eventhandling() {
        setTitle("GRID layout");
        setSize(500, 600);
        setVisible(true);
        setBackground(Color.cyan);
        setLayout(null);
        setForeground(Color.red);
	GridLayout f=new GridLayout(3,3,5,5);
	setLayout(f);
	Button b1=new Button("1");
	Button b2=new Button("2");
	Button b3=new Button("3");
Button b4=new Button("4");
Button b5=new Button("5");
Button b6=new Button("6");
Button b7=new Button("7");
Button b8=new Button("8");
Button b9=new Button("9");
add(b1);
add(b2);
add(b3);
add(b4);
add(b5);
add(b6);
add(b7);
add(b8);
add(b9);
addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent we) {
System.exit(0);
}
}
);
}
 
    public static void main(String[] args) {
        Eventhandling eventhandling = new Eventhandling();
    }
}

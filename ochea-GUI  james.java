import java.awt.*;
import javax.swing.*;

public class james{
  public static void main(String[] args) {
        JFrame frame = new JFrame("Hello Friday");
         frame.setSize(500,600);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setLayout(new FlowLayout(FlowLayout.LEFT,20,10));

         JLabel lblName = new JLabel ("Name:");
         JTextField txtname = new JTextField(30);

         JLabel lblAge = new JLabel ("Age:");
         JTextField txtAge = new JTextField(30);

         JLabel lblYear = new JLabel("Year level:");
         String[] yearlevels = {
                 "Select Year Level","1st year","2nd year","3rd year","4th year"
         };

         JComboBox<String> cmbYear = new JComboBox<>(yearlevels);


          JLabel lblmultiple = new JLabel ("Multiple Choice :");
          JRadioButton a = new JRadioButton("BSIT-2A");
          JRadioButton b = new JRadioButton("BSIT-2B");
           JRadioButton c = new JRadioButton("BSIT-2C");
            JRadioButton d = new JRadioButton("BSIT-D"); 

            ButtonGroup multiplechoice = new ButtonGroup();
            multiplechoice.add(a);
             multiplechoice.add(b);
              multiplechoice.add(c);
               multiplechoice.add(d);
     
              JLabel lblmenu = new JLabel("Available Love");
              JCheckBox v1  = new JCheckBox("Sick");
              JCheckBox v2  = new JCheckBox("Warm");
              JCheckBox v3  = new JCheckBox("Cold");
              JCheckBox v4  = new JCheckBox("Strong");

              JLabel lbladdress = new JLabel("Address");
              JTextArea txtaddress = new JTextArea(5,30);
              
              txtaddress.setLineWrap(true);
              txtaddress.setWrapStyleWord(true);

              JButton btnStart = new JButton("Start");
              JButton btnFinish = new JButton("Finish");
             

         
              frame.add(lblName);
              frame.add(txtname);
              frame.add(lblAge);
              frame.add(txtAge);
              frame.add(lblYear);
              frame.add(cmbYear);
              frame.add(lblmultiple);
              frame.add(a);
              frame.add(b);
              frame.add(c);
              frame.add(d);
              frame.add(lblmenu);
              frame.add(v1);
              frame.add(v2);
              frame.add(v3);
              frame.add(v4);
              frame.add(lbladdress);
              frame.add(txtaddress);
              frame.add(btnStart);
              frame.add(btnFinish);
                
              btnStart.addActionListener(e ->{
                  String name = txtname.getText().trim();
                  String AgeText = txtAge.getText().trim();
                  String year = cmbYear.getSelectedItem().toString();
                  String choice = multiplechoice.toString();
                  if (a.isSelected()){
                   choice  = "BSIT-2A";
                  }else if (b.isSelected()){
                   choice = "BSIT-2B";
                  }else if (c.isSelected()){
                   choice = "BSIT-2C";
                  }else if (d.isSelected()){
                   choice = "BSIT-2D";
                  }
                 
                String menu = "";
                if (v1.isSelected()){
                    menu += "Sick";
                }   
                if (v2.isSelected()){
                    menu += "Warm";
                }   
                if (v3.isSelected()){
                    menu += "Cold";
                }   
                if (v4.isSelected()){
                    menu += "Strong";
                }   



        



               
               menu = menu.substring(0,menu.length() -2);
            
                String message = "DATA ENTRY\n\n" + "NAME: " + name + "\nAge: " + AgeText + "\nYear: " + year + "\nMultiple: " + choice + "\nMenu: " + menu;

             JOptionPane.showMessageDialog(frame,message);

               

              });




      frame.setVisible(true);

  }
    
}




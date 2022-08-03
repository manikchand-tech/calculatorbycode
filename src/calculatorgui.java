import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculatorgui implements ActionListener {

    JFrame frame;
    JLabel title;
    JLabel label1;
    JLabel label2;
    JTextField tf1;
    JTextField tf2;
    JTextField result;
    JButton addbtn;
    JButton subbtn;
    JButton probtn;
    JButton divbtn;


    calculatorgui(){

        frame=new JFrame();
        title =new JLabel();
        label1=new JLabel();
        label2=new JLabel();
        tf1=new JTextField();
        tf2=new JTextField();
        result =new JTextField();
        addbtn=new JButton();
        subbtn=new JButton();
        probtn=new JButton();
        divbtn=new JButton();

       frame.setVisible(true);

       frame.setLayout(null);
        frame.setSize(600,600);

        frame.add(title);
        frame.add(label1);
        frame.add(label2);
        frame.add(tf1);
        frame.add(tf2);
        frame.add(result);
        frame.add(addbtn);
        frame.add(subbtn);
        frame.add(probtn);
        frame.add(divbtn);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);



         title.setBounds(650,50,100,50);
         title.setText("CALCULATOR");

 label1.setBounds(250,250,140,80);
 label1.setText("   Enter First Number :");


        label2.setBounds(250,400,140,80);


        label2.setText("Enter Second Number :");

        tf1.setBounds(450,250,140,30);
        tf2.setBounds(450,400,140,30);

        addbtn.setBounds(350,500,90,50);
        subbtn.setBounds(450,500,90,50);
        probtn.setBounds(550,500,90,50);
        divbtn.setBounds(650,500,90,50);
        addbtn.setText("+");
        subbtn.setText("-");
        probtn.setText("*");
        divbtn.setText("/");


        result.setBounds(450,600,90,30);
        result.setText("result");
addbtn.addActionListener(this);
subbtn.addActionListener(this);
probtn.addActionListener(this);
divbtn.addActionListener(this);


    }





    public static void main(String[] args) {



        calculatorgui gu = new calculatorgui();



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==addbtn){


            int a= Integer.parseInt(tf1.getText());

            int b=Integer.parseInt(tf2.getText());
            int sum=a+b;

            result.setText(""+sum);




        }

        else if (e.getSource()==subbtn){
            int a= Integer.parseInt(tf1.getText());

            int b=Integer.parseInt(tf2.getText());
            int sub=a-b;

            result.setText(""+sub);



        }
else if (e.getSource()==probtn){
            int a= Integer.parseInt(tf1.getText());

            int b=Integer.parseInt(tf2.getText());
            int pro=a*b;

            result.setText(""+pro);

        }

else if (e.getSource()==divbtn){
            float a= Float.parseFloat(tf1.getText());

            float b=Float.parseFloat(tf2.getText());
            float div=a/b;

            result.setText(""+div);



        }

    }
}
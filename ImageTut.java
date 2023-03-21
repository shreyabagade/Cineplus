import java.awt.*;
import javax.swing.*;
public class ImageTut extends JFrame
{
  private ImageIcon image1;
  private JLabel label1;
  private ImageIcon image2;
  private JLabel label2;
   private ImageIcon image3;
  private JLabel label3;
  private ImageIcon image4;
  private JLabel label4;
  private ImageIcon image5;
  private JLabel label5;
  private ImageIcon image6;
  private JLabel label6;
   private ImageIcon image7;
  private JLabel label7;
  private ImageIcon image8;
  private JLabel label8;
  private ImageIcon image9;
  private JLabel label9;
  ImageTut(){
	  setLayout(new FlowLayout());
    image1=new ImageIcon(getClass().getResource("godfat.jpg"));
	label1=new JLabel(image1);
	add(label1);
	image2=new ImageIcon(getClass().getResource("kantara3.jpg"));
	label2=new JLabel(image2);
	add(label2);
	image3=new ImageIcon(getClass().getResource("vikramvedha.jpg"));
	label3=new JLabel(image3);
	add(label3);
	image4=new ImageIcon(getClass().getResource("brah1.jpg"));
	label4=new JLabel(image4);
	add(label4);
	image5=new ImageIcon(getClass().getResource("ps11.jpg"));
	label5=new JLabel(image5);
	add(label5);
	image6=new ImageIcon(getClass().getResource("avatar.jpg"));
	label6=new JLabel(image6);
	add(label6);
	image7=new ImageIcon(getClass().getResource("ramsetu.jpg"));
	label7=new JLabel(image7);
	add(label7);
	image8=new ImageIcon(getClass().getResource("ticketop.jpg"));
	label8=new JLabel(image8);
	add(label8);
	image9=new ImageIcon(getClass().getResource("blackadam.jpg"));
	label9=new JLabel(image9);
	add(label9);
	
	
  }
  public static void main(String args[])
  {
	  JFrame f = new JFrame(); // Creation of a JFrame object named as f       
	  f.getContentPane().setBackground(Color.CYAN);
         //METHOD-2 : Using Color Constructors
        Color color=new Color(255, 239 ,213);
        f.getContentPane().setBackground(color);
	  ImageTut gui = new ImageTut();
	  gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  gui.setVisible(true);
	  gui.pack();
	  gui.setTitle("Image Program");
	  
	  
  }
}
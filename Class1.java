//import java.util.*;
import java.awt.*;
import javax.swing.*;
	public class Class1 extends JFrame{
			Font BigFont =new Font("Serif", Font.ITALIC,48);
			String hello="Hello";
		public void paint(Graphics brush){
				super.paint(brush);
				brush.setFont(BigFont);
				brush.drawString(hello,10,100);
			}
		public static void main(String[] args){
			Class1 frame=new Class1();
			frame.setSize(180,150);
			frame.setVisible(true);
			
		}
	}
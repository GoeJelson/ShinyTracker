import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;
/* 
Joseph Nelson
This is a simple program that goes along with a pokemon game
The idea is that it is a tracker which allows to see how many times you've encountered a regular pokemon
It also allows you to enter the name of the pokemon you are tracking for example Pikachu 
One of the final pieces allows you to actually track if it was a shiny or not. 
*/ 

class Pokemon {
	private String name; 
	private int count = 0; 
	private String isShiny;
	private boolean shiny = false;
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public int getCount(){
		return count;
	}
	public void setCount(int count){
		this.count = count + 1;
	}
	public String getIsShiny(){
		return isShiny;
	}
	public void setIsShiny(){
		if(shiny = true){
			this.isShiny = "is shiny";
		} else {
			this.isShiny = "is not shiny";
		}
	}
	public boolean getShiny(){
		return shiny;
	}
	public void setShiny(){
		this.shiny = true;
	}
	@Override
	public String toString() {
		return String.format("%s %s this is the %d encounter!", getName(), getIsShiny(), getCount());
	}
}


class ShinyFrame extends JFrame {

	public void configureMenu(){
		JMenuBar bar = new JMenuBar();
		JMenu mnuFile = new JMenu("File");
		JMenuItem miExit = new JMenuItem("Exit");
		miExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnuFile.add(miExit);
		bar.add(mnuFile);
		setJMenuBar(bar);
	}
	public void configureUI() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100,100,500,500);
		setTitle("Shiny Tracker");
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		JPanel pan = new JPanel();
		c.add(pan,BorderLayout.CENTER);
		JPanel panSouth = new JPanel();
		panSouth.setLayout(new FlowLayout());
		JLabel lblPointSize = new JLabel("Point Size");
		c.add(panSouth,BorderLayout.SOUTH);
		configureMenu();
	}
	public ShinyFrame() {
		configureUI();
	}
}

public class ShinyTracker {
	public static void main(String[] args){
		ShinyFrame sf = new ShinyFrame();
		sf.setVisible(true);
	}
}
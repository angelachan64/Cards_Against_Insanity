import java.awt.image.*;
import java.awt.event.*;
import javax.imageio.*;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.io.*;

class store extends JFrame implements ActionListener{
    private Container store;
    private JPanel buy,sell;
    private JButton
    
    public static void main(String[] args){
	store s = new store();
	s.setVisible(true);
    }

    public store(){
	setTitle("Welcome to the store!");
	setSize(600,600);
	setLocation(400,50);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}

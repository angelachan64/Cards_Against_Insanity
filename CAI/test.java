import java.awt.image.*;
import java.awt.event.*;
import javax.imageio.*;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.io.*;

public class test extends JFrame implements ActionListener{
    private Container window;
    private JPanel main,sidebar;

    public static void main(String[] args){
	test t = new test();
    }

    public test(){
	setTitle("Testing out Border Layout");
	setSize(1000,800);
	setLocation(400,50);
	setDefaultCloseOperation(EXIT_ON_CLOSE);

	window = getContentPane();
	BorderLayout BL = new BorderLayout();
	window.setLayout(new BorderLayout(0,800));
	BL.setVgap(10);
    }

    public void actionPerformed(ActionEvent e){

    }
}

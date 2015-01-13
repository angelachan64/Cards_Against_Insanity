import java.awt.image.*;
import java.awt.event.*;
import javax.imageio.*;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.io.*;

public class game extends JFrame{
    private Container jonjo;
    private JPanel canvas;
    private BufferedImage background,character;
    private JTextArea name,entername;
    private JButton Submit;

    public game(){
	setTitle("Cards Against Insanity");
	setSize(800,800);
	setLocation(400,50);
	setDefaultCloseOperation(EXIT_ON_CLOSE);

	jonjo = getContentPane();
	//jonjo.setLayout(new FlowLayout());
	setVisible(true);

	//canvas.setPreferredSize(new Dimension(600,600));
        //canvas.setBackground(Color.BLUE);
	try{
	    background = ImageIO.read(new File("background.jpg"));
	    //canvas = new JPanel(new ImageIcon(background));
	    //character = ImageIO.read(new File("character.png"));
	    //canvas = new Canvas();
	} catch(IOException e){
	}
	canvas = new Canvas();
	jonjo.add(canvas);
	name = new JTextArea();
	name.append("What is your name?");
	name.setColumns(20);
	name.setRows(1);
	name.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	name.setEditable(false);
	canvas.add(name);
	entername = new JTextArea();
	entername.setColumns(20);
	name.setRows(1);
	name.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	entername.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	canvas.add(entername);

	Submit = new JButton("Submit");
	canvas.add(Submit);
    }

    public void actionPerformed(ActionEvent e) {
	if (e.getSource() == Submit) {

	}
    }

    private class Canvas extends JPanel{
	public void paintComponent(Graphics g){
	    super.paintComponent(g);
	    //g.setColor(Color.blue);
	    canvas.setPreferredSize(new Dimension(600,600));
	    g.drawImage(background,0,0,getWidth(),getHeight(),null);
	    //g.drawImage(character,300,450,null);
	    //canvas.setPreferredSize(new Dimension(600,600));
	}
    }


    public static void main(String[] args){
	game g = new game();
	g.setVisible(true);
    }
}

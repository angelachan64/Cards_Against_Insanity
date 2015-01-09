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

    public game(){
	setTitle("Cards Against Insanity");
	setSize(800,800);
	setLocation(400,50);
	setDefaultCloseOperation(EXIT_ON_CLOSE);

	jonjo = getContentPane();
	jonjo.setLayout(new FlowLayout());
	setVisible(true);

	//canvas.setPreferredSize(new Dimension(600,600));
        //canvas.setBackground(Color.BLUE);
	try{
	    image = ImageIO.read(new File("background.jpg"));
	} catch(IOException e){
	}
	jonjo.add(canvas);
    }

    /*private class Canvas extends JPanel{
	public void paintComponent(Graphics g){
	    super.paintComponent(g);
	    g.setColor(Color.blue);
	}
    }*/

    public static void main(String[] args){
	game g = new game();
	g.setVisible(true);
    }
}

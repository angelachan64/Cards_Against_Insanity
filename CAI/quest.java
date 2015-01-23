import java.awt.image.*;
import java.awt.event.*;
import javax.imageio.*;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.io.*;

public class quest extends JFrame implements ActionListener, MouseListener{
    private Container battle;
    private JPanel canvas,panel1,panel2;
    private JButton start;
    private int wave;
    //private int questlevel;
    //maxwaves is the same as quest level.

    public quest() {
	try {
	    FileInputStream saveFile = new FileInputStream("questsave.txt");
	    ObjectInputStream restore = new ObjectInputStream(saveFile);
	    questlevel = (int) restore.readObject();
	    restore.close();
	} catch (Exception exc) {
	}
	    
	setTitle("Time to d-d-d-d-duel!");
	setSize(800,800);
	setLocation(400,50);
	setDefaultCloseOperation(EXIT_ON_CLOSE);

	battle = getContentPane();
	setVisible(true);

	questlevel = 1;

	canvas = new Canvas();
	battle.add(canvas);
	start = new JButton("Start");
	start.addActionListener(this);
	canvas.add(start);
	

	try {
	    FileOutputStream saveFile = new FileOutputStream("questsave.txt");
	    ObjectOutputStream save = new ObjectOutputStream(saveFile);
	    save.writeObject(questlevel);
	    save.close();
	} catch (Exception exc) {
	}
    }

    public void mouseExited(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseClicked(MouseEvent e) {
    }

    public void actionPerformed(ActionEvent e) {
	if (e.getSource() == start) {
	}
    }

    private class Canvas extends JPanel{
	public void paintComponent(Graphics g){
	    super.paintComponent(g);
	    canvas.setPreferredSize(new Dimension(500,500));
	    canvas.setBorder(BorderFactory.createLineBorder(Color.black));
	}
    }

    public static void main(String[] args){
	quest q = new quest();
	q.setVisible(true);
    }
}

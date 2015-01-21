import java.awt.image.*;
import java.awt.event.*;
import javax.imageio.*;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.io.*;

public class game extends JFrame implements ActionListener{
    private Container jonjo;
    private JPanel canvas,toolbar;
    private BufferedImage background,character;
    private JTextArea text,entername;
    private JButton Submit,confirm,deny,inventory,quests,store;
    private String player;
    private int panda;

    Random r = new Random();

    public game(){
	setTitle("Cards Against Insanity");
	setSize(1000,800);
	setLocation(400,50);
	setDefaultCloseOperation(EXIT_ON_CLOSE);

	jonjo = getContentPane();
	//jonjo.setLayout(new FlowLayout());
	//jonjo.setLayout(null);
	jonjo.setLayout(new BorderLayout(0,800));
	//jonjo.setSize(1000,800);
	setVisible(true);

	//canvas.setPreferredSize(new Dimension(600,600));
        //canvas.setBackground(Color.BLUE);
	try{
	    background = ImageIO.read(new File("background.jpg"));
	    //canvas = new JPanel(new ImageIcon(background));
	    character = ImageIO.read(new File("character.png"));
	    //canvas = new Canvas();
	} catch(IOException e){
	}
	canvas = new Canvas();
	//canvas.setPreferredSize(new Dimension(800,800));
	jonjo.add(canvas);


	text = new JTextArea();
	text.setText("What is your name?");
	text.setColumns(20);
	text.setRows(1);
	text.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	text.setEditable(false);
	canvas.add(text);

	entername = new JTextArea();
	entername.setColumns(20);
	entername.setLineWrap(true);
	text.setRows(1);
	text.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	//entername.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	canvas.add(entername);

	Submit = new JButton("Submit");
	Submit.addActionListener(this);
	canvas.add(Submit);
	confirm = new JButton("Yes");
	confirm.addActionListener(this);
	confirm.setVisible(false);
	deny = new JButton("No");
	deny.addActionListener(this);
	deny.setVisible(false);
	canvas.add(deny);
	canvas.add(confirm);

	toolbar.setPreferredSize(new Dimension(200,800));
	toolbar.setBackground(Color.BLACK);
	jonjo.add(toolbar);

	inventory = new JButton("Inventory");
	inventory.addActionListener(this);
	inventory.setBounds(100,100,100,50);
	toolbar.add(inventory);
    }

    public void actionPerformed(ActionEvent e) {
	if (e.getSource() == Submit) {
	    player = entername.getText();
	    if (player.length() > 20){
		text.setText("Your name is too long. Enter a new one.");
		entername.setText("");
	    } else{
		text.setText("Are you sure you wish to be called " + player + "?");
		text.setColumns(41);
		entername.setVisible(false);
		Submit.setVisible(false);
		confirm.setVisible(true);
		deny.setVisible(true);
	    }
	} else if(e.getSource() == deny){
	    entername.setVisible(true);
	    Submit.setVisible(true);
	    confirm.setVisible(false);
	    deny.setVisible(false);
	    text.setColumns(20);
	    text.setText("What would you like to be called?");
	} else if (e.getSource() == confirm) {
	    player = entername.getText();
	    confirm.setVisible(false);
	    deny.setVisible(false);
	    entername.setVisible(false);
	    text.setText("Hello " + player);
	    text.setColumns(1);
	    panda = r.nextInt(10);
	    if (panda == 0){
		try{
		    character = ImageIO.read(new File("panda.png"));
		} catch(IOException ex){
		} text.append(" You have turned into a panda! Honto kawaii desu!");
	    }
	    canvas.update(getGraphics());
	}
    }

    private class Canvas extends JPanel{
	public void paintComponent(Graphics g){
	    super.paintComponent(g);
	    //g.setColor(Color.blue);
	    //canvas.setBounds(0,800,800,800);
	    //canvas.setBorder(BorderFactory.createLineBorder(Color.red,2));
	    g.drawImage(background,0,0,800,800,null);
	    g.drawImage(character,300,450,null);
	    canvas.setPreferredSize(new Dimension(800,800));
	}
    }


    public static void main(String[] args){
	game g = new game();
	g.setVisible(true);
    }
}

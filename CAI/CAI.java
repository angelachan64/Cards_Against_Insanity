import java.awt.image.*;
import javax.imageio.*;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.io.*;

public class CAI extends JFrame{
    private Container window;
    private JPanel title,black;
    private JButton newgame,loadgame;
    private BufferedImage titlepic;
    private JLabel titulo,spacer;
    public CAI(){
        setTitle("Cards Against Insanity");
        setSize(800,800);
        setLocation(400,50);
	getContentPane().setBackground(Color.BLACK);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        window = getContentPane();
	window.setLayout(new FlowLayout());
	
	title = new JPanel();
	title.setPreferredSize(new Dimension(600,55));
        title.setOpaque(false);
	window.add(title);

	try{
	titlepic = ImageIO.read(new File("title.png"));
	titulo = new JLabel(new ImageIcon(titlepic));
	window.add(titulo);
	} catch(IOException ex){
	}

	/*title = new JPanel();
	title.setPreferredSize(new Dimension(700,600));
	title.setBorder(BorderFactory.createLineBorder(Color.red,2));
	window.add(title);*/

	black = new JPanel();
	black.setPreferredSize(new Dimension(600,55));
	black.setOpaque(false);
	window.add(black);

	newgame = new JButton("New Game");
	newgame.setPreferredSize(new Dimension(300,40));
	window.add(newgame);
	loadgame = new JButton("Load Game");
	loadgame.setPreferredSize(new Dimension(300,40));
	window.add(loadgame);
    }
}

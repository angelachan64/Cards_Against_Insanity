import java.awt.image.*;
import javax.imageio.*;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.io.*;

public class CAI extends JFrame{
    private Container window;
    private JPanel title;
    private JButton newgame,loadgame;
    private BufferedImage titlepic;
    private JLabel titulo;
    public CAI(){
        setTitle("Cards Against Insanity");
        setSize(800,800);
        setLocation(400,50);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        window = getContentPane();
	window.setLayout(new FlowLayout());

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

	newgame = new JButton("New Game");
	window.add(newgame);
	loadgame = new JButton("Load Game");
	window.add(loadgame);
    }
}

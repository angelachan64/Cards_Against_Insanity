import java.awt.image.*;
import java.awt.event.*;
import javax.imageio.*;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.io.*;

public class game extends JFrame implements ActionListener{
    private Container jonjo;
    private JPanel def,questlist,inv,shop,market,tabs,mainpanel;
    private CardLayout cards;
    private BufferedImage background,character,charflip;
    private JTextArea text,entername;
    private JButton Submit,confirm,deny,main,inventory,quests,store,selling;
    private JButton quit,move;
    private ArrayList<String> inven;
    private String player;
    private int panda;
    private int position;
    private int money;

    Random r = new Random();

    public game(){
	try{
	    FileInputStream saveFile = new FileInputStream("savefiles/save.txt");
	    ObjectInputStream restore = new ObjectInputStream(saveFile);
	    player = (String) restore.readObject();
	    inven = (ArrayList) restore.readObject();
	    money = (Integer) restore.readObject();
	    restore.close();
	} catch (Exception exc) {
	}

	setTitle("Cards Against Insanity");
	setSize(800,875);
	setLocationRelativeTo(null);
	setDefaultCloseOperation(EXIT_ON_CLOSE);

	jonjo = getContentPane();
	jonjo.setLayout(new BorderLayout());
	setVisible(true);

	try{
	    background = ImageIO.read(new File("images/background.jpg"));
	    character = ImageIO.read(new File("images/character.png"));
	    charflip = ImageIO.read(new File("images/character2.png"));
	} catch(IOException e){
	}

	cards = new CardLayout();
	mainpanel = new JPanel();
	mainpanel.setLayout(cards);
	cards.show(mainpanel, "quests");
	
	def = new Canvas();

	questlist = new JPanel();
	questlist.setSize(800,800);
	questlist.setBorder(BorderFactory.createLineBorder(Color.black));
	questlist.setBackground(Color.white);

	inv = new JPanel();
	inv.setSize(800,800);
	inv.setBorder(BorderFactory.createLineBorder(Color.black));
	inv.setBackground(new Color(255,253,208));

	shop = new JPanel();
	shop.setSize(800,800);
	shop.setBorder(BorderFactory.createLineBorder(Color.black));
	shop.setBackground(new Color(222,184,135));

	market = new JPanel();
	market.setSize(800,800);
	market.setBorder(BorderFactory.createLineBorder(Color.black));
	market.setBackground(new Color(222,184,135));

	mainpanel.add(def, "def");
	mainpanel.add(questlist, "quests");
	mainpanel.add(inv, "inv");
	mainpanel.add(shop, "shop");
	mainpanel.add(market, "market");

	jonjo.add(mainpanel,BorderLayout.CENTER);

	tabs = new JPanel();
	//tabs.setBorder(BorderFactory.createLineBorder(Color.black));
	//tabs.setSize(800,100);

	main = new JButton("Home Screen");
	main.addActionListener(this);
	tabs.add(main);
	inventory = new JButton("Inventory");
	inventory.addActionListener(this);
	tabs.add(inventory);
	quests = new JButton("Quests");
	quests.addActionListener(this);
	tabs.add(quests);
	store = new JButton("Shop");
	store.addActionListener(this);
	tabs.add(store);
	selling = new JButton("Market");
	selling.addActionListener(this);
	tabs.add(selling);
	quit = new JButton("Quit Game");
	quit.addActionListener(this);
	tabs.add(quit);
	
	jonjo.add(tabs,BorderLayout.SOUTH);

	move = new JButton("Explore");
	move.addActionListener(this);
	//def.add(move);
	
	if (player == null) {
	    text = new JTextArea();
	    text.setText("What is your name?");
	    text.setColumns(20);
	    text.setRows(1);
	    text.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	    text.setEditable(false);
	    def.add(text);

	    entername = new JTextArea();
	    entername.setColumns(20);
	    entername.setLineWrap(true);
	    text.setRows(1);
	    text.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	    def.add(entername);

	    Submit = new JButton("Submit");
	    Submit.addActionListener(this);
	    def.add(Submit);
	    confirm = new JButton("Yes");
	    confirm.addActionListener(this);
	    confirm.setVisible(false);
	    deny = new JButton("No");
	    deny.addActionListener(this);
	    deny.setVisible(false);
	    def.add(deny);
	    def.add(confirm);
	} else {
	    text = new JTextArea();
	    text.setText("Hello " + player);
	    text.setColumns(1);
	    text.setRows(1);
	    text.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	    text.setEditable(false);
	    def.add(text);
	    def.add(move);
	}


	//inventory = new JButton("Inventory");
	//inventory.addActionListener(this);
	//inventory.setBounds(100,100,100,50);
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
	    text.setText("Hello " + player + '.');
	    text.setColumns(1);
	    panda = r.nextInt(10);
	    if (panda == 0){
		try{
		    character = ImageIO.read(new File("images/panda.png"));
		    charflip = ImageIO.read(new File("images/panda2.png"));
		} catch(IOException ex){
		} text.append(" You have turned into a panda! Honto kawaii desu!");
	    }
	    def.update(getGraphics());
	    def.add(move);
	} else if (e.getSource() == quests){
	    cards.show(mainpanel, "quests");
	} else if (e.getSource() == main){
	    cards.first(mainpanel);
	} else if (e.getSource() == inventory){
	    cards.show(mainpanel, "inv");
	} else if (e.getSource() == store){
	    cards.show(mainpanel, "shop");
	} else if (e.getSource() == selling){
	    cards.last(mainpanel);
	} else if (e.getSource() == quit){
	    System.exit(0);
	} else if (e.getSource() == move) {
	    
	}
	try {
	    FileOutputStream saveFile = new FileOutputStream("savefiles/save.txt");
	    ObjectOutputStream save = new ObjectOutputStream(saveFile);
	    save.writeObject(player);
	    save.writeObject(inven);
	    save.writeObject(money);
	    save.close();
	} catch (Exception exc) {
	}
    }

    private class Canvas extends JPanel{
	public void paintComponent(Graphics g){
	    super.paintComponent(g);
	    g.drawImage(background,0,0,800,800,null);
	    g.drawImage(character,300,450,null);
	    def.setPreferredSize(new Dimension(800,800));
	}
    }


    public static void main(String[] args){
	game g = new game();
	g.setVisible(true);
    }
}

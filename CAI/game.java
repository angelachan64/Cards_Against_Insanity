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
    private JTextArea text,entername,stats;
    private JButton Submit,confirm,deny,main,inventory,quests,store,selling;
    private JButton quit,move,quest1,quest2,quest3,quest4,quest5,quest6;
    private JButton quest7,quest8;
    //private ArrayList<String> inven;
    private Basecard[] inven = new Basecard[25];
    private String player;
    private int panda,position,money,chance,gain;
    private int x = 300;
    private boolean left = false,discover;

    Random r = new Random();

    public game(){
	try{
	    FileInputStream saveFile = new FileInputStream("savefiles/save.txt");
	    ObjectInputStream restore = new ObjectInputStream(saveFile);
	    player = (String) restore.readObject();
	    //inven = (ArrayList) restore.readObject();
	    inven = (Basecard[]) restore.readObject();
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
	questlist.setLayout(null);
	questlist.setSize(800,800);
	questlist.setBorder(BorderFactory.createLineBorder(Color.black));
	questlist.setBackground(Color.white);
	quest1 = new JButton("Start Quest 1");
	quest1.setBounds(100,100,600,50);
	questlist.add(quest1);
	quest2 = new JButton("Start Quest 2");
	quest2.setBounds(100,175,600,50);
	questlist.add(quest2);
	quest3 = new JButton("Start Quest 3");
        quest3.setBounds(100,250,600,50);
	questlist.add(quest3);
	quest4 = new JButton("Start Quest 4");
        quest4.setBounds(100,325,600,50);
	questlist.add(quest4);
	quest5 = new JButton("Start Quest 5");
        quest5.setBounds(100,400,600,50);
	questlist.add(quest5);
	quest6 = new JButton("Start Quest 6");
        quest6.setBounds(100,475,600,50);
	questlist.add(quest6);
	quest7 = new JButton("Start Quest 7");
        quest7.setBounds(100,550,600,50);
	questlist.add(quest7);
	quest8 = new JButton("Start Quest 8");
        quest8.setBounds(100,625,600,50);
	questlist.add(quest8);

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
	tabs.setBackground(Color.white);
	//tabs.setBorder(BorderFactory.createLineBorder(Color.black));
	tabs.setSize(800,100);

	stats = new JTextArea();
	stats.setRows(1);
	stats.setColumns(70);
	stats.setEditable(false);
	stats.setText("Hello, " + player + ". You currently have " +
		      money + " pieces of gold.");
	stats.setBorder(BorderFactory.createLineBorder(Color.black));
	stats.setVisible(false);
	def.add(stats);

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
	
	jonjo.add(tabs,BorderLayout.PAGE_END);

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
	    entername.setLineWrap(false);
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
	    /*text = new JTextArea();
	    text.setText("Hello " + player);
	    text.setColumns(1);
	    text.setRows(1);
	    text.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	    text.setEditable(false);
	    def.add(text);*/
	    //text.setVisible(false);
	    stats.setText("Hello " + player + ". You currently have " + money +
			  " pieces of gold.");
	    stats.setVisible(true);
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
	    stats.setText("Hello " + player + ". You currently have " + money +
			  " pieces of gold.");
	    stats.setVisible(true);
	    text.setColumns(1);
	    text.setVisible(false);

	    card2 a = new card2();
	    card2 b = new card2();
	    inven[0] = a;
	    inven[1] = b;
	    
	    panda = r.nextInt(10);
	    if (panda == 0){
		try{
		    character = ImageIO.read(new File("images/panda.png"));
		    charflip = ImageIO.read(new File("images/panda2.png"));
		} catch(IOException ex){
		} stats.append(" You have turned into a panda! Honto kawaii desu!");
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
	    System.out.println("Shutting down...");
	    System.exit(0);
	} else if (e.getSource() == move) {
	    position = r.nextInt(400) + 150;
	    if (position > x){
		x = position;
		left = false;
		def.update(def.getGraphics());
	    } else if (position < x){
		x = position;
		left = true;
		def.update(def.getGraphics());
	    }

	    if (discover){
		discover = false;
		stats.setText("You decided to expore, but you didn't find anything.");
	    }
	    
	    chance = r.nextInt(100);
	    if (chance<=35){
		gain = r.nextInt(5)+1;
		discover = true;
		money += gain;
		stats.setText("You decided to explore, and it paid off! You found " + gain + " pieces of gold. You now have " + money + " gold.");
	    } 
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
	    if (!left){
		g.drawImage(character,x,450,null);
	    } else if (left){
		g.drawImage(charflip,x,450,null);
	    }
	    def.setPreferredSize(new Dimension(800,800));
	}
    }


    public static void main(String[] args){
	game g = new game();
	g.setVisible(true);
    }
}

import java.awt.image.*;
import java.awt.event.*;
import javax.imageio.*;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.io.*;

public class quest extends JFrame implements ActionListener{
    private Container battle;
    private JPanel canvas,toolbar;
    private BufferedImage background,tower1,tower2,tower3,tower4,tower5,tower6;
    private JButton start,a,b,c,d,e,f,g,h,i,j;
    private int numtowers = 0;
    private int wave;
    //private int questlevel;
    //maxwaves is the same as quest level.

    public quest() {
	try {
	    FileInputStream saveFile = new FileInputStream("questsave.txt");
	    ObjectInputStream restore = new ObjectInputStream(saveFile);
	    //questlevel = (int) restore.readObject();
	    restore.close();
	} catch (Exception exc) {
	}
	    
	setTitle("Time to d-d-d-d-duel!");
	setSize(800,800);
	setLocationRelativeTo(null);
	setResizable(false);
	setDefaultCloseOperation(EXIT_ON_CLOSE);

	battle = getContentPane();
	setVisible(true);

	try {
	    background = ImageIO.read(new File("images/quest.png"));
	} catch(IOException e){
	}

	battle.setLayout(new BorderLayout());
	canvas = new Canvas();
	toolbar = new JPanel();
	toolbar.setLayout(new GridLayout(5,2));
	toolbar.setBorder(BorderFactory.createLineBorder(Color.black));
	a = new JButton("Rarity 1");
	b = new JButton("Rarity 2");
	c = new JButton("Rarity 3");
	d = new JButton("Rarity 4");
	e = new JButton("Rarity 5");
	f = new JButton("Rarity 6");
	g = new JButton("Rarity 7");
	h = new JButton("Rarity 8");
	i = new JButton("Rarity 9");	
	j = new JButton("Rarity 10");
	a.addActionListener(this);
	b.addActionListener(this);
	c.addActionListener(this);
	d.addActionListener(this);
	e.addActionListener(this);
	f.addActionListener(this);
	g.addActionListener(this);
	h.addActionListener(this);
	i.addActionListener(this);
	j.addActionListener(this);
	toolbar.add(a);
	toolbar.add(b);
	toolbar.add(c);
	toolbar.add(d);
	toolbar.add(e);
	toolbar.add(f);
	toolbar.add(g);
	toolbar.add(h);
	toolbar.add(i);	
	toolbar.add(j);
	
	battle.add(canvas,BorderLayout.CENTER);
	battle.add(toolbar,BorderLayout.EAST);

	/*questlevel = 1;

	canvas = new Canvas();
	battle.add(canvas);
	start = new JButton("Start");
	start.addActionListener(this);
	canvas.add(start);*/
	

	try {
	    FileOutputStream saveFile = new FileOutputStream("questsave.txt");
	    ObjectOutputStream save = new ObjectOutputStream(saveFile);
	    //save.writeObject(questlevel);
	    save.close();
	} catch (Exception exc) {
	}
    }

    public void actionPerformed(ActionEvent e) {
	if (e.getSource() == start) {
	    
	} else if (e.getSource() == a) {
	    try {
		if (numtowers == 0) {
		    tower1 = ImageIO.read(new File("images/cards/01Reina.jpeg"));
		} else if (numtowers == 1) {
		    tower2 = ImageIO.read(new File("images/cards/01Reina.jpeg"));
		} else if (numtowers == 2) {
		    tower3 = ImageIO.read(new File("images/cards/01Reina.jpeg"));
		} else if (numtowers == 3) {
		    tower4 = ImageIO.read(new File("images/cards/01Reina.jpeg"));
		} else if (numtowers == 4) {
		    tower5 = ImageIO.read(new File("images/cards/01Reina.jpeg"));
		}
	    } catch (IOException exc) {
	    }
	    canvas.update(getGraphics());
	}
	else if (e.getSource() == b) {
	    try {
		if (numtowers == 0) {
		    tower1 = ImageIO.read(new File("images/cards/02Alisa.jpg"));
		} else if (numtowers == 1) {
		    tower2 = ImageIO.read(new File("images/cards/02Alisa.jpg"));
		} else if (numtowers == 2) {
		    tower3 = ImageIO.read(new File("images/cards/02Alisa.jpg"));
		} else if (numtowers == 3) {
		    tower4 = ImageIO.read(new File("images/cards/02Alisa.jpg"));
		} else if (numtowers == 4) {
		    tower5 = ImageIO.read(new File("images/cards/02Alisa.jpg"));
		}
	    } catch (IOException exc) {
	    }
	    canvas.update(getGraphics());
	}else if (e.getSource() == c) {
	    try {
		if (numtowers == 0) {
		    tower1 = ImageIO.read(new File("images/cards/03Antoinette.jpg"));
		} else if (numtowers == 1) {
		    tower2 = ImageIO.read(new File("images/cards/03Antoinette.jpg"));
		} else if (numtowers == 2) {
		    tower3 = ImageIO.read(new File("images/cards/03Antoinette.jpg"));
		} else if (numtowers == 3) {
		    tower4 = ImageIO.read(new File("images/cards/03Antoinette.jpg"));
		} else if (numtowers == 4) {
		    tower5 = ImageIO.read(new File("images/cards/03Antoinette.jpg"));
		}
	    } catch (IOException exc) {
	    }
	    canvas.update(getGraphics());
	}else if (e.getSource() == d) {
	    try {
		if (numtowers == 0) {
		    tower1 = ImageIO.read(new File("images/cards/04Zilean.jpg"));
		} else if (numtowers == 1) {
		    tower2 = ImageIO.read(new File("images/cards/04Zilean.jpg"));
		} else if (numtowers == 2) {
		    tower3 = ImageIO.read(new File("images/cards/04Zilean.jpg"));
		} else if (numtowers == 3) {
		    tower4 = ImageIO.read(new File("images/cards/04Zilean.jpg"));
		} else if (numtowers == 4) {
		    tower5 = ImageIO.read(new File("images/cards/04Zilean.jpg"));
		}
	    } catch (IOException exc) {
	    }
	    canvas.update(getGraphics());
	}else if (e.getSource() == e) {
	    try {
		if (numtowers == 0) {
		    tower1 = ImageIO.read(new File("images/cards/05Karina.jpg"));
		} else if (numtowers == 1) {
		    tower2 = ImageIO.read(new File("images/cards/05Karina.jpg"));
		} else if (numtowers == 2) {
		    tower3 = ImageIO.read(new File("images/cards/05Karina.jpg"));
		} else if (numtowers == 3) {
		    tower4 = ImageIO.read(new File("images/cards/05Karina.jpg"));
		} else if (numtowers == 4) {
		    tower5 = ImageIO.read(new File("images/cards/05Karina.jpg"));
		}
	    } catch (IOException exc) {
	    }
	    canvas.update(getGraphics());
	}else if (e.getSource() == f) {
	    try {
		if (numtowers == 0) {
		    tower1 = ImageIO.read(new File("images/cards/06Janna.jpg"));
		} else if (numtowers == 1) {
		    tower2 = ImageIO.read(new File("images/cards/06Janna.jpg"));
		} else if (numtowers == 2) {
		    tower3 = ImageIO.read(new File("images/cards/06Janna.jpg"));
		} else if (numtowers == 3) {
		    tower4 = ImageIO.read(new File("images/cards/06Janna.jpg"));
		} else if (numtowers == 4) {
		    tower5 = ImageIO.read(new File("images/cards/06Janna.jpg"));
		}
	    } catch (IOException exc) {
	    }
	    canvas.update(getGraphics());
	}else if (e.getSource() == g) {
	    try {
		if (numtowers == 0) {
		    tower1 = ImageIO.read(new File("images/cards/07Corey.jpg"));
		} else if (numtowers == 1) {
		    tower2 = ImageIO.read(new File("images/cards/07Corey.jpg"));
		} else if (numtowers == 2) {
		    tower3 = ImageIO.read(new File("images/cards/07Corey.jpg"));
		} else if (numtowers == 3) {
		    tower4 = ImageIO.read(new File("images/cards/07Corey.jpg"));
		} else if (numtowers == 4) {
		    tower5 = ImageIO.read(new File("images/cards/07Corey.jpg"));
		}
	    } catch (IOException exc) {
	    }
	    canvas.update(getGraphics());
	}else if (e.getSource() == h) {
	    try {
		if (numtowers == 0) {
		    tower1 = ImageIO.read(new File("images/cards/08Ignis.png"));
		} else if (numtowers == 1) {
		    tower2 = ImageIO.read(new File("images/cards/08Ignis.png"));
		} else if (numtowers == 2) {
		    tower3 = ImageIO.read(new File("images/cards/08Ignis.png"));
		} else if (numtowers == 3) {
		    tower4 = ImageIO.read(new File("images/cards/08Ignis.png"));
		} else if (numtowers == 4) {
		    tower5 = ImageIO.read(new File("images/cards/08Ignis.png"));
		}
	    } catch (IOException exc) {
	    }
	    canvas.update(getGraphics());
	}else if (e.getSource() == i) {
	    try {
		if (numtowers == 0) {
		    tower1 = ImageIO.read(new File("images/cards/09JacquelineJocelyn.jpg"));
		} else if (numtowers == 1) {
		    tower2 = ImageIO.read(new File("images/cards/09JacquelineJocelyn.jpg"));
		} else if (numtowers == 2) {
		    tower3 = ImageIO.read(new File("images/cards/09JacquelineJocelyn.jpg"));
		} else if (numtowers == 3) {
		    tower4 = ImageIO.read(new File("images/cards/09JacquelineJocelyn.jpg"));
		} else if (numtowers == 4) {
		    tower5 = ImageIO.read(new File("images/cards/09JacquelineJocelyn.jpg"));
		}
	    } catch (IOException exc) {
	    }
	    canvas.update(getGraphics());
	}else if (e.getSource() == j) {
	    try {
		if (numtowers == 0) {
		    tower1 = ImageIO.read(new File("images/cards/10Krampus.jpg"));
		} else if (numtowers == 1) {
		    tower2 = ImageIO.read(new File("images/cards/10Krampus.jpg"));
		} else if (numtowers == 2) {
		    tower3 = ImageIO.read(new File("images/cards/10Krampus.jpg"));
		} else if (numtowers == 3) {
		    tower4 = ImageIO.read(new File("images/cards/10Krampus.jpg"));
		} else if (numtowers == 4) {
		    tower5 = ImageIO.read(new File("images/cards/10Krampus.jpg"));
		}
	    } catch (IOException exc) {
	    }
	    canvas.update(getGraphics());
	}
    }

    private class Canvas extends JPanel{
	public void paintComponent(Graphics g){
	    super.paintComponent(g);
	    g.drawImage(background,0,0,750,800,null);
	    canvas.setPreferredSize(new Dimension(500,500));
	    //canvas.setBorder(BorderFactory.createLineBorder(Color.black));
	    canvas.setBackground(Color.green);
	    g.fillRect(40,250,50,50);
	    g.fillRect(150,100,50,50);
	    g.fillRect(310,250,50,50);
	    g.fillRect(350,570,50,50);
	    g.fillRect(500,260,50,50);
	    if (numtowers == 0) {
		g.drawImage(tower1,40,250,50,50,null);
		numtowers++;
	    } else if (numtowers == 1) {
		g.drawImage(tower2,150,100,50,50,null);
		numtowers++;
	    } else if (numtowers == 2) {
		g.drawImage(tower3,310,250,50,50,null);
		numtowers++;
	    } else if (numtowers == 3) {
		g.drawImage(tower4,350,570,50,50,null);
		numtowers++;
	    } else if (numtowers == 4) {
		g.drawImage(tower5,500,260,50,50,null);
		numtowers++;
	    }
	}
    }

    public static void main(String[] args){
	quest q = new quest();
	q.setVisible(true);
    }
}

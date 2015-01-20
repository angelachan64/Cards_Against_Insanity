import java.awt.image.*;
import java.awt.event.*;
import javax.imageio.*;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.io.*;

public class quest extends JFrame implements ActionListener{
    private Container battle;
    private JPanel canvas;
    private JButton start;
    private int rarity = 0;

    private quest() {
	setTitle("Time to d-d-d-d-duel!");
	setSize(800,800);
	setLocation(400,50);
	setDefaultCloseOperation(EXIT_ON_CLOSE);

	battle = getContentPane();
	setVisible(true);

	canvas = new Canvas();
	battle.add(canvas);
	start = new JButton("Start");
	start.addActionListener(this);
	canvas.add(start);
    }
}
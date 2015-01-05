import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.io.*;

public class CAI extends JFrame{
    private Container window;
    public CAI(){
        setTitle("Cards Against Insanity");
        setSize(1000,1000);
        setLocation(100,100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        window = getContentPane();
    }
}
package wordgame3;


import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.FileNotFoundException;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import wordgame3.WordDisplay;

public class Main extends JPanel{
	static int width;
	static int height;
	static WordDisplay[] wordDisplay = new WordDisplay[45];
	static String input;
	static boolean gameOver=false;
	static int score=0;
	static int difficulty=0;

    
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        
        //my paint
        //Game Over
        if(gameOver == true) {
        g.setColor(Color.red);
        g.setFont(new Font("Courier New", Font.BOLD, 72));
        g.drawString("Game Over!", height/2,width/2-300 );
        }
        
        g.setFont(new Font("Courier New", Font.ITALIC, 14));
        //score
        g.setColor(Color.blue);
        g.drawString("SCORE: "+score, 1100, 750);
        //My word
        g.setColor(Color.red);
		g.drawString("Your Word: "+input, 10, 750);
		
		//Flying Words
        g.setColor(Color.black);
        for(int i=0;i<wordDisplay.length;i++) {
		//System.out.println(i);
		g.drawString(wordDisplay[i].name, wordDisplay[i].locx, wordDisplay[i].locy);	
		//System.out.println(wordDisplay[i].locx);
		}
        
    }

    public static void main(String[] args) throws InterruptedException, FileNotFoundException {
    	//Ustawienie okienka (pêtla)
    	frameSetup();
    }
    
    public static void frameSetup() throws InterruptedException, FileNotFoundException {
    	JFrame frame = new JFrame("Word Game");
        Main game = new Main();
        KeyListiner key = new KeyListiner();
        key.main(null);
        
        frame.add(game);
        frame.setSize(1280, 800);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        height = frame.getHeight();
        width = frame.getWidth();
        
        //Do before loop
        game.initializeWords(45);
        while (true) {
            game.repaint();
            game.moveWords();
            input=key.word;
            Thread.sleep(25); 
            wordIn();
            difficulty();
            gameOver();
        }
    }
    

    
    public void moveWords() {
		//this defines a step of the word
		int step = 1+difficulty;
		for(int i=0;i<wordDisplay.length;i++) {
			wordDisplay[i].locx=wordDisplay[i].locx-step;
			repaint();
		}
	}
	
	public void initializeWords(int s) throws FileNotFoundException {
		Random rand = new Random();
		Words words = new Words();
		for(int i=0;i<s;i++) {
			System.out.println(i);
			wordDisplay[i]=new WordDisplay(); //this is important cause it creates the object
			wordDisplay[i].name=words.return_polishWord();
			wordDisplay[i].locx=width+rand.nextInt(width*2)+10;
			wordDisplay[i].locy=height-(rand.nextInt(730)+60); 
			System.out.println(wordDisplay[i].name);
		}
		System.out.println("Words Initialized"+" "+wordDisplay.length);
	}
	
	public static void gameOver() {
		for(int i=0;i<wordDisplay.length;i++) {
			if(wordDisplay[i].locx<0) {
				gameOver=true;
				System.out.println("Game Over!!!");
			}
		}
	}
	
	public static void wordIn() throws FileNotFoundException {
		for(int i=0;i<wordDisplay.length;i++) {
			if(wordDisplay[i].name.equals(input)) {
				score++;
				wordDelete(i);
			}
		}
	}
	
	public static void wordDelete(int i) throws FileNotFoundException {
		Words words = new Words();
		Random rand = new Random();
		wordDisplay[i].name=words.return_polishWord();
		wordDisplay[i].locx=width+rand.nextInt(width*2)+10;
		wordDisplay[i].locy=height-(rand.nextInt(730)+60); 
	}
	
	public static void difficulty() {
		if (score >100 && difficulty<1) {
			difficulty++;
		}
		if (score >400 && difficulty<2) {
			difficulty++;
		}
	}
}

package com.edu4java.samplegame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class DVD extends JPanel {
    int x = 20;
    int y = 20;
    int valx=1;
    int valy=1;

    private void moveBall() {
    	 if(x<0) 				valx=1;
    	 if(x>getWidth()-25)	valx=-1;
    	 if(y<10)				valy=1;
    	 if(y>getHeight())		valy=-1;
    	
        x = x + valx;
        y = y + valy;
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.drawString("DVD", x, y);
        
    }

    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("Odbijaj¹ce ko³o");
        DVD game = new DVD();
        frame.add(game);
        frame.setSize(300, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        while (true) {
            game.moveBall();
            game.repaint();
            Thread.sleep(10);   
        }
    }
}
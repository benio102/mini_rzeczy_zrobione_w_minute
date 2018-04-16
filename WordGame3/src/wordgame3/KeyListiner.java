package wordgame3;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


import javax.swing.JFrame;
import javax.swing.JTextField;

public class KeyListiner {
	static String word;
  public static void main(String[] args) {
    JFrame aWindow = new JFrame("This is the Window Title");
  
    

    aWindow.setBounds(50, 100, 300, 100);
    aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JTextField typingArea = new JTextField(20);
    typingArea.addKeyListener(new KeyListener() {

      /** Handle the key typed event from the text field. */
      public void keyTyped(KeyEvent e) {
        displayInfo(e, "KEY TYPED: ");
      }

      /** Handle the key pressed event from the text field. */
      public void keyPressed(KeyEvent e) {
        displayInfo(e, "KEY PRESSED: ");
      }

      /** Handle the key released event from the text field. */
      public void keyReleased(KeyEvent e) {
        displayInfo(e, "KEY RELEASED: ");
      }
      
      protected void displayInfo(KeyEvent e, String s) {
        char keyString;
        String words;
        int code= e.getKeyCode();
        typingArea.cut();
        if(code == 10) {
        words=typingArea.getText();
        typingArea.selectAll();
        typingArea.cut();
        //System.out.println(words.isEmpty());
        if(words.isEmpty()==false)word=words;
        System.out.println(word);
        }
      }

    });
    aWindow.add(typingArea);
    aWindow.setVisible(true);
  }
}
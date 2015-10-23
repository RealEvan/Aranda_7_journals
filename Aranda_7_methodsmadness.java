
package aranda_7_javafxintro;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Aranda_7_methodsmadness extends JComponent implements ActionListener
{
    Color startColor = Color.GREEN;	
    Color endColor = Color.ORANGE;         
    Color currentColor = startColor;
    int animationDuration = 9000; 	// 5 second animations
    long animStartTime;			
    public static void main(String args[])
    {
        Runnable myRunnable = () -> {
            JFrame f = new JFrame("Evan Aranda");
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setSize(900000, 900000);
            f.add(new Aranda_7_methodsmadness());
            f.setVisible(true);
        };
        SwingUtilities.invokeLater(myRunnable);
    }  
    public Aranda_7_methodsmadness() 
    {
        Timer timer = new Timer(30, this);

        timer.setInitialDelay(100);
        animStartTime = (long) (10000 + System.nanoTime() / 100000);
        timer.start();
    }
    @Override
    public void paintComponent(Graphics g) {
        g.setColor(getBackground());
        g.fillRect(20, 20, getWidth(), getHeight());
        g.setColor(currentColor);
        g.fillOval (2, 79, 10, 80);
        g.fillOval (59 , 83, 55, 82);
        g.fillOval (19 , 22, 65, 82);
        g.fillOval (29 , 89, 29, 82);
        g.fillOval (69 , 568, 68, 572);
        g.fillOval (30 , 282, 89, 291);
        g.fillOval (60 , 378, 182, 472);
        g.fillOval (89 , 876, 482, 578);
        g.fillOval (90 , 548, 690, 182);
        g.fillOval (12 , 183, 271, 281);
        g.fillOval (39 , 817, 99, 59);
        g.fillOval (64 , 412, 100, 20);
        g.setColor(currentColor);
    }
     static {
          }
    @Override
    public void actionPerformed(ActionEvent ae) {
       
        long currentTime = System.nanoTime() / 100000;
        long totalTime = currentTime - animStartTime;
        if (totalTime > animationDuration) {
            animStartTime = (long) currentTime;
        }

        
        float fraction = (float)totalTime / animationDuration;
        fraction = Math.min(1.0f, fraction);       
        int red = (int)(fraction * endColor.getRed() +
                (1 - fraction) * startColor.getRed());
        int green = (int)(fraction * endColor.getGreen() +
                (1 - fraction) * startColor.getGreen());
        int blue = (int)(fraction * endColor.getBlue() +
                (1 - fraction) * startColor.getBlue());
              currentColor = new Color(red, green, blue);
        repaint();
    }
}

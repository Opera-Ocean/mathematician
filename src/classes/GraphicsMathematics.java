package classes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author HALLELUJAH
 */
public class GraphicsMathematics extends JPanel implements ActionListener {

    
    
    Timer tym = new Timer(5, this);
    int x = 0, velX = 2, y = 0, velY = 2, l = 100, velL = 2;
    
    public void framer(){
        GraphicsMathematics math = new GraphicsMathematics();
        
        JFrame frame = new JFrame("Cool");
        frame.setSize(500, 400);
        frame.setVisible(true);
        frame.add(math);
        
    }
    
    public void paintComponent(Graphics graph){
        super.paintComponent(graph);
        graph.setColor(Color.red);
        graph.fillRect(x, 25, 100, 40);
        graph.fillOval(l, 100, 100, 100);
        graph.fillRoundRect(x, y, 75, 40, 20, 20);
        
        graph.drawLine(10, 10, 150, 350);
        
        graph.drawRect(150, 150, 100, 100);
        

        tym.start();
    }
    
  
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(x < 0 || x > 400){
            velX = -velX;
        }
        
        if(y < 0 || y > 300){
            velY = -velY;
        }
        
        if(l < 20 || l > 320){
            l = -1000;
        }
            
        x = x + velX;
        y = y + velY;
        l = l + velL;
        repaint();

    }
    
    public static void main(String[] args){
        GraphicsMathematics math = new GraphicsMathematics();
        math.framer();
        
    }
    
}

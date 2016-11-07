package graphicsChallengesOne;
import java.awt.*;
import javax.swing.*;
public class graphicsChallengesOne extends Canvas 
	{
	private static final long	serialVersionUID	= 1L;
 
    	public static void main(String[] args) 
    		{
	        graphicsChallengesOne canvas = new graphicsChallengesOne();
	        JFrame frame = new JFrame();
	        frame.setSize(1000, 1000);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.getContentPane().add(canvas).setBackground(Color.white);
	        frame.setLocationRelativeTo(null);
	        frame.setResizable(false);
	        frame.setVisible(true);
    		}
 
    	public void paint(Graphics graphics) 
    		{
    			
	        graphics.setColor(Color.black);
	        graphics.drawLine(0, 0, 1000, 1000);
	        
	        graphics.setColor(Color.black);
	        graphics.drawLine(0, 1000, 1000, 0);
	        
	        graphics.setColor(Color.blue);
	        graphics.drawRect(100,700,800,200);
	        
    		}
    	
    		public void delay()
    			{
    	        try
    					{
    					Thread.sleep(50);
    					} 
    	        catch (InterruptedException e)
    					{
    					e.printStackTrace();
    					}
    			}
    	}

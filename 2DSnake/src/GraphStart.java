import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class GraphStart extends Frame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	public void paint(Graphics g1)
	{
		g1.setColor(Color.BLUE);
		g1.drawRect(40,40,200,200);
		g1.drawOval(40,40,200,200);
		g1.drawOval(90,70,80,80);
		g1.drawOval(110,95,5,5);
		g1.drawOval(145,95,5,5);
		g1.drawLine(130,95,130,113);
		g1.drawArc(113,115,35,20,0,-180);
	}
	p
    

    GraphStart()
    {
    	super("Frame Demo");
    	setSize(700,400);
    	
    	addWindowListener(new WindowAdapter()
    	{
    		public void windowClosing(WindowEvent e)
    		{
    			setVisible(false);
    			dispose();
    			System.exit(0);
    		}
    		
    	});
    	
    }
}


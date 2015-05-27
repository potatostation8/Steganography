import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.Color;

public class Steg {
  public static void main (String [] args) {
    BufferedImage sample = null;		
		try {
			sample = ImageIO.read (new File("./sample.bmp"));
		} catch (IOException e) {};
		
		if (sample == null) {
			System.out.println ("Error loading file.");
			return;
		}
		
		int w = sample.getWidth();
		int h = sample.getHeight();
		
		for (int x = 0; x < w; x++) {
			for (int y = 0; y < h; y++) {
				Color c = new Color (sample.getRGB(x,y));
				
				System.out.print ("Pixel at " + x + ", " + y + ": ");
				System.out.print ("R " + c.getRed() + ", ");			
				System.out.print ("G " + c.getGreen() + ", ");
				System.out.println ("B " + c.getBlue() );
			}		
		}
  }
}  

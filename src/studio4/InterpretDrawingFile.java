package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		int r = 0;
		int g = 0;
		int b = 0;
		boolean filled = false;
		double p1 = 0;
		double p2 = 0;
		double p3 = 0;
		double p4 = 0;
		double p5 =0;
		double p6 = 0;
		String shape = "hello";
		while (in.hasNext()) {
			shape = in.next();
			r = in.nextInt();
			g = in.nextInt();
			b = in.nextInt();
			filled = in.nextBoolean();
			p1 = in.nextDouble();
			p2 = in.nextDouble();
			p3 = in.nextDouble();
			p4 = in.nextDouble();
			p5 = in.nextDouble();
			p6 = in.nextDouble();
		}
		StdDraw.setPenRadius(0.08);
		if(shape.equals("ellipse")) {
			StdDraw.setPenColor(r,g,b);
			if(filled) {
				StdDraw.filledEllipse(p1, p2, p3, p4);
			}
			else {
				StdDraw.ellipse(p1, p2, p3, p4);
			}
		}
			
		if(shape.equals("rectangle")) {
			StdDraw.setPenColor(r,g,b);
			if(filled) {
				StdDraw.filledRectangle(p1, p2, p3, p4);
			}
			else {
				StdDraw.rectangle(p1, p2, p3, p4);
			}
		}
		
		if(shape.equals("triangle")) {
			double[] xc = {p1,p2,p3};
			double[] yc = {p4,p5,p6};
			StdDraw.setPenColor(r,g,b);
			if(filled) {
				StdDraw.filledPolygon(xc,yc);
				
			}
			else {
				StdDraw.line(p1, p4, p2, p5);
				StdDraw.line(p1,p4,p3,p6);
				StdDraw.line(p2,p5,p3,p6);
			}
			
		}
		
	}
}

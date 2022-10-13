package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.clear();
		StdDraw.setPenRadius(0.008);
	double[] x1 = {0,0,0.33,0.33};
	double[] y1 = {0,1,1,0};
	double[] x2 = {0.33,0.33,0.67,0.67};
	double[] y2 = {0,1,1,0};
	double[] x3 = {0.67,0.67,1,1};
	double[] y3 = {0,1,1,0};
	StdDraw.setPenColor(204,204,255);
	StdDraw.filledPolygon(x1,y1);
	StdDraw.setPenColor(91,127,255);
	StdDraw.filledPolygon(x2, y2);
	StdDraw.setPenColor(255,255,0);
	StdDraw.filledPolygon(x3, y3);
	}
}
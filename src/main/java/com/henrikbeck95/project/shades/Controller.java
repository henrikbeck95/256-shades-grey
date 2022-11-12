package com.henrikbeck95.project.shades;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

import com.henrikbeck95.library.common.color.convert.ColorFromRgb;

public class Controller {
	public static void exportarImagem(BufferedImage processada) {
		// String path = "";
		String path = "dist/";
		// String path = "docs/screenshots/";
		// String path = "src/";
		
		// String path = "C:\\Users\\henrikbeck95\\Desktop";
		String fileName = JOptionPane.showInputDialog("Informe o nome o arquivo");

		String fileExtension = "jpg";

		try {
			ImageIO.write(processada, fileExtension, new File(path + fileName + "." + fileExtension));
		} catch (IOException ex) {
			Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	// SHOULD BE REFACTORED IN FAVOR OF COMMON LIBRARY
	public static int convertFromRgbToGrey(int pixel) {
		int[] rgb = derivar(pixel);

		int r = rgb[0];
		int g = rgb[1];
		int b = rgb[2];

		int grey = (r + g + b) / 3;
		
		rgb[0] = grey;
		rgb[1] = grey;
		rgb[2] = grey;

		/*
		 */
		
//		ArrayList<Double> grey = ColorFromRgb.convertToGrey(rgb[0], rgb[1], rgb[2]);
//		rgb[0] = Integer.valueOf(grey.get(0).toString());
//		rgb[1] = Integer.valueOf(grey.get(1).toString());
//		rgb[2] = Integer.valueOf(grey.get(2).toString());
		
		return integrar(rgb);
		
//		ColorFromRgb.convertToGrey(30, 55, 127);
//		ColorFromHexadecimal.convertToGrey();
	}
	
	public static int[] derivar(int rgb) {
		int r = ((int) rgb >> 16) & 0xFF;
		int g = ((int) rgb >> 8) & 0xFF;
		int b = ((int) rgb >> 0) & 0xFF;

		return new int[] { r, g, b };
	}

	public static int[] derivar(double rgb) {
		int r = ((int) rgb >> 16) & 0xFF;
		int g = ((int) rgb >> 8) & 0xFF;
		int b = ((int) rgb >> 0) & 0xFF;

		return new int[] { r, g, b };
	}
	
	public static int integrar(int[] rgb) {
		int r = ((int) rgb[0] & 0xFF) << 16;
		int g = ((int) rgb[1] & 0xFF) << 8;
		int b = ((int) rgb[2] & 0xFF) << 0;

		return r | g | b;
	}
	
	public static int integrar(double[] rgb) {
		int r = ((int) rgb[0] & 0xFF) << 16;
		int g = ((int) rgb[1] & 0xFF) << 8;
		int b = ((int) rgb[2] & 0xFF) << 0;

		return r | g | b;
	}
	
	// SHOULD BE REFACTORED IN FAVOR OF COMMON LIBRARY
	public static int convertFromRgbToWhite(int pixel) {
		int[] rgb = derivar(pixel);
		int r = rgb[0];
		int g = rgb[1];
		int b = rgb[2];
		int grey = (r + g + b) / 3;

		if (grey < 128) {
			grey = 0;
		} else {
			grey = 255;
		}

		rgb[0] = grey;
		rgb[1] = grey;
		rgb[2] = grey;

		return integrar(rgb);
	}
}
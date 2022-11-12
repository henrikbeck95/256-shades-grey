package com.henrikbeck95.project.shades;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

//import com.henrikbeck95.library.common.color.convert.ColorFromRgb;

public class Controller {
	public static void exportarImagem(BufferedImage processada) {
		String path = "";
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

	public static int escalaDeCinza(int pixel) {
//		ColorFromRgb.convertToGrey(30, 55, 127);
		
		int[] rgb = derivar(pixel);
		int r = rgb[0];
		int g = rgb[1];
		int b = rgb[2];

		int cinza = (r + g + b) / 3;

		rgb[0] = cinza;
		rgb[1] = cinza;
		rgb[2] = cinza;

		return integrar(rgb);
	}

	public static int[] derivar(int rgb) {
		int r = (rgb >> 16) & 0xFF;
		int g = (rgb >> 8) & 0xFF;
		int b = (rgb >> 0) & 0xFF;

		return new int[] { r, g, b };
	}

	public static int integrar(int[] rgb) {
		int r = (rgb[0] & 0xFF) << 16;
		int g = (rgb[1] & 0xFF) << 8;
		int b = (rgb[2] & 0xFF) << 0;

		return r | g | b;
	}

	public static int escalaBrancoPreto(int pixel) {
		int[] rgb = derivar(pixel);
		int r = rgb[0];
		int g = rgb[1];
		int b = rgb[2];
		int cinza = (r + g + b) / 3;

		if (cinza < 128) {
			cinza = 0;
		} else {
			cinza = 255;
		}

		rgb[0] = cinza;
		rgb[1] = cinza;
		rgb[2] = cinza;

		return integrar(rgb);
	}
}
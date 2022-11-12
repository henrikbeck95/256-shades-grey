package com.henrikbeck95.project.shades;

import java.awt.image.BufferedImage;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

public class Utils {
	private JFileChooser JavaFileChooser;
	private File file;
	private ImageIcon imageIcon;
	private BufferedImage imageProcessed;

	public JFileChooser getJavaFileChooser() {
		return JavaFileChooser;
	}

	public void setJavaFileChooser(JFileChooser JavaFileChooser) {
		this.JavaFileChooser = JavaFileChooser;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public ImageIcon getImageIcon() {
		return imageIcon;
	}

	public void setImageIcon(ImageIcon imageIcon) {
		this.imageIcon = imageIcon;
	}

	public BufferedImage getImageProcessed() {
		return imageProcessed;
	}

	public void setImageProcessed(BufferedImage imageProcessed) {
		this.imageProcessed = imageProcessed;
	}
}
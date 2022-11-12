package com.henrikbeck95.project.shades;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class Main extends javax.swing.JFrame {
	public static Scanner ENTRADA = new Scanner(System.in);
	public static Utils utils = new Utils();
	
	// Variables declaration - do not modify
	private javax.swing.JButton btnLoadImage;
	private javax.swing.JButton btnScaleWhite;
	private javax.swing.JButton btnScaleGrey;
	private javax.swing.JButton btnExportImage;
	private javax.swing.JButton btnClearContent;
	private javax.swing.JPanel jPanelImageOriginal;
	protected javax.swing.JPanel jPanelNull;
	private javax.swing.JScrollPane jScrollPaneThumbnail;
	private javax.swing.JScrollPane jScrollPaneMain;
	private javax.swing.JLabel lblImageOriginal;
	private javax.swing.JLabel lblMenuFerramentas;

	JLabel labelEditing = new JLabel();
	JLabel labelThumbnail = new JLabel();

	public static void main(String args[]) {
		// Set the Nimbus look and feel
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}

		// Create and display the form
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Main().setVisible(true);
			}
		});
	}

	public Main() {
		initComponents();
	}

	private void initComponents() {
		jScrollPaneMain = new javax.swing.JScrollPane();
		jScrollPaneThumbnail = new javax.swing.JScrollPane();
		jPanelNull = new javax.swing.JPanel();
		btnClearContent = new javax.swing.JButton();
		btnLoadImage = new javax.swing.JButton();

		lblMenuFerramentas = new javax.swing.JLabel();
		btnScaleGrey = new javax.swing.JButton();
		btnScaleWhite = new javax.swing.JButton();
		btnExportImage = new javax.swing.JButton();
		jPanelImageOriginal = new javax.swing.JPanel();
		lblImageOriginal = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("@henrikbeck95 - 256 shadows of grey");
		setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

		btnClearContent.setText("Clear content");
		btnClearContent.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnClearContentActionPerformed(evt);
			}
		});

		btnLoadImage.setText("Load image");
		btnLoadImage.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnLoadImageActionPerformed(evt);
			}
		});

		lblMenuFerramentas.setText("Menu options");

		btnScaleGrey.setText("Grey scale");
		btnScaleGrey.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnConvertScaleGreyActionPerformed(evt);
			}
		});

		btnScaleWhite.setText("White scale");
		btnScaleWhite.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnConvertScaleWhiteActionPerformed(evt);
			}
		});

		btnExportImage.setText("Export image");
		btnExportImage.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnExportImageActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanelNullLayout = new javax.swing.GroupLayout(jPanelNull);
		jPanelNull.setLayout(jPanelNullLayout);
		jPanelNullLayout.setHorizontalGroup(
				jPanelNullLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanelNullLayout
										.createSequentialGroup()
										.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(lblMenuFerramentas).addGap(19, 19, 19))
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelNullLayout.createSequentialGroup()
								.addGap(0, 1, Short.MAX_VALUE)
								.addGroup(jPanelNullLayout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addComponent(btnExportImage, javax.swing.GroupLayout.Alignment.TRAILING,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(btnScaleWhite, javax.swing.GroupLayout.Alignment.TRAILING,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(btnScaleGrey, javax.swing.GroupLayout.Alignment.TRAILING,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(btnClearContent, javax.swing.GroupLayout.Alignment.TRAILING,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(btnLoadImage, javax.swing.GroupLayout.Alignment.TRAILING,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))));
		jPanelNullLayout.setVerticalGroup(jPanelNullLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanelNullLayout.createSequentialGroup().addComponent(lblMenuFerramentas)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(btnLoadImage)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(btnClearContent)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(btnScaleGrey)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(btnScaleWhite)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 224, Short.MAX_VALUE)
						.addComponent(btnExportImage)));

		lblImageOriginal.setText("Original file");

		javax.swing.GroupLayout jPanelImagemOriginalLayout = new javax.swing.GroupLayout(jPanelImageOriginal);
		jPanelImageOriginal.setLayout(jPanelImagemOriginalLayout);
		jPanelImagemOriginalLayout.setHorizontalGroup(
				jPanelImagemOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanelImagemOriginalLayout.createSequentialGroup().addGap(38, 38, 38)
								.addComponent(lblImageOriginal)
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		jPanelImagemOriginalLayout.setVerticalGroup(
				jPanelImagemOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelImagemOriginalLayout
								.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE).addComponent(lblImageOriginal)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addComponent(jScrollPaneMain, javax.swing.GroupLayout.DEFAULT_SIZE, 985, Short.MAX_VALUE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(jPanelImageOriginal, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jPanelNull, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jScrollPaneThumbnail))
						.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addContainerGap()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
								.addComponent(jPanelNull, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jPanelImageOriginal, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jScrollPaneThumbnail, javax.swing.GroupLayout.PREFERRED_SIZE, 152,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addComponent(jScrollPaneMain, javax.swing.GroupLayout.Alignment.TRAILING))));

		pack();
		setLocationRelativeTo(null);
	}

	private void btnClearContentActionPerformed(java.awt.event.ActionEvent evt) {
		labelEditing.setIcon(null);
		// labelThumbnail.setIcon(null);
	}

	// SHOULD BE REFACTORED IN FAVOR OF COMMON LIBRARY
	private void btnConvertScaleGreyActionPerformed(java.awt.event.ActionEvent evt) {
		BufferedImage original = null;

		try {
			original = ImageIO.read(utils.getFile());
		} catch (IOException ex) {
			Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
		}

		int width = original.getWidth();
		int height = original.getHeight();

		BufferedImage processada = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

		for (int y = 0; y < height; y++) {
			for (int x = 0; x < width; x++) {
				int colorido = original.getRGB(x, y);
				int cinza = Controller.convertFromRgbToGrey(colorido);
				
				processada.setRGB(x, y, cinza);
			}
		}

		utils.setImageProcessed(processada);
		
		render();
	}
	
	// SHOULD BE REFACTORED IN FAVOR OF COMMON LIBRARY
	private void btnConvertScaleWhiteActionPerformed(java.awt.event.ActionEvent evt) {
		BufferedImage imageOriginal = null;

		try {
			imageOriginal = ImageIO.read(utils.getFile());
		} catch (IOException ex) {
			Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
		}

		int width = imageOriginal.getWidth();
		int height = imageOriginal.getHeight();

		BufferedImage processada = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

		for (int y = 0; y < height; y++) {
			for (int x = 0; x < width; x++) {
				int colorido = imageOriginal.getRGB(x, y);
				int cinza = Controller.convertFromRgbToWhite(colorido);
				
				processada.setRGB(x, y, cinza);
			}
		}

		utils.setImageProcessed(processada);

		render();
	}
	
	private void btnExportImageActionPerformed(java.awt.event.ActionEvent evt) {
		Controller.exportarImagem(utils.getImageProcessed());
	}
	
	private void btnLoadImageActionPerformed(java.awt.event.ActionEvent evt) {
		JFileChooser jFileChooser = new JFileChooser(); // Open file explorer for searching the image
		utils.setJavaFileChooser(jFileChooser);

		if (jFileChooser.showOpenDialog(jPanelNull) == JFileChooser.APPROVE_OPTION) {
			File file = jFileChooser.getSelectedFile();
			utils.setFile(file);

			frameEditing();
			frameThumbnail();
		}
	}

	protected void frameEditing() {
		ImageIcon imageIconEditing = new ImageIcon(utils.getFile().toString());
		imageIconEditing.setImage(imageIconEditing.getImage().getScaledInstance(jScrollPaneMain.getWidth() - 10,
				jScrollPaneMain.getHeight() - 10, 1));
		labelEditing.setIcon(imageIconEditing);
		jScrollPaneMain.getViewport().add(labelEditing);
	}
	
	@SuppressWarnings("static-access")
	protected void frameThumbnail() {
		ImageIcon imageIconThumbnail = new ImageIcon(utils.getFile().toString());
		imageIconThumbnail.setImage(imageIconThumbnail.getImage()
				.getScaledInstance(jScrollPaneThumbnail.getWidth() - 10, jScrollPaneThumbnail.getHeight() - 10, 1));
		labelThumbnail.setHorizontalAlignment(labelThumbnail.CENTER);
		labelThumbnail.setVerticalAlignment(labelThumbnail.CENTER);
		labelThumbnail.setIcon(imageIconThumbnail);
		jScrollPaneThumbnail.getViewport().add(labelThumbnail);
	}

	private void render() {
		ImageIcon icon = new ImageIcon(utils.getImageProcessed());
		icon.setImage(icon.getImage().getScaledInstance(jScrollPaneMain.getWidth() - 10,
				jScrollPaneMain.getHeight() - 10, 1));
		labelEditing.setIcon(icon);
		jScrollPaneMain.getViewport().add(labelEditing);
	}
}
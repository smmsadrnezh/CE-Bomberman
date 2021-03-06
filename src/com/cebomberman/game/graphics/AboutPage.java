package com.cebomberman.game.graphics;

/**
 * 
 * @author
 */
public class AboutPage extends javax.swing.JFrame {

	/**
	 * Creates new form AboutPage
	 */
	public AboutPage() {
		initComponents();
	}

	private void initComponents() {

		gameDescription = new javax.swing.JTextArea();
		okButton = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("About");

		gameDescription.setEditable(false);
		gameDescription.setColumns(20);
		gameDescription.setLineWrap(true);
		gameDescription.setRows(5);
		gameDescription
				.setText("CE Bomberman\n\nBomberman is a strategic, maze-based video game franchis originaly published in 1983.\n\nVersion: CE-Bomberman Release 1\nBuild date: 2014 Jan 27\n\n(c) Copyright CE Bomberman contributors 2013.  All rights reserved.\nVisit http://cebomberman.com\n\nThis product includes software developed by\nS. M. Masoud Sadrnezhaad and Arman Naeimian\n\nPresented in Sharif University of Technology");
		gameDescription.setWrapStyleWord(true);
		gameDescription.setBorder(javax.swing.BorderFactory
				.createEtchedBorder());
		gameDescription.setName(""); // NOI18N

		okButton.setText("Ok");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(gameDescription,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										425,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE))
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addContainerGap(
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(okButton,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										71,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap()));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(gameDescription,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										237, Short.MAX_VALUE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(okButton).addContainerGap()));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed"
		// desc=" Look and feel setting code (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the
		 * default look and feel. For details see
		 * http://download.oracle.com/javase
		 * /tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
					.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(AboutPage.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(AboutPage.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(AboutPage.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(AboutPage.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new AboutPage().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JTextArea gameDescription;
	private javax.swing.JButton okButton;
	// End of variables declaration//GEN-END:variables
}

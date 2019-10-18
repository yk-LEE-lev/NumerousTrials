package ui.main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JToolBar;
import javax.swing.JSplitPane;
import javax.swing.JDesktopPane;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainUI {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainUI window = new MainUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("Copyright © LND All Rights Reserved.");
		lblNewLabel.setFont(new Font("Meiryo UI", Font.PLAIN, 10));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel, BorderLayout.SOUTH);
		
		JToolBar toolBar = new JToolBar();
		frame.getContentPane().add(toolBar, BorderLayout.NORTH);
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		frame.getContentPane().add(splitPane, BorderLayout.EAST);
		
		JButton btnNewButton_1 = new JButton("Memo");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		splitPane.setLeftComponent(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("GuestBoard");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		splitPane.setRightComponent(btnNewButton_2);
		
		JDesktopPane desktopPane = new JDesktopPane();
		frame.getContentPane().add(desktopPane, BorderLayout.CENTER);
		
		JLabel lblNewLabel_1 = new JLabel("CSV Refinery");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(12, 10, 282, 13);
		desktopPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(5, 196, 261, 19);
		desktopPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("path");
		btnNewButton.setBounds(269, 195, 58, 21);
		desktopPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Merging CSV files");
		lblNewLabel_2.setBounds(32, 96, 101, 13);
		desktopPane.add(lblNewLabel_2);
		
		JButton btnMerging = new JButton("MERGE");
		btnMerging.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMerging.setBounds(22, 33, 125, 57);
		desktopPane.add(btnMerging);
		
		JButton btnCustomReport = new JButton("Sort & Categorize");
		btnCustomReport.setBounds(22, 114, 125, 57);
		desktopPane.add(btnCustomReport);
		
		JButton btnExtracting = new JButton("EXTRACT");
		btnExtracting.setBounds(159, 33, 135, 57);
		desktopPane.add(btnExtracting);
		
		JButton btnCustomReport_1 = new JButton("CUSTOM REPORT");
		btnCustomReport_1.setBounds(159, 114, 135, 57);
		desktopPane.add(btnCustomReport_1);
		
		JLabel lblExtractAndCreate = new JLabel("Create new with extracted data");
		lblExtractAndCreate.setBounds(159, 96, 168, 13);
		desktopPane.add(lblExtractAndCreate);
		
		JLabel lblCreateUpTo = new JLabel("Create up to 3files for report");
		lblCreateUpTo.setBounds(159, 172, 154, 13);
		desktopPane.add(lblCreateUpTo);
		
		JLabel lblFiltermodifyACsv = new JLabel("Filter&Modify a CSV file");
		lblFiltermodifyACsv.setBounds(22, 173, 125, 13);
		desktopPane.add(lblFiltermodifyACsv);
		
		JLabel lblSetThe = new JLabel("Set the export directory you want.");
		lblSetThe.setBounds(82, 214, 182, 19);
		desktopPane.add(lblSetThe);
	}
}

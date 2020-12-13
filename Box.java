package groupAssignment;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import net.miginfocom.swing.MigLayout;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import javax.swing.border.TitledBorder;
import javax.swing.JRadioButton;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.ButtonGroup;

public class Box extends JFrame implements ActionListener {
	private JPanel parentPanel = new JPanel(new MigLayout());
	JPanel boxPanel = new JPanel(new MigLayout());
	JTextField boxWeight = new JTextField(5);
	JTextField boxWidth = new JTextField(5);
	JTextField boxHeight = new JTextField(5);
	JTextField boxDepth = new JTextField(5);
	JTextField numberItems = new JTextField(5);
	JTextField itemWeight = new JTextField(5);
	JTextField itemWidth = new JTextField(5);
	JTextField itemHeight = new JTextField(5);
	JTextField itemDepth = new JTextField(5);
	JTextField questionOne = new JTextField("What is the box weight, width, height and depth");
	JTextField questionTwo = new JTextField("How many items are there");
	JTextField questionThree = new JTextField("What is the item weight, width, height and depth");
	

	
	public Box() {
		parentPanel.add(boxPanel);
		boxPanel.setLayout(new MigLayout());
		add(parentPanel);
		setTitle("Box");
		setSize(600, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		boxPanel.add(questionOne);
		boxPanel.add(boxWeight);
		boxPanel.add(boxWidth);
		boxPanel.add(boxHeight);
		boxPanel.add(boxDepth,"wrap");
		boxPanel.add(questionTwo);
		boxPanel.add(numberItems,"wrap");
		boxPanel.add(questionThree);
		boxPanel.add(itemWeight);
		boxPanel.add(itemWidth);
		boxPanel.add(itemHeight);
		boxPanel.add(itemDepth);
		questionOne.setEditable(false);
		questionTwo.setEditable(false);
		questionThree.setEditable(false);
		

		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	public static void main(String[] args) {
		new Box();

	}
}

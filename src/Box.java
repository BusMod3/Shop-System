

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
	JLabel boxNeeded = new JLabel("");
	JButton calcBox = new JButton("Calculate Boxes Needed");

	
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
		boxPanel.add(itemDepth, "wrap");
		boxPanel.add(calcBox, "wrap");
		boxPanel.add(boxNeeded);
		boxNeeded.setVisible(false);
		questionOne.setEditable(false);
		questionTwo.setEditable(false);
		questionThree.setEditable(false);
		calcBox.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == calcBox) {
		boxNeeded.setVisible(true);
		int boxW = Integer.parseInt(boxWidth.getText());
		int boxH = Integer.parseInt(boxHeight.getText());
		int boxD = Integer.parseInt(boxDepth.getText());
		int itemW = Integer.parseInt(itemWidth.getText());
		int itemH = Integer.parseInt(itemHeight.getText());
		int itemD = Integer.parseInt(itemWidth.getText());
		int numItems = Integer.parseInt(numberItems.getText());
		int boxDim = boxW*boxH*boxD;
		int itemDim = numItems*itemW*itemH*itemD;
		int boxFull = itemDim/boxDim;
		int boxRem = itemDim%boxDim;
		if(boxRem == 0) {
			boxNeeded.setText("Boxes required: " + boxFull);
		}
		boxFull++;
		boxNeeded.setText("Boxes required: " + boxFull);
		}
	}
	public static void main(String[] args) {
		new Box();

	}
}

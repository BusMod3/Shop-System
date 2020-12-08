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

public class Basket extends JFrame implements ActionListener {
	
	LinkedList<BasketList> basket = new LinkedList<BasketList>();
	String[] exampleItems = { "Luxury", "Essential", "Gift" };// Sets three items for dropdown box
	String[] exampleQuantity = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }; // Sets numbers for other dropdownbox
	private JPanel parentPanel = new JPanel(new MigLayout());
	JPanel basketPanel = new JPanel(new MigLayout());
	JButton add = new JButton("Add");
	JComboBox goods = new JComboBox(exampleItems);
	JComboBox quantity = new JComboBox(exampleQuantity);
	JTextField Screen = new JTextField(50);

	public Basket() {
		parentPanel.add(basketPanel);
		basketPanel.setLayout(new MigLayout());
		Screen.setEditable(false);
		add(parentPanel);
		setTitle("Basket");
		setSize(350, 350);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		basketPanel.add(add);
		basketPanel.add(goods);
		basketPanel.add(quantity);
		add.addActionListener(this);
		goods.addActionListener(this);
		quantity.addActionListener(this);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == add) {
			String product = (String) goods.getSelectedItem();
			String quant = (String) quantity.getSelectedItem();
			int quantity = Integer.parseInt(quant);
			int price = 0;
			if (product.equals("Luxury")) {
				price = 50;
			} else if (product.equals("Essential")) {
				price = 30;
			} else if (product.equals("Gift")) {
				price = 20;
			}
			basket.add(new BasketList(product, price, quantity));// adds what ever is selected to basket linked list
			System.out.println(basket);
		}

	}

	public static void main(String[] args) {
		new Basket();

	}
}

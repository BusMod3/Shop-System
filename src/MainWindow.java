import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import net.miginfocom.swing.*;

public class MainWindow {
	private JFrame frame; 
	private JPanel panel;
	private JButton btnStock, btnBasket, btnCalculate, btnShipping;
	
	public MainWindow()  {
		
	frame = new JFrame("Shop System");
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(600, 180);
	
	panel = new JPanel();
	panel.setLayout(new MigLayout());
	frame.add(panel);
	
	btnStock = new JButton("Stock Management");
	btnBasket = new JButton("Shopping Basket");
	btnCalculate = new JButton("Calculate Change");
	btnShipping = new JButton("Calculate Shipping Logistics");
	
	panel.add(btnStock, "wrap, pushx, growx");
	panel.add(btnBasket, "wrap, pushx, growx");
	panel.add(btnCalculate, "wrap, pushx, growx");
	panel.add(btnShipping, "pushx, growx");
	
	btnStock.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			StockGUI stockGui = new StockGUI();
			stockGui.setTitle("Stock Management");
			stockGui.setSize(600, 180);
			stockGui.setVisible(true);
		}
	});
	
	
	}
	
	public static void main(String args[]) {
		new MainWindow();
	}



}
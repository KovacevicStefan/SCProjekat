package smartConverter;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class SmartConverter implements ActionListener{
	
	private JFrame frame;
	private JTextField broj;
	private JTextField hexadecimal;
	private JComboBox dropMen;
	private JTextField binary;
	private JTextField decimal;
	private Hex hex;
	private Bin bin;
	private Dec dec;
	
	public SmartConverter() {
		
		frame = new JFrame();
		frame.setTitle("SmartConverter 1.0");
		frame.setBounds(100, 100, 350, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		dropMen = new JComboBox();
		dropMen.setModel(new DefaultComboBoxModel(new String[] {"Hexadecimal", "Binary", "Decimal"}));
		dropMen.setToolTipText("");
		dropMen.setBounds(10, 11, 314, 29);
		frame.getContentPane().add(dropMen);
		
		JLabel lblNewLabel = new JLabel("Enter number for conversion:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 54, 180, 14);
		frame.getContentPane().add(lblNewLabel);
		
		broj = new JTextField();
		broj.setBounds(200, 52, 124, 20);
		frame.getContentPane().add(broj);
		broj.setColumns(10);
		broj.addActionListener(this);
		
		hexadecimal = new JTextField();
		hexadecimal.setEditable(false);
		hexadecimal.setText("Hexadecimal");
		hexadecimal.setBounds(10, 97, 314, 20);
		frame.getContentPane().add(hexadecimal);
		hexadecimal.setColumns(10);
		
		binary = new JTextField();
		binary.setText("Binary");
		binary.setEditable(false);
		binary.setColumns(10);
		binary.setBounds(10, 128, 314, 20);
		frame.getContentPane().add(binary);
		
		decimal = new JTextField();
		decimal.setText("Decimal");
		decimal.setEditable(false);
		decimal.setColumns(10);
		decimal.setBounds(10, 159, 314, 20);
		frame.getContentPane().add(decimal);
		
		hex = new Hex();
		hex.setHex(hexadecimal.getText());
		bin = new Bin();
		bin.setBin(binary.getText());
		dec = new Dec();
		dec.setDec(decimal.getText());
		frame.setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(dropMen.getSelectedIndex() == 0) {
			this.fromHexCon();
		}else if(dropMen.getSelectedIndex() == 1) {
			this.fromBinCon();
		}else if(dropMen.getSelectedIndex() == 2) {
			this.fromDecCon();
		}
	}
	
	public void fromHexCon() {
    	
		if(hex.check(broj.getText()) == true && hex.maxNum(broj.getText()) == true) {
			
			hexadecimal.setText(broj.getText().toUpperCase());
			
			String hexbr = broj.getText();
			int dec = Integer.parseInt(hexbr, 16);
			String decimalni = Integer.toString(dec);
			
			decimal.setText(decimalni);
			
			String binarni = Integer.toBinaryString(dec);
			
			binary.setText(binarni);
			
			}else{
				JOptionPane.showMessageDialog(null, "VREDNOST NIJE VALIDNA!", "GRESKA", JOptionPane.PLAIN_MESSAGE);
			}
		
	}	
   
	public void fromBinCon() {
		
		if(bin.check(broj.getText()) == true && bin.maxNum(broj.getText()) == true) {
			
			binary.setText(broj.getText());
			
			String binarni = broj.getText();
			int dec = Integer.parseInt(binarni, 2);
			String decimalni = Integer.toString(dec);
			
			decimal.setText(decimalni);
			
			String heksadecimalni = Integer.toHexString(dec);
			hexadecimal.setText(heksadecimalni.toUpperCase());
			System.out.println(bin.maxNum(broj.getText()));
		}else {
			
			JOptionPane.showMessageDialog(null, "VREDNOST NIJE VALIDNA!", "GRESKA", JOptionPane.PLAIN_MESSAGE);
		}
		
	}
	
	public void fromDecCon() {
		
		if(dec.check(broj.getText()) == true && dec.maxNum(broj.getText()) == true) {
			
			String decimalni = broj.getText();
			decimal.setText(broj.getText());
			
			int bin = Integer.parseInt(decimalni, 10);
			String binarni = Integer.toBinaryString(bin);
			binary.setText(binarni);
			
			if(broj.getText().charAt(0) == '-') {
				String heksadecimalni = Integer.toHexString(Math.abs(bin));
				hexadecimal.setText("-" +heksadecimalni.toUpperCase());
			}else {
				String heksadecimalni = Integer.toHexString(bin);
				hexadecimal.setText(heksadecimalni.toUpperCase());
			}
			
		}else{
			JOptionPane.showMessageDialog(null, "VREDNOST NIJE VALIDNA!", "GRESKA", JOptionPane.PLAIN_MESSAGE);
		}
		
	}
	
	public static void main(String[] args) {
		
		//Stefan Kovacevic IM 56/19
		SmartConverter sc = new SmartConverter();
		
	}
	
	

}

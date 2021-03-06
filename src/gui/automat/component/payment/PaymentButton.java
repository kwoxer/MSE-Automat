package gui.automat.component.payment;

import gui.AutomatView;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JLabel;


public class PaymentButton extends JLabel {
	private static final long serialVersionUID = 1L;
	private String value;
	private Image icon;
	
	public PaymentButton(Image icon, String key) {
		super();

		this.value = key;
		this.icon = icon;
	}
	
	public PaymentButton() {
		value = "";
	}
	
	public String getValue() {
		return value;
	}
	
	public void paint(Graphics g) {
		if(!value.equals("")) {
			g.setColor(AutomatView.COLOR);
		    g.fillRect (0, 0, g.getClipBounds().width, g.getClipBounds().height);
			g.setColor(AutomatView.COLOR);
		    g.fillRect (1, 1, g.getClipBounds().width-2, g.getClipBounds().height-2);
			g.drawImage(icon , 1, 1, getWidth()-2, getHeight()-2, null);
		}
    }
}
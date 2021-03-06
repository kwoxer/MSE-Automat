package gui.automat;

import gui.AutomatView;
import gui.automat.component.ImageAreaComp;
import gui.lib.StylePanel;

import java.awt.Color;
import java.awt.Cursor;

import javax.swing.border.EmptyBorder;

public class BottomAreaView extends StylePanel {
	private static final long serialVersionUID = 1L;

	private ImageAreaComp iacAutomatOutputEmpty;
	private ImageAreaComp iacAutomatOutputFull;

	private ImageAreaComp currentImage;

	private boolean isEmpty;

	public BottomAreaView() {
		super(AutomatView.COLOR, AutomatView.COLOR, new EmptyBorder(0, 0, 0, 0));
		gridStyle.setPadding(50, 0, 5, 0);
		gridStyle.setGrid(1.0, 1.0, 0, 0);
		
		iacAutomatOutputEmpty = new ImageAreaComp(AutomatView.RESPATH + "soda/output_empty.png", Color.BLACK);
		iacAutomatOutputEmpty.setCursor(new Cursor(Cursor.HAND_CURSOR));

		iacAutomatOutputFull = new ImageAreaComp(AutomatView.RESPATH + "soda/output_full.png", Color.BLACK);
		iacAutomatOutputFull.setCursor(new Cursor(Cursor.HAND_CURSOR));

		currentImage = iacAutomatOutputEmpty;
		isEmpty = true;

		add(currentImage, gridStyle);
	}

	public ImageAreaComp getAutomatOutputEmpty() {
		return iacAutomatOutputEmpty;
	}

	public ImageAreaComp getAutomatOutputFull() {
		return iacAutomatOutputFull;
	}

	public boolean isEmpty() {
		return isEmpty;
	}

	public void changeToFull() {
		remove(currentImage);
		currentImage = iacAutomatOutputFull;
		add(currentImage, gridStyle);

		isEmpty = false;

		revalidate();
		repaint();
	}

	public void changeToEmpty() {
		remove(currentImage);
		currentImage = iacAutomatOutputEmpty;
		add(currentImage, gridStyle);

		isEmpty = true;

		revalidate();
		repaint();
	}
}
package com.pblazquez.joptionpane;

import javax.swing.JOptionPane;

public class JOptionPane4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int codigo = JOptionPane.showConfirmDialog(null, "Quiere pipa", "Donación", JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.INFORMATION_MESSAGE);
		if (codigo == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "No tengo");
		} else if (codigo == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Más pa mi");
		} else {
			System.out.println("cagaste");
		}
	}
}

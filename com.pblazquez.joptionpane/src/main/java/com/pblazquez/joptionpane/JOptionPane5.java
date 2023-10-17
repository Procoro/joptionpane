package com.pblazquez.joptionpane;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
public class JOptionPane5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UIManager.put("OptionPane.yesButtonText", "siii");
		UIManager.put("OptionPane.noButtonText", "nooo");
		
		JOptionPane.showMessageDialog(null, "Hola");
		int opcion = JOptionPane.showConfirmDialog(null, "¿Quieres continuar?",
				"Confirmar",JOptionPane.YES_NO_OPTION);
		
		if(opcion == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "Has elegido si","Elección",JOptionPane.INFORMATION_MESSAGE);
			String si= JOptionPane.showInputDialog("¿Por qué si?");
			JOptionPane.showMessageDialog(null, "Vaya, "+si);
		}else if(opcion==JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Has elegido no","Elección",JOptionPane.CANCEL_OPTION);
			String no = JOptionPane.showInputDialog("¿Por qué no?");
			JOptionPane.showMessageDialog(null, "Vaya, "+no);
		}
		JOptionPane.showMessageDialog(null, "Adiós","ERROR",JOptionPane.WARNING_MESSAGE);
	}

}

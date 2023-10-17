package com.pblazquez.joptionpane;
import javax.swing.JOptionPane;
public class JOptionPane3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre=JOptionPane.showInputDialog(null,"Nombre","Datos personales",JOptionPane.QUESTION_MESSAGE);
		if(nombre!=null) {
			System.out.println("Hola "+nombre);
		}else {
			System.out.println("Le has dado a cancelar");
		}
	}

}

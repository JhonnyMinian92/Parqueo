package intefaz;
import javax.swing.JOptionPane;

import Aplicacion.*;

public class TesVehiculo {
public static void main(String[] args){
	Vehiculo chevrolet=new Vehiculo();
	String nplaca = JOptionPane.showInputDialog("Ingrese Nro. Placa: ");
	String nmarca = JOptionPane.showInputDialog("Ingrese Marca del Vehiculo: ");
	String ncliente = JOptionPane.showInputDialog("Ingrese Nombre del Cliente: ");
	String ntipo = JOptionPane.showInputDialog("Ingrese Tipo de Vehiculo(grande/pequeño)");
	String ntiempo = JOptionPane.showInputDialog("Ingrese Tiempo de Permanencia de Parqueo: ");

	chevrolet.setPlaca(nplaca);
	chevrolet.setMarca(nmarca);
	chevrolet.setCliente(ncliente);
	chevrolet.setTipodevehiculo(ntipo);
	chevrolet.setTiempodepermanencia(Double.parseDouble(ntiempo));

	chevrolet.tarifa();
	chevrolet.descuento(Double.parseDouble(ntiempo));
	chevrolet.calcularPago();

	JOptionPane.showMessageDialog(null, "Datos Ingresados: "+chevrolet.toString());
}
}

package Aplicacion;

import javax.swing.JOptionPane;

public class Vehiculo {
String marca;
String placa;
String cliente;
String tipodevehiculo;
double tiempodepermanencia;
double valor;
double valordescuento;
double valortotal;

public Vehiculo(){
this.marca="";
this.placa="";
this.cliente="";
this.tipodevehiculo="";
this.tiempodepermanencia=0;
this.valor=0;
this.valordescuento=0;
this.valortotal=0;
}

public Vehiculo(String marca, String placa, String cliente,String tipodevehiculo,double tiempodepermanencia, double valor, double valordescuento,double valortotal){
	this.marca=marca;
	this.placa=placa;
	this.cliente=cliente;
	this.tipodevehiculo=tipodevehiculo;
	this.tiempodepermanencia=tiempodepermanencia;
	this.valor=valor;
	this.valordescuento=valordescuento;
	this.valortotal=valortotal;
}

public String toString(){

	String cadena="\n Placa: " + this.placa;
	cadena+="\n Marca del vehiculo:"+this.marca;
	cadena+="\n Cliente:"+this.cliente;
	cadena+="\n Tipo de vehiculo:"+ this.tipodevehiculo;
	cadena+="\n Tiempo de espera: "+this.tiempodepermanencia;
	cadena+="\n Valor x Hora del Vehiculo: "+this.valor;
	cadena+="\n descuento porntiempo de permanencia: " + this.valordescuento;
	cadena+="\nvalor a pagar:"+ this.valortotal;

	return cadena;
}

public void tarifa(){
     if (this.tipodevehiculo != "grande"){
double valortarifa=1;
this.valor=valortarifa;
JOptionPane.showMessageDialog(null,"el valor de la tarifa es:"+valortarifa+"dolar");
}
     else{double valortarifa=2;
     this.valor=valortarifa;
     JOptionPane.showMessageDialog(null,"el valor de la tarifa es:"+valortarifa+"dolar");}
}

public void descuento(double num){
	if (num<3){ this.valordescuento=0; }
	if(num>=3 && num<=9){	this.valordescuento=this.tiempodepermanencia*this.valor;
						    this.valordescuento=(this.valordescuento*5)/100; }
	if(num>9&&num<25){
		this.valordescuento=this.tiempodepermanencia*this.valor;
	this.valordescuento=(this.valordescuento*10)/100;
	}

	if(num>24){
		this.valordescuento=this.tiempodepermanencia*this.valor;
		this.valordescuento=(this.valordescuento*20)/100; }
}
public void calcularPago(){
	double vtotal=(this.tiempodepermanencia*this.valor)-this.valordescuento;
	this.valortotal=vtotal;

}


//esttos son los getter y setter
public String getCliente() {
	return cliente;
}

public void setCliente(String cliente) {
	this.cliente = cliente;
}

public String getMarca() {
	return marca;
}

public void setMarca(String marca) {
	this.marca = marca;
}

public String getPlaca() {
	return placa;
}

public void setPlaca(String placa) {
	this.placa = placa;
}

public double getTiempodepermanencia() {
	return tiempodepermanencia;
}

public void setTiempodepermanencia(double tiempodepermanencia) {
	this.tiempodepermanencia = tiempodepermanencia;
}

public String getTipodevehiculo() {
	return tipodevehiculo;
}

public void setTipodevehiculo(String tipodevehiculo) {
	this.tipodevehiculo = tipodevehiculo;
}

public double getValor() {
	return valor;
}

public void setValor(double valor) {
	this.valor = valor;
}

public double getValordescuento() {
	return valordescuento;
}

public void setValordescuento(double valordescuento) {
	this.valordescuento = valordescuento;
}

public double getValortotal() {
	return valortotal;
}

public void setValortotal(double valortotal) {
	this.valortotal = valortotal;
}

}
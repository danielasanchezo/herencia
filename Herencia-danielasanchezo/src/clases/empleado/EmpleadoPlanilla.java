package clases.empleado;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class EmpleadoPlanilla extends Empleado{

	private double salarioMensual;
	private double porcentajeAdicionalPorHoraExtra;
	
	public void registrarDatos() {
		super.registrarDatos();
		
		salarioMensual=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario Mensaul"));
		porcentajeAdicionalPorHoraExtra=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Procentaje Adicional por Hora Extra"));	
	}
	@Override
	public void imprimirDatosPersonas(String datos) {
		super.imprimirDatosPersonas(datos);
		
		datos= "Salario Mensual: " + salarioMensual + "\n";
		datos+= "Porcentaje Adicional Por Hora Extra: " + porcentajeAdicionalPorHoraExtra + "\n";
		
		System.out.println(datos);
		}
	
	public double getSalarioMensual() {
		return salarioMensual;
	}
	public void setSalarioMensual(double salarioMensual) {
		this.salarioMensual = salarioMensual;
	}
	public double getPorcentajeAdicionalPorHoraExtra() {
		return porcentajeAdicionalPorHoraExtra;
	}
	public void setPorcentajeAdicionalPorHoraExtra(double porcentajeAdicionalPorHoraExtra) {
		this.porcentajeAdicionalPorHoraExtra = porcentajeAdicionalPorHoraExtra;
	}
	
}

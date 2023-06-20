package clases.empleado;
public class EmpleadoEventual extends Empleado{
	private double honorariosPorHora;
	private String fechaTerminoContrato;
	
	public double getHonorariosPorHora() {
		return honorariosPorHora;
	}
	public void setHonorariosPorHora(double honorariosPorHora) {
		this.honorariosPorHora = honorariosPorHora;
	}
	public String getFechaTerminoContrato() {
		return fechaTerminoContrato;
	}
	public void setFechaTerminoContrato(String fechaTerminoContrato) {
		this.fechaTerminoContrato = fechaTerminoContrato;
	}
	
	
	public void imprimirDatosPersonas(String datos) {
	super.imprimirDatosPersonas(datos);
	
	datos="Horararios por Hora: "+ honorariosPorHora + "\n";
	datos+= "Fecha Termino del Contrato:"+fechaTerminoContrato + "\n";
	
	System.out.println(datos);
	}
}


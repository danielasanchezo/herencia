package clases;

import clases.empleado.Medico;

public class CitaMedica {
	private Paciente paciente;
	private Medico medico;
	private String servicio;
	private String fechaConsulta;
	private String horaConsulta;
	private String lugar;
	
	public CitaMedica(Paciente paciente,
			Medico medico, 
			String servicio,
			String fechaConsulta, 
			String horaConsulta,
			String lugar) {
		this.paciente=paciente;
		this.medico=medico;
		this.servicio= servicio;
		this.fechaConsulta=fechaConsulta;
		this.horaConsulta = horaConsulta;
		this.lugar= lugar;
	}
	public String informacionCitaMedica() {
		String datosCita= "<<INFORMACION CITA MEDICA>>\n";
		datosCita="Paciente: "+paciente.getNombre()+ "\n";
		datosCita="Medico: "+paciente.getNombre()+ "\n";
		datosCita="Motivo Consulta: "+servicio+ "\n";
		datosCita="Fecha Consulta: "+fechaConsulta+ "\n";
		datosCita="lugar: "+lugar+ "\n";
		return datosCita;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	public String getServicios() {
		return servicio;
	}
	public void setServicios(String servicios) {
		this.servicio = servicio;
	}
	public String getFechaConsulta() {
		return fechaConsulta;
	}
	public void setFechaConsulta(String fechaConsulta) {
		this.fechaConsulta = fechaConsulta;
	}
	public String getHoraConsulta() {
		return horaConsulta;
	}
	public void setHoraConsulta(String horaConsulta) {
		this.horaConsulta = horaConsulta;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	
}

package clases;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import clases.empleado.EmpleadoEventual;
import clases.empleado.EmpleadoPlanilla;
import clases.empleado.Medico;

public class ModeloDatos {

	HashMap<String, Paciente> pacientesMap;
	HashMap<String, EmpleadoPlanilla> empleadosPlanillaMap;
	HashMap<String, EmpleadoEventual> empleadosEventualMap;
	HashMap<String, Medico> medicosMap;
	ArrayList<CitaMedica> citasList;
	
	public ModeloDatos() {
		pacientesMap=new HashMap<String, Paciente>();
		empleadosPlanillaMap= new HashMap<String, EmpleadoPlanilla>();
		medicosMap= new HashMap<String, Medico>();
		empleadosEventualMap= new HashMap<String, EmpleadoEventual>();
		citasList=new ArrayList<CitaMedica>();
		}
	public void registrarPersona(Paciente miPaciente) {
		pacientesMap.put(miPaciente.getNumeroDeDNI(),miPaciente);
		System.out.println("Se ha registrado el paciente"+ 
		miPaciente.getNombre()+" Saticfactoriamente");
	}
	public void registrarPersona(EmpleadoPlanilla miEmpPlanilla) {
		empleadosPlanillaMap.put(miEmpPlanilla.getNumeroDeDNI(), miEmpPlanilla);
		System.out.println("Se ha registrado el empleado por planilla"+ 
				miEmpPlanilla.getNombre()+" Saticfactoriamente");
	}
	public void registrarPersona(EmpleadoEventual miEmpEventual) {
		empleadosEventualMap.put(miEmpEventual.getNumeroDeDNI(),miEmpEventual);
		System.out.println("Se ha registrado el empleado eventual"+ 
				miEmpEventual.getNombre()+" Saticfactoriamente");
	}
	public void registrarPersona(Medico miMedico) {
		medicosMap.put(miMedico.getNumeroDeDNI(),miMedico);
		System.out.println("Se ha registrado el medico"+ 
				miMedico.getNombre()+" Saticfactoriamente");
	}
	public void registrarCitaMedica(CitaMedica miCita) {
		citasList.add(miCita);
		System.out.println("Se ha registrado la cita exitosamente\n");
		System.out.println(miCita.informacionCitaMedica());
	}
	public void imprimirPacientes() {
		String msj="PACIENTES REGISTRADOS\n";
		Iterator<String> iterator=pacientesMap.keySet().iterator();
		
		while (iterator.hasNext()) {
			String clave = iterator.next();
			pacientesMap.get(clave).imprimirDatosPersonas(msj);
		}
	}
	public void imprimirEmpleadosEventuales() {
		String msj="EMPLEADOS EVENTUALES REGISTRADOS\n";
		for (String clave: empleadosEventualMap.keySet()) {
			empleadosEventualMap.get(clave).imprimirDatosPersonas(msj);
		}
	}
	public void imprimirEmpleadosPorPlanilla() {
		String msj="EMPLEADOS POR PLANILLA REGISTRADOS";
		for (EmpleadoPlanilla empleadoPlanilla: empleadosPlanillaMap.values()) {
			empleadoPlanilla.imprimirDatosPersonas(msj);
		}
		
	}
	public void imprimirMedicos() {
		String msj="MEDICOS REGISTRADOS\n";
		
		for (Map.Entry<String, Medico> elemento : medicosMap.entrySet()) {
			elemento.getValue().imprimirDatosPersonas(msj);			
		}
		
	}
	public Paciente consultarPacientePorDocumento(String documentoPciente) {
		Paciente miPaciente=null;
		
		if (pacientesMap.containsKey(documentoPciente)) {
			miPaciente=pacientesMap.get(documentoPciente);
		}
		return miPaciente;
	}
	public Medico consultarMedicoPorNombre(String nombreMedico) {
		for (Medico medico : medicosMap.values()) {
			if (medico.getNombre().equalsIgnoreCase(nombreMedico)) {
				return medico;
			}
		}
		return null;

	}
	public void imprimirCitasMedicasProgramadas() {
		String msj="CITAS MEDICAS PROGRAMADAS \n";
		CitaMedica miCita=null;
		
		System.out.println(msj + "\n");
		
		if (citasList.size()>0) {
			for (int i = 0; i < citasList.size(); i++) {
				miCita=citasList.get(i);
				System.out.println(miCita.informacionCitaMedica());
			}
		}else {
			System.out.println("No existen citas programadas");
		}
		
	}
	
}

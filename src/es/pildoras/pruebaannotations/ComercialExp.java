package es.pildoras.pruebaannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component // Toma el nombre de la clase comercialExp
@Scope("prototype")
public class ComercialExp implements Empleados {
		
//	@Autowired // Aplicado a un m�todo cualquiers
//	public void nombreIndiferente(CreacionInformeFinanciero nuevoInforme) {
//		this.nuevoInforme = nuevoInforme;
//	}
		
//	@Autowired // Aplicado a un m�todo Setter
//	public void setNuevoInforme(CreacionInformeFinanciero nuevoInforme) {
//		this.nuevoInforme = nuevoInforme;
//	}
	
/*	@Autowired // Busca una clase que implemente CreacionInformeFinanciero y devuelve algo, algo que luego ser� inyectado en nuevoInforme
	public ComercialExp(CreacionInformeFinanciero nuevoInforme) { 
		this.nuevoInforme = nuevoInforme; // this.nuevoInforme toma lo devuelto al final
	}*/

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Vender, vender y vender m�s!!";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
//		return "Informe generado por el comercial";
		return nuevoInforme.getInformeFinanciero(); // Referenciando al actualizado nuevoInforme, llama al m�todo getInformeFinanciero
	}
	
//	private CreacionInformeFinanciero nuevoInforme; // Recibe toda la info. Aqu� almacemos la inyecci�n

	@Autowired // Aplicado a un campo de clase
	@Qualifier("informeFinancieroTrim4") // con el Id del bean que debe utilizar
	private CreacionInformeFinanciero nuevoInforme;
}





/*
		@Scope("prototype")
	Esta anotaci�n permite indicar si los bean creados ser�n de espacios de memoria diferentes o no
	Es importante recordar que el valor por defecto es Singleton

*/
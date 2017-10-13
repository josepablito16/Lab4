// CC2006, Lab 4
// Una clase para representar a los Tenientes.

public class MainMilitar {

	public static void main (String[] args) {

		Militar m = new Militar();
		System.out.println("Hola soy un simple sonldado");
		System.out.println("El militar trabaja: " + m.getHoras()+" horas");
		System.out.println("Su salario es de: " + m.getSalario()+" Quetzales");
		System.out.println("Tiene " + m.getDiasVacaciones()+"" +" dias de vacaiones");
		System.out.println("El color del formulario es : " + m.getFormularioVacaciones());
		System.out.println("___________________________________________________________________");
		System.out.println("");

		Coronel c = new Coronel();
		System.out.println("Soy un coronel!");
		System.out.println("El coronel gana: " + c.getSalario()+" Quetzales");
		c.ejecutaOrdenManiobra();
		System.out.println("___________________________________________________________________");
		System.out.println("");

		Teniente t = new Teniente();
		System.out.println("Soy un teniente!");
		t.tomaOrdenCoronel("JP Cifuentes");
		System.out.println("___________________________________________________________________");
		System.out.println("");

		Soldado s = new Soldado();
		System.out.println("Soy un soldado!");
		System.out.println("El soldado trabaja: " + s.getHoras()+" horas");
		System.out.println("Su salario es de: " + s.getSalario()+" Quetzales");
		System.out.println("Tiene " + s.getDiasVacaciones()+"" +" dias de vacaiones");
		s.recibeOrden();
		System.out.println("___________________________________________________________________");
		System.out.println("");

		General g = new General();
		System.out.println("Soy un general!");
		System.out.println("La cantidad de vacaiones del general es de: " + g.getDiasVacaciones()+"" + " dias en el ano");
		System.out.println("El color de su formulario es de " + g.getFormularioVacaciones());
		g.planificaEstrategia();
		System.out.println("___________________________________________________________________");
		System.out.println("");


	}
}

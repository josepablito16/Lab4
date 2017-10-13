// CC2006, Lab 4
// Una clase para representar a los Tenientes.

public class Soldado extends Militar {

	public int getHoras(){
		return 80;
	}

	public double getSalario() {
        return 30000.0;
    }

    public int getDiasVacaciones() {
        return 5;
    }

    public void recibeOrden () {
        System.out.println("Ordene mi General");
    }
}

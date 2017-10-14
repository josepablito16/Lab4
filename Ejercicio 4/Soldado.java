// CC2006, Lab 4
// Una clase para representar a los Tenientes.

/**
 * @version 13/10/2017
 * @author jose
 */

public class Soldado extends Militar 
{

    /**
     * getHoras
     * @return devuelve las horas que trabaja
     */
	public int getHoras()
        {
		return 80;
	}

        /**
         * getSalario
         * @return devuelve el salario
         */
	public double getSalario() 
        {
        return 30000.0;
    }

        /**
         * getDiasVacaciones
         * @return devuelve los dias de vacaciones que le pagan
         */
    public int getDiasVacaciones() 
    {
        return 5;
    }

    /**
     * recibeOrden
     * este metodo unicamente imprime un mensaje en la consola
     */
    public void recibeOrden () 
    {
        System.out.println("Ordene mi General");
    }
}

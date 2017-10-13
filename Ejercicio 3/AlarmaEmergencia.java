/**
 * @version 13/10/2017
 * @author jose
 */
public class AlarmaEmergencia extends Alarma
{
    /**
     * m1
     * Imprime emergencia 1
     */
	public void m1() 
	{
		System.out.println("emergencia 1");
	}

        /**
         * m2
         * imprime m1 de la clase padre y timbre 1
         */
	public void m2() 
	{
		super.m1();
		System.out.println("timbre 1");
	}

        /**
         * toString
         * Hace resumen del objeto
         * @return super.toString
         */
	public String toString() 
	{
		System.out.println("emergencia");
		return super.toString();

	}





}
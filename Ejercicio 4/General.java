// CC2006, Lab 4
// Una clase para representar a los Generales.

/**
 * @version 13/10/2017
 * @author jose
 */

public class General extends Militar 
{
    /**
     * GetDiasVacaciones
     * @return devuelve los días de vacaciones del general
     */
    public int getDiasVacaciones() 
    {
        return super.getDiasVacaciones() + 5;           // 3 semanas de vacaciones
    }

    /**
     * getFormularioVacaciones
     * @return devuelve el color de formulario del general
     */
    public String getFormularioVacaciones() 
    {
        return "rosado";
    }
    
    /**
     * planificaEstrategia
     * este metodo solo imprime un mensaje en la consola
     */
    public void planificaEstrategia() 
    {
        System.out.println("Llevaremos tres divisiones a la frontera!");
    }
}

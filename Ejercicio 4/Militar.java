// CC2006, Lab 4
// Una clase para representar a los militares en general.

/**
 * @version 13/10/2017
 * @author jose
 */

public class Militar {
    
    /**
     * getHoras
     * @return devuelve cuantas horas trabaja el militar
     */
    public int getHoras() 
    {
        return 40;           // trabaja 40 horas / semana
    }
    
    /**
     * getSalario
     * @return devuelve cual es el salario del militar
     */
    public double getSalario() 
    {
        return 40000.0;      // Q40,000.00 / anio
    }
    
    /**
     * getDiasVacaciones
     * @return devuelve los dias de vacaciones pagadas
     */
    public int getDiasVacaciones() 
    {
        return 10;           // 2 semanas de vacaciones pagadas
    }

    /**
     * getFormularioVacaciones
     * @return devuelve el color de formulario del militar
     */
    public String getFormularioVacaciones() 
    {
        return "amarillo";     // use el formulario amarillo
    }
}

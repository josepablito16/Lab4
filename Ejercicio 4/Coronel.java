/**
 * @version 13/10/2017
 * Esta clase contienen las propiedades 
 * @author jose
 */

/**
 * @version 13/10/2017
 * @author jose
 */
public class Coronel extends Teniente {
    public double getSalario() {
        return super.getSalario() + 5000.0;      // Q45,000.00 / anio
    }
    
    public void ejecutaOrdenManiobra() {
        System.out.println("Presenten Armas!");
    }
}

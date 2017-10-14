// CC2006, Lab 4
// Una clase para representar a los Tenientes.

/**
 * @version 13/10/2017
 * @author jose
 */

public class Teniente extends Militar 
{
    /**
     * tomarOrdenCoronel
     * @param texto nombre del coronel
     */
    public void tomaOrdenCoronel(String texto) {
        System.out.println("Tomando orden del Coronel: " + texto);
    }
}

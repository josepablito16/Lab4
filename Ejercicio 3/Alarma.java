/**
 * @version 13/10/2017
 * Esta clase contienen las propiedades 
 * @author jose
 */

public class Alarma extends Timbre {
	public void m1() {
		System.out.println("alarma 1");
	}
	 
	public void m2() {
		super.m1();
	}
	 
	public String toString() {
		return super.toString() + "…" + super.toString();
	}
}

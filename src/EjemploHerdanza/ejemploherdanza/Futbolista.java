
package ejemploherdanza;

/**
 *
 * @author dam1
 */
public class Futbolista extends SeleccionFutbol{
    private int dorsal;
    private String demarcacion;
    public Futbolista() {
    }
    public Futbolista(int dorsal, String demarcacion, int id, String nome, String apellidos, int edad) {
        super(id, nome, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }
    public int getDorsal() {
        return dorsal;
    }
    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }
    public String getDemarcacion() {
        return demarcacion;
    }
    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }
    @Override
    public String toString() {
        return super.toString() +"dorsal=" + dorsal + ", demarcacion=" + demarcacion;
    }
    public void jugarPartido(){
        System.out.println("Juegan los futbolistas");
    }
    public void entrenar(){
        System.out.println("Entrenan los futbolistas");
    }
}
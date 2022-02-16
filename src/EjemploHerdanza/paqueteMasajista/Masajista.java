
package paqueteMasajista;

import ejemploherdanza.SeleccionFutbol;

/**
 *
 * @author dam1
 */
public class Masajista extends SeleccionFutbol{
    private String titulacion;
    private int añosExperencia;
    public Masajista() {
    }
    public Masajista(String titulacion, int añosExperencia, int id, String nome, String apellidos, int edad) {
        super(id, nome, apellidos, edad);
        this.titulacion = titulacion;
        this.añosExperencia = añosExperencia;
    }
    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAñosExperencia() {
        return añosExperencia;
    }

    public void setAñosExperencia(int añosExperencia) {
        this.añosExperencia = añosExperencia;
    }         
    @Override
    public String toString() {
        return "titulacion=" + titulacion + ", añosExperencia=" + añosExperencia ;
    }
    void darMasaje(){
        System.out.println("El masajista da masajes");
    }
    @Override
    public void viajar(){
        System.out.println("El masajista viaja en avión");
    }
    public void metodo(){
//        this.viajar();
        super.viajar();
    }
}

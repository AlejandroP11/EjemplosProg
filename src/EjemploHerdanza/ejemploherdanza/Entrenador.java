
package ejemploherdanza;

/**
 *
 * @author dam1
 */
public class Entrenador extends SeleccionFutbol {
    private String idFederacion;
    public Entrenador() {
    }
    public Entrenador(String idFederacion, int id, String nome, String apellidos, int edad) {
        super(id, nome, apellidos, edad);
        this.idFederacion = idFederacion;
    }
    public String getIdFederacion() {
        return idFederacion;
    }
    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }
    @Override
    public String toString() {
        return "idFederacion=" + idFederacion ;
    }
    public void dirigirPartido(){
        System.out.println("El entrenador dirige el partido");
    }
    public void dirigirEntrenamiento(){
        System.out.println("El entrenador dirige el entrenamiento");

    }
    
    
}

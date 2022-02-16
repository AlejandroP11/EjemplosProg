
package ejemploherdanza;

/**
 *
 * @author dam1
 */
public class SeleccionFutbol {
    private int id;
    private String nome;
    private String apellidos;
    private int edad;
    public SeleccionFutbol() {
    }
    public SeleccionFutbol(int id, String nome, String apellidos, int edad) {
        this.id = id;
        this.nome = nome;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    @Override
    public String toString() {
        return "id=" + id + ", nome=" + nome + ", apellidos=" + apellidos + ", edad=" + edad ;
    }    
    public void concentrarse(){
        System.out.println("Se concentra la selección");
    }
    protected void viajar(){
        System.out.println("Viaja la selección");
    }
}

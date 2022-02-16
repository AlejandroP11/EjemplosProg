
package Ejemploarrayobjetos;

import java.util.Objects;

/**
 *
 * @author dam1
 */
public class Alumnado implements Comparable{
    private String nombre;
    private int nota;
    public Alumnado() {
    }
    public Alumnado(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getNota() {
        return nota;
    }
    public void setNota(int nota) {
        this.nota = nota;
    }
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.nombre);
        hash = 59 * hash + this.nota;
        return hash;
    }
    @Override
    public boolean equals(Object obj){
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumnado other = (Alumnado) obj;
        if (this.nota != other.nota) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Object o) {
        Alumnado al=(Alumnado) o;
        if(this.nombre.compareToIgnoreCase(al.nombre)>0)
            return 1;
        else if(this.nombre.compareToIgnoreCase(al.nombre)<0)
            return -1;
        else
            return 0;
    }
}

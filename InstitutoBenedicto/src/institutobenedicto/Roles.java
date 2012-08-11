
package institutobenedicto;

/**
 *
 * @author Frank Maura
 */
public class Roles {

    private String Nombrerol;
    private String modulo;
    private int nuevo;
    private int editar;
    private int eliminar;
    private int acceso;

    public Roles(String Nombrerol, String modulo, int nuevo, int editar, int eliminar,int acceso) {
        this.Nombrerol = Nombrerol;
        this.modulo = modulo;
        this.nuevo = nuevo;
        this.editar = editar;
        this.eliminar = eliminar;
        this.acceso=acceso;

    }

    public Roles() {
    }

    public String getNombrerol() {
        return Nombrerol;
    }

    public void setNombrerol(String Nombrerol) {
        this.Nombrerol = Nombrerol;
    }

    public int getEditar() {
        return editar;
    }

    public void setEditar(int editar) {
        this.editar = editar;
    }

    public int getEliminar() {
        return eliminar;
    }

    public void setEliminar(int eliminar) {
        this.eliminar = eliminar;
    }

    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }

    public int getNuevo() {
        return nuevo;
    }

    public void setNuevo(int nuevo) {
        this.nuevo = nuevo;
    }

    public int getAcceso() {
        return acceso;
    }

    public void setAcceso(int acceso) {
        this.acceso = acceso;
    }

    

}

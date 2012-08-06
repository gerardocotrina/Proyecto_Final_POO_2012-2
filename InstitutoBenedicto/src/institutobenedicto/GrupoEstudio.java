/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package institutobenedicto;

import java.util.Date;

/**
 *
 * @author CARLOS
 */
public class GrupoEstudio {
private String nombre;
private String descripcion;
private String academia;
private String curso;
private String fechainicio;
private String fechafin ;
private String link;
private String aula;
private String local;
private String coordenadas;
private String estado;



    public GrupoEstudio(String nombre, String descripcion, String academia, String curso, String fechainicio, String fechafin, String link, String aula, String local, String coordenadas,String estado) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.academia = academia;
        this.curso = curso;
        this.fechainicio = fechainicio;
        this.fechafin = fechafin;
        this.link = link;
        this.aula = aula;
        this.local = local;
        this.coordenadas = coordenadas;
        this.estado=estado;

    }

    public GrupoEstudio() {
    }

    public String getAcademia() {
        return academia;
    }

    public void setAcademia(String academia) {
        this.academia = academia;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public String getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(String coordenadas) {
        this.coordenadas = coordenadas;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFechafin() {
        return fechafin;
    }

    public void setFechafin(String fechafin) {
        this.fechafin = fechafin;
    }

    public String getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(String fechainicio) {
        this.fechainicio = fechainicio;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
public String getEstado(){
    return estado;
}

public void setEstado(String estado){
    this.estado=estado;
}


}

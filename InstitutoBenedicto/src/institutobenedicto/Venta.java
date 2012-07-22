/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package institutobenedicto;


import java.sql.Date;


/**
 *
 * @author CARLOS
 */
public class Venta {

    private String concepto;
    private String numero;
    private String fechaemision;
    private String empresa;
    private String fechavencimiento;
    private String fechapago;
    private String estado;

    public Venta(String concepto,String numero,String fechaemision, String empresa, String fechavencimiento, String fechapago, String estado){
        this.concepto=concepto;
        this.numero=numero;
        this.fechaemision=fechaemision;
        this.empresa=empresa;
        this.fechavencimiento=fechavencimiento;
        this.fechapago=fechapago;
        this.estado=estado;

    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFechaemision() {
        return fechaemision;
    }

    public void setFechaemision(String fechaemision) {
        this.fechaemision = fechaemision;
    }

    public String getFechapago() {
        return fechapago;
    }

    public void setFechapago(String fechapago) {
        this.fechapago = fechapago;
    }

    public String getFechavencimiento() {
        return fechavencimiento;
    }

    public void setFechavencimiento(String fechavencimiento) {
        this.fechavencimiento = fechavencimiento;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

}

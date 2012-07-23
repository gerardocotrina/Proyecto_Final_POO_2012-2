/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package institutobenedicto;

/**
 *
 * @author CARLOS
 */
public class Compra {
private String concepto;
private String numero;
private String fechaemision;
private String empresa;
private String fechapago;
private String fechavencimiento;
private String estado;
private String observaciones;
private Double subtotal;
private Double total;
private Double igv;
private String moneda;

public Compra(String concepto,String numero ,String fechaemision,String empresa,String fechapago,String fechavencimiento,String estado,String observaciones,Double subtotal,String moneda){
    this.concepto=concepto;
    this.numero=numero;
    this.fechavencimiento=fechavencimiento;
    this.empresa=empresa;
    this.fechapago=fechapago;
    this.fechaemision=fechaemision;
    this.estado=estado;
    this.observaciones=observaciones;
    this.moneda=moneda;
    this.subtotal=subtotal;
    calcularigv();
    calculatotal();

}

    public double getSubtotal(){
        return subtotal;
    }

    private void setSubtotal(Double subtotal){
        this.subtotal=subtotal;
    }

    public String getMoneda(){
        return moneda;
    }

    public void setMoneda(String moneda){
        this.moneda=moneda;
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
    public String getObservaciones(){
        return observaciones;

    }
    public void setObservaciones(String observaciones){
        this.observaciones=observaciones;
    }

    public Double getIgv(){
        return igv;
    }

    public Double getTotal(){
        return total;
    }

    private void calcularigv(){
        this.igv=this.subtotal * 0.18;
    }

    private void calculatotal(){
        this.total=this.igv + this.subtotal;

    }
}

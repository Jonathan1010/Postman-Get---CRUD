/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author USUARIO
 */
@Entity
@Table(name = "venta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Venta.findAll", query = "SELECT v FROM Venta v")
    , @NamedQuery(name = "Venta.findByIdVenta", query = "SELECT v FROM Venta v WHERE v.idVenta = :idVenta")
    , @NamedQuery(name = "Venta.findByCodProducto", query = "SELECT v FROM Venta v WHERE v.codProducto = :codProducto")
    , @NamedQuery(name = "Venta.findByCedComprador", query = "SELECT v FROM Venta v WHERE v.cedComprador = :cedComprador")
    , @NamedQuery(name = "Venta.findByNomProducto", query = "SELECT v FROM Venta v WHERE v.nomProducto = :nomProducto")
    , @NamedQuery(name = "Venta.findByMateProducto", query = "SELECT v FROM Venta v WHERE v.mateProducto = :mateProducto")
    , @NamedQuery(name = "Venta.findByTipoProducto", query = "SELECT v FROM Venta v WHERE v.tipoProducto = :tipoProducto")
    , @NamedQuery(name = "Venta.findByCantidad", query = "SELECT v FROM Venta v WHERE v.cantidad = :cantidad")
    , @NamedQuery(name = "Venta.findByPrecio", query = "SELECT v FROM Venta v WHERE v.precio = :precio")
    , @NamedQuery(name = "Venta.findByFecha", query = "SELECT v FROM Venta v WHERE v.fecha = :fecha")
    , @NamedQuery(name = "Venta.findByPreTotal", query = "SELECT v FROM Venta v WHERE v.preTotal = :preTotal")})
public class Venta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "id_venta")
    private String idVenta;
    @Size(max = 10)
    @Column(name = "cod_producto")
    private String codProducto;
    @Size(max = 10)
    @Column(name = "ced_comprador")
    private String cedComprador;
    @Size(max = 45)
    @Column(name = "nom_producto")
    private String nomProducto;
    @Size(max = 45)
    @Column(name = "mate_producto")
    private String mateProducto;
    @Size(max = 45)
    @Column(name = "tipo_producto")
    private String tipoProducto;
    @Size(max = 10)
    @Column(name = "cantidad")
    private String cantidad;
    @Size(max = 10)
    @Column(name = "precio")
    private String precio;
    @Size(max = 20)
    @Column(name = "fecha")
    private String fecha;
    @Size(max = 10)
    @Column(name = "pre_Total")
    private String preTotal;

    public Venta() {
    }

    public Venta(String idVenta) {
        this.idVenta = idVenta;
    }

    public String getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(String idVenta) {
        this.idVenta = idVenta;
    }

    public String getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(String codProducto) {
        this.codProducto = codProducto;
    }

    public String getCedComprador() {
        return cedComprador;
    }

    public void setCedComprador(String cedComprador) {
        this.cedComprador = cedComprador;
    }

    public String getNomProducto() {
        return nomProducto;
    }

    public void setNomProducto(String nomProducto) {
        this.nomProducto = nomProducto;
    }

    public String getMateProducto() {
        return mateProducto;
    }

    public void setMateProducto(String mateProducto) {
        this.mateProducto = mateProducto;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getPreTotal() {
        return preTotal;
    }

    public void setPreTotal(String preTotal) {
        this.preTotal = preTotal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idVenta != null ? idVenta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Venta)) {
            return false;
        }
        Venta other = (Venta) object;
        if ((this.idVenta == null && other.idVenta != null) || (this.idVenta != null && !this.idVenta.equals(other.idVenta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Venta[ idVenta=" + idVenta + " ]";
    }
    
}

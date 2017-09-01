
import java.util.ArrayList;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jefry Hernandez
 */
public class Usuario {

    private String nombre;
    private String apellido;
    private String contraseña;
    private Date fecha;
    private String pais;
    private String numero;
    private String correo;
    private ArrayList<Mensaje> leido = new ArrayList();
    private ArrayList<Mensaje> no_leido = new ArrayList();
    private ArrayList<Mensaje> spam = new ArrayList();
    private ArrayList<Mensaje> borrador = new ArrayList();
    private ArrayList<Mensaje> enviado = new ArrayList();
    private ArrayList<Mensaje> eliminado = new ArrayList();
    private ArrayList<Mensaje> importante = new ArrayList();
    private ArrayList<Mensaje> no_deseado = new ArrayList();

    public Usuario(String nombre, String apellido, String contraseña, Date fecha, String pais, String numero, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.contraseña = contraseña;
        this.fecha = fecha;
        this.pais = pais;
        this.numero = numero;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public ArrayList<Mensaje> getLeido() {
        return leido;
    }

    public void setLeido(ArrayList<Mensaje> leido) {
        this.leido = leido;
    }

    public ArrayList<Mensaje> getNo_leido() {
        return no_leido;
    }

    public void setNo_leido(ArrayList<Mensaje> no_leido) {
        this.no_leido = no_leido;
    }

    public ArrayList<Mensaje> getSpam() {
        return spam;
    }

    public void setSpam(ArrayList<Mensaje> spam) {
        this.spam = spam;
    }

    public ArrayList<Mensaje> getBorrador() {
        return borrador;
    }

    public void setBorrador(ArrayList<Mensaje> borrador) {
        this.borrador = borrador;
    }

    public ArrayList<Mensaje> getEnviado() {
        return enviado;
    }

    public void setEnviado(ArrayList<Mensaje> enviado) {
        this.enviado = enviado;
    }

    public ArrayList<Mensaje> getEliminado() {
        return eliminado;
    }

    public void setEliminado(ArrayList<Mensaje> eliminado) {
        this.eliminado = eliminado;
    }

    public ArrayList<Mensaje> getImportante() {
        return importante;
    }

    public void setImportante(ArrayList<Mensaje> importante) {
        this.importante = importante;
    }

    public ArrayList<Mensaje> getNo_deseado() {
        return no_deseado;
    }

    public void setNo_deseado(ArrayList<Mensaje> no_deseado) {
        this.no_deseado = no_deseado;
    }

  
}

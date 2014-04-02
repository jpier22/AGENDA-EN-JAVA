package Pojo;
// Generated 02-abr-2014 11:55:25 by Hibernate Tools 3.6.0


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Tusuarioamigo generated by hbm2java
 */
public class Tusuarioamigo  implements java.io.Serializable {


     private String codigoUsuarioAmigo;
     private Tusuario tusuario;
     private String nombre;
     private String apellidoPaterno;
     private String apellidoMaterno;
     private String correoElectronico;
     private String contrasenia;
     private Date fechaNacimiento;
     private boolean sexo;
     private Date fechaRegistro;
     private Date fechaModificacion;
     private Set tusuarioamigotelefonos = new HashSet(0);
     private Set tactividadparticipantes = new HashSet(0);
     private Set tactividadcomentarios = new HashSet(0);

    public Tusuarioamigo() {
    }

	
    public Tusuarioamigo(String codigoUsuarioAmigo, Tusuario tusuario, String nombre, String apellidoPaterno, String apellidoMaterno, String correoElectronico, String contrasenia, Date fechaNacimiento, boolean sexo, Date fechaRegistro, Date fechaModificacion) {
        this.codigoUsuarioAmigo = codigoUsuarioAmigo;
        this.tusuario = tusuario;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.correoElectronico = correoElectronico;
        this.contrasenia = contrasenia;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.fechaRegistro = fechaRegistro;
        this.fechaModificacion = fechaModificacion;
    }
    public Tusuarioamigo(String codigoUsuarioAmigo, Tusuario tusuario, String nombre, String apellidoPaterno, String apellidoMaterno, String correoElectronico, String contrasenia, Date fechaNacimiento, boolean sexo, Date fechaRegistro, Date fechaModificacion, Set tusuarioamigotelefonos, Set tactividadparticipantes, Set tactividadcomentarios) {
       this.codigoUsuarioAmigo = codigoUsuarioAmigo;
       this.tusuario = tusuario;
       this.nombre = nombre;
       this.apellidoPaterno = apellidoPaterno;
       this.apellidoMaterno = apellidoMaterno;
       this.correoElectronico = correoElectronico;
       this.contrasenia = contrasenia;
       this.fechaNacimiento = fechaNacimiento;
       this.sexo = sexo;
       this.fechaRegistro = fechaRegistro;
       this.fechaModificacion = fechaModificacion;
       this.tusuarioamigotelefonos = tusuarioamigotelefonos;
       this.tactividadparticipantes = tactividadparticipantes;
       this.tactividadcomentarios = tactividadcomentarios;
    }
   
    public String getCodigoUsuarioAmigo() {
        return this.codigoUsuarioAmigo;
    }
    
    public void setCodigoUsuarioAmigo(String codigoUsuarioAmigo) {
        this.codigoUsuarioAmigo = codigoUsuarioAmigo;
    }
    public Tusuario getTusuario() {
        return this.tusuario;
    }
    
    public void setTusuario(Tusuario tusuario) {
        this.tusuario = tusuario;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidoPaterno() {
        return this.apellidoPaterno;
    }
    
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }
    public String getApellidoMaterno() {
        return this.apellidoMaterno;
    }
    
    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }
    public String getCorreoElectronico() {
        return this.correoElectronico;
    }
    
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    public String getContrasenia() {
        return this.contrasenia;
    }
    
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    public Date getFechaNacimiento() {
        return this.fechaNacimiento;
    }
    
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public boolean isSexo() {
        return this.sexo;
    }
    
    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }
    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }
    
    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    public Date getFechaModificacion() {
        return this.fechaModificacion;
    }
    
    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }
    public Set getTusuarioamigotelefonos() {
        return this.tusuarioamigotelefonos;
    }
    
    public void setTusuarioamigotelefonos(Set tusuarioamigotelefonos) {
        this.tusuarioamigotelefonos = tusuarioamigotelefonos;
    }
    public Set getTactividadparticipantes() {
        return this.tactividadparticipantes;
    }
    
    public void setTactividadparticipantes(Set tactividadparticipantes) {
        this.tactividadparticipantes = tactividadparticipantes;
    }
    public Set getTactividadcomentarios() {
        return this.tactividadcomentarios;
    }
    
    public void setTactividadcomentarios(Set tactividadcomentarios) {
        this.tactividadcomentarios = tactividadcomentarios;
    }




}



package models;

public class UserModel {
    private String dni;
    private String apellidos;
    private String nombres;
    private String correoElectronico;
    private String tipoUsuario;
    private String contrasenia;
    
    public UserModel(String dni, String apellidos, String nombres, String correoElectronico, String tipoUsuario, String contrasenia) {
        this.dni = dni;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.correoElectronico = correoElectronico;
        this.tipoUsuario = tipoUsuario;
        this.contrasenia = contrasenia;
    }

    public UserModel() {
    }
    
    // Métodos getter y setter para cada atributo
    public String getDni() {
        return dni;
    }
    
    public void setDni(String dni) {
        this.dni = dni;
    }
    
    public String getApellidos() {
        return apellidos;
    }
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    public String getNombres() {
        return nombres;
    }
    
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    
    public String getCorreoElectronico() {
        return correoElectronico;
    }
    
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    
    public String getTipoUsuario() {
        return tipoUsuario;
    }
    
    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    
    public String getContrasenia() {
        return contrasenia;
    }
    
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
}

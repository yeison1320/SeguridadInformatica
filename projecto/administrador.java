/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udecaldas.edu.co.projecto;

/**
 *
 * @author yeiso
 */
public class administrador extends Persona {
    
	
	private String idadministrador;
        private String contrasena;
        
	

	public administrador(String cedula, String nombre, String correoElectronico, String area) {
		super(cedula, nombre, correoElectronico, area);
		// TODO Auto-generated constructor stub
	}

    /**
     * @return the idadministrador
     */
    public String getIdadministrador() {
        return idadministrador;
    }

    /**
     * @param idadministrador the idadministrador to set
     */
    public void setIdadministrador(String idadministrador) {
        this.idadministrador = idadministrador;
    }

    /**
     * @return the contrasena
     */
    public String getContrasena() {
        return contrasena;
    }

    /**
     * @param contrasena the contrasena to set
     */
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

}


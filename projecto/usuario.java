/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udecaldas.edu.co.projecto;

/**
 *
 * @author yeiso
 */
public class usuario extends Persona {
	
	private String idUsuario;
        private String contrasena;
        


	

	public usuario(String cedula, String nombre, String correoElectronico, String area) {
		super(cedula, nombre, correoElectronico, area);
		// TODO Auto-generated constructor stub
	}

    /**
     * @return the idUsuario
     */
    public String getIdUsuario() {
        return idUsuario;
    }

    /**
     * @param idUsuario the idUsuario to set
     */
    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
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
    


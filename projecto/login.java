/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udecaldas.edu.co.projecto;

import java.util.ArrayList;
import java.util.List;
import udecaldas.edu.co.ui.logins;

/**
 *
 * @author yeiso
 */
public class login {
    private List<usuario> usuarios = new ArrayList<>();
    private List<administrador> administradores = new ArrayList<>();

    
    public void agregarUsuario(usuario user) {
        usuarios.add(user);
    }
    public void agregarAdministrador(administrador admin) {
        administradores.add(admin);
    }
    
    public usuario autenticarUsuario(String cedula, String contrasena) {
        for (usuario u : usuarios) {
            if (u.getCedula().equals(cedula) && u.getContrasena().equals(contrasena)) {
                return u; // Si las credenciales coinciden, devuelve el usuario
            }
        }
        return null; // Si no encuentra un usuario con esas credenciales, devuelve null
    }
     // Autenticar administrador
    public administrador autenticarAdministrador(String cedula, String contrasena) {
        for (administrador a : administradores) {
            if (a.getCedula().equals(cedula) && a.getContrasena().equals(contrasena)) {
                return a; // Si las credenciales coinciden, devuelve el administrador
            }
        }
        return null; // Si no encuentra un administrador con esas credenciales, devuelve null
    }
    
}

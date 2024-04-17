/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package h;

/**
 *
 * @author Admin
 */
public class H {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear objeto Clase Padre
        Humano adulto=new Humano();
        adulto.setNombre("manuelle");
    adulto.comer(adulto.getNombre());
    adulto.dormir();
    
        System.out.println();
    //Crear Objeto Clase Hija
    Hombre padre=new Hombre();
    padre.setNombre("nicolas");
    padre.comer(padre.getNombre());
    padre.dormir();
    padre.afeitarse();
        System.out.println();
    //Crear Objeto Clase Hija ->Mujer
    Mujer madre=new Mujer();
    madre.setNombre("Gloria");
    madre.comer(madre.getNombre());
    madre.dormir();
    madre.maquillarse(madre.getNombre());
    }
    
}

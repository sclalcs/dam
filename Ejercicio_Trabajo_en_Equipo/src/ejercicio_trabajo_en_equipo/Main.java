/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio_trabajo_en_equipo;


public class Main {

    public static void main(String[] args) {
        CCuenta Cuenta1; 
                
               
        double saldoActual;
  

        Cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        Cuenta1.operativa_Cuenta(2500,500);
        saldoActual = Cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );
        System.out.println("Esto es para el repositorio remoto");
        System.out.println("Esto es otro para el repositorio remoto");
        System.out.println("Mandar repositorio desde proyecto");
        System.out.println("Mandar pull desde repositorio en GitHub.com");
        System.out.println("nuevo Clone del proyecto, add, commit y push");
        System.out.println("nuevo Clone y rama nueva");
        System.out.println("segunda rama nueva add commit y push");
        
    }
}

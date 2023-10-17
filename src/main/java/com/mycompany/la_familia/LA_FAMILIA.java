/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.la_familia;

import javax.swing.JOptionPane;

/**
 *
 * @author Tony
 */
public class LA_FAMILIA {

    public static void main(String[] args) {
        //Bienvenida al programa.
        JOptionPane.showMessageDialog(null, "¡Bienvenido al supermercado La Fama!");

        // Variable para guardar las opciones del menu.
        int opcion;
        do {
            String menu = "Seleccione una opción:\n"
                    + "1. Registro de productos.\n"
                    + "2. Organizar producto en pasillo.\n"
                    + "3. Realizar compra de producto.\n"
                    + "4. Retiro de un producto.\n"
                    + "5. Modulo de reportes.\n"
                    + "6. Salir.";
            
            // El try nos va ayudar a eliminar el error a pasar un string a int.
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
            } catch (NumberFormatException e) {
                opcion = 0;
            }

            // Inicio del menu con las opciones.
            switch (opcion) {
                case 1:
                    
                    break;
                    
                case 2:
                    
                    break;
                    
                case 3:
                    
                    break;
                    
                case 4:
                    
                    break;
                    
                case 5:
                    /*5.1 Reporte producto.
                      5.2 Reporte organizacion de productos.
                      5.3 Reporte de caducidad.
                      5.4 Reporte del resumen de compras.
                    */
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "¡Hasta luego!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 6);        
    }
}

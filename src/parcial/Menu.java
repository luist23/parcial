/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author LuisT23
 */
public class Menu {
    private static Menu menu;
    private ListaPack listaPack;
    
    private Menu(){}
    
    
    public static Menu getInstance() {
        if (menu == null) {
            menu = new Menu();
        }
        return menu;
    }
    
    public void opciones() {
        System.out.println("----- Menu -----");
        System.out.println("1. Menu de Reservaciones");
        System.out.println("2. Administrar Hotel");
        System.out.println("3. Salir");
    }
     public void opcionesReserva(){
         System.out.println("1. Mostar reservaciones de la semana");
         System.out.println("2. crear nueva reservacion");
         System.out.println("3. editar reservacion existente");
         System.out.println("4. eliminar reservacion");
         System.out.println("5. regresar a menu principal");  
     }
     
     public void opcionesAdministracion(){
         System.out.println("1. habilitar habitacion");
         System.out.println("2. habilitar piso");
         System.out.println("3. habilitar todo");
         System.out.println("4. deshabilitar habitacion");
         System.out.println("5. deshabilitar piso");
         System.out.println("6. cambiar precio base de habitacion");
         System.out.println("7. modificar paquete");
         System.out.println("8. regresar a menu principal");
     }
     
     public void opcionesPack(){
         System.out.println("1. crear Pack");
         System.out.println("2. eliminar Pack");
         System.out.println("3. editar Pack");
         System.out.println("4. volver al menu de administracion");
     }
     
     
    public void mostrar() {
        int opcion = 4;
        Scanner leer = new Scanner(System.in);
        
        while (opcion != 3) {
            opciones();
            try {
                opcion = leer.nextInt();

                switch (opcion) {
                    case 1:
                        //estudiantes.add();
                        break;
                    case 2:
                        //estudiantes.mostrar();
                        break;
                    case 3:
                        System.out.println("Adios :(");
                        break;
                    default:
                        System.out.println("Por favor ingrese una opcion valida");
                }
            } catch (InputMismatchException e) {
                System.err.println("Por favor, Ingrese un número");
                leer.nextLine();
            }
        }
    }
    
    public void packetes(){
        System.out.println("------SubMenu Packetes------");
        int opcion = 4;
        Scanner leer = new Scanner(System.in);
        
        while (opcion != 3) {
            opcionesPack();
            try {
                opcion = leer.nextInt();

                switch (opcion) {
                    case 1:
                        listaPack.nuevoPack();
                        break;
                    case 2:
                        listaPack.removePack();
                        break;
                    case 3:
                        listaPack.editarPack();
                        break;
                    case 4:
                        System.out.println("adios :v");
                        break;
                    default:
                        System.out.println("Por favor ingrese una opcion valida");
                }
            } catch (InputMismatchException e) {
                System.err.println("Por favor, Ingrese un número");
                leer.nextLine();
            }
        }
    }
    
    
    
    
}

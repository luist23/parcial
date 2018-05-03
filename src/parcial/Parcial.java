/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

/**
 *
 * @author LuisT23
 */
public class Parcial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Menu menu = null;
        ListaPack listaPack= new ListaPack();
        paquetesIniciales(listaPack);//inicializando los paquetes
        Menu menu = Menu.getInstance();
        menu.listaPack=listaPack;
        menu.mostrar();
    }
    
    public static void paquetesIniciales(ListaPack lista){
        Pack nuevo= new Pack();
        nuevo.setPrecio(150);
        nuevo.setNombre("PREMIUM");
        nuevo.addVeneficio("Acceso a Buffet");
        nuevo.addVeneficio("Acceso a Piscina");
        nuevo.addVeneficio("Servicio a la Habitacion");
        nuevo.addVeneficio("Acceso a Minibar");
        nuevo.addVeneficio("Acceso a Internet");
        nuevo.addVeneficio("Acceso a Buffet");
        Pack nuevo2=new Pack();
        nuevo2.setNombre("Basico");
        nuevo2.setPrecio(10);
        nuevo2.addVeneficio("Acceso a Piscina");
        nuevo2.addVeneficio("Acceso a Internet");
        lista.add(nuevo);
        lista.add(nuevo2);
        
    }
    
}

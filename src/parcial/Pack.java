/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

import java.util.ArrayList;

/**
 *
 * @author LuisT23
 */
public class Pack {
    private ArrayList<String> veneficios;
    private String nombre;
    private int precio;
   
    public Pack(){
        veneficios= new ArrayList<>();
    }
    public void addVeneficio(String veneficio){
        veneficios.add(veneficio);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public void removeServicio(String servicio){
        for (String a : veneficios){
            if (a == servicio){
                veneficios.remove(a);
            }
        }
    }
    public void veneficios(){
        int i= 1;
        for (String e:veneficios){
            System.out.println(i+ ". " + e);
            i++;
        }
    }
    
}

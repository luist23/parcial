/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LuisT23
 */
public class ListaCliente {
    public ArrayList<Cliente> clientes;
    
    public ListaCliente(){
        clientes=new ArrayList<>();
    }
    public void nuevoCliene(){
        Cliente nuevo= new Cliente();
        clientes.add(nuevo);
        Scanner leer=new Scanner(System.in);
        
    }
    
    
}

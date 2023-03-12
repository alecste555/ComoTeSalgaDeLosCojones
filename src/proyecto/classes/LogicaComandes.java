/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.classes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Icheclin
 */
public class LogicaComandes {
    private static List<Comanda> comandes = new ArrayList<>();

    
    public static void afegirComanda(Comanda objClientEntrada) {
        comandes.add(objClientEntrada);} 

    public static List<Comanda> getLlistaComandes() {
        return comandes;
    }
    public static void eliminarComanda(Integer id){
        comandes.remove(id);
    }
    public static boolean hasComanda(int taula){
        int i=0;
        boolean found=false;
        if(!comandes.isEmpty()){
        while ((i<comandes.size()) && !found) {
            if(comandes.get(i).getTaula()==taula && !comandes.get(i).isPagada()){
            found=true;
            }
            i++;
        }}
        return found;
    }
}

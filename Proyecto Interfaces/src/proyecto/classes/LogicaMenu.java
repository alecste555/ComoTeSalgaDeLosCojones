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
public class LogicaMenu {
    private static ArrayList<Plat> menu = new ArrayList<>();

    public static void afegirComanda(Plat objClientEntrada) {
        menu.add(objClientEntrada);} 

    public static ArrayList<Plat> getMenu() {
        return menu;
    }
    public static Plat getPlat(String plat2){
        for (Plat plat : menu) {
            if(plat.getNom().equals(plat2)){
            return plat;
            }
        }
        return null;
    }
}

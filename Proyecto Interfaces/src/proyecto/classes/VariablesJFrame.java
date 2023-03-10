/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.classes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author KAOS
 */
public class VariablesJFrame {
    public static String nomRestaurant;
    public static String idiomaRestaurant;
    public static SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy, HH:mm");
    public static Date horaCierreRestaurant;
    public static int validacionLicencia = 0;
    public static int validacionCamarero = 0;
    public static int validacionMenu = 0;
    public static int hecho = 0;

    public SimpleDateFormat getFormatter() {
        return formatter;
    }

    public void setFormatter(SimpleDateFormat formatter) {
        this.formatter = formatter;
    }

    public int getValidacionLicencia() {
        return validacionLicencia;
    }

    public void setValidacionLicencia(int validacionLicencia) {
        this.validacionLicencia = validacionLicencia;
    }

    public int getValidacionCamarero() {
        return validacionCamarero;
    }

    public void setValidacionCamarero(int validacionCamarero) {
        this.validacionCamarero = validacionCamarero;
    }

    public int getValidacionMenu() {
        return validacionMenu;
    }

    public void setValidacionMenu(int validacionMenu) {
        this.validacionMenu = validacionMenu;
    }

    public int getHecho() {
        return hecho;
    }

    public void setHecho(int hecho) {
        this.hecho = hecho;
    }
    

    public String getNomRestaurant() {
        return nomRestaurant;
    }

    public String getIdiomaRestaurant() {
        return idiomaRestaurant;
    }

    public Date getHoraCierreRestaurant() {
        return horaCierreRestaurant;
    }

    public static void setConfigRestaurante(String nom, String idioma, Date horaCierre) throws ParseException {
        nomRestaurant = nom;
        idiomaRestaurant = idioma;
        horaCierreRestaurant = horaCierre;
    }
}

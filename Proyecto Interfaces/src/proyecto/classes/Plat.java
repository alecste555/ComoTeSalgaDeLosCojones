package proyecto.classes;

import java.util.ArrayList;
import java.util.Map;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author KAOS
 */
public class Plat {

    final private String nom;
    final private Double preu;
    final private tipo tipo;
    private boolean carn;
    private boolean peix;
    private boolean gluten;
    private boolean làctics;
    private boolean ou;

    public Plat(String nom, Double preu, tipo tipo) {
        this.nom = nom;
        this.preu = preu;
        this.tipo = tipo;
        this.carn = false;
        this.peix = false;
        this.gluten = false;
        this.làctics = false;
        this.ou = false;
    }

    public String getNom() {
        return nom;
    }

    public Double getPreu() {
        return preu;
    }

    public boolean isCarn() {
        return carn;
    }

    public void setCarn(boolean carn) {
        this.carn = carn;
    }

    public boolean isPeix() {
        return peix;
    }

    public void setPeix(boolean peix) {
        this.peix = peix;
    }

    public boolean isGluten() {
        return gluten;
    }

    public void setGluten(boolean gluten) {
        this.gluten = gluten;
    }

    public boolean isLàctics() {
        return làctics;
    }

    public void setLàctics(boolean làctics) {
        this.làctics = làctics;
    }

    public boolean isOu() {
        return ou;
    }

    public void setOu(boolean ou) {
        this.ou = ou;
    }

    public String[] exportDataArray() {
        String[] varStr = new String[9];
        varStr[0] = this.tipo.name();
        varStr[1] = this.nom;
        varStr[2] = this.carn ? "✓" : "";
        varStr[3] = this.peix ? "✓" : "";
        varStr[4] = this.làctics ? "✓" : "";
        varStr[5] = this.gluten ? "✓" : "";
        varStr[6] = this.ou ? "✓" : "";
        varStr[7] = Double.toString(this.preu);
        varStr[8] = "0";
        return varStr;

    }
}

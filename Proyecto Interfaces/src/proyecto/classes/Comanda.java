/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.classes;

import java.util.*;

/**
 *
 * @author Icheclin
 */
public class Comanda {

    private int id;
    final private HashMap<String, Object[]> primers;
    final private HashMap<String, Object[]> segons;
    final private HashMap<String, Object[]> postres;
    private int taula;
    private Date datacomanda;
    private boolean pagada;

    public Comanda(int taula, Date datacomanda) {
        this.primers = new HashMap<>();
        this.segons = new HashMap<>();
        this.postres = new HashMap<>();
        this.taula = taula;
        this.datacomanda = datacomanda;
        this.pagada = false;
    }

    public boolean isPagada() {
        return pagada;
    }

    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTaula() {
        return taula;
    }

    public void setTaula(int taula) {
        this.taula = taula;
    }

    public Date getDatacomanda() {
        return datacomanda;
    }

    public void setDatacomanda(Date datacomanda) {
        this.datacomanda = datacomanda;
    }

    public void addprimer(String plat, Integer quantitat, boolean hecho) {
        Object[] o = new Object[]{quantitat, hecho};
        primers.put(plat, o);
    }

    public void addsegon(String plat, Integer quantitat, boolean hecho) {
        Object[] o = new Object[]{quantitat, hecho};
        segons.put(plat, o);
    }

    public void addpostre(String plat, Integer quantitat, boolean hecho) {
        Object[] o = new Object[]{quantitat, hecho};
        postres.put(plat, o);
    }

    public void deleteprimer(String plat, Integer quantitat) {
        primers.remove(plat);
    }

    public void deletesegon(String plat, Integer quantitat) {
        segons.remove(plat);
    }

    public void deletepostre(String plat, Integer quantitat) {
        postres.remove(plat);
    }

    public void setPrimerHecho(String plato) {
        Object[] o = this.primers.get(plato);

        o[1] = true;
        this.primers.put(plato, o);
    }

    public void setSegonHecho(String plato) {
        Object[] o = this.segons.get(plato);
        System.out.println(this.segons.keySet());
        o[1] = true;
        this.segons.put(plato, o);
    }

    public String gettipoplat(String plato) {
        if (this.primers.containsKey(plato)) {
            return tipo.primer.name();
        } else if (this.segons.containsKey(plato)) {
            return tipo.segon.name();
        } else if (this.postres.containsKey(plato)) {
            return tipo.postre.name();
        }
        return "";
    }

    public Map<Integer, ArrayList<String[]>> exportDataArray() {
        ArrayList<String[]> lineascomanda = new ArrayList<>();
        String[] varStr;
        for (int i = 0; i < this.primers.size(); i++) {
            varStr = new String[6];
            varStr[0] = Integer.toString(this.id);
            varStr[1] = Integer.toString(this.taula);
            varStr[2] = this.primers.keySet().toArray()[i].toString();
            varStr[3] = ((Object[]) this.primers.values().toArray()[i])[0].toString();
            varStr[4] = this.datacomanda.toString();
            lineascomanda.add(varStr);
        }
        for (int i = 0; i < this.segons.size(); i++) {
            varStr = new String[6];
            varStr[0] = Integer.toString(this.id);
            varStr[1] = Integer.toString(this.taula);
            varStr[2] = this.segons.keySet().toArray()[i].toString();
            varStr[3] = ((Object[]) this.segons.values().toArray()[i])[0].toString();
            varStr[4] = this.datacomanda.toString();
            lineascomanda.add(varStr);
        }
        for (int i = 0; i < this.postres.size(); i++) {
            varStr = new String[6];
            varStr[0] = Integer.toString(this.id);
            varStr[1] = Integer.toString(this.taula);
            varStr[2] = this.postres.keySet().toArray()[i].toString();
            varStr[3] = ((Object[]) this.postres.values().toArray()[i])[0].toString();
            varStr[4] = this.datacomanda.toString();
            lineascomanda.add(varStr);
        }
        Map<Integer, ArrayList<String[]>> mapa = new HashMap<>();
        mapa.put(this.taula, lineascomanda);
        return mapa;
    }

    public Map<Integer, ArrayList<String[]>> exportDataArrayCocina() {
        ArrayList<String[]> lineascomanda = new ArrayList<>();
        String[] varStr;
        for (int i = 0; i < this.primers.size(); i++) {
            varStr = new String[7];
            varStr[0] = Integer.toString(this.id);
            varStr[1] = Integer.toString(this.taula);
            varStr[2] = this.primers.keySet().toArray()[i].toString();
            varStr[3] = ((Object[]) this.primers.values().toArray()[i])[0].toString();
            varStr[4] = this.datacomanda.toString();
            varStr[6] = (boolean) ((Object[]) this.primers.values().toArray()[i])[1] ? "X" : " ";
            lineascomanda.add(varStr);
        }
        for (int i = 0; i < this.segons.size(); i++) {
            varStr = new String[7];
            varStr[0] = Integer.toString(this.id);
            varStr[1] = Integer.toString(this.taula);
            varStr[2] = this.segons.keySet().toArray()[i].toString();
            varStr[3] = ((Object[]) this.segons.values().toArray()[i])[0].toString();
            varStr[4] = this.datacomanda.toString();
            varStr[6] = (boolean) ((Object[]) this.segons.values().toArray()[i])[1] ? "X" : " ";
            lineascomanda.add(varStr);
        }
        for (int i = 0; i < this.postres.size(); i++) {
            varStr = new String[7];
            varStr[0] = Integer.toString(this.id);
            varStr[1] = Integer.toString(this.taula);
            varStr[2] = this.postres.keySet().toArray()[i].toString();
            varStr[3] = ((Object[]) this.postres.values().toArray()[i])[0].toString();
            varStr[4] = this.datacomanda.toString();
            varStr[6] = (boolean) ((Object[]) this.postres.values().toArray()[i])[1] ? "X" : " ";
            lineascomanda.add(varStr);
        }
        Map<Integer, ArrayList<String[]>> mapa = new HashMap<>();
        mapa.put(this.taula, lineascomanda);
        return mapa;
    }
}

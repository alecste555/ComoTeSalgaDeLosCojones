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
    final private HashMap<String,Integer> primers;
    final private HashMap<String,Integer> segons;
    final private HashMap<String,Integer> postres;
    private int taula;
    private Date datacomanda;
    private boolean pagada;
    public Comanda(int taula, Date datacomanda) {
        this.id = LogicaComandes.getLlistaComandes().size();
        this.primers = new HashMap<>();
        this.segons = new HashMap<>();
        this.postres = new HashMap<>();
        this.taula = taula;
        this.datacomanda = datacomanda;
        this.pagada=false;
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


    public void addprimer(String plat,Integer quantitat){
    primers.put(plat, quantitat);
    }
    public void addsegon(String plat,Integer quantitat){
    segons.put(plat, quantitat);
    }
    public void addpostre(String plat,Integer quantitat){
    postres.put(plat, quantitat);
    }
    public void deleteprimer(String plat,Integer quantitat){
    primers.remove(plat);
    }
    public void deletesegon(String plat,Integer quantitat){
    segons.remove(plat);
    }
    public void deletepostre(String plat,Integer quantitat){
    postres.remove(plat);
    }
    public Map<Integer,ArrayList<String[]>> exportDataArray() {
        ArrayList<String[]> lineascomanda= new ArrayList<>();
        String[] varStr;
        for(int i = 0; i< this.primers.size();i++){
            varStr = new String[6];
            varStr[0]= Integer.toString(this.id);
            varStr[1]= Integer.toString(this.taula);
            varStr[2]= this.primers.keySet().toArray()[i].toString();
            varStr[3]= this.primers.values().toArray()[i].toString();
            varStr[4]= this.datacomanda.toString();
            lineascomanda.add(varStr);
        }
         for(int i = 0; i< this.segons.size();i++){
            varStr = new String[6];
            varStr[0]= Integer.toString(this.id);
            varStr[1]= Integer.toString(this.taula);
            varStr[2]= this.segons.keySet().toArray()[i].toString();
            varStr[3]= this.segons.values().toArray()[i].toString();
            varStr[4]= this.datacomanda.toString();
            lineascomanda.add(varStr);
        }
          for(int i = 0; i< this.postres.size();i++){
            varStr = new String[6];
            varStr[0]= Integer.toString(this.id);
            varStr[1]= Integer.toString(this.taula);
            varStr[2]= this.postres.keySet().toArray()[i].toString();
            varStr[3]= this.postres.values().toArray()[i].toString();
            varStr[4]= this.datacomanda.toString();
            lineascomanda.add(varStr);
        }
          Map<Integer,ArrayList<String[]>> mapa =new HashMap<>();
          mapa.put(this.taula, lineascomanda);
        return mapa;
    }
}

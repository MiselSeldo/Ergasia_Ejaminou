/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.school;

/**
 *
 * @author mishe
 */
public class Mathima {

    private int vathmos;

    /**
     * Get the value of vathmos
     *
     * @return the value of vathmos
     */
    public int getVathmos() {
        return vathmos;
    }

    /**
     * Set the value of vathmos
     *
     * @param vathmos new value of vathmos
     */
    public void setVathmos(int vathmos) {
        this.vathmos = vathmos;
    }

    public Mathima(Taxi taxi, String Perigrafi, int Kodikos_mathimatos) {
        this.taxi = taxi;
        this.Perigrafi = Perigrafi;
        this.Kodikos_mathimatos = Kodikos_mathimatos;
        
    }
    public void printstats(){
        System.out.println("Κωδικός Μαθήματος:"+Kodikos_mathimatos+", Μάθημα:"+Perigrafi+", Διδάσκεται στη τάξη:"+taxi.getKodikos_taxis());
    }
    
    
    private Taxi taxi;

    /**
     * Get the value of taxi
     *
     * @return the value of taxi
     */
    public Taxi gettaxi() {
        return taxi;
    }

    /**
     * Set the value of taxi
     *
     * @param taxi new value of taxi
     */
    public void settaxi(Taxi taxi) {
        this.taxi = taxi;
    }

    private String Perigrafi;

    /**
     * Get the value of Perigrafi
     *
     * @return the value of Perigrafi
     */
    public String getPerigrafi() {
        return Perigrafi;
    }

    /**
     * Set the value of Perigrafi
     *
     * @param Perigrafi new value of Perigrafi
     */
    public void setPerigrafi(String Perigrafi) {
        this.Perigrafi = Perigrafi;
    }

    private int Kodikos_mathimatos;

    /**
     * Get the value of Kodikos_mathimatos
     *
     * @return the value of Kodikos_mathimatos
     */
    public int getKodikos_mathimatos() {
        return Kodikos_mathimatos;
    }

    /**
     * Set the value of Kodikos_mathimatos
     *
     * @param Kodikos_mathimatos new value of Kodikos_mathimatos
     */
    public void setKodikos_mathimatos(int Kodikos_mathimatos) {
        this.Kodikos_mathimatos = Kodikos_mathimatos;
    }

}

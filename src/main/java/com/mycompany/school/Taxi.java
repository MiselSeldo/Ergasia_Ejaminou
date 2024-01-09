/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.school;

/**
 *
 * @author mishe
 */
public class Taxi {
    
    public Taxi(String Perigrafi, String Kodikos_taxis) {
        this.Perigrafi = Perigrafi;
        this.Kodikos_taxis = Kodikos_taxis;
    }
    public void printstats(){
       System.out.println("Περιγραφή τάξης: "+Perigrafi+" και κωδικός τάξης "+Kodikos_taxis);
    }
    private String Perigrafi;

    private String Kodikos_taxis;

    /**
     * Get the value of Kodikos_taxis
     *
     * @return the value of Kodikos_taxis
     */
   
    public String getKodikos_taxis() {
        return Kodikos_taxis;
    }

    /**
     * Set the value of Kodikos_taxis
     *
     * @param Kodikos_taxis new value of Kodikos_taxis
     */
    public void setKodikos_taxis(String Kodikos_taxis) {
        this.Kodikos_taxis = Kodikos_taxis;
    }

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


}

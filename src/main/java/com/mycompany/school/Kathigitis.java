/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.school;

/**
 *
 * @author mishe
 */
public class Kathigitis {

    public Kathigitis(Mathima Didaskei, String AMKA, String Epitheto, String Onoma) {
        this.Didaskei = Didaskei;
        this.AMKA = AMKA;
        this.Epitheto = Epitheto;
        this.Onoma = Onoma;
    }
    public void printstats(){
        System.out.println("Ονοματεπώνυμο καθηγητή: "+Onoma+ " "+Epitheto+", ΑΜΚΑ: "+AMKA+", διδάσκει "+Didaskei.getPerigrafi());
    }
    
    private Mathima Didaskei;

    /**
     * Get the value of Didaskei
     *
     * @return the value of Didaskei
     */
    public Mathima getDidaskei() {
        return Didaskei;
    }

    /**
     * Set the value of Didaskei
     *
     * @param Didaskei new value of Didaskei
     */
    public void setDidaskei(Mathima Didaskei) {
        this.Didaskei = Didaskei;
    }

    private String AMKA;

    /**
     * Get the value of AMKA
     *
     * @return the value of AMKA
     */
    public String getAMKA() {
        return AMKA;
    }

    /**
     * Set the value of AMKA
     *
     * @param AMKA new value of AMKA
     */
    public void setAMKA(String AMKA) {
        this.AMKA = AMKA;
    }

    private String Epitheto;

    /**
     * Get the value of Epitheto
     *
     * @return the value of Epitheto
     */
    public String getEpitheto() {
        return Epitheto;
    }

    /**
     * Set the value of Epitheto
     *
     * @param Epitheto new value of Epitheto
     */
    public void setEpitheto(String Epitheto) {
        this.Epitheto = Epitheto;
    }

    private String Onoma;

    /**
     * Get the value of Onoma
     *
     * @return the value of Onoma
     */
    public String getOnoma() {
        return Onoma;
    }

    /**
     * Set the value of Onoma
     *
     * @param Onoma new value of Onoma
     */
    public void setOnoma(String Onoma) {
        this.Onoma = Onoma;
    }

}

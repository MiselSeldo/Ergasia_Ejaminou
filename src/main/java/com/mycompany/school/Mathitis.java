/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.school;

/**
 *
 * @author mishe
 */
public class Mathitis {

    public void vathmoi_mathiti(int AM_mathiti,int math1,int math2,int math3,int math4,int math5) {
        System.out.println(getAM_mathiti()+","+getEpitheto()+" :" +math1+" "+math2+" "+math3+" "+math4+" "+math5); 
    }

    public Mathitis(int AM_mathiti, String Epitheto, String Onoma) {
        this.AM_mathiti = AM_mathiti;
        this.Epitheto = Epitheto;
        this.Onoma = Onoma;
    }
    public void printstats(){
        System.out.println("ΑΜ ΜΑΘΗΤΗ: "+AM_mathiti+", Όνομα: "+Onoma +", Επίθετο: "+Epitheto); 
    }
    
    private int AM_mathiti;
    
    /**
     * Get the value of AM_mathiti
     *
     * @return the value of AM_mathiti
     */
    public int getAM_mathiti() {
        return AM_mathiti;
    }

    /**
     * Set the value of AM_mathiti
     *
     * @param AM_mathiti new value of AM_mathiti
     */
    public void setAM_mathiti(int AM_mathiti) {
        this.AM_mathiti = AM_mathiti;
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

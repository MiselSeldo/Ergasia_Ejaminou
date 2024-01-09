package com.mycompany.school;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



/**
 *
 * @author mishe
 */
public class School {

    public static void main(String[] args) {
        System.out.println("Μαθήματα Σχολείου:");
        Taxi taxi1= new Taxi("Εργαστήριο 1","E1");
        Taxi taxi2= new Taxi("Εργαστήριο 2","E2");
        Taxi taxi3= new Taxi("Εργαστήριο 3","E3");
        Taxi taxi4= new Taxi("Εργαστήριο 6","E6");
        Taxi taxi5= new Taxi("Εργαστήριο 8","Ε8");
        //Εκτυπώσεις τάξεων
        taxi1.printstats();
        taxi2.printstats();
        taxi3.printstats();
        taxi4.printstats();
        taxi5.printstats();
        System.out.println("ΑΜ και Ονοματεπώνυμα Μαθητών Σχολείου: ");
        Mathitis math1= new Mathitis(1001,"Θεοδώρου","Αντριάννα");
        Mathitis math2= new Mathitis(1002,"Παπαγεωργίου","Ηλίας");
        Mathitis math3= new Mathitis(1003,"Σταθόπουλος","Στάθης");
        Mathitis math4= new Mathitis(1004,"Αλμπάνης","Πέτρος");
        Mathitis math5= new Mathitis(1005,"Ταμπάκης","Γιάννης");
        Mathitis math6= new Mathitis(1006,"Πορτούρος","Γίαννης");
        Mathitis math7= new Mathitis(1007,"Χαλκίδης","Μιχάλης");
        Mathitis math8= new Mathitis(1008,"Κρονίδης","Μανόλης");
        Mathitis math9= new Mathitis(1009,"Πασβάνης","Σπύρος");
        Mathitis math10= new Mathitis(1010,"Παπαρόπουλος","Άρης");
        Mathitis math11= new Mathitis(1011,"Παράσι","Ήρα");
        Mathitis math12= new Mathitis(1012,"Τζασελάρι","Αθηνά");
        Mathitis math13= new Mathitis(1013,"Σακελάρη","Ντανιέλα");
        Mathitis math14= new Mathitis(1014,"Τέτα","Βάσω");
        Mathitis math15= new Mathitis(1015,"Πατανάκη","Άννα");
        Mathitis math16= new Mathitis(1016,"Παλικάβου","Αγγελική");
        Mathitis math17= new Mathitis(1017,"Μαρκάτου","Δήμητρα");
        Mathitis math18= new Mathitis(1018,"Αλεφάντη","Μαρία");
        Mathitis math19= new Mathitis(1019,"Κυριακίδου","Αμαρυλλίνα");
        Mathitis math20= new Mathitis(1020,"Κοστορίζου","Στέλλα");
        //Εκτυπώσεις μαθητών
        math1.printstats();
        math2.printstats();
        math3.printstats();
        math4.printstats();
        math5.printstats();
        math6.printstats();
        math7.printstats();
        math8.printstats();
        math9.printstats();
        math10.printstats();
        math11.printstats();
        math12.printstats();
        math13.printstats();
        math14.printstats();
        math15.printstats();
        math16.printstats();
        math17.printstats();
        math18.printstats();
        math19.printstats();
        math20.printstats();
        System.out.println("Όσον αφορά τα μαθήματα.... ");
        Mathima lesson1=new Mathima(taxi1,"3DS MAX",01);
        Mathima lesson2=new Mathima(taxi2,"Πρακτική Εφαρμογή στην Ειδικότητα",02);
        Mathima lesson3=new Mathima(taxi3,"Βάσεις Δεδομένων",03);
        Mathima lesson4=new Mathima(taxi4,"JAVA",04);
        Mathima lesson5=new Mathima(taxi5,"PHP",05);
        //Εκτυπώσεις μαθημάτων
        lesson1.printstats();
        lesson2.printstats();
        lesson3.printstats();
        lesson4.printstats();
        lesson5.printstats();
        System.out.println("Καθηγητές και το μάθημα που διδάσκουν: ");
        Kathigitis kath1=new Kathigitis(lesson1, "01020456781", "Παπαπέτρου","Ηλίας");
        Kathigitis kath2=new Kathigitis(lesson2, "01020458982", "Ιακωβίδης","Σπύρος");
        Kathigitis kath3=new Kathigitis(lesson3, "01020453454", "Παπαδοπούλου","Ερασμία");
        Kathigitis kath4=new Kathigitis(lesson4, "01020451442", "Ιωαννίδου","Ιωάννα");
        Kathigitis kath5=new Kathigitis(lesson5, "01020457889", "Παπαχελάς","Πέτρος");
        //Εκτυπώσεις καθηγητών
        kath1.printstats();
        kath2.printstats();
        kath3.printstats();
        kath4.printstats();
        kath5.printstats();
        System.out.println("Βαθμοί Μαθητών στα μαθηματα με σειρα:");
        System.out.println("3DS MAX/Πρακτική Εφαρμογή στην Ειδικότητα/Βάσεις Δεδομένων/JAVA/PHP");
        math1.vathmoi_mathiti(1001,8, 9, 5, 5, 6);
        math2.vathmoi_mathiti(1002,10, 10, 10, 10, 10);
        math3.vathmoi_mathiti(1003,1, 1, 1, 1, 1);
        math4.vathmoi_mathiti(1004,9, 9, 9, 8, 8);
        math5.vathmoi_mathiti(1005,7, 8, 10, 9, 7);
        math6.vathmoi_mathiti(1006,6, 10, 10, 9, 8);
        math7.vathmoi_mathiti(1007,9, 9, 9, 9, 7);
        math8.vathmoi_mathiti(1008,10, 6, 5, 8, 6);
        math9.vathmoi_mathiti(1009,8, 10, 5, 10, 6);
        math10.vathmoi_mathiti(1010,1, 1, 1, 1, 1);
        math11.vathmoi_mathiti(1011,7, 6, 9, 5, 8);
        math12.vathmoi_mathiti(1012,4, 6, 7, 6, 6);
        math13.vathmoi_mathiti(1013,9, 9, 7, 8, 6);
        math14.vathmoi_mathiti(1014,1, 1, 1, 1, 1);
        math15.vathmoi_mathiti(1015,8, 7, 7, 7, 8);
        math16.vathmoi_mathiti(1016,9, 6, 9, 7, 8);
        math17.vathmoi_mathiti(1017,10, 10, 7, 9, 5);
        math18.vathmoi_mathiti(1018,5, 6, 7, 8, 10);
        math19.vathmoi_mathiti(1019,6, 10, 6, 7, 10);
        math20.vathmoi_mathiti(1020,6, 10, 8, 7, 10);
        
        
        
    }
    
}

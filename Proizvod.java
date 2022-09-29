public class Proizvod {

    String naziv;
    double cena;
    double porez;

    Proizvod(){}

    Proizvod(String in_naziv, double in_cena){
        naziv = in_naziv;
        cena = in_cena;
        porez = 0.2;
    }

   Proizvod(String in_naziv, double in_cena, double in_porez){
       naziv= in_naziv;
       cena= in_cena;
       if (in_porez > 1){
           porez = in_porez /100;
       }else{
           porez= in_porez;
       }
       porez= in_porez;

   }

    double cenaSaPorezom(){
        return cena+(cena * porez);
    }

    String za_ispis () {
        return String.format("""
                NAZIV: %s
                CENA: %.2f
                POREZ: %.2f  %%
                CENA(sa porezom): %.2f
                """, naziv, cena, porez * 100, cenaSaPorezom());

    }

}

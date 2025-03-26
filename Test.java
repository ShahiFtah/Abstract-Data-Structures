public class Test {
    public static void main(String[] args) {
    IndeksertListe<String> liste = new IndeksertListe<>();
    liste.leggTil("A");
    liste.leggTil("B");
    liste.leggTil("C");
    liste.leggTil("T");
    liste.fjern();
    liste.sett(1,"D");
    
    System.out.println(liste.toString());
    
    //for (int i = 0; i<4; i++){
    //    System.out.println(liste.hent(i));
    //}

  } 
}
    
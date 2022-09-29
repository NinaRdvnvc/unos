import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // i nacin

        Proizvod p1 = new Proizvod();
        System.out.println("Uneti naziv proizvoda ");
        p1.naziv = input.nextLine();
        System.out.println(" Uneti cenu proizvoda ");
        p1.cena = Double.parseDouble(input.nextLine());
        System.out.println("Uneti porez ");
        p1.porez = Double.parseDouble(input.nextLine());
        if (p1.porez > 1){
            p1.porez = p1.porez/100;
        }

        System.out.println(p1.za_ispis());

        // II nacin


        System.out.println("Uneti naziv proiyvoda ");
        String naziv = input.nextLine();
        System.out.println(" Uneti cenu proizvoda ");
        double cena = Double.parseDouble(input.nextLine());
        System.out.println("Uneti porez ");
        double porez = Double.parseDouble(input.nextLine());
        Proizvod p2 = new Proizvod(naziv, cena, porez);

        System.out.println(p2.za_ispis());
    }
}

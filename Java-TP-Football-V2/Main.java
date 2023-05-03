package principale;

import vivant.*;

public class Main
{
    public static void main(String[] args)
    {
        Olona o = new Olona();
        Joueur j = new Joueur();
        Coach c  = new Coach();

        j.setNom("Bob");
        System.out.println(j.getNom());
        j.setSalaire(3000.00);
    }
}
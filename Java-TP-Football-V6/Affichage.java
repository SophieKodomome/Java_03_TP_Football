package principale;

import vivant.*;
import visuel.*;
import football.*;
import java.util.*;

public class Affichage
{
    public static void main(String[] args)
    {


        Joueur[] joueurtesthome= new Joueur[10];
        joueurtesthome[0]= new Joueur("Jean",2000,"1",1,4);
        Equipe equipehome= new Equipe(joueurtesthome);

        Joueur[] joueurtestaway= new Joueur[10];
        joueurtestaway[0]= new Joueur("Joe",2000,"1",1,4);
        Equipe equipeaway= new Equipe(joueurtestaway);
        Match match=new Match(equipehome,equipeaway,new GregorianCalendar(2023,0,1),new Olona("Arbitre",34,'m'),0,0);

        Fenetre fenetre= new Fenetre(match);

    }
}
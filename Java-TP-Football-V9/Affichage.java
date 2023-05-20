package principale;

import vivant.*;
import visuel.*;
import football.*;
import java.util.*;

public class Affichage
{
    public static void main(String[] args)
    {


        Joueur[] joueurtesthome= new Joueur[11];
        joueurtesthome[0]= new Joueur("Jean",5000,"01",1,9);
        joueurtesthome[1]= new Joueur("Joan",3000,"07",2,6);
        joueurtesthome[2]= new Joueur("Ian",2000,"06",3,5);
        joueurtesthome[3]= new Joueur("Hans",3000,"15",4,8);
        joueurtesthome[4]= new Joueur("Juan",8000,"69",5,10);
        joueurtesthome[5]= new Joueur("Jose",6000,"21",6,7);
        joueurtesthome[6]= new Joueur("Jeanne",2000,"04",7,2);
        joueurtesthome[7]= new Joueur("Jane",2000,"2",8,2);
        joueurtesthome[8]= new Joueur("Yolande",2000,"28",9,3);
        joueurtesthome[9]= new Joueur("Giovanna",2000,"31",10,6);
        joueurtesthome[10]= new Joueur("Joane",2000,"12",11,3);
        Equipe equipehome= new Equipe(joueurtesthome);

        Joueur[] joueurtestaway= new Joueur[11];
        joueurtestaway[0]= new Joueur("Marc",2000,"1",1,5);
        joueurtestaway[1]= new Joueur("Marcel",3000,"07",2,6);
        joueurtestaway[2]= new Joueur("Marcelin",6000,"06",3,6);
        joueurtestaway[3]= new Joueur("Marshall",8000,"15",4,8);
        joueurtestaway[4]= new Joueur("Mars",6000,"69",5,6);
        joueurtestaway[5]= new Joueur("Marco",7000,"21",6,7);
        joueurtestaway[6]= new Joueur("Marcus",2000,"04",7,2);
        joueurtestaway[7]= new Joueur("Mario",1000,"2",8,7);
        joueurtestaway[8]= new Joueur("Marvin",5000,"28",9,3);
        joueurtestaway[9]= new Joueur("Marvellous",8000,"31",10,10);
        joueurtestaway[10]= new Joueur("Marcy",2000,"12",11,3);
        Equipe equipeaway= new Equipe(joueurtestaway);
        Match match=new Match(equipehome,equipeaway,new GregorianCalendar(2023,0,1),new Olona("Arbitre",34,'m'),0,0);

        Fenetre fenetre= new Fenetre(match);

    }
}
import java.util.*;
public class Main {
    public static void printMazePrint(int sr,int sc,int dr,int dc,String psf){
        if(sr==dr && sc==dc){
            System.out.println(psf);
            return;
        }
        for(int hss=1;hss<=dc-sc;hss++){
            printMazePrint(sr, sc+hss, dr, dc, psf +"h"+hss);
        }
        for(int vss=1;vss<=dr-sr;vss++){
            printMazePrint(sr+vss, sc, dr, dc, psf +"v"+vss);
        }
        for(int dss=1;dss<=dr-sr && dss<=dc-sc;dss++){
            printMazePrint(sr+dss, sc+dss, dr, dc, psf +"d"+dss);
        }
    } 
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int row=scn.nextInt();
        int col=scn.nextInt();
        printMazePrint(1, 1, row, col, " ");

    }
}

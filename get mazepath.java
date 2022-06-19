import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        int col = scn.nextInt();
        ArrayList<String> paths = getMazePaths(1, 1, row, col);
        System.out.println(paths);
    }
    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr > dr || sc > dc){
            ArrayList<String> bpaths = new ArrayList<>();
            return bpaths;
        } else if(sr == dr && sc == dc){
            ArrayList<String> bpaths = new ArrayList<>();
            bpaths.add("");
            return bpaths;
        }
        ArrayList<String> hpaths = getMazePaths(sr, sc + 1, dr, dc);
        ArrayList<String> vpaths = getMazePaths(sr + 1, sc, dr, dc);
        ArrayList<String> paths = new ArrayList<>();
        for(String hpath: hpaths){
            paths.add("h" + hpath);
        }
        for(String vpath: vpaths){
            paths.add("v" + vpath);
        }
        return paths;
    }
}


public class Main{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        String str=new String();
        ArrayList<String>=gss(str);
    }
    public static ArrayList<String> gss(String str){
        if(str.length()==0){
            // bres:base result
            ArrayList<String> bres=new ArrayList<>();
            bres.add(" ");
            return bres;
        }
        char ch=str.charAt(0);
        // ros:rest of the string
        String ros=str.substring(1);
        //rres: recuresive result
        ArrayList<String> rres=gss(ros);
        // myres:myresult
        ArrayList<String> myres=new ArrayList<>();
        for(int val:rres){
            myres.add(" "+val);
        }
        for(int val:rres){
            myres.add(ch+val);
        }
    }
}
// faith and exp method

public class count digits {
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        int count=0;
        for(int i=0;i<=n;i++){
            int quotient=n/10;
            count++;
            n=quotient;
        }
        System.out.print(count);
    }
    
}

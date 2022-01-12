public class SolidRohombus{
    public static void main(String args[]){
        int n=10;
        for(int i=1;i<=n;i++){     // Space print
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=5;j++){ //Print Star
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
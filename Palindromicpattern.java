public class PalindromicPattern{
    public static void main(String args[]){
        int n=5; // Space 
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){    //!half part number
                System.out.print(" ");
            }
            for(int j=2;j<=i;j++){  // 2half part number
                System.out.print(j);
            }
        }
    }
}
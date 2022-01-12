public class butterFly{
    public static void main(String args[]){
        int n=5;
        // First upper part to print the Star with space.
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            // spaces
            int space=2*(n-i);
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
          for(int i=n;i>=1;i--){ // Reverse the upper code to get desired output.
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            // spaces
            int space=2*(n-i);
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
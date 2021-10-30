class PatternThird{
    public static void main(String args[]){
        int n=5,i,j;
        for(i=1;i<=n;i++){
            for(j=i;j<=n;j++){   //for spacing 
                System.out.print(" ");
            }
                for(j=1;j<i;j++){ // left  for printing star 
                    System.out.print("*");
                }
                for(j=1;j<=i;j++){ // right for printing star
                    System.out.print("*");
                }
                System.out.println(); // printing new line
        }
    }
}
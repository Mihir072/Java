public class Practice {
    public static void main(String[] args){
        int n = 5; 
       for(int i=n; i>=1; i--){
        for(int j=1; j<=i; j++){
            System.out.print(" ");
        }
        for(int j=1; j<=n; j++){
            if(i==1||j==1||i==n||j==n){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
 
      
    //  int n= 4; 
    //    //Upper half
    //  for(int i=1; i<=n; i++){
    //     for(int j=1; j<=i; j++){
    //       System.out.print("*");
    //     }
    //     int spaces = 2*(n-i);
    //     for(int j=1; j<=spaces; j++){
    //         System.out.print(" ");
    //     }
    //     for(int j=1; j<=i; j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    //  }
    //    //Lower Half
    //    for(int i=n; i>=1; i--){
    //     for(int j=1; j<=i; j++){
    //         System.out.print("*");
    //     }
    //     int spaces = 2*(n-i);
    //     for(int j=1; j<=spaces; j++){
    //         System.out.print(" ");
    //     }
    //     for(int j=1; j<=i; j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    //  }   
   }

 }
        
        

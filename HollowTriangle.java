// *
// **
// * *
// *  *
// *   *
// ******
public class HollowTriangle {
        static void hollow(){
            int n=6;
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=i;j++){
                    if(j==1||i==n||i==j)
                    System.out.print("*");
                    else
                    System.out.print(" ");

                }
            System.out.println();
            }
    
        }
        public static void main(String[] args){
            hollow();
        }
}

//Sum odd and even
package bailecture5;


public class BaiTap1 {

    
    public static void main(String[] args) {
       int sumEven=0;
       int sumOdd=0;
       for(int i=1;i<=100;i++){
           if (i%2==0){
               sumEven+=i;
           }else {
               sumOdd+=i;
           }
           
       } System.out.println("Sum of even number from 1 to 100: "+sumEven);
       System.out.println( "Sum of old number from 1 to 100 :"+sumOdd);
    }
    
}

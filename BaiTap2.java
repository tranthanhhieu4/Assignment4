//Sum of digit
package bailecture5;

import java.util.Scanner;
public class BaiTap2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap vao mot so nguyen:");
        int n= scanner.nextInt();
        int sum=0;
        int number=Math.abs(n);
        while(number>0){
            int soCuoi=number%10;
            sum+=soCuoi;
            number/=10;
        }
        System.out.println("TOng cac chu so:"+sum);
    }
}

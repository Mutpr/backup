/*
 * 소스의 목표: 별로 이등변삼각형을 찍어준다.
 * 최초 입력: 2019-07-21
 */
package src;

import java.util.Scanner;

public class src2 {
    public static void main(String[] args) {
        int line;
        Scanner input = new Scanner(System.in);
        
        System.out.print("How long is the line? : ");
        line = input.nextInt();
        
        for(int i=line, add=0; i>0; i--, add++) { //공백을 찍어줌
            for(int j=0; j<i-1; j++) {
               System.out.println(); 
            }System.out.print("*");
//            for(int j=0; j<line-(i-1)+add; j++) {
//                System.out.print("*");
//            }
            
        }
    }
}



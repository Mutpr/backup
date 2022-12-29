package src4_0526;

import java.util.*;
public class info {
	String id;
	int pass;
	
	void display(String id, int pass) {
		this.id = id;
		this.pass = pass;
		int b[] = new int[4];
        for(int i=0; i<4; i++) {
           b[i]=(int)(Math.random()*10);
           for(int j=0; j<i;j++) {
               if(b[i]==b[j]) {i--; break;}
           }    
        }
        pass = (b[0]*1000)+(b[1]*100)+(b[2]*10)+b[3]; 
        	System.out.println("아이디>> "+id);
        	System.out.println("패스워드>> "+pass);
   }
       

		
	}
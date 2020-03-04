
package addressbook;

import java.util.Scanner;



public class Main {
    
    public static void main(String[] args) {
        
         Addbook[] book=new Addbook[100];
          Scanner input=new Scanner(System.in);
       
         while(true){
         System.out.println("PLEASE ENTER YOUR CHOICE:");
         System.out.println("1.CREATE NEW RECORD\n 2.UPDATE RECORD\n 3.DELETE RECORD\n 4.EXIT");
         
         int hu=input.nextInt();
         
         if(hu==1){
             String n,a;
             int p,s;
             System.out.println("HOW MANY NEW RECORD DO YOU WANT TO CREAT?");
             int c=input.nextInt();
             for(int i=0;i<c;i++){
                 System.out.println("ENTER SERIAL:");
                 s=input.nextInt();
                 System.out.println("ENTER NAME:");
                 n=input.next();
                 System.out.println("ENTER ADDRESS:");
                 a=input.next();
                 System.out.println("ENTER PHONE NUM:");
                 p=input.nextInt();
                 
                 book[i]=new Addbook();
                 book[i].setSerial(s);
                 book[i].setName(n);
                 book[i].setAddress(a);
                 book[i].setPhn(p);
                 
                 
            
             }
             
             for(int i=0;i<c;i++){
                 System.out.println("YOUR NEW INFORMATION CREATED:");
                 System.out.println(book[i].getName());
                 System.out.println(book[i].getAddress());
                 System.out.println(book[i].getPhn());
             }
             
             
             
             }
        else if(hu==2){
             int x;
             System.out.println("ENTER SERIAL NUMBER THAT YOU WANT TO UPDATE:");
             x=input.nextInt();
             System.out.println("HERE IS THE INFORMATION");     
            
                 System.out.println(book[x].getName());
                 System.out.println(book[x].getAddress());
                 System.out.println(book[x].getPhn());
             
             System.out.println("WHICH ONE YOU WANT TO UPDATE:1.NAME 2. ADDRESS 3.PHONE");
             int u;
             u=input.nextInt();
             if(u==1){
                 String un;
                 System.out.println("tYPE UPDATED NAME:");
                 un=input.next();
                 book[x].setName(un);
                  System.out.println("Updated");
             }
             else if(u==2){
                 String ua;
                 System.out.println("tYPE UPDATED address:");
                 ua=input.next();
                 book[x].setName(ua);
                 System.out.println("Updated");
             }
             else if(u==3){
                 String up;
                 System.out.println("tYPE UPDATED phn:");
                 up=input.next();
                 book[x].setName(up);
                  System.out.println("Updated");
             }
             
         }   
         
         else if(hu==3){
             int ds;
             System.out.println("ENTER SERIAL NUMBER YOU WANT TO DELETE");
             ds=input.nextInt();
             book[ds]=null;
             System.out.println("DELETED SUCCESSFULLY");
         
         }
         
         
         
         
         
         else if(hu==4){
             break;
         }
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         } 
        
         
         
         
        
        
        
     
      
          
       
          
          
     
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
    }
    
    
}

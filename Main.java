
package bankaccountnewupdate;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
       
     
        
       
      
            
        
        while(true){
             System.out.println("PLEASE SELECT YOUR OPTION \n1.Creat Account \n 2.Deposite \n 3.Withdraw\n 4.Exit\n"); 
             Scanner input=new Scanner(System.in);
             int choice=input.nextInt();   
                
        if(choice==1){
              Newacc n=new Newacc();
           
            System.out.println("PLASE ENTER YOUR NAME: ");
            String name=input.next();
           
            
            System.out.println("PLASE ENTER YOUR PHONE NUMBER: ");
            int mobile=input.nextInt();
       
            
            System.out.println("PLEASE ENER YOUR ADDRESS");
            String add=input.next();
       
            
           
            
           
            n.setName(name);
            n.setAddress(add);
            n.setMobile(mobile);
            
            System.out.println("YOUR NAME IS: "+n.getName());
            System.out.println("YOUR ADDRESS IS: "+n.getAddress());
            System.out.println("YOUR MOBILE NUMBER IS: "+n.getMobile());
            
        }
        else if(choice==2){
            Deposite d=new Deposite();
             System.out.println("PLEASE ENTER YOUR CURRENT AMMOUNT");
             int ca=input.nextInt();
             d.setAmmount(ca);
             System.out.println("PLEASE ENTER YOUR  DEPOSITE AMMOUNT");
             int depo=input.nextInt();
             d.adddeposite(depo);
             System.out.println(d.getAmmount());
             
        }
        else if(choice==3){
             Withdraw w=new Withdraw();
            System.out.println("PLEASE ENTER YOUR CURRENT AMMOUNT");
             int ca2=input.nextInt();
             w.setAmmount(ca2);
             System.out.println("PLEASE ENTER YOUR  WITHDRAW AMMOUNT");
             int depo=input.nextInt();
             w.subdeeposite(depo);
             System.out.println(w.getAmmount());
        }  
        else if(choice==4){
             break;
        }
                
     }
       
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
}

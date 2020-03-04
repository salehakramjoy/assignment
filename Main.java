
package employeerecord;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Employee[] e=new Employee[100];
        Salarid[]  sa=new Salarid [20];
        Commissioned[] co=new Commissioned[20];
        HourlySalarid[] hs=new HourlySalarid[20]; 
        
        
        int j,count=0,i,s;
            String n,d;
        
        Scanner input=new Scanner(System.in);
        
        
        while(true){
             System.out.println("Enter your choice ");
        System.out.println("1.Record of a  employee: ");
        System.out.println("2.update employee's info");
        int hu=input.nextInt();
        
        if(hu==1){
           
            
            System.out.println("Creat your employee first");
           
            System.out.println("Which Type Do you want to create");
            System.out.println("1.Salaried 2.Commissioned 3. hourly");
            int tt=input.nextInt();
            
            if(tt==1){
                System.out.println("You can only create 20 salaried employee");
                System.out.println("HOW MANY SALARIED NEW EMPLOYEE DO YOU WANT TO CREAT?");
                int se=input.nextInt();
                
                        
                   for(j=0;j<se;j++){
                 System.out.println("ENTER ID:");
                 i=input.nextInt();
                 System.out.println("ENTER NAME:");
                 n=input.next();
                 System.out.println("ENTER SALARY");
                 s=input.nextInt();
                 System.out.println("ENTER DEPARTMENT");
                 d=input.next();
                 
                 sa[j]=new Salarid();
                 sa[j].setId(i);
                sa[j].setName(n);
                 sa[j].setSalary(s);
                 sa[j].setDepartment(d);
                 
                 for(int x=0;x<se;x++){
                 System.out.println("YOUR NEW INFORMATION CREATED:");
                 System.out.println(sa[x].getId());
                 System.out.println(sa[x].getName());
                 System.out.println(sa[x].getSalary());
                 System.out.println(sa[x].getDepartment());
             }
             
            
             }
                
            } 
            
            else if(tt==2){
                
                System.out.println("You can only create 20 commissioned employee");
                System.out.println("HOW MANY COMMISSIONED NEW EMPLOYEE DO YOU WANT TO CREAT?");
                int Ce=input.nextInt();
            
                  for(j=20;j<20+Ce;j++){
                 System.out.println("ENTER ID:");
                 i=input.nextInt();
                 System.out.println("ENTER NAME:");
                 n=input.next();
                 System.out.println("ENTER SALARY");
                 s=input.nextInt();
                 System.out.println("ENTER DEPARTMENT");
                 d=input.next();
                 
                 co[j]=new Commissioned();
                 co[j].setId(i);
                 co[j].setName(n);
                 co[j].setSalary(s);
                 co[j].setDepartment(d);
                 
                 for(int x=20;x<20+Ce;x++){
                 System.out.println("YOUR NEW INFORMATION CREATED:");
                 System.out.println(co[x].getId());
                 System.out.println(co[x].getName());
                 System.out.println(co[x].getSalary());
                 System.out.println(co[x].getDepartment());
             }
                 
                 
                 
               
             }
            }
            else if(tt==3){
                 System.out.println("You can only create 20 hourlysalaried employee");
                System.out.println("HOW MANY  NEW EMPLOYEE DO YOU WANT TO CREAT?");
                int hc=input.nextInt();
                
                
                
            
                 for(j=40;j<40+hc;j++){
                 System.out.println("ENTER ID:");
                 i=input.nextInt();
                 System.out.println("ENTER NAME:");
                 n=input.next();
                 System.out.println("ENTER SALARY");
                 s=input.nextInt();
                 System.out.println("ENTER DEPARTMENT");
                 d=input.next();
                 
                 hs[j]=new HourlySalarid();
                 hs[j].setId(i);
                 hs[j].setName(n);
                 hs[j].setSalary(s);
                 hs[j].setDepartment(d);
                 
                 for(int x=40;x<40+hc;x++){
                 System.out.println("YOUR NEW INFORMATION CREATED:");
                 System.out.println(hs[x].getId());
                 System.out.println(hs[x].getName());
                 System.out.println(hs[x].getSalary());
                 System.out.println(hs[x].getDepartment());
                      }
            
                 }
                 
            }
        }
        }
    }
            
           
             
            }
            
            
            
        
        
        
        
       
        
        
        
    


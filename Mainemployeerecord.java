
package employeerecordupdated;

import java.util.Scanner;




public class Main {
    
       public static void main(String[] args) {
        
    
    

         Employee[] e=new Employee[100];
         Salaried []  sa=new Salaried  [20];
         CommisionedEmployee[] co=new CommisionedEmployee[20];
         HourlySalaried [] hs=new HourlySalaried [20]; 
        
         
        
        
        
        while(true){
           
            
        
        System.out.println("Enter your choice ");
        System.out.println("0.View of a Employee:");
        System.out.println("1.Record of a  employee: ");
        System.out.println("2.update employee's info");
        System.out.println("3.EXIT");
        
        
        Scanner input=new Scanner(System.in);
        int hu=input.nextInt();
        
        if(hu==1){
           
            
            System.out.println("Creat your employee first");
           
            System.out.println("Which Type Do you want to create");
            System.out.println("1.Salaried 2.Commissioned 3. hourly");
            int tt=input.nextInt();
            int count=0;
            
            if(tt==1){
                
                System.out.println("You can only create 20 salaried employee");
                System.out.println("HOW MANY SALARIED NEW EMPLOYEE DO YOU WANT TO CREAT?");
                int se=input.nextInt();
                
                 System.out.println("Serial must be 0 to 20");      
                 System.out.println("enter serial");
                 int serial=input.nextInt();
                for(int scan=serial;scan<serial+se;scan++){
                 
                 System.out.println("ENTER ID:");
                 int  i=input.nextInt();
                 System.out.println("ENTER NAME:");
                 String n=input.next();
                 System.out.println("ENTER SALARY");
                 int s=input.nextInt();
                 System.out.println("ENTER DEPARTMENT");
                 String d=input.next();
                 
                 sa[scan]=new  Salaried();
                 sa[scan].setId(i);
                 sa[scan].setName(n);
                 sa[scan].setSalary(s);
                 sa[scan].setDepartment(d);
                 
                
             }
                
                for(int prt=serial;prt<se+serial;prt++){
                 System.out.println("YOUR NEW INFORMATION CREATED:");
                 System.out.println(sa[prt].getId());
                 System.out.println(sa[prt].getName());
                 System.out.println(sa[prt].getSalary());
                 System.out.println(sa[prt].getDepartment());
             } 
                
            }   
            
            else if(tt==2){
               
                 System.out.println("You can only create 20 commissioned employee");
                 System.out.println("HOW MANY COMMISSIONED NEW EMPLOYEE DO YOU WANT TO CREAT?");
                 int Ce=input.nextInt();
                 
                 System.out.println("Serial must be 0 to 20"); 
                 System.out.println("enter serial");
                 int serial=input.nextInt();
                 
                  for(int j=serial;j<Ce+serial;j++){
                 
                
                 System.out.println("ENTER ID:");
                 int i=input.nextInt();
                 System.out.println("ENTER NAME:");
                 String n=input.next();
                 System.out.println("ENTER BASE SALARY");
                 int s=input.nextInt();
                 
                 System.out.println("ENTER COMMISSION ");
                 int c=input.nextInt();
                 
                 System.out.println("ENTER DEPARTMENT");
                 String d=input.next();
                 
                 co[j]=new CommisionedEmployee();
                 co[j].setId(i);
                 co[j].setName(n);
                 co[j].setSalary(s);
                 co[j].setComps(c);
                 co[j].setDepartment(d);
                 
                 
             }
                for(int prt=serial;prt<Ce+serial;prt++){
                 System.out.println("YOUR NEW INFORMATION CREATED:");
                 System.out.println(co[prt].getId());
                 System.out.println(co[prt].getName());
                 int res=co[prt].getSalary() +co[prt].getComps();
                 System.out.println(res);
                 System.out.println(co[prt].getDepartment());
                 
                 
               
             }
                
            }
            
            else if(tt==3){
                System.out.println("You can only create 20 hourlysalaried employee");
                System.out.println("HOW MANY  NEW EMPLOYEE DO YOU WANT TO CREAT?");
                int hc=input.nextInt();
                
                 System.out.println("Serial must be 0 to 20"); 
                 System.out.println("enter serial");
                 int serial=input.nextInt();
                
            
                 for(int j=serial;j<hc+serial;j++){
                 System.out.println("ENTER ID:");
                 int  i=input.nextInt();
                 System.out.println("ENTER NAME:");
                 String n=input.next();
                 System.out.println("ENTER HOURLY SALARY");
                 int s=input.nextInt();
                 System.out.println("ENTER HOUR");
                 int h=input.nextInt();
                 System.out.println("ENTER DEPARTMENT");
                 String d=input.next();
                 
                 hs[j]=new HourlySalaried();
                 hs[j].setId(i);
                 hs[j].setName(n);
                 hs[j].setSalary(s);
                 hs[j].setHour(h);
                 hs[j].setDepartment(d);
                 
                 
            
                 }
                 
                for(int x=serial;x<hc+serial;x++){
                 System.out.println("YOUR NEW INFORMATION CREATED:");
                 System.out.println("ID"+hs[x].getId());
                 System.out.println("NAME"+hs[x].getName());
                 int res=hs[x].getHour() * hs[x].getSalary();
                 System.out.println("SALARY"+res);
                 System.out.println("DEPARTMENT"+hs[x].getDepartment());
                      }
                 
                 
            }
        
        }
        
        
      else if(hu==2){
              System.out.println("WLCOME TO EMPLOYEE'S UPDATE");
              System.out.println("Which type employee you want to update:");
              System.out.println("Enter your employee type: 1.salaried 2.Hourlysalaried 3.Commissioned  ");
              int update=input.nextInt();
              
              if(update==1){
                  System.out.println("Enter serial num that you want to update:");
                  System.out.println("If you create multiple same type employee you need to add one to the serial number:\n");
                  int ups=input.nextInt();
                  System.out.println("Which one you want to update:1.name 2.salary 3.department");
                  int up=input.nextInt();
                  if(up==1){
                      System.out.println("Enter updated name:");
                      String uname=input.next();
                      sa[ups].setName(uname);
              
                  }
                  else if(up==2){
                       System.out.println("Enter updated salary:");
                     int updatesal=input.nextInt();
                     sa[ups].setSalary(updatesal);
                     
                  }
                  else if(up==3){
                      System.out.println("Enter updated department:");
                      String updatedepar=input.next();
                      sa[ups].setDepartment(updatedepar);
                  }
                  
                  
              }
              else if(update==2){
                   System.out.println("Enter serial num that you want to update:");
                   System.out.println("If you create multiple same type employee you need to add one to the serial number:\n");
                  int ups=input.nextInt();
                  System.out.println("Which one you want to update:1.name 2.salary 3.department");
                  int up=input.nextInt();
                  if(up==1){
                      System.out.println("Enter updated name:");
                      String uname=input.next();
                      hs[ups].setName(uname);
              
                  }
                  else if(up==2){
                       System.out.println("Enter updated salary:");
                     int updatesal=input.nextInt();
                     hs[ups].setSalary(updatesal);
                     
                  }
                  else if(up==3){
                      System.out.println("Enter updated department:");
                      String updatedepar=input.next();
                      hs[ups].setDepartment(updatedepar);
                  }
              }
              
              else if(update==3){
                  
                   System.out.println("Enter serial num that you want to update:");
                   System.out.println("If you create multiple same type employee you need to add one to the serial number:\n");
                  int ups=input.nextInt();
                  System.out.println("Which one you want to update:1.name 2.salary 3.department");
                  int up=input.nextInt();
                  if(up==1){
                      System.out.println("Enter updated name:");
                      String uname=input.next();
                      co[ups].setName(uname);
              
                  }
                  else if(up==2){
                       System.out.println("Enter updated salary:");
                     int updatesal=input.nextInt();
                     co[ups].setSalary(updatesal);
                     
                  }
                  else if(up==3){
                      System.out.println("Enter updated department:");
                      String updatedepar=input.next();
                      co[ups].setDepartment(updatedepar);
                  }
                  
                  
              }
            
            
            
        }
        else if(hu==0){
            
            System.out.println("CREATE YOUR EMPLOYEE FIRST OTHERWISE YOU WILL GET ERROR MESSAGE");
            System.out.println("YOUR CAN VIEW ANY EMPLOYEE HERE: ");
            System.out.println("Enter your employee type:1.salaried 2.Hourlysalaried 3.Commissioned  ");
            int view=input.nextInt();
            
            if(view==1){
                System.out.println("Enter serial of salaried:");
                System.out.println("If you create multiple same type employee you need to add one to the serial number:\n");
                int sview=input.nextInt();
                 System.out.println("YOUR NEW INFORMATION CREATED:");
                 System.out.println(sa[sview].getId());
                 System.out.println(sa[sview].getName());
                 System.out.println(sa[sview].getSalary());
                 System.out.println(sa[sview].getDepartment());
             } 
            
            else if(view==2){
                System.out.println("Enter serial of Hourlysalaried:");
                System.out.println("If you create multiple same type employee you need to add one to the serial number:\n");
                int hview=input.nextInt();
            
                 System.out.println("ID"+hs[hview].getId());
                 System.out.println("NAME"+hs[hview].getName());
                 int res=hs[hview].getHour() * hs[hview].getSalary();
                 System.out.println("SALARY"+res);
                 System.out.println("DEPARTMENT"+hs[hview].getDepartment());
            
            
            }
            else if(view==3){
                System.out.println("Enter serial of Commissioned salaried:");
                System.out.println("If you create multiple same type employee you need to add one to the serial number:\n");
                int csview=input.nextInt();
                 System.out.println(co[csview].getId());
                 System.out.println(co[csview].getName());
                 int res=co[csview].getSalary() +co[csview].getComps();
                 System.out.println(res);
                 System.out.println(co[csview].getDepartment());
            }
            else{
                System.out.println("INVALID");
            }
            
            
            
        }
        else{
            
            System.out.println("SYSTEM OFFLINE");
            
            break;
         
        
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        }             
}
}


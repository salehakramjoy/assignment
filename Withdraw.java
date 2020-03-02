
package bankaccountnewupdate;





public class Withdraw {
     private int  ammount;
     
    Withdraw(){
        System.out.println("Welcome to withdraw");
    }

    public int getAmmount() {
        return ammount;
    }

    public void setAmmount(int ammount) {
        this.ammount = ammount;
    }

    
    void subdeeposite(int x){
        if(ammount>x)
        ammount=ammount-x;
        System.out.println("SUCCESSFULL");
    }
    
    
   
}


package bankaccountnewupdate;




public class Deposite {
    
    private int  ammount;
    
    Deposite(){
        System.out.println("Welcome to deposite");
    }

    public int getAmmount() {
        return ammount;
    }

    public void setAmmount(int ammount) {
        this.ammount = ammount;
    }

    
    void adddeposite(int x){
        ammount=ammount+x;
        System.out.println("SUCCESSFULL");
    }
    
    
   
   
    
    
    
}

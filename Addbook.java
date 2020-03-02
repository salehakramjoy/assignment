
package addressbook;





public class Addbook {
    private String name;
    private String address;
    private int phn,serial;

    Addbook(){
        System.out.println("WELCOME TO ADDRESSBOOK");
    }
    
    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }
    
   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhn() {
        return phn;
    }

    public void setPhn(int phn) {
        this.phn = phn;
    }
    
   
    
    
}

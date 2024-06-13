package Video12;

public class Customer {
     static String nic;
     String name;
     String address;


    static {
        System.out.println("Hi I'm static block");
        nic="FEA";
    }


    {
        System.out.println("Hi I'm instance block");
        name="FEA";
        address="FEA";
    }

     public Customer(){
         System.out.println("Hi I am constructor");
     }

    public Customer(String name, String address) {
        System.out.println("Hi I am constructor");
        this.name = name;
        this.address = address;
    }

    public String getNic() {
//        int a;
//        System.out.println(a);
//        System.out.println(name);
//        System.out.println(address);

        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
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
}

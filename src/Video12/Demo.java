package Video12;

public class Demo {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        System.out.println(customer1.getNic());
        System.out.println(customer1.getName());
        System.out.println(customer1.getAddress());


        System.out.println("\n\n\n");


        Customer customer2 = new Customer("isuru","Galle");
        System.out.println(customer2.getNic());
        System.out.println(customer2.getName());
        System.out.println(customer2.getAddress());
    }
}

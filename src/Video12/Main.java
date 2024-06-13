package Video12;

public class Main {
    public static void main(String[] args) {
        System.out.println(Customer.nic);


        Customer customer1 = new Customer();
        customer1.setNic("111");
        customer1.setName("name1");
        System.out.println(customer1.getNic());
        System.out.println(customer1.getName());

        Customer customer2 = new Customer();
//        customer2.setNic("222");
        System.out.println(customer2.getNic());
        System.out.println(customer2.getName());

        Customer customer3 = new Customer();
        System.out.println(customer3.getNic());
        System.out.println(customer3.getName());

        Customer.nic = "fdf";
        System.out.println(Customer.nic);

    }
}

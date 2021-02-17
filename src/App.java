import entities.Client;

public class App {
    public static void main(String[] args) {
        

        Client client = new Client("Bruno","bruno@gmail.com");
        Client client2  = new Client("Jose", "jose@gmail.com");
        Client client3  = new Client("Jose", "jose@gmail.com");


        System.out.println(client.hashCode());  // HASHCODE  -608985072
        System.out.println(client2.hashCode()); // HASHCODE  -1078395984
        System.out.println(client3.hashCode()); // HASHCODE  -1078395984
        

        System.out.println(client.equals(client2)); // false,hashcode diferente ou seja conteudo diferente
        System.out.println(client2.equals(client3)); // true,pois o hashcode sao iguais e o conteudo igual porem referencia de memoria diferente

     

    }
}

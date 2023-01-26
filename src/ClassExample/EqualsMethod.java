package ClassExample;

class Client{
    private int id;

    public Client(int id){
        this.id = id ;
    }
    public int getId() {
        return id;
    }
    
    public boolean equals(Object obj){
            Client other = (Client) obj;
        if(id !=other.id)
            return false ;
        return true;
    }
}
public class EqualsMethod {

    public static void main(String args[]) {
    Client client1 = new Client(25);
    Client client2 = new Client(25);
    Client client3 = client1;

    System.out.println(client1.equals(client2));

    System.out.println(client3.equals(client1));



    }
}

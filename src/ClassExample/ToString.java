package ClassExample;

class Animal {
    String name ;
    String type ;
    public Animal(String name , String type){
        this.name = name ;
        this.type = type ;
    }

    public String toString(){
        return "Animal [ name = "+ name +" , type =" +type+"]";
    }
}
public class ToString {

    public static void main(String args[]){
        Animal animal = new Animal("AK", "BK");
        System.out.println(animal);
    }

}

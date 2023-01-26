package DesignPattern;

class SingletonEager{
    private static SingletonEager singletonEager = new SingletonEager();
    private SingletonEager(){}
    public static SingletonEager  getInstance(){
        return singletonEager;
    }
}


class SingletonLazy {
    private static SingletonLazy singletonLazy = null ;
    private SingletonLazy() {}
    public static SingletonLazy getInstance(){
        if(singletonLazy == null){
            singletonLazy = new SingletonLazy();
        }
        return singletonLazy;
    }

}

class SingletonSynchronised{
    private static SingletonSynchronised singletonSynchronised = null;
    private SingletonSynchronised () {}
    public static synchronized SingletonSynchronised getInstance(){
        if(singletonSynchronised == null){
            singletonSynchronised = new SingletonSynchronised();
        }
        return singletonSynchronised;
    }
}


class SingletonSynchronisedBlock{
    private static  SingletonSynchronisedBlock singletonSynchronisedBlock = null;
    private SingletonSynchronisedBlock() {}
    public static SingletonSynchronisedBlock getInstance(){
        if(singletonSynchronisedBlock == null){
            synchronized (Singleton.class){
                singletonSynchronisedBlock = new SingletonSynchronisedBlock();
            }
        }
        return singletonSynchronisedBlock;
    }

}
public class Singleton {
    public static void main(String args[]){

        System.out.println("Singleton Design Pattern");

        System.out.println(SingletonEager.getInstance());

        System.out.println("Singleton Design Pattern Eager ");

        System.out.println(SingletonEager.getInstance());
        System.out.println();




        System.out.println("Singleton Design Pattern Lazy");

        System.out.println(SingletonLazy.getInstance());

        System.out.println("Singleton Design Pattern Lazy ");

        System.out.println(SingletonLazy.getInstance());
        System.out.println();



        System.out.println("Singleton Design Pattern synchronised method");

        System.out.println(SingletonSynchronised.getInstance());

        System.out.println("Singleton Design Pattern synchronised method ");

        System.out.println(SingletonSynchronised.getInstance());
        System.out.println();

        System.out.println("Singleton Design Pattern synchronised block");

        System.out.println(SingletonSynchronisedBlock.getInstance());

        System.out.println("Singleton Design Pattern synchronised block ");

        System.out.println(SingletonSynchronisedBlock.getInstance());
        System.out.println();


    }
}

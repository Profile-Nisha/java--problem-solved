public class Animal {
    public void eat(){
        System.out.println("i am eating");
    }
    public static void main(String args[]){
       System.out.println("1");
       Animal dog = new Animal();
       dog.eat();
       dog.run();
       
       
    }

    public void run(){
        System.out.println("i am running");
    }
    
    public class Birds{
        public void fly(){
            System.out.println("i am flying");
        }
    }
}


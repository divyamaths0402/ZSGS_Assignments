public class Block{
       public static void main(String [] args){
        System.out.println("I am main method");
        Block obj=new Block();
       }
     Block(){
        System.out.println("I am constructor");
     }

    static {
           System.out.println("Hi i am static block");
        }
    {
      System.out.println(" I am Initializer block");
    }
     
}
import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args){
        Pen pen1    = new Pen("Blue","Fine");
        Pen pen2 = new Pen("Red","Fat");

        System.out.println(pen1);
        try {
            System.out.println(pen1.getThickness());
            System.out.println("try 1");
            //throw new Exception();
            //System.out.println("try2");
        }
        catch(Exception e){
            System.out.println("the catch");
        }
        finally{
            System.out.println("the finally");
        }
    }

}

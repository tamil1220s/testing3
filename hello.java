
import java.util.*;

class A extends Thread
{
    public void run()
   {
    
         for (int i = 0; i < 10; i++)
        {
             System.out.println("hi");
             try {
                 Thread.sleep(10);
             } catch (Exception e) {
             }
        }
   }

   
    
}
class B extends Thread
{
    public void run()
   {
    for (int i = 0; i < 10; i++)
        {
             System.out.println("hello");
             try {
                 Thread.sleep(10);
             } catch (Exception e) { 
             }
        }
   }
}
public class hello
{
    public static void main(String[] args) {
        



        Map <Integer,String> dict = new HashMap <> ();

        dict.put(1, "fruit");
        dict.put(2, "veg");
        dict.put(3, "greens");
        
      dict.forEach((num,food) -> System.out.println(num +"  :  " +food));


      HashSet<Integer> r = new HashSet<>();
      r.add(7);
      r.add(56);
      r.add(34);
      r.add(56);
      r.add(3);

   r.forEach((num) -> System.out.println(num));

int a = 10;
int b = 20;
String t;

t =  (a>b)? "no":"yes";
       
        A obj1 = new A();
   
        
        B obj2 = new B();
      

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}
Package java;
import java.util.*;
class Animal
{
    public void  dog()
    {
        System.out.println("i am a dog");
        
    }
}
class b extends Animal
{
    public void  cat()
    {
        System.out.println("i am a dog");
        
    }
}
class Singleinheritance{
    public static void main(String args[])
    {
        b obj=new b();
    obj.cat();
    obj.dog();
    }
}
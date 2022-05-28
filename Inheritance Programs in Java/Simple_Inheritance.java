
// Simple inheritance


class Super_class
{
    int a = 10;
    void Display_Super()
    {
        System.out.println("Display on Super Class: - Value of a is"+a);
    }
}

class Sub_class extends Super_class{
    void Display_sub()
    {
        System.out.println("\nDisplay on Sub Class:-  Value of a is"+a);
    }
}
class Main    //change it while using in your device and save the main classname as   SingleInheritance
{
    public static void main(String args[])
    {
        Sub_class sub1 = new Sub_class();
        sub1.Display_Super();
        sub1.Display_sub();
    }
}

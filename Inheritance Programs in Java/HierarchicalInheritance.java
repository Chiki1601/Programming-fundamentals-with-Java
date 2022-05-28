
//Hierarchical Inheritance

class classA  // super class
{
    int a = 10;
    int b = 20;
}

class classB extends classA // 1st sub class
{
    void Sum(){
        int add = a+b;
        System.out.println("Addition is" +add);
    }
}

class classC extends classA // 2nd sub class
{
    void Product()
    {
        int mul = a*b;
        System.out.println("Product is"+mul);
    }
}

class Main    // change it while using in your device and save the main classname as  HierarchicalInheritance
{ 
    public static void main(String []args)
    {
    classB b = new classB();
    classC c= new classC();
    b.Sum();
    c.Product();
    
}
}

/*

note:   i compiled this program online.
so if you are using my program  on your system;
then use "Main" class as "Hierarchical Inheritance"
and save the file as "HierarchicalInheritance.java"

*/

package Turtle;

public class Main
{
    public static void main(String[] args)
    {
        Turtle one = new Turtle();
        Turtle two = new Turtle("Pashka", 50, 20);
        Turtle three = new Turtle("Differential", 20, 10, "Oksana", 6);


        System.out.println("\n \n");
        System.out.println(one);
        System.out.println("\n \n");
        System.out.println(two);
        System.out.println("\n \n");
        System.out.println(three);
        System.out.println("\n \n");
    }
}
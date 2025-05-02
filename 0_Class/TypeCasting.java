
public class TypeCasting {
    public static void main(String[] args) {
        // Type casting 

        byte a = 10;    
        short b = a;
        int c = a;
        double d = a;
        System.out.println("Byte to short, int, double :- "+" b:- "+b+ " c:- " +c+ " d:- " +d);

        short e = 10;
        int f = e;
        double g = e;
        System.out.println("short to int, double :- "+" f:- "+f+ " g:- " +g);

        int h = 10;
        double i = h;
        System.out.println("int to double :- " +" i:- "+i);

        short j = 10;
        byte k = (byte)j;
        System.out.println("short to byte :- " +" k:- "+k);

        int l = 10;
        byte m = (byte)l;
        System.out.println("int to byte :- " +" m:- "+m);

        double n = 10;
        byte o = (byte)n;
        System.out.println("double to byte :- " +" o:- "+o);


        System.out.println("Lokesh Pardhi");

    }
}



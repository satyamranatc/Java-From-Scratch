// ! Strings
public class Day18 
{

    public static void main(String[] args) {
        //! Strings:
            //? 1. String
            //? 2. String Buffer
            //? 3. String Builder

        
        // String:
        String N = "Ajay";
        String X = "Ajay";
        // The N and X Sheres The same SCP Space 

        String N2 = new String("Ajay");
        // New Memory Will Created For N2

        // System.out.println(N);
        // N += " Kumar";//? Now N Has New Memory
        // System.out.println(N);


        System.out.println(N == N2);
        // == will Check The Memory address

        System.out.println(N.equals(N2));
        // equals will Check The Data

        System.out.println(N.contains("A"));
        // Contains will check a Part Of String


    //!----------------------------------
        System.out.println("--------------------------------");
        StringBuffer a = new StringBuffer("Ajay");
        System.out.println(a);

        a.append(" Kumar");
        System.out.println(a);


        System.out.println("-----------------");
        StringBuilder b = new StringBuilder("Ajay");
        System.out.println(b);
        b.append(" Kumar");
        System.out.println(b);


    }

}

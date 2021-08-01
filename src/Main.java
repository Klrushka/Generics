import task10.GenericMethods;
import task2.Holder;

public class Main {
    public static void main(String[] args) {

        /*
        Exercise 2: (1) Create a holder class that holds three objects of the same type, along with
        the methods to store and fetch those objects and a constructor to initialize all three.
         */

        Holder<Integer> holder = new Holder<>(1, 2, 3);

        System.out.println("Object 1: " + holder.getObject1() + "\n" +
                "Object 2: " + holder.getObject2() + "\n" +
                "Object 3: " + holder.getObject3());


        System.out.println();

        /*
        Exercise 3 : (1) Create and test a SixTuple generic.

        ********************IN task3 package****************
         */





        /*
        Exercise 9: (1) Modify GenericMethods.java so that f( ) accepts three arguments, all
        of which are of a different parameterized type.

        Exercise 10: (1) Modify the previous exercise so that one of f( )’s arguments is non-
        parameterized.
         */

        GenericMethods genericMethods = new GenericMethods();

        genericMethods.f("Hi", 123.5454545,"bye");

        System.out.println();


        /*

         */





    }
}

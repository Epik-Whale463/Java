public class printf {
    public static void main(String[] args) {

            //System.out.printf("%d is the answer ",123);

            boolean myBoolean = true;
            char myChar = '@';
            String myString ="Charan";
            int myInt = 40;
            double myDouble = -1000.00;

            // using printf method on the above data types


            /*
            System.out.printf("%b",myBoolean);
            System.out.printf("%c",myChar);
            System.out.printf("%s",myString);
            System.out.printf("%d",myInt);
            System.out.printf("%f",myDouble);

             */

             //width

             System.out.printf("Hello %10s\n",myString);

             // precision

             System.out.printf("You have %.3f dollars\n",myDouble);

             // flags

            System.out.printf("You have %,f dollars",myDouble);


    }
}

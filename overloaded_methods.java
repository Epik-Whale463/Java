public class overloaded_methods {
    public static void main(String[] args) {

        int x = add(1,2);
        System.out.println(x);
    }

    // METHODS........

    static int add(int a,int b) {

        // accepts 2 values

        return (a + b);
    }

    static int add(int a,int b,int c)   {

        // accepts 3 values

        return (a + b+  c);
    }

      static int add(int a,int b,int c,int d)   {

        // accepts 4 values

        return (a + b+  c +d);
    }
}

public class variable {
    public static void main(String[]args){

        //Int  non decimal
        int age = 120;
        int year = -120;
        System.out.println(age + year);

        //float stores floating point numbers, with decimals, such as 19.99 or -19.99
         float A = 19.99f;
         float B = -19.99f;
         System.out.println(A + " " + B);

        //boolean store value true or false
        boolean hijau = true;
        boolean merah = false;

        //String store text "Hello"
        String FirstName = "Akhtar";
        String LastName = "Fauzan";
        String FullName = FirstName + LastName;
        System.out.println("Nama: " + FullName);

        //char stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
        char Nilai = 'A';
        System.out.println("Nilai Agama: " + Nilai); 

        //Mixing text and number

        int x = 5;
        int y = 2;

        System.out.println("Hasil kali dari X dan Y adalah:"+ x * y);

        //Declare many variable
        int a = 5,b = 2,c = 10;
        System.out.println(a * b + c);
        
        //One value to multiple variable
        int e, f, g;
        e = f = g = 50;
        System.out.println(e + f + g);

        //constant final value A variable declared with final becomes a constant, which means unchangeable and read-only
        final int BIRTH = 2007;
        System.out.println(BIRTH);


        /*
        The general rules for naming variables are:

          Names can contain letters, digits, underscores, and dollar signs
          Names must begin with a letter
          Names should start with a lowercase letter, and cannot contain whitespace
          Names can also begin with $ and _
          Names are case-sensitive ("myVar" and "myvar" are different variables)
          Reserved words (like Java keywords, such as int or boolean) cannot be used as names

          Invalid identifiers:
         int 2ndNumber = 5;  // Cannot start with a digit
         int my var = 10;    // Cannot contain spaces
         int int = 20;       // Cannot use reserved keywords

         */



    }
}
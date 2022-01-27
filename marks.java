import java.util.Scanner;

class main {

    public static void main(String[] args) {

        //declare variables
        int mark;




        //scanner statement
        Scanner sc = new Scanner(System.in);




        //prompt the user to enter marks
        System.out.println("Enter Marks");
        mark  = sc.nextInt();



        //generate the results
        if (mark <=49)
         {

            System.out.println("Fail");


        } else if (mark >=50 && mark <=59)

        {

           System.out.println("Pass");

       }

       else if (mark >=60 && mark <=79)

        {

           System.out.println("Credit");

       }

       else if (mark >=80 && mark <=100)

        {

           System.out.println("Distinction");

       }

        
        
    }


}
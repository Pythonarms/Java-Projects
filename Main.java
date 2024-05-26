import java.util.Scanner;

public class Main {
 public static Scanner objscan = new Scanner(System.in);
    public static void main(String[] args) {

        //message asking user which action they want to take
        {System.out.println(
                """
                        Choose one the following options:\s
                        1.Addition
                        2.Subtraction
                        3.Multiplication
                        4.Division
                        5.Modulus
                        6.Square root
                        Enter any other number to exit the program
                        =============================================================================================
                        Enter your choice:\s"""
        );}
        //entering there action option
        int response = Integer.parseInt(objscan.nextLine());
        boolean option = false;
        while (!option) {

            double num1,num2;
                //entering the numbers
                System.out.println("Enter the first number: ");
                num1 = Double.parseDouble(objscan.nextLine());
                System.out.println("Enter the second number: ");
                num2 = Double.parseDouble(objscan.nextLine());

                //switch statement about the option picked
             switch(response){
                 case 1 : Add(num1,num2);break;
                 case 2 : Sub(num1,num2);break;
                 case 3: multi(num1,num2);break;
                 case 4: Divi(num1,num2);break;
                 case 5:Mod(num1,num2);break;
                 case 6: Sqr(num1);break;
             }

             //if that will ask user to continue
             if(response !=0){

                 System.out.println("Do you want to continue? Y/N");

                 String ans = objscan.nextLine();
                 //if statement yes or no continuation
                    if(ans.equals("Y") || ans.equals("y")){
                        {System.out.println(
                                """
                                        Choose one the following options: 1.
                                        Addition
                                        2.Subtraction
                                        3.Multiplication
                                        4.Division
                                        5.Modulus
                                        6.Square root
                                        Enter any other number to exit the program
                                        =============================================================================================
                                        Enter your choice:\s"""
                        );}
                        System.out.println("Which action do you want to take?");
                       String response2 = objscan.next();
                        System.out.println("Enter the first number: ");
                        num1 = Double.parseDouble(objscan.nextLine());
                        System.out.println("Enter the second number: ");
                        num2 = Double.parseDouble(objscan.nextLine());

                        System.out.println("Choose your action: ");
                        Calculator(response2, num1,num2);
                    }
             }else{
                 option = true;
             }

        }


    }

    //calculator function with other functions
    public static void Calculator(String response,double num1,double num2){

        switch (response) {
            case "1" : Add(num1, num2);break;
            case "2" : Sub(num1, num2);break;
            case "3" : multi(num1, num2);break;
            case"4"  :Divi(num1, num2);break;
            case "5" : Mod(num1, num2);break;
            case "6" : Sqr(num1);break;
        }
    }
    //addition function
    public static void Add(double num1,double num2){

        double answer;
        answer = num1 + num2;
        System.out.println("Add answer: " +answer);

    }
    //subtraction function
    public static void Sub(double num1,double num2){

        double answer;
        answer = num1 - num2;
        System.out.println("Subtraction answer: " +answer);

    }

    //multiplication function
    public  static void multi(double num1,double num2){

        double answer;
        answer = num1 * num2;
        System.out.println("Multiplication answer: " +answer);

    }
//division function
    public static void Divi(double num1,double num2){

        double answer;
        if(num2 == 0){
            System.out.println("You can't divide by zero. Please enter different numbers");
            System.out.println("First number: ");
            num1 = Double.parseDouble(objscan.nextLine());
            System.out.println("Second number: ");
            num2 = Double.parseDouble(objscan.nextLine());
            Divi(num1,num2);
        }else {
            answer = num1 / num2;
            System.out.println("Division answer: " + answer);
        }

    }
    //Modulus function
    public static void Mod(double num1,double num2){

        double answer;
        answer = num1 % num2;
        System.out.println("Modulus answer: " +answer);

    }
    //square root function
    public static void Sqr(double num1){

        double answer;
       answer= Math.sqrt(num1);
        System.out.println("Sqaure root answer: "+answer);

    }
}
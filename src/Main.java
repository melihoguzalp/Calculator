import java.util.Scanner;

public class Main {



    public static int extr(int a,int b) {

        return (a - b);

    }
    public static double div(int a,int b) {
        return ((double)a / b);

    }
    public static int sum(int a,int b){

        return (a + b);

    }
    public static int sum(int a,int b,int c) {

        return (a + b + c);
    }
    public static int multp(int a,int b) {

        return a * b;
    }
    public static int multp(int a,int b,int c) {
        return a * b * c;

    }



    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);

        String operations = "1. Sum Operation\n"
                +"2. Extraction\n"
                +"3. Multiplication\n"
                +"4. Division\n"
                +"q" ;


        System.out.println("****************************************");
        System.out.println(operations);
        System.out.println("****************************************");


        while(true){



            System.out.println("Please Select an Operation: ");

            String operation = scanner.nextLine();

            int a;
            int b;
            int c;

            if(operation.equals("q")){

                System.out.println("Bye bye");
                break;

            }


            else if(operation.equals("1")){


                System.out.print("How many value will you sum? (2  or  3): ");

                int countnumber = scanner.nextInt();

                if (countnumber == 2) {
                    System.out.print("a:");
                    a = scanner.nextInt();
                    System.out.print("b:");
                    b = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Sum of the numbers : " + (sum(a, b)));


                }
                else if (countnumber == 3) {
                    System.out.print("a:");
                    a = scanner.nextInt();
                    System.out.print("b:");
                    b = scanner.nextInt();
                    System.out.print("c:");
                    c = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Sum of the numbers : " + (sum(a, b,c)));

                }
                else {

                    System.out.println("This is not a sut...");
                }



            }



            else if(operation.equals("2")){

                System.out.println("First Number : ");
                a = scanner.nextInt();
                System.out.println("Second Number : ");
                b = scanner.nextInt();

                System.out.println("Sum : " + extr(a,b));

            }

            else if(operation.equals("3")){

                System.out.print("How many value will you sum? (2  or  3): ");

                int countnumber = scanner.nextInt();

                if (countnumber == 2) {
                    System.out.print("a:");
                    a = scanner.nextInt();
                    System.out.print("b:");
                    b = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Multiplication of numbers  : " + (multp(a, b)));


                }
                else if (countnumber == 3) {
                    System.out.print("a:");
                    a = scanner.nextInt();
                    System.out.print("b:");
                    b = scanner.nextInt();
                    System.out.print("c:");
                    c = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Multiplication of numbers : " + (multp(a, b,c)));

                }
                else {

                    System.out.println("This is not a suitable method...");
                }
            }


            else if(operation.equals("4")){

                System.out.println("First Number : ");
                a = scanner.nextInt();
                System.out.println("Second Number : ");
                b = scanner.nextInt();

                System.out.println("Sum : " + div(a,b));
            }

            else {

                System.out.println("This is not a suitable method...");


            }

        }





/*   Second way for Calculator

                switch (operation) {

                    case "1":
                        System.out.println("First Number : ");
                        a = scanner.nextInt();
                        System.out.println("Second Number : ");
                        b = scanner.nextInt();

                        System.out.println("Sum : " + (a + b));
                        break;

                    case "2":

                        System.out.println("First Number : ");
                        a = scanner.nextInt();
                        System.out.println("Second Number : ");
                        b = scanner.nextInt();

                        System.out.println("Sum : " + (a - b));
                        break;

                    case "3":

                        System.out.println("First Number : ");
                        a = scanner.nextInt();
                        System.out.println("Second Number : ");
                        b = scanner.nextInt();

                        System.out.println("Mult : " + (a * b));
                        break;

                    case "4":

                        System.out.println("First Number : ");
                        a = scanner.nextInt();
                        System.out.println("Second Number : ");
                        b = scanner.nextInt();

                        System.out.println("Div : " + (a / b));
                        break;





                }



 */




            }

        }

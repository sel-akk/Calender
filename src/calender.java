import java.util.Scanner;

//A program that asks the user if a year is a leap one and prints the days
//By Selin Beren Akkaya
public class calender {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Is the year a leap year (enter yes or no) : ");

        String leap = scan.nextLine();  // Read user input

        scan.close();


        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

        for(int  i = 0; i <= 11; i++){

            //31 days : 0, 2, 4, 6, 7, 9, 11
            if(i == 0 || i == 2 || i == 4 || i == 6 || i == 7 || i == 9 || i == 11){

                for(int j = 1; j <= 31; j++){
                    System.out.println(months[i] + j);
                }

            }
            //30 days : 3, 5, 8, 10
            if(i == 3 || i == 5 || i == 8 || i == 10){
                for(int j = 1; j <= 30; j++){
                    System.out.println(months[i] + j);
                }
            }

            //28 days : 1
            if(i == 1){

                if(leap.equals("no")) {
                    for (int j = 1; j <= 28; j++) {
                        System.out.println(months[i] + j);
                    }
                }

                if(leap.equals("yes")){
                    for (int j = 1; j <= 29; j++) {
                        System.out.println(months[i] + j);
                    }
                }


            }

        }

    }
}

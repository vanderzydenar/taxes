import java.util.Scanner;

public class Taxes
{  
  public static void main ( String[] args )  
  {
    Scanner scan = new Scanner( System.in );

    double originalIncome = 0;
    double incomeValue = 0;
    double remainingIncome = 0;
    double taxes = 0;
    double children = 0;
    double age = 0;
    

    System.out.println("What is your income?: ");
    originalIncome = scan.nextInt();

    System.out.println("What is your age?: ");
    age = scan.nextInt();

    System.out.println("How many children do you have?: ");
    children = scan.nextInt();


    remainingIncome = originalIncome;

    //Total Taxes

    while(remainingIncome > 0) {

        if(remainingIncome > 10000){ //checks if it is greater than value
            remainingIncome -= 10000; //if so, substracts maximum value for specific tax rate
            taxes += 10000*0; //adds the tax percentage of maximum to the total taxes
            //System.out.println(remainingIncome);
        } else { //else, takes the remaining value and taxes that 
            taxes += remainingIncome*0.0;
            remainingIncome -= remainingIncome;
        }

        
        if(remainingIncome > 25000){ //checks if it is greater than value
            remainingIncome -= 25000;
            taxes += 25000*0.10;
            //System.out.println(remainingIncome);
        } else if (remainingIncome > 10000){ //checks if it greater than the last and taxes that
            taxes += remainingIncome*0.10;
            remainingIncome -= remainingIncome;
        }


        if(remainingIncome > 75000){
            remainingIncome -= 25000;
            taxes += 75000*0.20;
        } else if (remainingIncome > 25000){
            taxes += remainingIncome*0.20;
            remainingIncome -= remainingIncome;
        }

        if(remainingIncome > 250000){
            remainingIncome -= 250000;
            taxes += 250000*0.30;
        } else if (remainingIncome > 75000){
            taxes += remainingIncome*0.30;
            remainingIncome -= remainingIncome;
        }

        
        if(remainingIncome > 250000){
            remainingIncome -= 250000;
            taxes += 250000*0.40;
        }  
    }

    

    //Age Discount

    if(age < 0){
        System.out.println("Fatal error. Age below zero.");
    }
    if(age > 0 && age < 15){
        taxes -= taxes*0.50;
    }
    if(age > 16 && age < 21){
        taxes -= taxes*0.25;
    }
    if(age > 22 && age < 63){
        taxes -= taxes*0.0;
    }
    if(age > 64 && age < 72){
        taxes -= taxes*0.33;
    }
    if(age > 73 && age < 80){
        taxes -= taxes*0.66;
    }
    if(age > 80){
        taxes = 0;
    }

    //Child Dependents

    if(children == 0){
        taxes = taxes;
    }
    if(children == 1){
        taxes -= 1000;
    }
    if(children > 2){
        taxes -= children*500;
    }
    
    System.out.println(taxes);

}
}
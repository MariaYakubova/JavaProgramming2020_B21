package day14_Switch_Recap;

public class SalaryCalculator {
    public static void main(String[] args) {
        int hourlyRate=45;
        int weeklyHours =35;
        int numberOfWeeks= 75;

        int salary = 0;
        if(hourlyRate>0){
            if(weeklyHours>1&&weeklyHours<=65){
                if( numberOfWeeks>1 &&  numberOfWeeks<=52){

                    salary=hourlyRate*weeklyHours* numberOfWeeks;
                }
            }
        }

        /*
        1. write a program for the salary calculator
            given info:
                    hourlyRate  40$
                    weeklyHours  45 hours
                    numberofWeeks 48 weeks
            pre conditions: hourlyRate cannot be negative
                            weekly hours cannot be negative or more than 65
                            numberOfWeeks cannot be more than 52 weeks or less than 1
            salary  =  hourlyRate *  weeklyHours * numberofWeeks

         */
    }
}

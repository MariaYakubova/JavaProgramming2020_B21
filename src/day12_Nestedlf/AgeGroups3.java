package day12_Nestedlf;

public class AgeGroups3 {
    public static void main(String[] args) {

        int age =99;
        //with ternary:
        String ageGroups =(age<=2)?"infant":(age <= 5)?"Toddler":
                (age <= 9)?"Kid":(age <= 12)?"Pre-Teen":(age <= 17)?"Teenager":
               (age <= 20)?"Young Adult":(age <= 39)?"Adult":(age <= 49)?"Young Middle Age Adult":
               (age <= 54)?"Middle Age Adult":(age <= 64)?"Very Young Senior Citizen":
               (age <= 74)?" Young Senior Citizen":(age <= 84)?"Senior Citizen":"Old Senior Citizen";
        System.out.println(ageGroups);
    }
}

 /*if (age >= 1 && age <= 2) {// it becomes false when age >=3

            ageGroups = "infant";
        } else if (age <= 5) {//becomes false when age >=6
            ageGroups = "Toddler";
        } else if (age <= 9) { //becomes false when age >=10
            ageGroups = "Kid";
        } else if (age <= 12) {//becomes false when age >=13
            ageGroups = "Pre-Teen";
        } else if (age <= 17) {//becomes false when age >=18
            ageGroups = "Teenager";
        } else if (age <= 20) {//becomes false when age >=21
            ageGroups = "Young Adult";
        } else if (age <= 39) {// becomes false when age<=40
            ageGroups = "Adult";
        } else if (age <= 49) {// becomes false when age >=50
            ageGroups = (age <= 49);
        } else if (age <= 54) {//becomes false when age >=55
            ageGroups = "Middle Age Adult";
        } else if (age <= 64) {//becomes false when age >=65
            ageGroups = "Very Young Senior Citizen";
        } else if (age <= 74) {//becomes false when age >=75
            ageGroups = " Young Senior Citizen";
        }else if (age <= 84) {//becomes false when age >=85
            ageGroups = "Senior Citizen";
        }else {
            ageGroups = "Old Senior Citizen";
            */



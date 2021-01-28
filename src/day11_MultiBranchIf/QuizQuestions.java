package day11_MultiBranchIf;

public class QuizQuestions {
    public static void main(String[] args) {

        int ivar = 100;
        double dvar = 200;
        float fvar = 300;

        ivar = (int)fvar; //explicit casting
        fvar = ivar; // implicit casting
        dvar = fvar;//implicit casting
        fvar = ivar ;//implicit casting
        dvar = ivar;//implicit casting
        ivar= (int)dvar;//explicit casting

        int a = 3, b   =2;
        //long c =(a+b)

    }
}

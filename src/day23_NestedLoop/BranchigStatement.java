package day23_NestedLoop;

public class BranchigStatement {
    public static void main(String[] args) {
        int a =10;
        int b =0;

        if(b == 0){
            System.err.println("Invalid Number");
            System.exit(0);  // forcefully terminating the program
        }


        System.out.println(a/b);

    }
}

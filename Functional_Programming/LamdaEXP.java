package Functional_Programming;

public class LamdaEXP {
    public static void main(String[] args) {
        WorkerInterface wk=()->{System.out.println("Do some work using lamda expression");};
        
        System.out.println(wk);
    }
}

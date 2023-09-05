package Facade;

public class CPU {
    public void freeze() {
        System.out.println("CPU is freezing");
    }

    public void jump(int position) {
        System.out.println("CPU is jumping to " + position);
    }

    public void execute() {
        System.out.println("CPU is executing");
    }
}

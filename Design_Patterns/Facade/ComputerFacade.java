package Facade;

public class ComputerFacade {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public ComputerFacade() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    public void start() {
        System.out.println("Computer is starting...");
        cpu.freeze();
        memory.load("Boot program");
        cpu.jump(0);
        cpu.execute();
        hardDrive.read(0, 1024);
    }

    public void close() {
        System.out.println("Computer is shutting down...");
        // Add any necessary shutdown logic here
        
    }
}

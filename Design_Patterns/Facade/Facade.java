package Facade;

public class Facade {
    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade();
        computer.start();

        // Simulate using the computer for some time

        computer.close();
    }
}

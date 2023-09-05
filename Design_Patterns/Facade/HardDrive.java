package Facade;

public class HardDrive {
    public void read(int sector, int size) {
        System.out.println("Hard Drive is reading from sector " + sector + " with size " + size);
    }
}

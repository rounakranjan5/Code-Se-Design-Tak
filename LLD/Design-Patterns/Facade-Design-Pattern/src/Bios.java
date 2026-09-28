public class Bios {

    public void boot(CPU cpu,Memory memory){
        System.out.println("BIOS : Booting CPU and Memory Checks !!");
        cpu.initiate();
        memory.selfTest();
    }

}

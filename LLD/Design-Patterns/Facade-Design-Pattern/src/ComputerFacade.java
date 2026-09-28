public class ComputerFacade {

    private PowerSupply powerSupply=new PowerSupply();
    private CoolingSystem coolingSystem=new CoolingSystem();
    private CPU cpu=new CPU();
    private Memory memory=new Memory();
    private HardDrive hardDrive=new HardDrive();
    private Bios bios=new Bios();
    private Os os=new Os();

    public void startPC(){
        System.out.println(".........Starting Computer ....");
        powerSupply.start();
        coolingSystem.cool();
        bios.boot(cpu,memory);
        hardDrive.spinUp();
        os.load();
        System.out.println("Compuer Booted Successfully!");
    }

}

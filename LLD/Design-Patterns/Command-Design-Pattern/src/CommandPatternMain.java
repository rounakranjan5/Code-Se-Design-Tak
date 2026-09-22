public class CommandPatternMain {

    public static void main(String[] args) {

        Fan ceilingFan=new Fan();
        Light homeLight=new Light();

        RemoteController remote=new RemoteController();
        remote.setCommand(0,new FanCommand(ceilingFan));
        remote.setCommand(1,new LightCommand(homeLight));

        // toggling Fan

        remote.pressBtn(0);
        remote.pressBtn(0);
        remote.pressBtn(0);

        // toggling Light

        remote.pressBtn(1);
        remote.pressBtn(1);

        // pressing Unassigned Button
        remote.pressBtn(2);
        remote.pressBtn(3);
    }

}

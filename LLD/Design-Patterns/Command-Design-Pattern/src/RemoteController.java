public class RemoteController {

    private static final int numsBtn=4;
    private ICommand[] buttons;
    private boolean[] btnsPressed;

    public RemoteController() {
        this.buttons=new ICommand[numsBtn];
        this.btnsPressed=new boolean[numsBtn];

        for (int i = 0; i < numsBtn; i++) {
            buttons[i]=null;
            btnsPressed[i]=false;
        }

    }

    public void setCommand(int idx, ICommand command){

        if (idx>=0 && idx<numsBtn){
            buttons[idx]=command;
            btnsPressed[idx]=false;
        }

    }

    public void pressBtn(int idx){
        if (idx>=0 && idx<numsBtn && buttons[idx]!=null){
            if (!btnsPressed[idx]){
                buttons[idx].execute();
            }else{
                buttons[idx].undo();
            }
            btnsPressed[idx]=!btnsPressed[idx];
        }
        else{
            System.out.println("DISCLAIMER : Please Set Command First !!");
        }
    }

}

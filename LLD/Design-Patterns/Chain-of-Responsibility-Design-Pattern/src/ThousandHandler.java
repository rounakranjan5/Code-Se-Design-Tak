public class ThousandHandler extends MoneyHandler {
    private int totalnotes;
    public ThousandHandler(int totalnotes) {
        this.totalnotes=totalnotes;
    }

    @Override
    public void nextHandler(MoneyHandler nextHandler) {
        super.nextHandler(nextHandler);
    }

    @Override
    public void dispense(int amount) {
        int notesNeeded=amount/1000;

        if(notesNeeded>totalnotes){
            notesNeeded=totalnotes;
            totalnotes=0;
        }else{
            totalnotes-=notesNeeded;
        }

        if(notesNeeded>0) System.out.println("Dispensing "+notesNeeded+" $1000 notes..." );

        int remainingAmount=amount-notesNeeded*1000;

        if(remainingAmount>0){
            if(nextHandler!=null){
                nextHandler.dispense(remainingAmount);
            }else{
                System.out.println("Insufficient Fund!! for the remaining amount $"+remainingAmount);
            }
        }
    }
}

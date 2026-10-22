public class OneHundredHandler extends MoneyHandler {
    private int totalnotes;
    public OneHundredHandler(int totalnotes) {
        this.totalnotes=totalnotes;
    }

    @Override
    public void nextHandler(MoneyHandler nextHandler) {
        super.nextHandler(nextHandler);
    }

    @Override
    public void dispense(int amount) {
        int notesNeeded=amount/100;

        if(notesNeeded>totalnotes){
            notesNeeded=totalnotes;
            totalnotes=0;
        }else{
            totalnotes-=notesNeeded;
        }

        if(notesNeeded>0) System.out.println("Dispensing "+notesNeeded+" $100 notes..." );

        int remainingAmount=amount-notesNeeded*100;

        if(remainingAmount>0){
            if(nextHandler!=null){
                nextHandler.dispense(remainingAmount);
            }else{
                System.out.println("Insufficient Fund!! for the remaining amount $"+remainingAmount);
            }
        }
    }
}

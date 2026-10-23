abstract class ModelTrainer {
    public final void trainPipeline(String path){
        loadData(path);
        preprocess();
        train();//subclass specific
        evaluate();//subclass specific
        save();//subclass specific
    }

    protected abstract void train();
    protected abstract void evaluate();

    // common save method - subclass can override it
    protected void save() {
        System.out.println("saving --- COMMON");
    }

    protected void preprocess() {
        System.out.println("pre-processing started");
    }

    protected void loadData(String path) {
        System.out.println("loaded data into "+path);
    }

}

public class NeuralNetwork extends ModelTrainer {
    @Override
    protected void train() {
        System.out.println("neural network training started");
    }

    @Override
    protected void evaluate() {
        System.out.println("neural network evaluation started");
    }

    @Override
    protected void save() {
        System.out.println("SAVING -- Neural Network");
    }
}

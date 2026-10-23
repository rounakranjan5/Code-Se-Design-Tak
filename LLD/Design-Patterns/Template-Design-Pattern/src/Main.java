public class Main {
    public static void main(String[] args) {
        System.out.println("=== Neural Network Training ===");
        ModelTrainer neuralnw=new NeuralNetwork();
        neuralnw.trainPipeline("data/images");// neural netword overrided save method

        System.out.println("=== Decision tree Training ===");
        ModelTrainer decisionTree=new DecisionTree();
        decisionTree.trainPipeline("data/iris.csv");// common save method

    }
}

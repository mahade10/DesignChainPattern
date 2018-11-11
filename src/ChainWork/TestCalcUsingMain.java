package ChainWork;

public class TestCalcUsingMain {

	public static void main(String[] args) {
		Chain chainCalc1 = new AddNumbers();
		Chain chainCalc2 = new SubtractNumbers();
		Chain chainCalc3 = new MultiplicationNumbers();
		Chain chainCalc4 = new DivideNumbers();
		
		chainCalc1.setNextChain(chainCalc2);
		chainCalc2.setNextChain(chainCalc3);
		chainCalc3.setNextChain(chainCalc4);
		
		
		Numbers requests = new Numbers(4,2,"sub");
		chainCalc1.calculate(requests);
		
	}

}

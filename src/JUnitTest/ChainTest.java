package JUnitTest;



import static org.junit.Assert.*;

import org.junit.Test;

import ChainWork.AddNumbers;
import ChainWork.Chain;
import ChainWork.DivideNumbers;
import ChainWork.MultiplicationNumbers;
import ChainWork.Numbers;
import ChainWork.SubtractNumbers;

public class ChainTest {

	@Test
	public void test() {
		Chain chainCalc1 = new AddNumbers();
		Chain chainCalc2 = new SubtractNumbers();
		Chain chainCalc3 = new MultiplicationNumbers();
		Chain chainCalc4 = new DivideNumbers();
		
		chainCalc1.setNextChain(chainCalc2);
		chainCalc2.setNextChain(chainCalc3);
		chainCalc3.setNextChain(chainCalc4);
		
		assertEquals("5.0",chainCalc1.calculate( new Numbers(3.0,2.0,"add")),"");
		//assertEquals("1.0",chainCalc2.calculate( new Numbers(3.0,2.0,"sub")));
		//assertEquals("6.0",chainCalc3.calculate( new Numbers(3.0,2.0,"mult")));
		//assertEquals("1.5",chainCalc3.calculate( new Numbers(3.0,2.0,"div")));
		
	}

}

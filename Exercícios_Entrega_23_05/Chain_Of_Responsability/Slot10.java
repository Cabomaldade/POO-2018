package chain.of.responsability;

public class Slot10 extends Slot{

	@Override
	public void capturar(int moeda) {
		if(moeda == 10) {
			valorCapturado += moeda;
		}
		else {
			getProximo().capturar(moeda);
		}
	}

}

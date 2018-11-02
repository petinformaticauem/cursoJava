package exemplos;

public interface Luminoso {
	public void acender();
	public void apagar();
}

package exemplos;

public class Abajur implements Luminoso {
	@Override
	public void acender() {
		System.out.println("Abajur acendeu");
		System.out.println("Vai ficar aceso a noite toda");
	}
	
	@Override
	public void apagar() {
		System.out.println("Não tenho medo do escuro, vou apagar o abajur");
	}
}


package exemplos;

public class LED implements Luminoso {
	@Override
	public void acender() {
		System.out.println("Vou ficar piscando e te causando câncer");
	}
	
	@Override
	public void apagar() {
		System.out.println("Cansei de ficar aceso");
	}
}



package exemplos;

public class Main {

	public static void main(String[] args) {
		Luminoso l1, l2;
		l1 = new Abajur();
		l2 = new LED();
		
		l1.acender();
		l2.acender();
		l2.apagar();
		l1.apagar();
	}
}


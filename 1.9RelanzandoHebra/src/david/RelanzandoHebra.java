package david;

class MiHebra extends Thread{
	public void run(){
		System.out.println("[Hebra]:\tDormimos un rato");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
		}
		System.out.println("[Hebra]:\tTerminamos");
	}
}
public class RelanzandoHebra {

	public static void main(String[] args) throws InterruptedException {
		MiHebra mh = new MiHebra();
		System.out.println("[Main]: Lanzamos la hebra...");
		mh.start();
		System.out.println("[Main]: Dormimos un rato...");
		Thread.sleep(3000);
		System.out.println("[Main]: Relanzamos la hebra..."+mh.getState());
		mh.start();
		while(true);
	}

}

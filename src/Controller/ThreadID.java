package Controller;

public class ThreadID extends Thread {
 
	private int idThread;
	
	public ThreadID(int idThread) {
		this.idThread= idThread;
	 
 }
	@Override
	public void run() {
		// so executa o que está aqui 
		System.out.println("TID # "+ getId());
	}
 
}

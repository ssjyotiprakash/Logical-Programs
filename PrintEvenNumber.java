package EvenThread;

public class PrintEvenNumber implements Runnable {
	private int no;
	Object object;

	public PrintEvenNumber(int no, Object object) {
		this.no = no;
		this.object = object;
	}

	@Override
	public void run() {
		try {
			synchronized (object) {
				for (int i = 1; i <= no; i++) {
					if (i % 2 == 0) {
						System.out.println(i);
						System.out.println("notifying");
						object.notify();
						object.wait();
					}
				}
			}
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}
}

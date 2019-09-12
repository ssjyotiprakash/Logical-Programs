package OddThread;

public class PrintOddNumber implements Runnable {
	private int no;
	Object object;

	public PrintOddNumber(int no, Object object) {
		this.no = no;
		this.object = object;
	}

	@Override
	public void run() {

		try {
			synchronized (object) {
				for (int i = 1; i <= no; i++) {
					if (i % 2 != 0) {
						System.out.println(i);
						System.out.println("waiting");
						object.wait();
						object.notify();
					}
				}
			}
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}

}

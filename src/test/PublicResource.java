package test;

/**
 * ������Դ��
 */
public class PublicResource {
	private int number = 0;

	/**
	 * ���ӹ�����Դ
	 */
	public synchronized void increace() {
		while (number == 2) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		number++;
		System.out.println(Thread.currentThread().getName() + " : "+ number);
		notify();
	}

	/**
	 * ���ٹ�����Դ
	 */
	public synchronized void decreace() {
		while (number == 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		number--;
		System.out.println(Thread.currentThread().getName() + " : "+number);
		notify();
	}
}

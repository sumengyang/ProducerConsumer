package test;

//ģ���������ߺ������߲���������Դ�����Σ�����뱣֤��������ķ�Χ�ڡ�
//׼ȷ˵Ӧ���ǡ�������-������-�ִ���ģ�ͣ��뿪�˲ִ���������������ģ�;��Ե�û��˵������
public class ProducerConsumerTest {
	public static void main(String[] args) {
		PublicResource resource = new PublicResource();
		new Thread(new ProducerThread(resource)).start();
		new Thread(new ConsumerThread(resource)).start();
		new Thread(new ProducerThread(resource)).start();
		new Thread(new ConsumerThread(resource)).start();
		new Thread(new ProducerThread(resource)).start();
		new Thread(new ConsumerThread(resource)).start();
	}
}
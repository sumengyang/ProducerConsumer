package test;

//模拟多个生产者和消费者操作公共资源的情形，结果须保证是在允许的范围内。
//准确说应该是“生产者-消费者-仓储”模型，离开了仓储，生产者消费者模型就显得没有说服力了
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
package blockingqueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * �ֿ���Storageʵ�ֻ�����
 * 
 */
public class Storage
{
	// �ֿ����洢��
	private final int MAX_SIZE = 100;

	// �ֿ�洢������
	private LinkedBlockingQueue<Object> list = new LinkedBlockingQueue<Object>(
	        100);

	// ����num����Ʒ
	public void produce(int num)
	{
		// ����ֿ�ʣ������Ϊ0
		if (list.size() == MAX_SIZE)
		{
			System.out.println("���������:" + MAX_SIZE + "/t��ʱ����ִ����������!");
		}

		// ����������������£�����num����Ʒ
		for (int i = 1; i <= num; ++i)
		{
			try
			{
				// �����Ʒ���Զ�����
				list.put(new Object());
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}

			System.out.println("���ֲִ���Ϊ��:" + list.size());
		}
	}

	// ����num����Ʒ
	public void consume(int num)
	{
		// ����ֿ�洢������
		if (list.size() == 0)
		{
			System.out.println("���������:0/t��ʱ����ִ����������!");
		}

		// ����������������£�����num����Ʒ
		for (int i = 1; i <= num; ++i)
		{
			try
			{
				// ���Ѳ�Ʒ���Զ�����
				list.take();
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}

		System.out.println("���ֲִ���Ϊ��:" + list.size());
	}

	// set/get����
	public LinkedBlockingQueue<Object> getList()
	{
		return list;
	}

	public void setList(LinkedBlockingQueue<Object> list)
	{
		this.list = list;
	}

	public int getMAX_SIZE()
	{
		return MAX_SIZE;
	}
}
package ex5_abstract;

public abstract class AbsParent {
	//�߻�Ŭ������ �߻�޼��带 �Ѱ� �̻� ������ �ִ� Ŭ������ �ǹ�
	//�߻�Ŭ������ ���� abstractŰ���带 ����Ѵ�.

	int value = 10;
	String str = "�ȳ�";

	//�߻�޼ҵ�
	//�߻�޼ҵ�� body�� ����. (abstract Ű���带 ���� �����Ѵ�)
	//��ü�� ���� �߻�޼���� '�̿ϼ��� ����'�̶�� �ϴµ�,
	//�̷��� �� �ϼ��� �޼��带 �ڽ��� �����޾� �ϼ���Ű���� �ϴ� ���� ������ �ȴ�.
    abstract public void setValue(int n);

	
	
	
}


//13.��������Ϊ�������ݸ�������
/*��ĿҪ��:
(1) ����һ��Circle��,����һ��double�͵�radius���Դ���Բ�İ뾶��findArea��������Բ�������
(2) ����һ����PassObject, �����ж���һ������printAreas(), �÷����Ķ�������:
	public void printAreas(Circle C, int times) //����ǩ��
(3) ��printAreas�����д�ӡ���1��times֮���ÿ�������뾶ֵ���Լ���Ӧ�������
	���磬timesΪ5,������뾶1, 2, 3, 4, 5,�Լ���Ӧ��Բ�����
(4) ��main�����е���printAreas������������Ϻ������ǰ�뾶ֵ��
	�������н����ͼ��ʾ
	Radius              Area
	1.0					3.14.......
	2.0
		
*/
	
class HomeWork13{
	public static void main(String[] args){
		Circle c = new Circle();
		PassObject o = new PassObject();
		o.printAreas(c,7);
	}
}

class Circle {
	double radius;
	public Circle(){
		
	}
	public Circle (double radius){
		this.radius = radius;
	}
	
	public double findArea(){
		return Math.PI * radius * radius;
	}
	
	// ��ӷ���setRadius���޸Ķ���İ뾶ֵ
	public void setRadius(double radius){
		this.radius = radius;
	}
}

class PassObject {
	public void printAreas(Circle c, int times){
		System.out.println("Radius\tArea");
		for(int i = 1;i <= times;i++){
			c.setRadius(i);
			System.out.println(i + "\t" + c.findArea());
		}
		
	}
}



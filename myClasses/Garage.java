package myClasses;
import java.util.Scanner;

public class Garage
{
	private double sideLength;
	private double sideWidth;
	private double height;

	public Garage()
	{
		sideLength = 1.0;
		sideWidth = 1.0;
		height = 1.0;
	}	
	public Garage(double sideLength, double sideWidth, double height)
	{
		this.sideLength = sideLength;
		this.sideWidth = sideWidth;
		this.height = height;
	}
	// �㭪�� �� ������� �ਢ���� ����� �����.
	public void setGarage(double sideLength, double sideWidth, double height)
	{
		this.sideLength = sideLength;
		this.sideWidth = sideWidth;
		this.height = height;
	}
	public void inputGarage()
	{
		System.out.print("������ ����� ��ࠦ�: ");
		Scanner scanner = new Scanner(System.in);
		sideLength = scanner.nextDouble();
		while (sideLength <= 0)
		{
			System.out.print("������ ���� ����� ��஭� - ��� ������ ���� ������⥫�� �᫮�. ���஡�� �� ࠧ: ");
			scanner = new Scanner(System.in);
			sideLength = scanner.nextDouble();
		}

		System.out.print("������ �ਭ� ��ࠦ�: ");
		scanner = new Scanner(System.in);
		sideWidth = scanner.nextDouble();
		while (sideWidth <= 0)
		{
			System.out.print("������ ���� ����� ��஭� - ��� ������ ���� ������⥫�� �᫮�. ���஡�� �� ࠧ: ");
			scanner = new Scanner(System.in);
			sideWidth = scanner.nextDouble();
		}

		System.out.print("������ ����� ��ࠦ�: ");
		scanner = new Scanner(System.in);
		height = scanner.nextDouble();
		while (height <= 0)
		{
			System.out.print("������ ���� ����� ��஭� - ��� ������ ���� ������⥫�� �᫮�. ���஡�� �� ࠧ: ");
			scanner = new Scanner(System.in);
			height = scanner.nextDouble();
		}
	}

	public void getGarage()
	{
		System.out.println("����� � ��ࠦ�:");
		System.out.println("����� ��஭� ��ࠦ�: " + sideLength);
		System.out.println("��ਭ� ��஭� ��ࠦ�: " + sideWidth);
		System.out.println("���� ��ࠦ�: " + height);
	}

	public double getSideLength()
	{
		return sideLength;
	}

	public double getSideWidth()
	{
		return sideWidth;
	}

	public double getHeight()
	{
		return height;
	}
}
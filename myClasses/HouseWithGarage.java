package myClasses;
import java.util.Scanner;

public class HouseWithGarage extends Building
{
		private Garage garage = new Garage();

		public HouseWithGarage()
		{
			super();
			this.garage.setGarage(1.0, 1.0, 1.0);
		}
		public HouseWithGarage(String typeOfBuilding, double sideLength, double basementHeight,
			double floorHeight, int floorAmount, int windowsAmount, int openedWindowsAmount, double sideLengthG,
			double sideWidthG, double heightG)
		{
			super(typeOfBuilding, sideLength, basementHeight, floorHeight, floorAmount, windowsAmount, openedWindowsAmount);
			this.garage = new Garage(sideLengthG, sideWidthG, heightG);
		}

		/* �㭪�� �� �뢮�� ᢮��� ������� ����� Building. */
		public void get()
		{
			System.out.println("�����⢠ ������� ������:");
			System.out.println("�������� ��ந⥫쭮� ��������: " + companyName);
			System.out.println("��饥 ������⢮ ������ �⮩ ��������: " + countOfBuildings);
			System.out.println("��� ������: " + typeOfBuilding);
			System.out.println("����� ��஭� �᭮�����: " + sideLength);
			System.out.println("���� �㭤�����: " + basementHeight);
			System.out.println("���� �⠦�: " + floorHeight);
			System.out.println("������⢮ �⠦��: " + floorAmount);
			facade.getFacade();
			System.out.println("�����樥�� ��⮩稢���: " + stabilityFactor);
			garage.getGarage();
			System.out.println();
		}

		public void input()
		{
			super.input();
			garage.inputGarage();
		}
/*
        public override string ToString()
        {
			string s = "";
			s += "�����⢠ ������� ������:\n" + "�������� ��ந⥫쭮� ��������: " +
				Convert.ToString(companyName) + "\n��饥 ������⢮ ������ �⮩ ��������: " +
				Convert.ToString(countOfBuildings) + "\n��� ������: " + Convert.ToString(typeOfBuilding) +
				"\n����� ��஭� �᭮�����: " + Convert.ToString(sideLength) + "\n���� �㭤�����: " +
				Convert.ToString(basementHeight) + "\n���� �⠦�: " + Convert.ToString(floorHeight) +
				"\n������⢮ �⠦��: " + Convert.ToString(floorAmount) + "\n��饥 ������⢮ ����: " +
				Convert.ToString(facade.getWindowsAmount()) + "\n������⢮ ������� ����: " +
				Convert.ToString(facade.getOpenedWindowsAmount()) + "\n�����樥�� ��⮩稢���: " +
				Convert.ToString(stabilityFactor) + "\n����� � ��ࠦ�:\n����� ��஭� ��ࠦ�: " +
				Convert.ToString(getSideLength()) + "\n��ਭ� ��஭� ��ࠦ�: " +
				Convert.ToString(getSideWidth()) + "\n���� ��ࠦ�: " + Convert.ToString(getHeight()) + "\n";
			return s;
		}

        public override double getVolume()
		{
			return (sideLength * sideLength * floorHeight * floorAmount) +
				(getSideLength() * getSideWidth() * getHeight());
		}*/

		public void getGarage()
		{
			garage.getGarage();
		}

		public double getSideLength()
		{
			return garage.getSideLength();
		}

		public double getSideWidth()
		{
			return garage.getSideWidth();
		}

		public double getHeight()
		{
			return garage.getHeight();
		}
}
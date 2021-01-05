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

        public String ToString()
        {
			return "�����⢠ ������� ������:\n" + "�������� ��ந⥫쭮� ��������: " + companyName +
				"\n��饥 ������⢮ ������ �⮩ ��������: " + countOfBuildings + "\n��� ������: " +
				typeOfBuilding + "\n����� ��஭� �᭮�����: " + sideLength + "\n���� �㭤�����: " +
				basementHeight + "\n���� �⠦�: " + floorHeight + "\n������⢮ �⠦��: " + floorAmount +
				"\n��饥 ������⢮ ����: " + facade.getWindowsAmount() + "\n������⢮ ������� ����: " +
				facade.getOpenedWindowsAmount() + "\n�����樥�� ��⮩稢���: " + stabilityFactor +
				"\n����� � ��ࠦ�:\n����� ��஭� ��ࠦ�: " + getSideLength() + "\n��ਭ� ��஭� ��ࠦ�: " +
				getSideWidth() + "\n���� ��ࠦ�: " + getHeight() + "\n";
		}
/*
        public override double getVolume()
		{
			return (sideLength * sideLength * floorHeight * floorAmount) +
				(getSideLength() * getSideWidth() * getHeight());
		}
*/
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
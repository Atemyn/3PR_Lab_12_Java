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

		/* Функция по выводу свойств экземпляра класса Building. */
		public void get()
		{
			System.out.println("Свойства данного здания:");
			System.out.println("Название строительной компании: " + companyName);
			System.out.println("Общее количество зданий этой компании: " + countOfBuildings);
			System.out.println("Тип здания: " + typeOfBuilding);
			System.out.println("Длина стороны основания: " + sideLength);
			System.out.println("Высота фундамента: " + basementHeight);
			System.out.println("Высота этажа: " + floorHeight);
			System.out.println("Количество этажей: " + floorAmount);
			facade.getFacade();
			System.out.println("Коэффициент устойчивости: " + stabilityFactor);
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
			s += "Свойства данного здания:\n" + "Название строительной компании: " +
				Convert.ToString(companyName) + "\nОбщее количество зданий этой компании: " +
				Convert.ToString(countOfBuildings) + "\nТип здания: " + Convert.ToString(typeOfBuilding) +
				"\nДлина стороны основания: " + Convert.ToString(sideLength) + "\nВысота фундамента: " +
				Convert.ToString(basementHeight) + "\nВысота этажа: " + Convert.ToString(floorHeight) +
				"\nКоличество этажей: " + Convert.ToString(floorAmount) + "\nОбщее количество окон: " +
				Convert.ToString(facade.getWindowsAmount()) + "\nКоличество открытых окон: " +
				Convert.ToString(facade.getOpenedWindowsAmount()) + "\nКоэффициент устойчивости: " +
				Convert.ToString(stabilityFactor) + "\nДанные о гараже:\nДлина стороны гаража: " +
				Convert.ToString(getSideLength()) + "\nШирина стороны гаража: " +
				Convert.ToString(getSideWidth()) + "\nВысота гаража: " + Convert.ToString(getHeight()) + "\n";
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
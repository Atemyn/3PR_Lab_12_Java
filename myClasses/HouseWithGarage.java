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

        public String ToString()
        {
			return "Свойства данного здания:\n" + "Название строительной компании: " + companyName +
				"\nОбщее количество зданий этой компании: " + countOfBuildings + "\nТип здания: " +
				typeOfBuilding + "\nДлина стороны основания: " + sideLength + "\nВысота фундамента: " +
				basementHeight + "\nВысота этажа: " + floorHeight + "\nКоличество этажей: " + floorAmount +
				"\nОбщее количество окон: " + facade.getWindowsAmount() + "\nКоличество открытых окон: " +
				facade.getOpenedWindowsAmount() + "\nКоэффициент устойчивости: " + stabilityFactor +
				"\nДанные о гараже:\nДлина стороны гаража: " + getSideLength() + "\nШирина стороны гаража: " +
				getSideWidth() + "\nВысота гаража: " + getHeight() + "\n";
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
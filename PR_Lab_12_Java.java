import java.util.Scanner;
import java.util.ArrayList;
import myClasses.Facade;
import myClasses.Building;
import myClasses.HelpClass;
import myClasses.Garage;
import myClasses.HouseWithGarage;
import myClasses.BuildingLayout;
import myClasses.SquareBaseBuilding;
import myClasses.CircleBaseBuilding;
import myClasses.TetrahedronBuilding;

public class PR_Lab_12_Java{
	public static void main(String[] args){
		/* Работа с производным классом. */
		HouseWithGarage house1 = new HouseWithGarage();
		house1.input();
		house1.get();

		HouseWithGarage house2 = new HouseWithGarage("Коттедж", 5.0, 1.0, 3.0, 5, 5, 5, 1.0, 2.0, 3.0);
		System.out.printf("%s", house2.ToString());
		// Производные классы от абстрактного класса.
		SquareBaseBuilding s = new SquareBaseBuilding(5.0, 10.0, 1000.0);
		CircleBaseBuilding c = new CircleBaseBuilding(5.0, 10.0, 1000.0);
		TetrahedronBuilding t = new TetrahedronBuilding(5.0, 10.0, 1000.0);
		System.out.println("Здание с квадратным основанием:" + "\nОбъем: " + s.getVolume() + "\nПлотность: " + s.getDensity() + "\n");
		System.out.println("Здание с круглым основанием:" + "\nОбъем: " + c.getVolume() + "\nПлотность: " + c.getDensity() + "\n");
		System.out.println("Здание-тетраэдр:" + "\nОбъем: " + t.getVolume() + "\nПлотность: " + t.getDensity() + "\n");	
		/*..............................*/
	}
}

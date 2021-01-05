import java.util.Scanner;
import java.util.ArrayList;
import myClasses.Facade;
import myClasses.Building;
import myClasses.HelpClass;
import myClasses.Garage;
import myClasses.HouseWithGarage;

public class PR_Lab_12_Java{
	public static void main(String[] args){
		/* Работа с производным классом. */
			HouseWithGarage house1 = new HouseWithGarage();
			house1.input();
			house1.get();

			HouseWithGarage house2 = new HouseWithGarage("Коттедж", 5.0, 1.0, 3.0, 5, 5, 5, 1.0, 2.0, 3.0);
		/*..............................*/
	}
}

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
		/* ����� � �ந������ ����ᮬ. */
		HouseWithGarage house1 = new HouseWithGarage();
		house1.input();
		house1.get();

		HouseWithGarage house2 = new HouseWithGarage("���⥤�", 5.0, 1.0, 3.0, 5, 5, 5, 1.0, 2.0, 3.0);
		System.out.printf("%s", house2.ToString());
		// �ந������ ������ �� ����ࠪ⭮�� �����.
		SquareBaseBuilding s = new SquareBaseBuilding(5.0, 10.0, 1000.0);
		CircleBaseBuilding c = new CircleBaseBuilding(5.0, 10.0, 1000.0);
		TetrahedronBuilding t = new TetrahedronBuilding(5.0, 10.0, 1000.0);
		System.out.println("������ � ������� �᭮������:" + "\n��ꥬ: " + s.getVolume() + "\n���⭮���: " + s.getDensity() + "\n");
		System.out.println("������ � ��㣫� �᭮������:" + "\n��ꥬ: " + c.getVolume() + "\n���⭮���: " + c.getDensity() + "\n");
		System.out.println("������-�����:" + "\n��ꥬ: " + t.getVolume() + "\n���⭮���: " + t.getDensity() + "\n");	
		/*..............................*/
	}
}

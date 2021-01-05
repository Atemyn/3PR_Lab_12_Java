package myClasses;
import java.util.Scanner;

public class TetrahedronBuilding extends BuildingLayout
{
	public TetrahedronBuilding()
	{
		super();
	}
	public TetrahedronBuilding(double characteristic, double height, double weight)
	{
		super(characteristic, height, weight);
	}
	public double getVolume()
	{
		return characteristic * characteristic * characteristic * Math.sqrt(2.0) / 12;
	}
}
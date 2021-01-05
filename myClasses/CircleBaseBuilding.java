package myClasses;
import java.util.Scanner;

public class CircleBaseBuilding extends BuildingLayout
{
	public CircleBaseBuilding(double characteristic, double height, double weight)
	{
		super(characteristic, height, weight);
	}
	public CircleBaseBuilding()
	{
		super();
	}
	public double getVolume()
	{
		return Math.PI * characteristic * characteristic * height +
			2.0 / 3.0 * Math.PI * characteristic * characteristic * characteristic;
	}
}
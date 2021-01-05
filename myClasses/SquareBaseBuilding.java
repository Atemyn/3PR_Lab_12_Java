package myClasses;
import java.util.Scanner;

public class SquareBaseBuilding extends BuildingLayout
{
	public SquareBaseBuilding()
	{
		super();
	}
	public SquareBaseBuilding(double characteristic, double height, double weight)
	{
		super(characteristic, height, weight);
	}
	public double getVolume()
	{
		return characteristic * characteristic * height;
	}
}
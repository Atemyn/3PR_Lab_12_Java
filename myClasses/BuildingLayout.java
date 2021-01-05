package myClasses;
import java.util.Scanner;

public abstract class BuildingLayout
{
	protected double characteristic;
	protected double height;
	protected double weight;
	public BuildingLayout(double characteristic, double height, double weight)
	{
		this.characteristic = characteristic;
		this.height = height;
		this.weight = weight;
	}
	public BuildingLayout()
	{
		this.characteristic = 1.0;
		this.height = 1.0;
		this.weight = 1.0;
	}

	public abstract double getVolume();
	
	public double getDensity()
	{
		return weight / getVolume();
	}
}
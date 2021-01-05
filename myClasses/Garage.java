package myClasses;
import java.util.Scanner;

public class Garage
{
	private double sideLength;
	private double sideWidth;
	private double height;

	public Garage()
	{
		sideLength = 1.0;
		sideWidth = 1.0;
		height = 1.0;
	}	
	public Garage(double sideLength, double sideWidth, double height)
	{
		this.sideLength = sideLength;
		this.sideWidth = sideWidth;
		this.height = height;
	}
	// Функция по заданию приватных полей класса.
	public void setGarage(double sideLength, double sideWidth, double height)
	{
		this.sideLength = sideLength;
		this.sideWidth = sideWidth;
		this.height = height;
	}
	public void inputGarage()
	{
		System.out.print("Введите длину гаража: ");
		Scanner scanner = new Scanner(System.in);
		sideLength = scanner.nextDouble();
		while (sideLength <= 0)
		{
			System.out.print("Неверный ввод длины стороны - она должна быть положительным числом. Попробуйте еще раз: ");
			scanner = new Scanner(System.in);
			sideLength = scanner.nextDouble();
		}

		System.out.print("Введите ширину гаража: ");
		scanner = new Scanner(System.in);
		sideWidth = scanner.nextDouble();
		while (sideWidth <= 0)
		{
			System.out.print("Неверный ввод длины стороны - она должна быть положительным числом. Попробуйте еще раз: ");
			scanner = new Scanner(System.in);
			sideWidth = scanner.nextDouble();
		}

		System.out.print("Введите высоту гаража: ");
		scanner = new Scanner(System.in);
		height = scanner.nextDouble();
		while (height <= 0)
		{
			System.out.print("Неверный ввод длины стороны - она должна быть положительным числом. Попробуйте еще раз: ");
			scanner = new Scanner(System.in);
			height = scanner.nextDouble();
		}
	}

	public void getGarage()
	{
		System.out.println("Данные о гараже:");
		System.out.println("Длина стороны гаража: " + sideLength);
		System.out.println("Ширина стороны гаража: " + sideWidth);
		System.out.println("Высота гаража: " + height);
	}

	public double getSideLength()
	{
		return sideLength;
	}

	public double getSideWidth()
	{
		return sideWidth;
	}

	public double getHeight()
	{
		return height;
	}
}
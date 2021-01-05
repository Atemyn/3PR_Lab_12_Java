package myClasses;
import java.util.Scanner;

class Ex extends Exception
{
	public int TypeE;
	Ex(int e)
	{
		TypeE = e;
	}
	
	public String toString()
	{
		if (TypeE == 0)
			return "��㬥�� < 1";
		else
			return "��㬥�� = 1";
	}
}

public class Building
{
	// ������⢮ �����-���� ����஥���� ������.
	protected static int countOfBuildings = 0;
	// ��� ������.
	protected String typeOfBuilding;
	// ����� ��஭� �᭮�����.
	protected double sideLength;
	// ���� �㭤�����.
	protected double basementHeight;
	// ���� �⠦�.
	protected double floorHeight;
	// ������⢮ �⠦��.
	protected int floorAmount;
	// ��ꥪ� ����� �ᠤ� ������, ᮤ�ঠ騩 ���ଠ�� �� ����� ������.
	protected Facade facade = new Facade();
	// �����樥�� ��⮩稢���.
	protected double stabilityFactor;
	/* �㭪�� �� ��⠭���� ��।����� ���祭�� � ᢮��⢠ ������� ����� Building. */
	protected void setBuilding(String typeOfBuilding, double sideLength, double basementHeight, double floorHeight, int floorAmount, int windowsAmount, int openedWindowsAmount)
	{
		this.typeOfBuilding = typeOfBuilding;
		this.sideLength = sideLength;
		this.basementHeight = basementHeight;
		this.floorHeight = floorHeight;
		this.floorAmount = floorAmount;
		this.stabilityFactor = (double)(sideLength * sideLength * Math.sqrt(basementHeight)) / (floorHeight * floorAmount);
		this.facade.setFacade(windowsAmount, openedWindowsAmount);
	}
	// ��������� ��� ��ࠬ��஢.
	public Building()
	{
		this.setBuilding("����� ������", 1.0, 1.0, 1.0, 1, 0, 0);
		countOfBuildings++;
	}
	// ��������� � 1 ��ࠬ��஬.
	public Building(double sideLength)
	{
		this.setBuilding("����� ������", sideLength, 1.0, 1.0, 1, 0, 0);
		if (stabilityFactor < 1)
			this.setBuilding("����� ������", 1.0, 1.0, 1.0, 1, 0, 0);
		countOfBuildings++;
	}
	// ��������� � �ᥬ� ��ࠬ��ࠬ�.
	public Building(String typeOfBuilding, double sideLength, double basementHeight, double floorHeight, int floorAmount, int windowsAmount, int openedWindowsAmount)
	{
		this.setBuilding(typeOfBuilding, sideLength, basementHeight, floorHeight, floorAmount, windowsAmount, openedWindowsAmount);
		if (stabilityFactor < 1)
			this.setBuilding("����� ������", 1.0, 1.0, 1.0, 1, 0, 0);
		countOfBuildings++;
	}
	// �������� ��ந⥫쭮� ��������.
	public static String companyName = "�����";
	// ����᪨� ��⮤ �� ����祭�� ������⢠ ������.
	public static int getCountOfBuildings()
	{
		return countOfBuildings;
	}
	public static void array1Forming(Building[] array, int n)
	{
		for (int i = 1; i < n + 1; i++)
		{
			array[i - 1].setBuilding("����� ������", (double)i, (double)i, (double)i, i, i, i);
		}
	}

	public static void array2Forming(Building[][] array, int n, int m)
	{
		for (int i = 1; i < n + 1; i++)
		{
			for (int j = 1; j < m + 1; j++)
			{
				array[i - 1][j - 1].setBuilding("����� ������", (double)(i + j), (double)(i + j), (double)(i + j), i + j, i + j, i + j);
			}
		}
	}

	public static void array1Output(Building[] array, int n)
	{
		for (int i = 0; i < n; i++)
		{
			System.out.print(array[i].sideLength + " ");
		}
		System.out.println("\n");
	}

	public static void array2Output(Building[][] array, int n, int m)
	{
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < m; j++)
			{
				System.out.print(array[i][j].sideLength + " ");
			}
			System.out.println();
		}
		System.out.println("\n");
	}
	/* �㭪�� �� �뢮�� ᢮��� ������� ����� Building. */
	public void get()
	{
		System.out.println("�����⢠ ������� ������:");
		System.out.println("�������� ��ந⥫쭮� ��������: " + companyName);
		System.out.println("������⢮ �����-���� ����஥���� �⮩ ��������� ������: " + countOfBuildings);
		System.out.println("��� ������: " + typeOfBuilding);
		System.out.println("����� ��஭� �᭮�����: " + sideLength);
		System.out.println("���� �㭤�����: " + basementHeight);
		System.out.println("���� �⠦�: " + floorHeight);
		System.out.println("������⢮ �⠦��: " + floorAmount);
		facade.getFacade();
		System.out.println("�����樥�� ��⮩稢���: " + stabilityFactor + "\n");
	}
	/* �㭪�� �� ������� ᢮��� �� 㬮�砭�� ������� ����� Building. */
	public void initBuilding()
	{
		setBuilding("����� ������", 1.0, 1.0, 1.0, 1, 0, 0);
		facade.setFacade(0, 0);
	}
	/* �㭪�� �� ����� � ���������� ᢮��� ��� ������� ����� Building */
	public void input()
	{
		// ����� �� ��ࠪ� ��� ����� ��� ����室���� ������.
		System.out.print("������ ⨯ ��襣� ������ (�����⮩ ��ப��): ");
		Scanner scanner = new Scanner(System.in);
		typeOfBuilding = scanner.nextLine();
		while (typeOfBuilding.length() == 0)
		{
			System.out.print("������ ���� ⨯� ������ - �� ������ ���� �����⮩ ��ப��. ���஡�� �� ࠧ: ");
			scanner = new Scanner(System.in);
			typeOfBuilding = scanner.nextLine();
		}
		System.out.print("������ ����� ��஭� ��襣� ������: ");
		scanner = new Scanner(System.in);
		sideLength = scanner.nextDouble();
		while (sideLength <= 0)
		{
			System.out.print("������ ���� ����� ��஭� - ��� ������ ���� ������⥫�� �᫮�. ���஡�� �� ࠧ: ");
			scanner = new Scanner(System.in);
			sideLength = scanner.nextDouble();
		}

		System.out.print("������ ����� �㭤����� ��襣� ������: ");
		scanner = new Scanner(System.in);
		basementHeight = scanner.nextDouble();
		while (basementHeight <= 0)
		{
			System.out.print("������ ���� ����� �㭤����� - ��� ������ ���� ������⥫�� �᫮�. ���஡�� �� ࠧ: ");
			scanner = new Scanner(System.in);
			basementHeight = scanner.nextDouble();
		}

		System.out.print("������ ����� ������ �⠦� ��襣� ������: ");
		scanner = new Scanner(System.in);
		floorHeight = scanner.nextDouble();
		while (floorHeight <= 0)
		{
			System.out.print("������ ���� ����� �⠦� - ��� ������ ���� ������⥫�� �᫮�. ���஡�� �� ࠧ: ");
			scanner = new Scanner(System.in);
			floorHeight = scanner.nextDouble();
		}

		System.out.print("������ ������⢮ �⠦�� ��襣� ������: ");
		scanner = new Scanner(System.in);
		floorAmount = scanner.nextInt();
		while (floorAmount <= 0)
		{
			System.out.print("������ ���� ������⢠ - ��� ������ ���� ������⥫�� 楫� �᫮�. ���஡�� �� ࠧ: ");
			scanner = new Scanner(System.in);
			floorAmount = scanner.nextInt();
		}
		facade.inputFacade();
		try
		{
			// ����� �����業� ��⮩稢���.
			stabilityFactor = (double)(sideLength * sideLength * Math.sqrt(basementHeight)) / (floorHeight * floorAmount);
			// �᫨ �����樥�� ��⮩稢��� ����� 1 - ������ 㯠���; ����嫤�� ������ ���� �ࠪ���⨪
			if (stabilityFactor < 1.0)
			{
				throw new Ex(0);
			}
			if (stabilityFactor == 1.0)
			{
				throw new Ex(1);
			}
			System.out.print("�⫨筮! ������� ����稫��� ��⮩稢� � �����樥�⮬ k = " + stabilityFactor + "\n\n");
		}
		catch(Ex e)
		{
			System.out.print("�ࠡ�⠫� �᪫�祭��: " + e + "\n\n");
			if (e.TypeE == 0)
				this.setBuilding("����� ������", 1.0, 1.0, 1.0, 1, 0, 0);
		}
	} 
	/* �㭪�� �� ᫮����� ���� ������஢ ����� Building, ��� build - �������, ����� �㤥� �ਡ��������. */
	public void addToBuilding(Building build)
	{
		if (this == build)
		{
			System.out.println("���������� ᫮���� ������ � ᠬ�� ᮡ��!");
			return;
		}
		System.out.println("�����頥� ��� ������... �� ᢮��⢠ ⠪��:");
		System.out.println("���� ������: " + typeOfBuilding + " � " + build.typeOfBuilding + "\n" + "����� ��஭ �᭮�����: " + sideLength + " � " + build.sideLength + "\n" +
			"����� �㭤����⮢: " + basementHeight + " � " + build.basementHeight + "\n" + "����� �⠦��: " + floorHeight + " � " + build.floorHeight + "\n" +
			"������⢠ �⠦��: " + floorAmount + " � " + build.floorAmount + "\n" + "�����樥��� ��⮩稢���: " + stabilityFactor + " � " + build.stabilityFactor + "\n" + 
			"��騥 ������⢠ ����: " + facade.getWindowsAmount() + " � " + build.facade.getWindowsAmount() + "\n" +
			"������⢠ ������� ����: " + facade.getOpenedWindowsAmount() + " � " + build.facade.getOpenedWindowsAmount() + "\n");
		
		String s = typeOfBuilding;
		typeOfBuilding = new String();
		typeOfBuilding = s + " " + build.typeOfBuilding;

		if (sideLength < build.sideLength)
			sideLength = build.sideLength;

		if (basementHeight < build.basementHeight)
			basementHeight = build.basementHeight;

		if (floorHeight < build.floorHeight)
			floorHeight = build.floorHeight;

		floorAmount = floorAmount + build.floorAmount;

		facade.addToFacade(build.facade);
		// ����� ������ �����樥�� ��⮩稢��� � �஢�ઠ ��� ���४⭮��.
		stabilityFactor = (double)(sideLength * sideLength * Math.sqrt(basementHeight)) / (floorHeight * floorAmount);
		if (stabilityFactor < 1)
		{
			System.out.println("� ᮦ������, ��᫥ ᮢ��饭�� ���� ������ ����� ������ �ࠧ� �� ࠧ��������, ⠪ ��� ��� �����樥�� ��⮩稢��� k = " + stabilityFactor + " ����� �������.\n");
			initBuilding();
		}
		else
		{
			System.out.println("�⫨筮! ����� ������ ���﫮. ��� ᢮��⢠ ⠪��:");
			get();
		}
	}
	/* �㭪�� �� ���������� floorsToAdd �⠦�� �������� ����� Building. */
	public void addFloors()
	{
		int floorsToAdd;
		// ���� �� ��ࠪ� ��� ����� floorsToAdd.
		System.out.print("������ ������⢮ �⠦�� ��� ���������� � ��襬� ������: ");
		Scanner scanner = new Scanner(System.in);
		floorsToAdd = scanner.nextInt();
		while (floorsToAdd < 0)
		{
			System.out.print("������ ���� ������⢠ - ��� ������ ���� ������⥫�� 楫� �᫮�. ���஡�� �� ࠧ: ");
			scanner = new Scanner(System.in);
			floorsToAdd = scanner.nextInt();
		}

		floorAmount = floorAmount + floorsToAdd;
		// ����� ������ �����樥�� ��⮩稢��� � �஢�ઠ ��� ���४⭮��.
		stabilityFactor = (double)(sideLength * sideLength * Math.sqrt(basementHeight)) / (floorHeight * floorAmount);
		if (stabilityFactor < 1.0)
		{
			System.out.println("�����樥�� �⠡��쭮�� ��襣� ������ k = " + stabilityFactor +
				" �⠫ ����� �������.\n��� ����� ������ � ������ �� ������. ���஡�� �������� ������⢮ �⠦�� � ���������� (���ਬ��, �� 0)\n");
			floorAmount = floorAmount - floorsToAdd;
			addFloors();
		}
		else
		{
			System.out.println("�⫨筮! ������ ����稫��� ��⮩稢� � �����樥�⮬ ��⮩稢��� k = " + stabilityFactor + "\n");
			// �⮡ࠦ���� ���ଠ樨 � ������.
			get();
		}
	}

	/* �㭪�� �� 㤠����� floorsToRemove �⠦�� � ������� ����� Building. */
	public void removeFloors()
	{
		int floorsToRemove;
		// ���� �� ��ࠪ� ��� ����� floorsToRemove.
		System.out.print("������ ������⢮ �⠦�� ��� 㤠����� � ��襣� ������: ");
		Scanner scanner = new Scanner(System.in);
		floorsToRemove = scanner.nextInt();
		while (floorsToRemove < 0 || floorsToRemove >= floorAmount)
		{
			System.out.print("������ ���� ������⢠ - ��� ������ ���� ������⥫�� 楫� �᫮� � ����訬 ��饣� �᫠ �⠦��. ���஡�� �� ࠧ: ");
			scanner = new Scanner(System.in);
			floorsToRemove = scanner.nextInt();
		}
		// ����� ������ �����樥�� ��⮩稢���.
		floorAmount = floorAmount - floorsToRemove;
		stabilityFactor = (double)(sideLength * sideLength * Math.sqrt(basementHeight)) / (floorHeight * floorAmount);
		System.out.println("�⠦� �ᯥ譮 㤠����!");
		// �⮡ࠦ���� ���ଠ樨 � ������.
		get();
	}

	public void openWindowsOnFacade()
	{
		facade.openWindows();
		get();
	}

	public void closeWindowsOnFacade()
	{
		facade.closeWindows();
		get();
	}
	
	public void returnStabilityFactor(HelpClass h)
	{
		h.field = stabilityFactor;
	}

};
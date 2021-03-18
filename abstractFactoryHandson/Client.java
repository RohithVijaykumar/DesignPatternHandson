package abstractFactoryHandson;

import java.util.Scanner;

public class Client 
{
	public void doSomeClientJob()
	{
		Scanner sc= new Scanner(System.in);
		String input=sc.next();
		Tire tire = FactoryMaker.getFactory(input).makeTire();
		System.out.println(tire.getTireModel());
		HeadLight light = FactoryMaker.getFactory(input).makeHeadLight();
		System.out.println(light.getHeadLightModel());
	}
}
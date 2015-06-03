package operar;

public class Operar {

	static void hacerOperaciones(int x,int i,int opcion){
		switch(opcion){
		case 1:
			System.out.println(x + i);
			break;
		case 2:
			System.out.println(x - i);
			break;
		case 3:
			float multiplicar = (float)x*i;
			System.out.println(multiplicar);
			break;
			
		default:
			System.out.println("adios");
			break;
		}
	}
}

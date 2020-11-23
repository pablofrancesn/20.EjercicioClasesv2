import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		CazurroLeones[] cazurros = new CazurroLeones[5];
		VecinaRubia[] vecinas = new VecinaRubia[5];

		// Rellena Cazurros.
		System.out.println("Rellena Cazurros:");
		for (int i = 0; i < cazurros.length; i++) {
			System.out.print("Introduce nombre: ");
			String name = sc.nextLine();
			System.out.print("Introduce un apellido: ");
			String surname = sc.nextLine();
			System.out.print("Introduce nivel cazurrismo: ");
			int lvlC = sn.nextInt();
			System.out.print("Introduce altura: ");
			double height = sn.nextDouble();
			System.out.print("Introduce peso: ");
			double weight = sn.nextDouble();
			System.out.print("Introduce cap alcohólica: ");
			int alcoholCap = sn.nextInt();
			System.out.print("Introduce nº haters: ");
			int nHaters = sn.nextInt();
			cazurros[i] = new CazurroLeones(name, surname, lvlC, height, weight, alcoholCap, nHaters);
		}

		// Rellena Vecinas.
		System.out.println("Rellena Vecinas:");
		for (int i = 0; i < vecinas.length; i++) {
			System.out.print("Introduce nombre: ");
			String name = sc.nextLine();
			System.out.print("Introduce un apellido: ");
			String surname = sc.nextLine();
			System.out.print("Introduce nivel brillibrilli: ");
			int lvlB = sn.nextInt();
			System.out.print("Introduce longitud de melena: ");
			double hairLenght = sn.nextDouble();
			System.out.print("Introduce nº haters: ");
			int nHaters = sn.nextInt();
			System.out.print("Introduce nº followers: ");
			int nFollowers = sn.nextInt();
			vecinas[i] = new VecinaRubia(name, surname, lvlB, hairLenght, nHaters, nFollowers);
		}

		// Cazurros:
		for (int i = 0; i < cazurros.length; i++) {
			if (cazurros[i].getLvlC() > 9) {
				cazurros[i].setAlcoholCap(cazurros[i].getAlcoholCap() + 1);
			}
			if (cazurros[i].getName().endsWith("a")) {
				cazurros[i].setnHaters(0);
			}
		}
		// Vecinas:
		for (int i = 0; i < vecinas.length; i++) {
			if (vecinas[i].getHairLength() < 45) {
				vecinas[i].setLvlB(vecinas[i].getLvlB() - 1);
			}
			if (vecinas[i].getName().endsWith("a")) {
				vecinas[i].setnHaters(0);
			}
		}
	}

}

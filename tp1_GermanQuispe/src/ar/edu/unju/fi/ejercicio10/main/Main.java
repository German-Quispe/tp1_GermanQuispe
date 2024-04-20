package ar.edu.unju.fi.ejercicio10.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio10.model.Pizza;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//-------Estructura iterativa para ingresar 3 pizzas------
		for(int i=1; i<=3; i++) {
			Pizza pizza = new Pizza();
			Integer diametro;
			//--------Validacion deñ diametro de la pizza--------
			do {
				System.out.println("Ingrese diametro de la pizza 20(chica), 30(mediana) 0 40(grande): ");
				diametro = sc.nextInt();
			}while(diametro!=20 && diametro != 30 && diametro!=40);
			//---------------------------------------------------
			System.out.println("Tiene ingredientes especiales?(true/false) ");
			Boolean ingredientesEspeciales = sc.nextBoolean();
			
			pizza.setDiametro(diametro);
			pizza.setIngredientesEspeciales(ingredientesEspeciales);
			
			pizza.mostrarDatos();
		}
		//---------------------------------------------------------
		sc.close();		
	}

}

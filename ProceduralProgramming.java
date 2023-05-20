package Lab5_16;
import java.util.Random;
import java.util.Scanner;
public class ProceduralProgramming {
	public static void main(String[] args) {
	
	//Завдання 1
	Random random = new Random();
    int randomNumber = random.nextInt(41) -20;
    if (randomNumber != 0) {
    System.out.println("Випадкове натуральне число з проміжку [-20; 20]: " + randomNumber);
    	}
    
    //Завдання 2
    double leg1 = 3;
    double leg2 = 4;
    double S = (leg1 * leg2)/2;
    System.out.println("Площа прямокутного трикутника дорівнює " + S);
    double sqhypotenuse = (Math.pow(leg1,2)) + (Math.pow(leg2,2));
    double hypotenuse = Math.sqrt(sqhypotenuse);
    double P = leg1 + leg2 + hypotenuse; 
    System.out.println("Периметр прямокутного трикутника дорівнює " + P);
    
    //Завдання 3
    int number = (int) (Math.random() * 101);
    int digits = String.valueOf(number).length();
    System.out.println("Згенероване число: " + number);
    System.out.println("Кількість цифр: " + digits);
    
    //Завдання 4
    System.out.println("Введіть послідовність трьох цілих чисел з проміжку [1;3]. У вас є 2-і спроби!");
    
    for (int i = 0; i < 2; i++) {
    int progNum1 = (int)(Math.random()*3+1);
    int progNum2 = (int)(Math.random()*3+1);
    int progNum3 = (int)(Math.random()*3+1);
    
    Scanner scanner = new Scanner(System.in);
    int userNum1 = scanner.nextInt();
    int userNum2 = scanner.nextInt();
    int userNum3 = scanner.nextInt();
    
    System.out.println("Згенерована послідовність: " + progNum1 + ", " + progNum2 + ", " + progNum3);
    System.out.println("Введена послідовність: " + userNum1 + ", " + userNum2 + ", " + userNum3);
    
    if (progNum1 == userNum1 && progNum2 == userNum2 && progNum3 == userNum3) {
        System.out.println("Ви вгадали!!! Послідовності співпали!");
    } else {
    	if (i<1) {
        System.out.println("Ви не вгадали. Послідовності не співпали. У вас залишилася 1 спроба.");
    	} else {
    		System.out.println("Ви не вгадали. Послідовності не співпали. У вас не залишилося спроб.");
    	}
    }
 
		}
	}
}

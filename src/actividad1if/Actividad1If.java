package actividad1if;

import java.util.Scanner;

public class Actividad1If {

    
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int actual = 2021, año = 0;
        System.out.println("Ingrese un año a evaluar");
        año = ent.nextInt();
        
        if(actual>año){
            System.out.println("Han pasado " + (actual-año) + " años desde el " + año);
        }else if(actual==año){
            System.out.println(año + " Es el año actual");
        }else{
            System.out.println("Faltan " + (año-actual) + " años para el " + año);
        }
        
        
    }
    
}

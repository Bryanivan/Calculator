
import java.util.Scanner;

public class Calculator{ 

    float numero1, numero2, sum, subs, mult, div, mod;
    
    public void leerNumeros(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite el primer numero: ");;
        numero1 = teclado.nextFloat();
        System.out.println("Digite el segundo numero: ");
        numero2 = teclado.nextFloat();
}
    public void sumar(){
        sum = numero1+numero2;
    }
    public void subs(){
        subs = numero1-numero2;
    }
    public void mult(){
        mult = numero1*numero2;
    }
    public void div(){
        div = numero1/numero2;
    }
    public void mod(){
        mod = numero1%numero2;
    }
    public void mostrarResultados(){
        System.out.println("El primer numero es: "+numero1);
        System.out.println("El segundo numero es: "+numero2);
        System.out.println("La suma es: "+sum);
        System.out.println("La resta es: "+subs);
        System.out.println("La division es "+div);
        System.out.println("La multiplicaciones es: "+mult);
        System.out.println("El residuo es: "+mod);
    }
    public static void main(String [] args){
        Calculator op = new Calculator();
        
        op.leerNumeros();
        op.sumar();
        op.subs();
        op.div();
        op.mult();        
        op.mod();
        op.mostrarResultados();
        
        
    }
}
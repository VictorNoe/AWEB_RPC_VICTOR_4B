package server;

import java.util.Arrays;

public class Methods {

    public String persons (String name, double peso, double altura){
        double mc = peso/(altura*altura);
        return "Tu nombre es: "+name+"\n"+"Tu MC es: "+mc+"\n";
    }

    public String multiplicacion (double num1, double num2, double num3, double num4){
        double multi = num1*num2*num3*num4;
        double promedio = multi/4;
        return "La multiplicaicón es: "+multi+"\n"+"El promedio: "+promedio+"\n";
    }

    public double addition (double num1,double num2,double num3){
        return (num1+num2+num3);
    }

    public int sumatoria(int num1,int num2){
        int minimo = Math.min(num1,num2); //Cuenta el numero pequeño
        int maximo = Math.max(num1,num2); //Cuenta el numero grande
        int sumatoria = 0;
        for (int i = minimo; i <= maximo; i++) {
            sumatoria += i;
        }
        return sumatoria;
    };

    public String ascendencia (int num1,int num2,int num3,int num4,int num5){
        int numeros [] = {num1,num2,num3,num4,num5};
        Arrays.sort(numeros);
        return Arrays.toString(numeros);
    }
}

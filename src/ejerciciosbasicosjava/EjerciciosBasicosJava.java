package ejerciciosbasicosjava;

/**
 *
 * @author Mohamed El Boudakhani
 */
public class EjerciciosBasicosJava {

   //si el numero de bellotas es mayor o igual que 40 y 60 devuelve
   //verdadero y sino devuelve falso.
    
    public boolean fiestasArdillas (int numBellotas, boolean finDeSemana){
        if (finDeSemana){
            return true;
        }
        if (numBellotas >= 40 && numBellotas <= 60){
            return true;
        }
        return false;
    }
    
    public int multa (int velocidad, boolean birthday){
        if (birthday){//si es mi cumple el guardia me quita 5 de velocidad
             }
        if (velocidad <= 60){
            return 0;
        }
        if (velocidad > 60 && velocidad <=80){
            return 1;
        }   
        return 2; //el resto de casos, que son que voy a más de 80
               
    }
    
    public boolean muyVanidoso (int numero){
        if (numero % 11 == 0 || numero % 11 == 1){
                return true;
    }
    return false;
     
    //otra posible solucion mas corta:
    //return (numero % 11 == 0 || numero % 11 == 1);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EjerciciosBasicosJava ejercicios = new EjerciciosBasicosJava();
        System.out.print (ejercicios.fiestasArdillas(30, false));
        System.out.print (ejercicios.fiestasArdillas(50, false));
        System.out.print (ejercicios.fiestasArdillas(70, true));
            //testeo el ejercicio 2
        System.out.print (ejercicios.multa(60, false));
        System.out.print (ejercicios.multa(65, false));
        System.out.print (ejercicios.multa(65, true));
         //testeo el ejercicio 3
        System.out.print ("muyVanidoso (22)" + ejercicios.muyVanidoso(22));
        System.out.print ("muyVanidoso (23)" + ejercicios.muyVanidoso(23));
             System.out.print ("muyVanidoso (24)" + ejercicios.muyVanidoso(24));
         
    }
}

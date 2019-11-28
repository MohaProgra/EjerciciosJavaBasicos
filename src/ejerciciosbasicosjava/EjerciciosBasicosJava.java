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
        return 0;
        
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EjerciciosBasicosJava ejercicios = new EjerciciosBasicosJava();
        System.out.print (ejercicios.fiestasArdillas(30, false));
        System.out.print (ejercicios.fiestasArdillas(50, false));
        System.out.print (ejercicios.fiestasArdillas(70, true));
    }
    
}

package ordenarray;
import java.util.*;
public class OrdenArray {
    static Scanner teclado = new Scanner (System.in);
    static int matriz[ ], num, pos, res;
public static void main(String[] args) {
    
    ordenArray();
}
    public static void ordenArray(){
        System.out.println(" Inserta el numero de elementos: ");
        num = teclado.nextInt();
        
        matriz = new int [num];
        
        System.out.println(" Digite el arreglo: ");
        for (int i=0; i<num; i++){
            System.out.print((i+1)+" Digite un numero: ");
            matriz [i] = teclado.nextInt();
        }
        for (int i=0; i<num; i++){
            pos = i;
            res = matriz[i];
            
            while ((pos>0) && (matriz[pos-1] > res)){
                matriz [pos] = matriz [pos-1];
                pos--;
            }
            matriz [pos] = res;
        }
        System.out.print("Orden mayor a menor: ");
        for (int i=(num-1);i>=0;i--){
            System.out.print(matriz [i]+ " - ");
            
        }
    } 
}

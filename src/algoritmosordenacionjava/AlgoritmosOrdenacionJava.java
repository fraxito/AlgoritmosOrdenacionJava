/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmosordenacionjava;

/**
 *
 * @author jorgecisneros
 */
public class AlgoritmosOrdenacionJava {

    public void imprimeArray( int [ ] numeros ){
        for(int i=0;  i < numeros.length;  i++ ){
            System.out.print(numeros[ i ] + " ");
        } 
    } 
       
    public void ordenacionBurbuja( int [ ] numeros ){
        int aux;   //variable
        for (int j=1; j<numeros.length; j++){
            for(int i=0;  i < numeros.length -j;  i++ ){
                if ( numeros[ i ] > numeros[i+1] ) {
                    aux = numeros[ i ];                //intercambia los elementos
                    numeros[ i ] = numeros[ i+1 ];
                    numeros[ i+1 ] = aux; 
                } 
            } 
        }
    } 
 
    public void ordenacionBurbujaConWhile( int [ ] numeros ){
        boolean cambio = true;
        int aux;  
        while (cambio){
            cambio = false;
            for(int i=0;  i < numeros.length -1;  i++ ){
                if ( numeros[ i ] > numeros[i+1] ) {
                    aux = numeros[ i ];                //intercambia los elementos
                    numeros[ i ] = numeros[ i+1 ];
                    numeros[ i+1 ] = aux;
                    cambio = true;
                } 
            } 
        }
    } 
    
    public void insercionDirecta(int[] numeros) {
        for (int i = 2; i < numeros.length; i++) {
            int aux = numeros[i];
            int j=0; //declaro la j fuera del bucle for interior porque necesito utilizar su valor fuera del bucle interior
            for (j = i - 1; j >= 0 && numeros[j] > aux; j--) {  //desplaza los números del array en la parte ordenada, hasta que j vale -1
                                                                //o hasta que es menor que el comparado
                numeros[j + 1] = numeros[j];
            }
            numeros[j + 1] = aux;  //coloca el valor comparado en su posición correspondiente
        }
    }
    
    public void insercionDirectaWhile(int[] numeros) {
    for (int i = 1; i < numeros.length; i++) {
			int aux = numeros[i];
			int j = i;
			while (j > 0 && numeros[j - 1] > aux) {
				numeros[j] = numeros[j - 1];
				j--;
			}
			numeros[j] = aux;
		}

    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] listaNumeros = {1,57,22, 11, 13, 21, 7,1,2,22,0};
        AlgoritmosOrdenacionJava ejercicio1 = new AlgoritmosOrdenacionJava();
        //ejercicio1.ordenacionBurbuja(listaNumeros);
        //ejercicio1.ordenacionBurbujaConWhile(listaNumeros);
        //ejercicio1.insercionDirecta(listaNumeros);
        ejercicio1.insercionDirectaWhile(listaNumeros);
        ejercicio1.imprimeArray(listaNumeros);
        
    }
    
}

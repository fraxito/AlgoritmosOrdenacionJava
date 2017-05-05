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
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] listaNumeros = {57,22, 11, 13, 21, 7};
        AlgoritmosOrdenacionJava ejercicio1 = new AlgoritmosOrdenacionJava();
        //ejercicio1.ordenacionBurbuja(listaNumeros);
        ejercicio1.ordenacionBurbujaConWhile(listaNumeros);
        ejercicio1.imprimeArray(listaNumeros);
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arbolbinariobusqueda;

/**
 *
 * @author Ignacio Gaynor
 */
public class Main{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    /***
    *Implementa un árbol binario de búsqueda utilizando los conceptos del
capítulo 13 del Libro Estructura de Datos en Java. Implementa las clases y métodos
necesarios para crear el árbol, insertar un nodo, borrar un nodo, buscar un nodo y recorrer
el árbol en preorden, inorden y postorden. Los nodos del árbol pueden ser cualquier dato a
tu elección
    ***/
   System.out.println("Arbol binario de busqueda de enteros\n");

     ArbolBinarioBusqueda arbolBinarioBusqueda = new ArbolBinarioBusqueda();
     
     
    try{
      
      arbolBinarioBusqueda.insertar(10);
      arbolBinarioBusqueda.insertar(15);
      arbolBinarioBusqueda.insertar(7);
      arbolBinarioBusqueda.insertar(3);
      arbolBinarioBusqueda.insertar(9);
      arbolBinarioBusqueda.insertar(1);
      arbolBinarioBusqueda.insertar(20);
      
      arbolBinarioBusqueda.buscar(15);
      arbolBinarioBusqueda.eliminar(10);
      
      System.out.println("\npre orden");
      ArbolBinario.preOrden(arbolBinarioBusqueda.raizArbol());
      System.out.println("\nin orden");
      ArbolBinario.inOrden(arbolBinarioBusqueda.raizArbol());
      System.out.println("\npost orden");
      ArbolBinario.postOrden(arbolBinarioBusqueda.raizArbol());
      
    }catch(Exception e){
      System.out.println(e.getMessage());
    }
 
  


  }

  }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    
    


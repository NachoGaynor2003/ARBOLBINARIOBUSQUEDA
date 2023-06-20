/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbolbinariobusqueda;

import java.util.Comparator;

/**
 *
 * @author Ignacio Gaynor
 */
public class ArbolBinarioBusqueda extends ArbolBinario {

    public final Comparator Comparador; // esta variable necesita un nombre mejor

    public ArbolBinarioBusqueda() {
        super();    //Faltan cosas en este constructor
        Comparador = new ComparaEnteros();
    }

    public Nodo buscar(Object buscado){
    if (raiz == null){
      return null;
    }else{
      return localizar(raizArbol(), buscado);
    }
  }

    protected Nodo localizar(Nodo raizSub, Object buscado) {
        if (raizSub == null) 
            return null;
        else if(Comparador.compare(buscado, raizSub.valorNodo()) < 0)
            return localizar(raizSub.subarbolIzdo(),buscado);
        else if(Comparador.compare(buscado,raizSub.valorNodo()) > 0)
            return localizar(raizSub.subarbolDcho(),buscado);
        else
            System.out.println("EL VALOR INGRESADO YA SE ENCUENTRA EN EL ARBOLB BINARIO");
        return raiz;
      
}

public void insertar(Object valor) throws Exception {
        raiz = insertar(raiz, valor);
    }





    protected Nodo insertar(Nodo raizSub,  Object dato) throws Exception {
        if (raizSub == null) {
            raizSub = new Nodo(dato);
        } else if (Comparador.compare(dato, raizSub.valorNodo())< 0){
            Nodo iz;
            iz = insertar(raizSub.subarbolIzdo(),dato);
            raizSub.ramaIzdo(iz);
        } else if (Comparador.compare(dato, raizSub.valorNodo()) > 0) {
            Nodo dr;
            dr = insertar(raizSub.subarbolDcho(), dato);
            raizSub.ramaDcho(dr);
        } else {
            throw new Exception("Nodo duplicado");
        }
        return raizSub;
    }

    
    
    
    
    
    
    public void eliminar(Object valor) throws Exception {
        raiz = eliminar(raiz, valor);
    }

    // método interno para realizar la operación
    protected Nodo eliminar(Nodo raizSub, Object dato) throws Exception {
        if(raiz==null) throw new Exception("NO SE ENCONTRO EL NODO CON LA CLAVE");
        else if(Comparador.compare(dato, raizSub.valorNodo()) < 0){
            Nodo iz;
            iz=eliminar(raizSub.subarbolIzdo(),dato);
            raizSub.ramaIzdo(iz);
        }
        else if(Comparador.compare(dato,raizSub.valorNodo()) > 0){
            Nodo dcho;
            dcho = eliminar(raizSub.subarbolDcho(),dato);
            raizSub.ramaDcho(dcho);
        }
        else{
            Nodo q;
            q=raizSub;
            if(q.subarbolIzdo()== null)
                raizSub = q.subarbolDcho();
            else if(q.subarbolDcho() == null)
                raizSub = q.subarbolIzdo();
             else{
                q = reemplazar(q);
                }
            q = null;
            System.out.println("nodo eliminado");
        }  
        return raizSub;
    }

    // método interno para susutituir por el mayor de los menores
    private Nodo reemplazar(Nodo act) {
        Nodo a, p;
        p = act;
        a = act.subarbolIzdo(); // rama de nodos menores
        while (a.subarbolDcho() != null) {
            p = a;
            a = a.subarbolDcho();
        }
        act.nuevoValor(a.valorNodo());
        if (p == act) {
            p.ramaIzdo(a.subarbolIzdo());
        } else {
            p.ramaDcho(a.subarbolDcho());
        }
        return a;

}
    /*
   * Clase privada que compara dos elementos enteros, debería estar en su propio archivo, y quizas, no ser privada.
     */
    public class ComparaEnteros implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        return ((Integer) o1).intValue() - ((Integer) o2).intValue();
    }
}

}

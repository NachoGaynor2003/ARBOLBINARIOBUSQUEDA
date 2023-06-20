/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbolbinariobusqueda;

/**
 *
 * @author Ignacio Gaynor
 */
public class Nodo {
    protected Object dato;
  protected Nodo izdo;
  protected Nodo dcho;

  public Nodo(Object dato) {
    this.dato = dato;
    this.izdo = null;
    this.dcho = null;
  }

  public Nodo(Nodo ramaIzdo, Object dato, Nodo ramaDcho) {
    //Please, complete this constructor...
     this.dato=dato;
     izdo=ramaIzdo;
     dcho = ramaDcho;
  }

  public Object valorNodo()
  { return dato; }
  public Nodo subarbolIzdo()
  { return izdo; }
  public Nodo subarbolDcho()
  { return dcho; }
  public void nuevoValor(Object d)
  { dato = d; }
  public void ramaIzdo(Nodo n)
  { izdo = n; }
  public void ramaDcho(Nodo n)
  { dcho = n; }

  //Este método necesita un nombre mejor
  void visitar() {
    System.out.print(dato + " ");
  }
}

/**
 * 
 */

import java.util.ArrayList;

 /**
  * @author Pablo Orellana 
  * Interface Binary Search Tree
  */

public interface IBinarySearchTree <K,V> {
    /**
     * Metodo para insertar valores
     * @param id Llave 
     * @param value Valor
     */

    void insert(K id, V value);

    /**
     * Metodo para eliminar valores
     * @param id Llave del valor para eliminar
     * @return valor eliminado
     */

    V delete(K id);

    /**
     * Metodo para buscar valores
     * @param id Llave a buscar
     * @return valor que se buscó
     */

    V find(K id);
    
    /**
	   * Metodo que permite dar la cantidad de objetos que hay en el arbol
	   * @return tamaño del arbol
	   */
	  int count();
	
	  /**
	   * 
	   * @return True si esta vacio y false en caso contrario
	   */
	  boolean isEmpty();
	
	  /**
	   * Metodo que regresa un listado de los elementos
	   * @return listado de elementos
	   */
	  ArrayList<V> getElements();
	
	  /**
	   * Regresa valores en orden
	   * @param traversal
	   */
	  void inOrder(ITreeTraversal<V> traversal);
	
	  /**
	   * Regresa valores pre orden
	   * @param traversal
	   */
	  void preOrder(ITreeTraversal<V> traversal);
	
	  /**
	   * Regresa valores post orden
	   * @param traversal
	   */
	  void postOrder(ITreeTraversal<V> traversal);
}

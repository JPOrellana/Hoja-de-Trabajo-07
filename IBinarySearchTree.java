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
}

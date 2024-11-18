package problems;

import adt.linkedList.SingleLinkedListNode;

public class LinkedListRemoveDuplicatesImpl<T> implements LinkedListRemoveDuplicates<T>{

    /**
     * Restricoes extras:
     * - Você NÃO pode usar recursão
     * - Você pode criar métodos auxiliares se achar necessário, desde que sejam criados
     *   nesta classe
     */
	
    public void removeDuplicates(SingleLinkedListNode<T> node){
    	
    	SingleLinkedListNode<T> auxNode = node.getNext();
    	T auxData = auxNode.getData();
    	T data = node.getData();
    	//boolean repetida = false;
    	
    	if(!node.isNIL() && node != null) {
    		
    		while(!auxNode.isNIL() && auxNode != null) {
    			if (!auxNode.getData().equals(data)) {
    				
    				auxNode = auxNode.getNext();
    				
    			} else if (auxNode.getData().equals(data)) {
    				
    				if (auxNode.getNext().isNIL()) {
    					auxNode.setData(null);
    					auxNode.setNext(null);
    					
    				} else {
    					auxNode.setData(auxNode.getNext().getData());
    					auxNode.setNext(auxNode.getNext().getNext());
    				}
    				
    			}
    			auxNode = auxNode.getNext();
    			
    		}			
    	}
    }
}





package problems;


public class BinarySearchRotatedArrayImpl implements BinarySearchRotatedArray{
   
    public int findRotations(int[] array){
    	int left = 0;
    	int right = array.length - 1;
    	
        return buscaBinariaComIndex(array, left, right); 
    }
    
    
    public int buscaBinariaComIndex(int[] array, int left, int right) {
    	int meio = array.length / 2;
    	int numRots = 0;
    	if (array[left] > array[meio] || array[meio] > array[right]) {
    		numRots += 1;
    	}	
    	if(array[left] < array[meio]) { 
			return buscaBinariaComIndex(array, left, meio-1);
		} else if (array[left] > array[meio]){
			numRots += 1; 
		} else if (array[meio] <  array[right]) {
    		return buscaBinariaComIndex(array, meio+1, right);
    	} else {
    		numRots += 1;
    	}
    	
    	return numRots;
    }

}

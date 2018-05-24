
public class ModifiedSelectionSort {
	
	public static void modifiedSelectionSort(int[] list) {
		int i, j, maxNum, maxInde, temp = 0;
		for (i = list.length-1; i >= 0; i--) {
		    maxNum = list[i];
		    maxInde = i;
		    for (j = 0; j < i; j++) { 
		        if (list[j] > maxNum) {
		            maxNum = list[j];
		            maxInde = j;
		        }
		    }
		    
		    if (maxNum > list[i]) {
		        temp = list[i];
		        list[i] = list[maxInde];
		        list[maxInde] = temp;
		    }
		}
	}
	
	public static void modifiedSelectionSort(String[] list) {
		int i, j, maxInde = 0;
		String maxS, temp;
		for (i = list.length-1; i >= 0; i--) {
		    maxS = list[i];
		    maxInde = i;
		    for (j = 0; j < i; j++) { 
		        if (list[j].compareTo(maxS) > 0) {
		            maxS = list[j];
		            maxInde = j;
		        }
		    }
		    
		    if (maxS.compareTo(list[i]) > 0) {
		        temp = list[i];
		        list[i] = list[maxInde];
		        list[maxInde] = temp;
		    }
		}
	}
	
	public static void selectionSort(int[] list) {
		int i, j, minNum, minInde, temp = 0;
		for (i = 0; i <= list.length - 1; i++) {
		    minNum = list[i];
		    minInde = i;
		    for (j = i + 1; j < list.length; j++) { 
		        if (list[j] < minNum) {
		            minNum = list[j];
		            minInde = j;
		        }
		    }
		    
		    if (minNum < list[i]) {
		        temp = list[i];
		        list[i] = list[minInde];
		        list[minInde] = temp;
		    }
		}
	}
	
	public static void SelectionSort(String[] list) {
		int i, j, minInde = 0;
		String minS, temp;
		for (i = 0; i <= list.length - 1; i++) {
		    minS = list[i];
		    minInde = i;
		    for (j = i + 1; j < list.length; j++) { 
		        if (list[j].compareTo(minS) < 0) {
		            minS = list[j];
		            minInde = j;
		        }
		    }
		    
		    if (minS.compareTo(list[i]) < 0) {
		        temp = list[i];
		        list[i] = list[minInde];
		        list[minInde] = temp;
		    }
		}
	}
}

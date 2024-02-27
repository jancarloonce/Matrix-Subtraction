import java.util.Scanner;
public class Matrices {
    
	
    public static void main(String[] args) {
    	Scanner scnr = new Scanner(System.in);
    	System.out.print("Input the size of the square matrix (less than 5): ");
    	int size = 0;
    	boolean isValid = false;
    	while (isValid == false){
    	try {
    	size = scnr.nextInt();
    	isValid = true;
    	while (size >= 5) {
    		System.out.println("Size of matrix must be less than 5!");
    		System.out.print("Input size again: ");
    		size = scnr.nextInt();
    		
    		}
    	}
    	catch (Exception e) {
    		System.out.println("Size of matrix must be an integer!");
    		System.out.print("Input size again: ");
			scnr.reset();
			scnr.next();
    		
    		}
    	}
    	System.out.println("Input the elements of the first matrix");
    	int[][] a = read(scnr, size);
    	System.out.println();
    	System.out.println("Input the elements of the second matrix");
    	int[][] b = read(scnr, size);
    	System.out.println();
    	scnr.close();
    	int[][] difference1 = subtract(a, b, size);
    	System.out.println("The difference of two matrices is: ");
    	System.out.println();
    	printMatrix(difference1);
    	scnr.close();
    }
    
    public static int[][] read(Scanner s, int size) {
    	int[][] result = new int[size][size];;
    	for (int i = 0; i < size; i++) {
    		for (int j = 0; j < size; j++) {
    			System.out.print("Element - [" + (i) + "],[" + (j) +"]: ");
    			boolean isValid = false;
    			while (isValid == false) {
    				try {
    					result[i][j] = s.nextInt();
    					isValid = true;
    				}
    				catch (Exception e) {
    					System.out.println("Elements of the matrix must be an integer!");
    					System.out.print("Element - [" + (i) + "],[" + (j) +"]: ");
    					s.reset();
    					s.next();
    				}
    			}
    		}
    	}
    	return result;
    }
    

    public static int[][] subtract(int[][] a, int[][] b, int size){
    	int[][] result = new int[size][size];
    	for (int i = 0; i < size; i++) {
    		for (int j = 0; j < size; j++) {
    			result[i][j] = a[i][j] - b[i][j];
    		}
    	}
    	return result;
    }
    
    public static void printMatrix(int[][] matrix) {
    	int rows = matrix.length;
    	int columns = matrix[0].length;
    	for (int i = 0; i < rows; i++) {
    		for (int j = 0; j < columns; j++) {
    			System.out.print(matrix[i][j] + " ");
    		}
    		System.out.println();
    
    	}
    	
    }
}

   
    

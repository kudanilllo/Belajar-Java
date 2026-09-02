package array;
public class printAllElements {
    public static void main(String[]args){
        int[][] numbers = {{5,6,7},{8,9,10}}; //two dimension
        int rowIndex = 0;

        for(int[] row : numbers){
            for(int columns : row){
                System.out.println("row: " + rowIndex + " columns: " + columns+ " ");
            }
            rowIndex++;
        }
    }
    
}

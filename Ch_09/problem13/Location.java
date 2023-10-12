package Ch_09.problem13;

public class Location {
    public int maxRowIndex;
    public int maxColIndex;
    public double maxValue;

    public double [][] array;

    public Location(int row, int col) {
        array=new double[row][col];
    }

    public void insert(double element , int r , int c){
        array[r][c]=element;
    }
    public double getMaxValue(){
        maxValue=array[0][0];

        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                if(maxValue<array[i][j]){
                    maxValue=array[i][j];
                    maxColIndex=j;
                    maxRowIndex=i;

                }
            }
        }
        return maxValue;
    }

    public int getMaxRowIndex() {
        return maxRowIndex;
    }

    public int getMaxColIndex() {
        return maxColIndex;
    }
}

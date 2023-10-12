package Ch_09.problem06;

public class Main {
    public static void main(String[] args) {
        int []arrayOfRandomNumbers=getArrayOfRandoms(100000);
        StopWatch s=new StopWatch();

        selectionSort(arrayOfRandomNumbers);

        s.stop();
        System.out.println(s.getElapsedTime());

    }
    public static int [] getArrayOfRandoms(int n){
        int []array=new int[n];
        for(int i=0;i<array.length;i++)
            array[i]=(int) (Math.random()*100000);

        return array;
    }
    public static void selectionSort(int [] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}

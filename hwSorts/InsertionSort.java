iort java.util.Random;

public class InsertionSort{

    //static int[] test=new int[]{3,2,4,5};                                     

    public static void main(String[]args){
        int size=1000000;
        int max = 10000;
        int[] test = new int[size];
        Random num = new Random();
        for(int i=0; i<size; i++){
            test[i]=num.nextInt(max);
        }
	insertiontionSort(test);
    }

    public static void insertionSort(int[] myData){
        int x; //x is current number                                            
        for(int i=1; i<myData.length; i++){
            //1 because start w/ 2nd #                                          
            x=myData[i];
            int j=i-1;
            for (j=i-1; j>=0 && x < myData[j]; j--){
                myData[j+1]=myData[j];
            }//for j                                                            
            myData[j+1]=x;
        }//for i                                                                
        for(int k=0; k<myData.length; k++){
            System.out.print(myData[k]);
        }//for k                                                                
    }
}
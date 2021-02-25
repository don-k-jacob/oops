public class SecondSmallestInArray {
    public static void main(String[] args) {
        int array[]={1,32,8,62,34,4,11,5,13,6,15,42,23};
        System.out.println("\nArray : ");
        int i,j,t;
        int len=array.length;
        for(i=0;i<len;i++){
            System.out.print(array[i]+"  ");
        }
        for(i=0;i<len;i++){
            for(j=i+1;j<len;j++){
                if(array[i]>array[j]){
                    t=array[i];
                    array[i]=array[j];
                    array[j]=t;
                }
            }
        }
        System.out.println("\nSorted Array : ");
        for (i = 0; i < len; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println("\nSecond Smallest Value : "+array[1]);
    }
}
package arrayexercise;

public class program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int arr [][] = new int [4][10]; 
    //System.out.println(arr.length);
    //System.out.println(arr[0].length);
    for (int i=0; i<arr.length;i++)
    {
       for(int j=0; j<arr[0].length;j++)
       {
       System.out.print(i);
       System.out.print(j);
       System.out.print(" ");
       }
       System.out.println();
	}
 }
}
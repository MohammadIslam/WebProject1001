//Mohammad islam
//small program to find out the maximum & minimum number
package my_programs;

public class MinMaximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int numbers[]={2,4,6,8,10,12,14,16,18,20,25,30,35,40,50,2,1};
        int maximum=numbers[0];
        int minimum=numbers[0];
      //  System.out.println("2nd numbers"+numbers[6]);
        for (int i=0;i<numbers.length;i++)
        {
        	if(maximum<numbers[i])
        		maximum=numbers[i];
        	if(minimum>numbers[i])
        		minimum=numbers[i];
        }
        System.out.println("maximum number is:"+maximum);
        System.out.println("minimum number is:"+minimum);
	}

}

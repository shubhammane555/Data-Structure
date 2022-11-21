package java2;

public class Mergesort {
	
	
	
	int[] array;
	int[] tempmergearr;
	int length;
	
	public static void main(String[]args)
	{
		int [] arr= {48,36,13,52,19,21};
		Mergesort ms=new Mergesort();
		ms.sort(arr);
						
		
		for(int i:arr)
		{
			System.out.println(i+"");
		}
	}

	public void sort(int arr[])
	{
		this.array=arr;
		this.length=arr.length;
		this.tempmergearr=new int[length];
		divideArray(0,length-1);
	}
	public void divideArray(int LowerIndex,int HigherIndex)
	{
		if(LowerIndex<HigherIndex)
		{
			int middle=LowerIndex+(HigherIndex-LowerIndex)/2;
			//it will sort the left side of array
			divideArray(LowerIndex,middle);
			
			//it will sort the right side
			divideArray(middle+1,HigherIndex);
			
			mergeArray(LowerIndex,middle,HigherIndex);
		}
	}
	
	public void mergeArray(int LowerIndex,int middle,int HigherIndex)
	{
		for(int i=LowerIndex;i<=HigherIndex;i++)
		{
			tempmergearr[i]=array[i];
		}
		
		
		int i=LowerIndex;
		int j=middle+1;
		int k=LowerIndex;
		
		while(i<=middle && j<=HigherIndex)
		{
			if(tempmergearr[i]<=tempmergearr[j])
			{
				array[k]= tempmergearr[i];
				i++;
			}
			else
			{
				array[k]=tempmergearr[j];
				j++;
				
			}
			k++;
		}
		while(i<=middle)
		{
			array[k]=tempmergearr[i];
			k++;
			i++;
		}
		
	}
}

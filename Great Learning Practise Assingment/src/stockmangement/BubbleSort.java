package stockmangement;


class BubbleSort{
	public void sort(float [] a,int n) { 
		float temp;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1;j++) {
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}
			}
			
		}
		
		System.out.println("Stock prices in ascending order are :");
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}
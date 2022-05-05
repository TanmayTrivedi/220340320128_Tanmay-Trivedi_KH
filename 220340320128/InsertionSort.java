import java.util.*;
class InsertionSort{

void insertionSort(int n, int arr[]){
		for(int i=n-1; i>=0; i--){
			int k = arr[i];
			int j = i-1;
			while(j>=0 && arr[j] >= k){
				arr[j+1] = arr[j];
				--j;
				print(arr);
			}		
			arr[j+1] = k;
		}
		print(arr);
	}
void print(int[] arr){

for(int i = 0 ; i<arr.length ; i++){
System.out.print(" "+arr[i]);
}
System.out.println();
}

public static void main(String[] args){
InsertionSort obj = new InsertionSort();
Scanner sc = new Scanner(System.in);
//System.out.printarrn("Enter size ");
int s = sc.nextInt();

int[] arr=new int[s];
//System.out.printarrn("Enter array earrements ");
for(int i = 0; i<s;i++){
arr[i]=sc.nextInt();
}

//System.out.printarrn("Insertion Sort \n");
obj.insertionSort(s,arr);

}

}


public class CassThree {
	public static void main(String[] args) {
		int k[][]= {{1,3,4},{2,4,3},{3,4,5}};   
		int l[][]=  {{1,3,4},{2,4,3},{1,2,4}};  
		    
		//creating another matrix to store the sum of two matrices    
		int o[][]=new int[3][3];  //3 rows and 3 columns  
		    
		//adding and printing addition of 2 matrices    
		for(int i=0;i<3;i++){    
		for(int j=0;j<3;j++){    
		o[i][j]=0;      
		for(int p=0;p<3;p++)      
			{      
			o[i][j]+=k[i][p]*l[p][j];      
			}//end of k loop  
			System.out.print(o[i][j]+" ");  //printing matrix element  
			}//end of j loop  
			System.out.println();//new line    
			}
		
		int a[][]= {{1,3,4},{2,4,3},{3,4,5}};   
		int b[][]=  {{1,3,4},{2,4,3},{1,2,4}};  
		//creating another matrix to store the sum of two matrices    
		int c[][]=new int[3][3];  //3 rows and 3 columns  
		    
		//adding and printing addition of 2 matrices    
		for(int i=0;i<3;i++){    
		for(int j=0;j<3;j++){    
		c[i][j]=a[i][j]+b[i][j];    //use - for subtraction  
		System.out.print(c[i][j]+" ");    
		}    
		System.out.println();//new line    
		}  
	}
		


		
		
			}
	
			
			
	
	


	
	

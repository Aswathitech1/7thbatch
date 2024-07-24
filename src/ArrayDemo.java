
public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Syntax
		 * data_type array_name[] = new data_type[array_size];//array declaration
		 *
		 * arrayInitialization
		 * array_name[0]= value1;
		 * array_name[1]=value2;
		 * .....................
		 * array_[size-1]=value n;
		 * 
		 * array declaration with initialization
		 * data_type array_name[]={value1,value2,.......,value n};
		 * 
		 * */
		
//		int marks[] = new int[5];
//		marks[0] = 10;
//		marks[1] = 20;
//		marks[2] = 30;
//		marks[3] = 40;
//		marks[4] = 50;
		
		int marks[]= {40,50,88,99,100,20};
		
		System.out.println(marks[3]);
		
		for(int index = 0;index<marks.length;index++) {
			System.out.println(marks[index]);
		}
		
		
		

	}

}

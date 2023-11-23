package Arrays;

public class ArrayConcept {


			public static void main(String[] args) {
				// TODO Auto-generated method stub
				//Array: to store similar data types values in single varirable
						//1. integer variable
						int i []=  {20,35,40,45,50}; // means i is incremental variable here and the size of the array is 4
						// means 4 values can be stored in this i  variable from 0 to 3 means i0,i1,i2 and i3.
						//lowest bound or index is 0 and highest bound or index is n-1 means 4-1 is 3.
						// one dimensional array.
						// disadvantages of array:
						// I.size is fixed-- static array-- to overcome this problem we use collections 
						// -- array list Hashtable - Dynamic array.
						// 2. similar data type values  can only be stored.
						// to overcome this problem , we use object array (
//		                i[0]=10;
//		                i[1]=20;
//		                i[2]=30;
//		                i[3]=40;
		                System.out.println(i[3]);
		          //array index out of bound exception means if you give i[4] to print
		          // means 5th value  which doesnot exsits then will give
		          // "Array Index out of Bound Exception" 
		          // to get the size of the array system.out.println(i.length);
		                
		                System.out.println(i.length);
		                //IMP - To print  all the values of array we Use "For Loop"
		                for (int j=0; j<i.length; j++) {
		              System.out.println (i[j]);
		                }
		              //2.double array;
		        		double d[] = new double [4];
		        		       d[0]= 12.22;
		        		       d[1]=13.44;
		        		       d[2]=14.2;
		        		       d[3]=16.2;
		        		       
		        		       System.out.println(d[3]);
		        		       
		        		       for (int m=0; m<d.length; m++) {
		        		    	   System.out.println(d[m]);
		        		       }
		        		       //3.char array;
		        		       char c [] = new char [3];
		        		       c[0]='a';
		        		       c[1]='#';
		        		       c[2]='2';
		        		       System.out.println(c[1]);
		        		       // boolean array;
		        		       boolean b[] = new boolean [2];
		        		       b[0]=true;
		        		       b[1]=false;
		        		       System.out.println(b[1]);
		        		       //5. String array;
		        		       String s [] = new String [3];
		        		       s[0]="Test";
		        		       s[1]="Satish";
		        		       s[2]="durga";
		        		       
		        		       System.out.println(s.length);
		        		       System.out.println(s[2]);
		        		       
		        		       for (int j=0; j<s.length; j++) {    //Use for loop when we want to print the all  values.
		        		    	   System.out.println(s[j]);
		        		       }
		        		       
		        		       //6. object array ( object is the super class in java).
		        		       
		        		       //-- used to store data types values.
		        		       
		        		       Object ob [] = new Object [6];
		        		       ob[0] = "Satish";
		        		       ob[1]=24;
		        		       ob[2]= 14.34;
		        		       ob[3]='#';
		        		       ob[4]="05/07/1996";
		        		       ob[5]="kunchapalli";
		        		       
		        		       System.out.println(ob[5]);
		        		       System.out.println(ob.length);
		        		       
		        	       for (int x=0; x<ob.length; x++) {     // For printing the all values.
		        	    	   System.out.println(ob[x]);
		               }

			}

		


	}



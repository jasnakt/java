
public class secondlargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int a[]= {7,8,3,1,9,12,6,5,10,11};
         
         int f = 0;int s=0;
        if(a[0]>a[1]) {
        	f=a[0];
        	s=a[1];
        	
        	
        }else if(a[1]>a[0]) {
        	f=a[1];
        	s=a[0];
        	
        }
        	
        	
        
        for(int i=2;i<a.length;i++) {
        	if(a[i]>f) {
        		s=f;
        		f=a[i];
        		
        		
        	}
        	else if(a[i]>s && a[i]<f){
        		s=a[i];
        	
        	}
        	
        	
        }
        

		System.out.println("***************"+f);
    	System.out.println("***************"+s);
         
	}

}

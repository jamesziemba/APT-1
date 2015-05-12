public class AccessList {
     public String mayAccess(int[] rights, int minPermission) {
    	 String retval = "";
    	 if(rights.length ==0){
    		 return retval;
    	 }
    	 for(int i = 0;i<rights.length ; i++) {
    		 if(rights[i] < minPermission){
    		 	retval += "D";}
    		 else{
    		 		retval += "A";}
    	
    	
    	 }
    	 return retval;
     }
     public static void main(String[] args){
    	AccessList myTest = new AccessList();
    	System.out.println(myTest.mayAccess(new int[]{1,2,3,4,0,-1,5}, 1));
     }
     }

	


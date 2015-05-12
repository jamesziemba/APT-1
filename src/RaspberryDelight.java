public class RaspberryDelight{
      public int toasts(int upper_limit, int layer_count){
         if(upper_limit > layer_count) {
        	 return 1;
         }
         int count = 0;
         int count_var = layer_count;
         int limit_var = upper_limit;
         while(count_var > 0) {
        	 count += 1;
        	 count_var = count_var - limit_var;
        } 
        return count;  

      }
      public static void main(String[] args){
      	RaspberryDelight myTest = new RaspberryDelight();
      	System.out.println(myTest.toasts(2,13));
  }
}
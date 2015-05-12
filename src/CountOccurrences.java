public class CountOccurrences{
     public int numberOccurrences(int number, int digit) {
        int count = 0;
        String strnum = Integer.toString(number);
        String strdig = Integer.toString(digit);
        for(int i=0;i<strnum.length();i++){
        	if(strnum.charAt(i)==strdig.charAt(0)){
        		count += 1;
        	}
        }
     return count;
     }
     public static void main(String[] args){
       	CountOccurrences myTest = new CountOccurrences();
       	System.out.println(myTest.numberOccurrences(5554555,5));
     }
}   
    	 
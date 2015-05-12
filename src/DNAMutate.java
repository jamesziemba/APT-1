public class DNAMutate {
	public String mutate(String dna) {
		String retval = "";
		int len = dna.length()-1;
		for(int i = len;i >= 0;--i){
			retval = retval + dna.charAt(i);
		}
		return retval;
	}
	public static void main(String[] args){
		DNAMutate myTest = new DNAMutate();
		System.out.println(myTest.mutate("JAMES"));
	}
}
public class Calculate {

	public static void main(String[] arg) {
            
		System.out.println("Calculate...");
                int first = Integer.valueOf(arg[0]);
                int second  = Integer.valueOf(arg[1]);
                int therd  = Integer.valueOf(arg[2]);
                String fous = String.valueOf(arg[3]);
                int sum = first + second + therd;
                System.out.println(fous);
                System.out.println("sum" + sum);
	}

}

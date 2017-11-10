import java.util.Scanner;
public class Iterrator {
    
    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        
        try {
            Calculator calc = new Calculator();
            String exit = "no";
            while (!exit.equals("Yes")) {
				
            System.out.println("Input operation type + - / *");
		String typeOp = reader.next();
                System.out.println("Input first arg:");
                String first = reader.next();
                System.out.println("Input second arg:");
                String second = reader.next();
				
                calc.add (typeOp, Integer.valueOf(first), Integer.valueOf(second));
                
                System.out.println("typeOp:"+ typeOp);
                
                System.out.println("Result:"+ calc.otputResult());
                calc.clearResult();
                System.out.println("Exit? yes/no");
                exit = reader.next();
                
            }
            
        } finally  {
            reader.close();
        }
            
        }
    }
    
    
    
    

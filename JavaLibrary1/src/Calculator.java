// класс реализует калькулятор


public class Calculator {
    
   /** Результат*/
        private int result;
     
//математическая операция  сложения String typeOp,

    public void add ( String typeOp, int ... params ) {
        
        
        for (Integer param : params) {
            System.out.println(param);
            if	(typeOp.equals("+")){
		this.result += param;
                }	
//            if (typeOp.equals("-")) {
//                this.result = param[i] - param[i-1];
//            }

            
        }
		
    }
	
	
        //вывод результата операции
        public int otputResult (){
            return this.result;
        }
        
        
     //очистка результата операции   
    public void clearResult ()  {
        this.result = 0;
      }
    
    
    
}
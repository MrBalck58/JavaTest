public class Calculator {
        private int result;
     
    public void add ( String typeOp, int ... params ) {
                
        for (Integer param : params) {
            System.out.println(param);
            switch (typeOp){
                case "+": 
                    this.result += param;
                case "-": 
                    this.result = params[0] - params[1];
                case "*": 
                    this.result = params[0] * params[1];
                case "/": 
                    this.result = params[0] / params[1];                  
            }
            System.out.println("param:"+param);
        }    
    }
            //
        public int otputResult(){
            return this.result;
        }
     //  
    public void clearResult ()  {
        this.result = 0;
      }
}
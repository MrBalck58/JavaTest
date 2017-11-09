/* класс реализует калькулятор
*/

public class Calculator {
    
   /** Результат*/
        private int result;
     
//математическая операция   
    public void add (int ... params ) {
        for (Integer param : params) {
            this.result += param;
        }
    }
        //вывод результата операции
        public int otputresult (){
            return this.result;
        }
        
        
     //очистка результата операции   
    public void clearresult ()  {
        this.result = 0;
      }
    
    
    
}
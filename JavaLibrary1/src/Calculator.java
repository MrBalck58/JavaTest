// ����� ��������� �����������


public class Calculator {
    
   /** ���������*/
        private int result;
     
//�������������� ��������  �������� String typeOp,

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
	
	
        //����� ���������� ��������
        public int otputResult (){
            return this.result;
        }
        
        
     //������� ���������� ��������   
    public void clearResult ()  {
        this.result = 0;
      }
    
    
    
}
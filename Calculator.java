/* ����� ��������� �����������
*/

public class Calculator {
    
   /** ���������*/
        private int result;
     
//�������������� ��������   
    public void add (int ... params ) {
        for (Integer param : params) {
            this.result += param;
        }
    }
        //����� ���������� ��������
        public int otputresult (){
            return this.result;
        }
        
        
     //������� ���������� ��������   
    public void clearresult ()  {
        this.result = 0;
      }
    
    
    
}
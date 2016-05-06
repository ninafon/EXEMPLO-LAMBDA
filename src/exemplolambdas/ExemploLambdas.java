package exemplolambdas;


public class ExemploLambdas {
    
    public static void main(String[] args) {
       //clase anonima
        ILambdas op = new ILambdas(){
            public void operacion(int a, int b){
                System.out.println("op : "+ (a*b)); 
            }
        };
        op.operacion(5, 9);
        // expresion lambdas
        ILambdas op2 = (int a, int b)-> System.out.println("resultado :"+ (a*b));
        op2.operacion(3, 6);
        op2.saudo();
        ILambdas op3 = (int a,int b)-> { System.out.println("resul :"+ (a+b));};
          op3.operacion(8, 2);
        
    }
    
}

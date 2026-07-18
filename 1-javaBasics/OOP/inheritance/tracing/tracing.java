package OOP.inheritance.tracing;

public class tracing {
    public class A{
        public static int temp = 6;
        public static int x = 3;
        public int sum = 1;
        public int y = 2;
        public A(){
          y = temp - 2;
          sum = temp + 3;
          temp -= 2;
        }
        public void methodA(int m, int n){
          int x = 0;
          y = y + m + (this.temp++);
          x = x + 2 +  n;
          sum = sum + this.x + y;
          System.out.println(x + " " + y+ " " +sum); 
        }
      }
      public class B extends A{
        public static int x = 7;
        public int temp = 0;
        public B(){
          temp = temp + 3 ;
          sum = 3 + temp + 2 + sum;
          super.temp -= 1;
        } 
        public B(B b){
          sum = b.sum;
          x = b.x;
          b.methodB(2, 3);
        }
        public void methodB(int m, int n){    
          int y = 0;
          y = y + this.y + m;
          x = this.y + super.x + temp;
          methodA(x, y);
          sum = x + y + super.sum;
          System.out.println(x + " " + y+ " " +sum);
        }
      
}

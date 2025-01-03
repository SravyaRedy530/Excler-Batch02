public class Demo3 {
    
        public static void main(String[] args){
            int a = 10;
            int b = 20;
            int c = 30;
            int greatest;
            if((a>b) && (a>c)){
                greatest = a;
            }
            else if((b>a) && (b>c)){
                greatest = b;
            }
            else{
                greatest = c;
            }
            System.out.println("The greatest number is: "+greatest);
        }
    }
    
    


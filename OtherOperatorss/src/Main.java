public class Main {
    public static void main(String[] args) {
        int a = 15;
        a +=5;
        a-=4;
        int b=a+1;

            System.out.println("at the start of this program b is equal to:"+b);
        if (b%2==0){
            System.out.println("statement:true, b is odd");
        }else{
            System.out.println("statement:false, b is not odd");
        }
        if(b*b+1%3==0){
            System.out.println("statement:true,the result is a multiple of 3");
        }else{
            System.out.println("statement:false,the result is not a multiple of 3");
        }
    }
}
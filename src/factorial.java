class factorial{
    static int fact(int n){

        if(n==0){
            return 1;
        }
        else{
            return (n*fact(n-1));
        }
    }
    public static void main(String[] args)
    {
        int number=5;
        System.out.println("factorial of the "+number+" is "+fact(number));
    }
}
public class CheckPrimeNumber {
    void prime(int number) {
        int flag = 0;
        int half = number/2;
        int i;
        if(number ==0 || number == 1 || number < 0){
            System.out.println(number+" is not a prime number ");
        }
        else {
            for (i=2;i<half;i++){
                if (number%i == 0){
                    flag = flag +1;
                    break;
                }
            }
        }
        if (flag == 0){
            System.out.println(number + " is the prime number");
        }
        else {
            System.out.println(number + " is not a prime number");
        }
    }

    
}

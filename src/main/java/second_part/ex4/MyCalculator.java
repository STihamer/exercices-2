package second_part.ex4;

 class MyCalculator implements AdvancedArithmetic{
    @Override
    public int divisor_sum(int n) {
        int counter = 0;
        for (int i = 1; i<=n; i++)
            if(n % i == 0){
                counter = counter + i;
            }
        return counter;
    }
}

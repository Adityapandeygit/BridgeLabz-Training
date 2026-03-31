class Reverse {
    public int reverseno(int x) {
        long output = 0;
        while(x!=0){
            int digit=x%10;
            output+=digit;
            x/=10;
            output *=10;
        }
        output/=10;
        if(output<Integer.MIN_VALUE || output>Integer.MAX_VALUE){
            return 0;
        }
        return (int)output;
    }
}
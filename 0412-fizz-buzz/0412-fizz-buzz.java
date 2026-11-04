class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> result = new ArrayList<>();
        int x = 1;
        while(x<=n){
            if(x%3==0 && x%5==0){
                result.add("FizzBuzz");
            }
            else if(x%3==0){
                result.add("Fizz");
            }
            else if(x%5==0){
                result.add("Buzz");
            }
            else{result.add(String.valueOf(x));}
            x++;
        }
        return result;
    }
}
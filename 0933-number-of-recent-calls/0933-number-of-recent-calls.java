class RecentCounter {

    ArrayList<Integer> result;

    public RecentCounter() {
        result = new ArrayList<>();
    }
    
    public int ping(int t) {
        result.add(t);

        int count = 0;

        for(int i = result.size() - 1; i >= 0; i--) {
            if(result.get(i) >= t - 3000) {
                count++;
            } else {
                break;
            }
        }

        return count;
    }
}
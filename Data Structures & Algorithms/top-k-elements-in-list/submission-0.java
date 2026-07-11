class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frquency =  new HashMap<>();
        for(int i=0; i<nums.length;i++){
            frquency.put(nums[i], frquency.getOrDefault(nums[i], 0)+1);
        }
        List<Integer> uniqueElements =  new ArrayList<>(frquency.keySet());
        uniqueElements.sort(Comparator.comparing(frquency::get).reversed());
        int [] response = new int[k];
        for(int i=0; i<k;i++){
            response[i] = uniqueElements.get(i);

        }
        return response;

    }
}

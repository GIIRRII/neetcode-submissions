class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frquency =  new HashMap<>();
        for(int i=0; i<nums.length;i++){
            frquency.put(nums[i], frquency.getOrDefault(nums[i], 0)+1);
        }
        PriorityQueue<int []> heap =  new PriorityQueue<>((a, b) -> a[0] - b[0]);
        for(Map.Entry<Integer, Integer> entry : frquency.entrySet()){
            heap.offer(new int[]{entry.getValue(), entry.getKey()});
            if(heap.size() > k){
                heap.poll();
            }
        }
        int [] response = new int[k];
        for(int i=0; i<k;i++){
            response[i] = heap.poll()[1];

        }
        return response;

    }
}

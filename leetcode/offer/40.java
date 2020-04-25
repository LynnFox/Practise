//方案一：利用选择排序的思想
class Solution {
    public int[] getLeastNumbers(int[] arr, int k) {
        int[] res = new int[k];

        for (int i = 0; i < k; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                min = arr[min] <= arr[j] ? min : j;
            }
            res[i] = arr[min];
            
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return res;
    }
}
//方案二：优先队列实现大顶堆
//只有k个元素的大顶堆！！！
//比堆顶小进堆，堆元素超过k个删堆顶
class Solution {
    public int[] getLeastNumbers(int[] arr, int k) {
        
        if(k==0) {
            return new int[k];
        }
        
        //使用优先队列建立大顶堆
        Queue<Integer> maxheap = new PriorityQueue<>(k,(i1, i2)->Integer.compare(i2,i1));


        for (int e : arr) {
            
            //堆不满入堆
            //比堆顶元素小入堆
            if (maxheap.size() < k || e < maxheap.peek()) {
                maxheap.offer(e);
            }

            // 删除堆顶最大元素，保证堆中元素个数不超过k
            if (maxheap.size() > k) {
                maxheap.poll(); 
            }
        }


        // 将堆中的元素存入数组
        int[] res = new int[k];
        int index = 0;
        for (int e : maxheap) {
            res[index++] = e;
        }
        return res;
    }
}

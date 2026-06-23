class Solution {
    public int[] getOrder(int[][] tasks) {

        int n = tasks.length;

        int[][] arr = new int[n][3];

        for (int i = 0; i < n; i++) {
            arr[i][0] = tasks[i][0];
            arr[i][1] = tasks[i][1];
            arr[i][2] = i;
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                if (a[0] < b[0]) return -1;
                if (a[0] > b[0]) return 1;
                return 0;
            }
        });

        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {

                if (a[1] < b[1]) return -1;
                if (a[1] > b[1]) return 1;

                if (a[2] < b[2]) return -1;
                if (a[2] > b[2]) return 1;

                return 0;
            }
        });

        int[] ans = new int[n];

        int answerIndex = 0;
        int taskIndex = 0;
        long currentTime = 0;

        while (taskIndex < n || !pq.isEmpty()) {

            if (pq.isEmpty() && taskIndex < n) {
                if (currentTime < arr[taskIndex][0]) {
                    currentTime = arr[taskIndex][0];
                }
            }

            while (taskIndex < n &&
                   arr[taskIndex][0] <= currentTime) {

                pq.offer(arr[taskIndex]);
                taskIndex++;
            }

            int[] task = pq.poll();

            ans[answerIndex] = task[2];
            answerIndex++;

            currentTime += task[1];
        }

        return ans;
    }
}
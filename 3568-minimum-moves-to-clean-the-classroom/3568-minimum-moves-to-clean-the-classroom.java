class Solution {
    public int minMoves(String[] classroom, int energy) {

        int m = classroom.length;
        int n = classroom[0].length();

        int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        int startRow = 0;
        int startCol = 0;

        HashMap<String, Integer> litterIndex = new HashMap<>();

        int index = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                char ch = classroom[i].charAt(j);

                if (ch == 'S') {
                    startRow = i;
                    startCol = j;
                }

                if (ch == 'L') {
                    litterIndex.put(i + "," + j, index++);
                }
            }
        }

        if (index == 0)
            return 0;

        int targetMask = (1 << index) - 1;

        boolean[][][][] visited = new boolean[m][n][energy + 1][1 << index];

        Queue<int[]> queue = new LinkedList<>();

        queue.offer(new int[]{startRow, startCol, energy, 0, 0});

        visited[startRow][startCol][energy][0] = true;

        while (!queue.isEmpty()) {

            int[] curr = queue.poll();

            int row = curr[0];
            int col = curr[1];
            int currEnergy = curr[2];
            int mask = curr[3];
            int moves = curr[4];

            if (mask == targetMask)
                return moves;

            for (int[] d : dir) {

                int newRow = row + d[0];
                int newCol = col + d[1];

                if (newRow < 0 || newCol < 0 || newRow >= m || newCol >= n)
                    continue;

                char cell = classroom[newRow].charAt(newCol);

                if (cell == 'X')
                    continue;

                if (currEnergy == 0)
                    continue;

                int nextEnergy = currEnergy - 1;
                int nextMask = mask;

                if (cell == 'R')
                    nextEnergy = energy;

                if (cell == 'L') {
                    int bit = litterIndex.get(newRow + "," + newCol);
                    nextMask |= (1 << bit);
                }

                if (visited[newRow][newCol][nextEnergy][nextMask])
                    continue;

                visited[newRow][newCol][nextEnergy][nextMask] = true;

                queue.offer(new int[]{
                        newRow,
                        newCol,
                        nextEnergy,
                        nextMask,
                        moves + 1
                });
            }
        }

        return -1;
    }
}
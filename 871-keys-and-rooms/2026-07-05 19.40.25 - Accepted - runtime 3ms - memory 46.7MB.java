class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Queue<Integer> q = new LinkedList<>();

        q.offer(0);
        int roomsOpened = 0;

        while (!q.isEmpty()) {
            int a = q.poll();
            if (rooms.get(a) == null) {
                continue;
            }
            int i = 0;
            while (i < rooms.get(a).size()) {
                q.offer(rooms.get(a).get(i));
                i++;
            }
            rooms.set(a, null);

            roomsOpened++;

        }

        return roomsOpened == rooms.size();
    }
}
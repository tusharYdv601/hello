class Solution {
    public double angleClock(int hour, int minutes) {
        double angle = Math.abs(((hour % 12) * 30 + 0.5 * minutes) - minutes * 6);
        return Math.min(angle, 360 - angle);

    }
}
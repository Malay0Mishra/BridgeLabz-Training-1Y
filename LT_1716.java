class Solution {
    public int totalMoney(int n) {
        int weeks = n / 7;
        int days = n % 7;

        int fullWeeksSum = weeks * 28 + 7 * (weeks * (weeks - 1)) / 2;

        int start = weeks + 1;
        int remainingDaysSum = days * (2 * start + (days - 1)) / 2;

        return fullWeeksSum + remainingDaysSum;
    }
}
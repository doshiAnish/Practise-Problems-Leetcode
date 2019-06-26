class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (isSelfDividingNumber(i)) {
                list.add(i);
            }
        }
        return list;
    }

    public boolean isSelfDividingNumber(int num) {
        int temp = num;
        while (temp > 0) {
            int rem = temp % 10;
            if (rem == 0) {
                return false;
            }
            if (num % rem == 0) {
                temp = temp / 10;
            } 
            else {
                return false;
            }
        }
        return true;
    }
}
    
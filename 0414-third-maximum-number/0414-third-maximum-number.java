class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> tree = new TreeSet<>();
        for (int num : nums) {
            tree.add(num);
        }

        List<Integer> al = new ArrayList<>(tree);
        if (2 < al.size()) {
            return al.get(al.size()-3);
        } else {
             return al.get(al.size() - 1);
        }
    }
}
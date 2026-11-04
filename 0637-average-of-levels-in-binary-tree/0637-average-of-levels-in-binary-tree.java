class Solution {
    public List<Double> averageOfLevels(TreeNode root) {

        List<Double> ans = new ArrayList<>();
        ArrayList<TreeNode> nodes = new ArrayList<>();

        nodes.add(root);

        while (!nodes.isEmpty()) {

            int n = nodes.size();
            double sum = 0;

            ArrayList<TreeNode> next = new ArrayList<>();

            for(int i = 0; i < n; i++) {

                TreeNode node = nodes.get(i);

                sum += node.val;

                if(node.left != null)
                    next.add(node.left);

                if(node.right != null)
                    next.add(node.right);
            }

            ans.add(sum / n);

            nodes = next;
        }

        return ans;
    }
}
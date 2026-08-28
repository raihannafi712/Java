public class Task3 {

    //======================TASK#3======================
    public static String findPath(BSTNode root, Integer key) {
        if (root == null || key == null) {
            return "No Path Found";
        }

        String path = "";
        BSTNode current = root;

        while (current != null) {
            if (path.isEmpty()) {
                path = current.elem.toString();
            } else {
                path = path + " " + current.elem;
            }

            if (key.equals(current.elem)) {
                return path;
            } else if (key < current.elem) {
                current = current.left;
            } else {
                current = current.right;
            }
        }

        return "No Path Found";
    }
    //==================================================
}
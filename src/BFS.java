import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class BFS {

    public static List<Integer> calculate(Map<Integer, List<Integer>> graph, int start) {
        List<Integer> visited = new ArrayList<>();
        LinkedList<Integer> stack = new LinkedList<>();
        stack.add(start);
        while (!stack.isEmpty()) {
            int vertex = stack.removeFirst();

            if (!visited.contains(vertex)) {
                visited.add(vertex);
                List<Integer> childrens = graph.get(vertex);

                for (int child : childrens) {
                    if (!visited.contains(child)) {
                        stack.addLast(child);
                    }
                }
            }
        }
        return visited;
    }
}

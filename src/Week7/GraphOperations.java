package Week7;

import java.util.HashSet;
import java.util.Set;

public class GraphOperations {
    public static Set<Vertex> getNeighbours(Graph graph, Vertex vertex) {
        //Have fun coding!
        Set<Vertex> set = new HashSet<>();
        for (Edge edge : graph.getEdges()) {
            if (edge.v1 == vertex) {
                set.add(edge.v2);
            } else if (edge.v2 == vertex) {
                set.add(edge.v1);
            }
        }
        return set;
    }
}

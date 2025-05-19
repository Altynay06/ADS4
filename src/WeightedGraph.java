
import java.util.*;

public class WeightedGraph<V> {
    private Map<Vertex<V>, List<Edge<Vertex<V>>>> map = new HashMap<>();

    public void addVertex(Vertex<V> vertex) {
        map.putIfAbsent(vertex, new ArrayList<>());
    }

    public void addEdge(Vertex<V> source, Vertex<V> dest, double weight) {
        map.get(source).add(new Edge<>(source, dest, weight));
    }

    public Map<Vertex<V>, List<Edge<Vertex<V>>>> getGraph() {
        return map;
    }
}

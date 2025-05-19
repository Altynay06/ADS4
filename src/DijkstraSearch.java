
import java.util.*;

public class DijkstraSearch<V> {
    public Map<Vertex<V>, Double> dijkstra(Vertex<V> start) {
        Map<Vertex<V>, Double> distances = new HashMap<>();
        PriorityQueue<Map.Entry<Vertex<V>, Double>> pq = new PriorityQueue<>(Map.Entry.comparingByValue());

        distances.put(start, 0.0);
        pq.add(new AbstractMap.SimpleEntry<>(start, 0.0));

        while (!pq.isEmpty()) {
            Vertex<V> current = pq.poll().getKey();

            for (Map.Entry<Vertex<V>, Double> entry : current.getAdjacentVertices().entrySet()) {
                Vertex<V> neighbor = entry.getKey();
                double weight = entry.getValue();
                double newDist = distances.get(current) + weight;

                if (!distances.containsKey(neighbor) || newDist < distances.get(neighbor)) {
                    distances.put(neighbor, newDist);
                    pq.add(new AbstractMap.SimpleEntry<>(neighbor, newDist));
                }
            }
        }

        return distances;
    }
}

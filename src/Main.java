
public class Main {
    public static void main(String[] args) {
        Vertex<String> a = new Vertex<>("A");
        Vertex<String> b = new Vertex<>("B");
        Vertex<String> c = new Vertex<>("C");

        a.addAdjacentVertex(b, 5);
        a.addAdjacentVertex(c, 10);
        b.addAdjacentVertex(c, 3);

        BreadthFirstSearch<String> bfs = new BreadthFirstSearch<>();
        System.out.println("BFS:");
        bfs.bfs(a);

        DijkstraSearch<String> dijkstra = new DijkstraSearch<>();
        System.out.println("Dijkstra:");
        dijkstra.dijkstra(a).forEach((vertex, dist) ->
                System.out.println(vertex + " -> " + dist));
    }
}

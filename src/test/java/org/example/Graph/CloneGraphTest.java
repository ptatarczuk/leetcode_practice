package org.example.Graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class CloneGraphTest {
    @Test
    public void testCloneGraphExample1() {
        // Create a graph: [[2,4],[1,3],[2,4],[1,3]]
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        node1.neighbors.add(node2);
        node1.neighbors.add(node4);
        node2.neighbors.add(node1);
        node2.neighbors.add(node3);
        node3.neighbors.add(node2);
        node3.neighbors.add(node4);
        node4.neighbors.add(node1);
        node4.neighbors.add(node3);

        CloneGraph cloneGraph = new CloneGraph();
        Node clonedGraph = cloneGraph.cloneGraph(node1);

        // Validate the cloned graph structure
        assertNotNull(clonedGraph);
        assertEquals(1, clonedGraph.val);
        assertEquals(2, clonedGraph.neighbors.get(0).val);
        assertEquals(4, clonedGraph.neighbors.get(1).val);

        // Add more validations as needed
    }

    @Test
    public void testCloneGraphExample2() {
        // Create an empty graph
        Node node = null;

        CloneGraph cloneGraph = new CloneGraph();
        Node clonedGraph = cloneGraph.cloneGraph(node);

        // Validate the cloned graph structure for an empty graph
        assertNull(clonedGraph);
        // Add more validations as needed
    }

    @Test
    public void testCloneGraphExample3() {
        // Create an empty graph
        Node[] adjList = {};

        CloneGraph cloneGraph = new CloneGraph();
        Node clonedGraph = cloneGraph.cloneGraph(null);

        // Validate the cloned graph structure for an empty graph
        assertNull(clonedGraph);
        // Add more validations as needed
    }

}
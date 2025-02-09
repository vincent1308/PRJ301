

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class Flowchart {
    public static void main(String[] args) {
        // Create a JFrame to display the flowchart
        JFrame frame = new JFrame("LED Fade Flowchart");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        // Create a graph
        mxGraph graph = new mxGraph();
        Object parent = graph.getDefaultParent();

        graph.getModel().beginUpdate();
        try {
            // Style for the nodes
            Map<String, Object> style = graph.getStylesheet().getDefaultVertexStyle();
            style.put(mxConstants.STYLE_SHAPE, mxConstants.SHAPE_RECTANGLE);
            style.put(mxConstants.STYLE_ROUNDED, true);
            style.put(mxConstants.STYLE_FILLCOLOR, "#e3f2fd");
            style.put(mxConstants.STYLE_STROKECOLOR, "#64b5f6");
            style.put(mxConstants.STYLE_FONTFAMILY, "Arial");
            style.put(mxConstants.STYLE_FONTCOLOR, "#0d47a1");
            style.put(mxConstants.STYLE_ALIGN, mxConstants.ALIGN_CENTER);

            // Create nodes
            Object start = graph.insertVertex(parent, null, "Start", 50, 50, 100, 40);
            Object setup = graph.insertVertex(parent, null, "Setup (Empty)", 50, 150, 140, 40);
            Object fadeIn = graph.insertVertex(parent, null, "Fade In\nfadeValue = 0 to 255", 50, 250, 160, 60);
            Object checkIn = graph.insertVertex(parent, null, "fadeValue <= 255?", 50, 350, 160, 40, "shape=ellipse");
            Object fadeOut = graph.insertVertex(parent, null, "Fade Out\nfadeValue = 255 to 0", 250, 250, 160, 60);
            Object checkOut = graph.insertVertex(parent, null, "fadeValue >= 0?", 250, 350, 160, 40, "shape=ellipse");

            // Create edges
            graph.insertEdge(parent, null, "", start, setup);
            graph.insertEdge(parent, null, "", setup, fadeIn);
            graph.insertEdge(parent, null, "True", fadeIn, checkIn);
            graph.insertEdge(parent, null, "False", checkIn, fadeOut);
            graph.insertEdge(parent, null, "True", fadeOut, checkOut);
            graph.insertEdge(parent, null, "False", checkOut, fadeIn);

        } finally {
            graph.getModel().endUpdate();
        }

        // Add the graph to a component and display it
        mxGraphComponent graphComponent = new mxGraphComponent(graph);
        frame.add(graphComponent);
        frame.setVisible(true);
    }
}

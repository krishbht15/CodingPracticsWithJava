package hackerankDS;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Graphs {
    private class Vertex {
        HashMap<String, Integer> nbrs = new HashMap<>();

    }

    HashMap<String, Vertex> vtces;

    public Graphs() {
        vtces = new HashMap<>();
    }

    public int numVertex() {
        return this.vtces.size();

    }

    public boolean containsVertex(String vName) {

        return vtces.containsKey(vName);
    }

    public void addVertex(String vname) {
        Vertex vertex = new Vertex();
        vtces.put(vname, vertex);
    }

    public void removeVertex(String vname) {
        Vertex vertex = vtces.get(vname);
        if (vertex == null) {
            return;
        }
        ArrayList<String> val = new ArrayList<>(vertex.nbrs.keySet());

        for (String key : val) {
            Vertex vertex1 = vtces.get(key);
            vertex1.nbrs.remove(key);
        }


    }

    public int numEdges() {
        ArrayList<String> keys = new ArrayList<>(vtces.keySet());
        int count = 0;
        for (String key : keys) {
            Vertex vertex = vtces.get(key);
            count = count + vertex.nbrs.size();
        }
        return count / 2;
    }

    public boolean contatinsEdge(String vname1, String vname2) {

        Vertex v1 = vtces.get(vname1);
        Vertex v2 = vtces.get(vname2);

        if (v1 == null || v2 == null || !v1.nbrs.containsKey(vname2)) {
            return false;
        }
        return true;

    }

    public void addEdge(String vname1, String vname2, int cost) {
        Vertex v1 = vtces.get(vname1);
        Vertex v2 = vtces.get(vname2);

        if (v1 == null || v2 == null || v1.nbrs.containsKey(vname2)) {
            return;
        }
        v1.nbrs.put(vname2, cost);
        v2.nbrs.put(vname1, cost);

    }

    public void removeEdge(String vname1, String vname2) {
        Vertex v1 = vtces.get(vname1);
        Vertex v2 = vtces.get(vname2);

        if (v1 == null || v2 == null || !v1.nbrs.containsKey(vname2)) {
            return;
        }
        v1.nbrs.remove(vname2);
        v2.nbrs.remove(vname1);

    }

    static class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();

            for (int i = 0; i < a; i++) {
                String mainn="";
                ArrayList<String> al = new ArrayList<>();
                String temp = "";
                int vertices = scanner.nextInt();
                int avv=scanner.nextInt();
                int clib = scanner.nextInt();
                int croad = scanner.nextInt();

                int[][] data = new int[vertices][2];
                  for (int z = 0; z < avv; z++) {
                    String x = "";
                    for (int j = 0; j < 2; j++) {
                        data[i][j] = scanner.nextInt();
                        x = x + data[i][j];
//                        System.out.println(x);
                    }
                    if (temp.equals("")) {
                        temp = x;
//                        System.out.println(temp);
                    } else {
                        if (temp.contains(x)) {
                            continue;
                        } else if (temp.contains(String.valueOf(data[i][0]))) {
                            temp = temp + data[i][1];
//                            System.out.println(temp+" 0 same");
                        } else if (temp.contains(String.valueOf(data[i][1]))) {
                            temp = temp + data[i][0];
//                            System.out.println(temp+" 1 same");

                        } else {
                            al.add(temp);
                            temp = x;
                            System.out.println(temp);
                        }
                    }

                 }
                al.add(temp);

                int total = 0;
                int check=0;
                for (int j = 0; j < al.size(); j++) {
                    check=check+al.get(j).length();
                    total = total + (al.get(j).length() - 1) * croad + clib;
                }
//                if(check<vertices){
//                    total=total+(vertices-check)*clib;
//                }
//                System.out.println(92*5);
//                System.out.println(Math.min(total, clib * vertices));
//

            }


        }

//        private static int getShortestPath(int vertices, int croad, int clib, int[][] data) {
//
//                Graphs graphs=new Graphs();
//                for (int j = 0; j <vertices ; j++) {
//                    graphs.addVertex(String.valueOf(j));
//                }
//            for (int i = 0; i <data.length; i++) {
//
//                    graphs.addEdge(String.valueOf(data[i][0]),String.valueOf(data[i][1]),croad);
//
//            }
//
//
//
//
//
//        }
    }
}

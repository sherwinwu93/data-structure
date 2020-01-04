package DisjointSets;

public class QuickFindDS implements DisjointSets{
    /** the id of element's no */
    private int[] id;

    public QuickFindDS(int N) {
        id = new int[N];
        for (int i = 0; i < id.length; i += 1) {
            id[i] = i;
        }
    }

    /** Very fast */
    public boolean isConnected(int p, int q) {
        return id[p] == id[q];
    }

    public void connect(int p, int q) {
        int pId = id[p];
        int qId = id[q];
        for (int i = 0; i < id.length; i += 1) {
            if (id[i] == qId) {
                id[i] = pId;
            }
        }
    }
}

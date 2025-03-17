package Array_ArrayList.Q18_matriz;
public class Matriz {
    private float[][] m;

    public Matriz(float a, float b, float c, float d) {
        m = new float[][]{{a, b}, {c, d}};
    }

    public float determinante() {
        return (m[0][0] * m[1][1]) - (m[0][1] * m[1][0]);
    }

    public void imprimir() {
        System.out.println(m[0][0] + " " + m[0][1]);
        System.out.println(m[1][0] + " " + m[1][1]);
    }
}

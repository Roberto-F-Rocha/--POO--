package Array_ArrayList.Q18_Matriz;
public class Demo_Matriz{
    public static void main(String[] args) {
        Matriz mat = new Matriz(1.0f, 2.0f, 3.0f, 4.0f);
        mat.imprimir();
        System.out.println(mat.determinante());
    }
}

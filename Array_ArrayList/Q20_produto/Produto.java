package Array_ArrayList.Q20_Produto;
class Produto {
    public static int produto(int... numeros) {
        int resultado = 1;
        for (int num : numeros) {
            resultado *= num;
        }
        return resultado;
    }
}

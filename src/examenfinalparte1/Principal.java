package examenfinalparte1;


public class Principal {

    int result;
    
    /** Constructor que recoge dos variables y llama al metodo suma();
     * @param num1
     * @param num2
     */
    public Principal(int num1, int num2) {

        result = suma(num1, num2);

    }

    /** Constructor que recoge una variable y llama al metodo suma();
     * @param num1
     */
    public Principal(int num1) {

        result = suma(num1, num1);

    }
    
    /** Constructor por defecto que devuelve -1;
     */
    public Principal() {
        result = -1;
    }
    /** Metodo para retornar la suma de las dos variables enviadas
     * @param sum1
     * @param sum2
     * @return La suma de ambas variables
     */
    public int suma(int sum1, int sum2) {
        return sum1 + sum2;
    }
}


public class Dadito {
    public Dadito(int i) {

    }

    public static void main(String[] args) {
        Dadito dad = new Dadito(6); // Crear un dado de 6 caras
        int numLanzamientos = 5;

        for (int i = 1; i <= numLanzamientos; i++) {
            int resultado = dad.lanzar();
            System.out.println("Lanzamiento " + i + ": " + resultado);
        }
    }

    private int lanzar() {
        return 6;
    }

}


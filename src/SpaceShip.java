public class SpaceShip {
    private String nombre;
    private String matriculaGalatica;
    private float aceleracion;
    private float velocidadX = 0;
    private float velocidadY = 0;
    private int coordenadaX = 0;
    private int getCoordenadaY = 0;
    private int direccionX = 0;
    private int direccionY = 0;

    public SpaceShip(String nombre, String matriculaGalatica, float aceleracion) {
        this.nombre = nombre;
        this.matriculaGalatica = matriculaGalatica;
        this.aceleracion = aceleracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMatriculaGalatica() {
        return matriculaGalatica;
    }

    public void setMatriculaGalatica(String matriculaGalatica) {
        this.matriculaGalatica = matriculaGalatica;
    }

    public float getAceleracion() {
        return aceleracion;
    }

    public void setAceleracion(float aceleracion) {
        this.aceleracion = aceleracion;
    }

    public float getVelocidadX() {
        return velocidadX;
    }

    public void setVelocidadX(float velocidadX) {
        this.velocidadX = velocidadX;
    }

    public float getVelocidadY() {
        return velocidadY;
    }

    public void setVelocidadY(float velocidadY) {
        this.velocidadY = velocidadY;
    }

    public int getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public int getGetCoordenadaY() {
        return getCoordenadaY;
    }

    public void setGetCoordenadaY(int getCoordenadaY) {
        this.getCoordenadaY = getCoordenadaY;
    }

    public int getDireccionX() {
        return direccionX;
    }

    public void setDireccionX(int direccionX) {
        this.direccionX = direccionX;
    }

    public int getDireccionY() {
        return direccionY;
    }

    public void setDireccionY(int direccionY) {
        this.direccionY = direccionY;
    }
}

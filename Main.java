public class Main {
    public static void main(String[] args) {
        Persona alberto= new Persona("Alberto",19,"2345678A","M",170,60);


        Persona toni = new Persona("Toni",49,"1234567l","M",1.73,73);
        toni.calcularIMC();
        toni.esMayorDeEdad();
        toni.comprobarSexo();
        toni.mostrarInfo();
    }
}
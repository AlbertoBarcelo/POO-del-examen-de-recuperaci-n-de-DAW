public class Persona {
    private String nombre;
    private int edad;
    private String dni;
    private String sexo;
    private double altura;
    private double peso;
    public Persona(){
        this.nombre = null;
        this.edad = 0;
        this.dni = null;
        this.sexo = "M";
        this.altura = 0;
        this.peso = 0;
    }
    public Persona(String nombre,int edad, String sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.dni = null;
        this.sexo = sexo;
        this.altura = 0;
        this.peso = 0;
    }
    public Persona(String nombre,int edad,String dni, String sexo, double altura, double peso){
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    public void calcularIMC(){
        System.out.println("------Comprobar IMC-------");
        double IMC = this.peso / (this.altura * this.altura);
        System.out.println(IMC);
    }
    public void esMayorDeEdad(){
        System.out.println("------Comprobar edad-------");
        if (this.edad>=18){System.out.println("Es mayor de edad");}
        else{
            System.out.println("Es menor de edad");}
    }
    public void comprobarSexo(){
        System.out.println("------Comprobar sexo-------");
        if (this.sexo == "M"){
        System.out.println("Es un hombre");}
        else{
        System.out.println("Es una mujer");}
    }

    public void mostrarInfo(){
        System.out.println("------Mostrar Información-------");
        System.out.println("Se llama: "+this.nombre);
        System.out.println("Tiene "+this.edad+" años");
        System.out.println("Tiene el DNI: "+this.dni);
        System.out.println("Su sexo es: "+this.sexo);
        System.out.println("Pesa: "+this.peso);
        System.out.println("Mide: "+this.altura);

    }
}

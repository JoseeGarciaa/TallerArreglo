
public class Alumno {

	
	private String nombre; 
	private String apellido;
	private int semestre; 
    private String jornada; 
    private int identificacion; 
    private float nota;
    
    private float notaMayor;
    
    
    public Alumno() {
    	
    	nombre = "";
    	apellido = "";
    	semestre = 0;
    	jornada = "";
    	identificacion = 0;
    	nota = 0;
    	notaMayor = 0;
    }
    public Alumno(String n, String o, int m, String g, int gg, float p, float s) {
    	nombre = n;
    	apellido = o;
    	semestre = m;
    	jornada = g;
    	identificacion = gg;
    	nota = p; 
    	notaMayor = s;
    }
    

public void setnombre(String n) {
	nombre = n;
}

public String getnombre() {
	return nombre;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public int getSemestre() {
	return semestre;
}

public void setSemestre(int semestre) {
	this.semestre = semestre;
}

public String getJornada() {
	return jornada;
}
public void setJornada(String jornada) {
	this.jornada = jornada;
}
public int getIdentificacion() {
	return identificacion;
}

public void setIdentificacion(int grado) {
	this.identificacion = grado;
}
public float getNota() {
	return nota;
}
public void setNota(float nota) {
	this.nota = nota;
}
public String getApellido() {
	return apellido;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
}
public float getNotaMayor() {
	return notaMayor;
}
public void setNotaMayor(float notaMayor) {
	this.notaMayor = notaMayor;
}









}

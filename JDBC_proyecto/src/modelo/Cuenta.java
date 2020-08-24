package modelo;

public class Cuenta {
    
	/*acceso modificador tipoidentificador nombreidentificador = opcional;
	public|private| final|static tipoprimitivo|objeto nombre;*/
	
	private Integer id;
	private String nombre;
	private String apellido;
/*	private String colorPelo;
	private final String COLORPELOCONST="NEGRO";
	
	
	
	public String getColorPelo() {
		return COLORPELOCONST;
	}
	
	public void setColorPelo(String colorPelo) {
		this.colorPelo = colorPelo;
	}
	*/
	
	
	public Cuenta(Integer id, String nombre, String apellido) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public Cuenta() {}
	
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	@Override
	public String toString() {
		return "Cuenta [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + "]" + "\n";
	}
	
	
	/*
	 * public|private final|static|abstract tipoPrimitivo|Objeto|void nombre(){return tipoObjeto|tipoPrimitivo}
	 * 
	 */
	
	
	
	
	
}

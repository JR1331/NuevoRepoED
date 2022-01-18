
/**
 * Definimos las propiedades de la clase Ccuenta
 * 
 * @author ramon
 *
 */
public class CCuenta {
	/**
	 * Define el nombre del propietario de la cuenta
	 */
	protected String nombre;
	/**
	 * Define que la cuenta va a ser un string
	 */
	private String cuenta;
	/**
	 * Define la cantidad de saldo que tiene
	 */
	private double saldo;
	/**
	 * Define con un número el tipo de interés que tiene la cuenta
	 */
	private double tipoInterés;

	/**
	 * Crea un objeto CCuenta con los valores indicados
	 */
	public CCuenta() {
	}

	/**
	 * Crea un objeto CCuenta con los parametros nombre, cuenta, saldo y tipo de interes
	 * 
	 * @param nom  Nombre del propietario de la cuenta
	 * @param cue  Indica la cuenta en si
	 * @param sal  Indica el valor restante en la cuenta
	 * @param tipo Indica el valor del interés de la cuenta
	 */
	public CCuenta(String nom, String cue, double sal, double tipo) {
		nombre = nom;
		cuenta = cue;
		saldo = sal;
		tipoInterés = tipo;
	}

	/**
	 * Asigan un valor de tipo String a nombre
	 * @param nom Asigna un nombre al atributo nombre del onjeto cuenta
	 */
	public void asignarNombre(String nom) {
		nombre = nom;
	}

	/**
	 * Enseña el valor que hay en nombre
	 * @return Devuelve el valor del atributo nombre
	 */
	public String obtenerNombre() {
		return nombre;
	}

	/**
	 * Enseña el valor guardado en el momento del saldo
	 * @return Devuelve la cantidad de saldo de la cuenta
	 */
	public double estado() {
		return saldo;
	}

	/**
	 * Este método sirve para añadir dinero al saldo de tu cuenta
	 * 
	 * @param cantidad Indica la cantidad que quieres ingresar en la cuenta
	 * @throws Exception En caso de que la cantidad a ingresar sea menor a 0 se
	 *                   indicara que es una operacion erronea
	 */
	public void ingresar(double cantidad) throws Exception {
		if (cantidad < 0) {
			throw new Exception("No se puede ingresar una cantidad negativa");
		}
		setSaldo(saldo + cantidad);
	}

	/**
	 * Sirve para retirar una cantidad de saldo de tu cuenta
	 * 
	 * @param cantidad INdica la cantidad a retirar
	 * @throws Exception Si la cantidad a retirar es menor que 0 o mayor que el
	 *                   saldo de tu cuenta se indicara que es un movimiento erroneo
	 */
	public void retirar(double cantidad) throws Exception {
		if (cantidad < 0) {
			throw new Exception("No se puede retirar una cantidad negativa");
		}
		if (estado() < cantidad) {
			throw new Exception("No se hay suficiente saldo");
		}
		setSaldo(saldo - cantidad);
	}

	/**
	 * Devuelve el valor de la cuenta
	 * @return Te devuelve el valor de tu cuenta
	 */
	public String obtenerCuenta() {
		return cuenta;
	}

	/**
	 * Cambia o asigna un nuvo valor para tu cuenta
	 * 
	 * @param cuenta Cambia el nombre de tu cuenta
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * Cambia o asigna un nuvo valor para tu saldo
	 * 
	 * @param saldo INdica el nuevo saldo
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Indica el tipo de interes de la cuenta
	 * @return Devuelve el tipo de interes de la cuenta
	 */
	public double getTipoInterés() {
		return tipoInterés;
	}

	/**
	 * Cambia o asigna un nuvo valor para tu interes
	 * 
	 * @param tipoInterés Indica el nuevo interes
	 */
	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
}

package model.pojos;

import java.io.Serializable;
import java.util.Objects;

public class Ejercicio implements Serializable {

	private static final long serialVersionUID = -136997167035462939L;

	private String Nombre = null;
	private String Descripcion = null;
	private int IdWorkout = 0;

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public int getIdWorkout() {
		return IdWorkout;
	}

	public void setIdWorkout(int idWorkout) {
		IdWorkout = idWorkout;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Descripcion, IdWorkout, Nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ejercicio other = (Ejercicio) obj;
		return Objects.equals(Descripcion, other.Descripcion) && IdWorkout == other.IdWorkout
				&& Objects.equals(Nombre, other.Nombre);
	}

	@Override
	public String toString() {
		return "Ejercicio [Nombre=" + Nombre + ", Descripcion=" + Descripcion + ", IdWorkout=" + IdWorkout + "]";
	}

}
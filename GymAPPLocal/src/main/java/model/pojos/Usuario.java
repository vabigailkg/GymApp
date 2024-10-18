package model.pojos;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Usuario implements Serializable {

	private static final long serialVersionUID = 2725639723091708069L;

	private String Nombre = null;
	private String Apellidos = null;
	private String Contraseña = null;
	private String Email = null;
	private Boolean EsAdmin;
	private Date FechaNacimiento = null;

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}

	public String getContraseña() {
		return Contraseña;
	}

	public void setContraseña(String contraseña) {
		Contraseña = contraseña;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public Boolean getEsAdmin() {
		return EsAdmin;
	}

	public void setEsAdmin(Boolean esAdmin) {
		EsAdmin = esAdmin;
	}

	public Date getFechaNacimiento() {
		return FechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		FechaNacimiento = fechaNacimiento;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Apellidos, Contraseña, Email, EsAdmin, FechaNacimiento, Nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(Apellidos, other.Apellidos) && Objects.equals(Contraseña, other.Contraseña)
				&& Objects.equals(Email, other.Email) && Objects.equals(EsAdmin, other.EsAdmin)
				&& Objects.equals(FechaNacimiento, other.FechaNacimiento) && Objects.equals(Nombre, other.Nombre);
	}

	@Override
	public String toString() {
		return "Usuario [Nombre=" + Nombre + ", Apellidos=" + Apellidos + ", Contraseña=" + Contraseña + ", Email="
				+ Email + ", EsAdmin=" + EsAdmin + ", FechaNacimiento=" + FechaNacimiento + "]";
	}

}
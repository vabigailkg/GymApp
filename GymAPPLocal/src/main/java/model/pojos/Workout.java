package model.pojos;

import java.io.Serializable;
import java.util.Objects;

public class Workout implements Serializable {

	private static final long serialVersionUID = -9048566874196902603L;

	private String Nivel = null;
	private String Nombre = null;
	private int NºEjercicios = 0;
	private String UrlVide0 = null;

	public String getNivel() {
		return Nivel;
	}

	public void setNivel(String nivel) {
		Nivel = nivel;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public int getNºEjercicios() {
		return NºEjercicios;
	}

	public void setNºEjercicios(int nºEjercicios) {
		NºEjercicios = nºEjercicios;
	}

	public String getUrlVide0() {
		return UrlVide0;
	}

	public void setUrlVide0(String urlVide0) {
		UrlVide0 = urlVide0;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Nivel, Nombre, NºEjercicios, UrlVide0);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Workout other = (Workout) obj;
		return Objects.equals(Nivel, other.Nivel) && Objects.equals(Nombre, other.Nombre)
				&& NºEjercicios == other.NºEjercicios && Objects.equals(UrlVide0, other.UrlVide0);
	}

	@Override
	public String toString() {
		return "Workout [Nivel=" + Nivel + ", Nombre=" + Nombre + ", NºEjercicios=" + NºEjercicios + ", UrlVide0="
				+ UrlVide0 + "]";
	}

}
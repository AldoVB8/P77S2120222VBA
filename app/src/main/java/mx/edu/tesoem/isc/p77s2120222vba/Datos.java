package mx.edu.tesoem.isc.p77s2120222vba;

import android.os.Parcel;
import android.os.Parcelable;

public class Datos implements Parcelable {
    String nombre;
    int edad;

    public Datos(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Datos() {

    }

    protected Datos(Parcel in) {
        nombre = in.readString();
        edad = in.readInt();
    }

    public static final Creator<Datos> CREATOR = new Creator<Datos>() {
        @Override
        public Datos createFromParcel(Parcel in) {
            return new Datos(in);
        }

        @Override
        public Datos[] newArray(int size) {
            return new Datos[size];
        }
    };

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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(nombre);
        parcel.writeInt(edad);
    }
}

package Entidades;

public class Fecha {

      private String dia, mes, año, fecha, amPm;
      private int horas, minutos;

      public Fecha(String dia, String mes, String año, int horas, int minutos) {
            this.dia = dia;
            this.mes = mes;
            this.año = año;
            this.horas = horas;
            this.minutos = minutos;
      }

      public Fecha() {
      }

      //Metodos
      public void crearFecha() {
            //Mando a llamar las funciones de abajo
            this.convertirFomatoHoras();
            this.modificarMinutos();
      }

      private void convertirFomatoHoras() {
            //Si es mayor de 13 (Es decir, si son las 1 PM o más tarde, se pone PM).
            if (this.horas >= 13) {
                  this.horas -= 12;
                  this.amPm = "PM";
            } else {
                  //SI es antes del medio dia, es AM.
                  this.amPm = "AM";
            }

      }

      private void modificarMinutos() {
            //Esto se podria  m e j o r a r  pero me da hueva.
            if (this.minutos <= 9) {
                  this.fecha = this.getDia() + "/ " + this.getMes() + "/ " + this.getAño() + " | Hora:  " + String.valueOf(this.getHoras()) + ":0" + this.getMinutos() + this.amPm;
            } else {
                  this.fecha = this.getDia() + "/ " + this.getMes() + "/" + this.getAño() + "  | Hora:  " + String.valueOf(this.getHoras()) + ":" + this.getMinutos() + this.amPm;
            }
      }

      //Getters
      public String getDia() {
            return dia;
      }

      public String getMes() {
            return mes;
      }

      public String getAño() {
            return año;
      }

      public String getFecha() {
            return fecha;
      }

      public int getHoras() {
            return horas;
      }

      public int getMinutos() {
            return minutos;
      }

      //Setters
      public void setDia(String dia) {
            this.dia = dia;
      }

      public void setMes(String mes) {
            this.mes = mes;
      }

      public void setAño(String año) {
            this.año = año;
      }

      public void setFecha(String fecha) {
            this.fecha = fecha;
      }

      public void setHoras(int hora) {
            this.horas = hora;
      }

      public void setMinutos(int minutos) {
            this.minutos = minutos;
      }

}

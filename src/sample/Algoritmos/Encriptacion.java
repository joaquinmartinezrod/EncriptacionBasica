package sample.Algoritmos;

public class Encriptacion {
    String encriptado="";
    String desencriptado="";
    String cadena="";

    public void setEncriptado() {
        encriptado = cadena;
    }

    public String getDesencriptado() {
        return desencriptado;
    }

    public void setDesencriptado(String desencriptado) {
        this.desencriptado = desencriptado;
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }


    //CODIGO PARA DESENCRIPTAR Y ENCRIPTAR LA CADENA
   public void encriptar(){
        encriptado = (String) encriptado.replace("a","🖤");
        encriptado = (String) encriptado.replace("e","💜");
        encriptado = (String) encriptado.replace("i","💛");
        encriptado = (String) encriptado.replace("o","💚");
        encriptado = (String) encriptado.replace("u","💙");

    }
    public void encriptar2(){
        encriptado = (String) encriptado.replace("a","*");
        encriptado = (String) encriptado.replace("e","/");
        encriptado = (String) encriptado.replace("i","=");
        encriptado = (String) encriptado.replace("o","+");
        encriptado = (String) encriptado.replace("u","&");

    }
    public void desencriptar(){
        encriptado = (String) encriptado.replace("🖤","a");
        encriptado = (String) encriptado.replace("💜","e");
        encriptado = (String) encriptado.replace("💛","i");
        encriptado = (String) encriptado.replace("💚","o");
        encriptado = (String) encriptado.replace("💙","u");
    }
    public String getEncriptado() {
        return encriptado;
    }


}

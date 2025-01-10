package cap03.data;

public class Data {
    private int mes;
    private int dia;
    private int ano;

    public Data(int mes, int dia, int ano) {
       setMes(mes);
       setDia(dia);
       setAno(dia);
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if(mes > 0 && mes <= 12){
            this.mes = mes;
        }else {
            System.out.println("Mês inválido! Definindo para 1.");
            this.mes = 1;
        }

    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if(dia > 0 && dia <= 31){
            this.dia = dia;
        }else{
            System.out.println("Dia inválido! Definindo para 1.");
            this.dia = 1;
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
       if(ano > 0){
           this.ano = ano;
       }else {
           System.out.println("Ano inválido! Definindo para 2000.");
           this.ano = 2000;
       }
    }

    public void displayData(){
        System.out.printf("%02d/%02d/%04d%n", dia, mes, ano); // Formata com zeros à esquerda
    }
}

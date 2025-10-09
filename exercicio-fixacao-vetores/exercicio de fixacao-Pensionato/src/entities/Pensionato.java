package entities;

public class Pensionato {
    private String nome;
    private String email;

    public Pensionato(String nome,String email){
        this.nome = nome;
        this.email = email;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public static void busyRooms(Pensionato[] pessoas){
        for(int i =0;i<pessoas.length;i++){
            if (pessoas[i] != null) {
                System.out.println(i+": "+pessoas[i].nome+", "+pessoas[i].email);
            }
        }
    }
    
}

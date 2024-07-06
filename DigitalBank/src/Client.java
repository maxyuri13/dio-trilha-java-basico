import java.util.Objects;

public class Client {
    private String name; 
    private String cpf; 
    private String address; 

    
    public Client() {
    }

    public Client(String name, String cpf, String address) {
        this.name = name;
        this.cpf = cpf;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(name, client.name) &&
               Objects.equals(cpf, client.cpf) &&
               Objects.equals(address, client.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cpf, address);
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", cpf='" + cpf + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

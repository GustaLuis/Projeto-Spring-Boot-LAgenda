package br.com.luis.repository;


import br.com.luis.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

//para comunicação com o banco de dados
public interface ContactRepository extends JpaRepository<Contact,Long> {

}

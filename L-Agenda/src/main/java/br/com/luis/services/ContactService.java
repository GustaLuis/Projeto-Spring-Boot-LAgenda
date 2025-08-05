package br.com.luis.services;

import br.com.luis.exception.ResourceNotFoundException;
import br.com.luis.model.Contact;
import br.com.luis.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class ContactService {

    //usado para gerar IDs únicos para os contatos
    private final AtomicLong counter = new AtomicLong();

    private Logger logger = Logger.getLogger(ContactService.class.getName());

    /* Aqui você pode adicionar métodos para gerenciar contatos,
    como criar, atualizar, excluir e listar contatos.*/

    @Autowired
    ContactRepository repository;

    public List<Contact> findAll() {
        logger.info("Finding all contacts!");
        return repository.findAll();
    }

    public Contact findById(Long id) {
        logger.info("Finding contact by ID!");
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No records found for this ID!"));

    }

    public Contact create(Contact contact) {
        logger.info("Creating contact!");
        return repository.save(contact);
    }

    public Contact update(Contact contact) {
        logger.info("Updating contact!");

        Contact entity = repository.findById(contact.getId())
                .orElseThrow(() -> new ResourceNotFoundException("No records found for this ID!"));

        // Atualiza os campos do contato com os novos valores
        entity.setNome(contact.getNome());
        entity.setTelefone(contact.getTelefone());
        entity.setEmail(contact.getEmail());

        return repository.save(entity);
    }

    public void delete(Long id) {
        logger.info("Deleting contact!");
        Contact entity = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No records found for this ID!"));
        repository.delete(entity);
    }
}

package org.jjad.repositories;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.jjad.entities.Product;

import java.util.List;

@ApplicationScoped
public class ProductRepository {

    private EntityManager entityManager;

    @Inject
    public  ProductRepository(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    @Transactional
    public void createProduct(Product product){
        this.entityManager.persist(product);
    }

    @Transactional
    public void deleteProduct(Product product){
        this.entityManager.remove(product);
    }

    @Transactional
    public List<Product> listProducts(){
        return this.entityManager.createQuery("select p from Product p").getResultList();
    }

}

package org.jjad;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.jboss.resteasy.annotations.ResponseObject;
import org.jjad.entities.Product;
import org.jjad.repositories.ProductRepository;

import java.util.List;

@Path("/api/v1/product")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProductResource {

    private ProductRepository productRepository;

    @Inject
    public ProductResource(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    @POST
    public Response add(Product product){
        this.productRepository.createProduct(product);
        return Response.ok().build();
    }

    @GET
    public List<Product> products() {
        return this.productRepository.listProducts();
    }
}

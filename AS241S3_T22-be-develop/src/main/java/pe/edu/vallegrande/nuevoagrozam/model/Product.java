package pe.edu.vallegrande.nuevoagrozam.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_product")
    private Long idProduct;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "product_description")
    private String productDescription;

    @Column(name = "expiration_date")
    private LocalDate expirationDate;

    @Column(name = "unit_if_measure")
    private String unitOfMeasure;

    @Column(name = "product_price")
    private Double productPrice;

    @Column(name = "admission_date")
    private LocalDate admissionDate;

    @Column(name = "current_stock")
    private String currentStock;

    @Column(name = "state")
    private String state;
}

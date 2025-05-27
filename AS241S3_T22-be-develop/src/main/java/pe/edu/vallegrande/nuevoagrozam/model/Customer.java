package pe.edu.vallegrande.nuevoagrozam.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Integer customerId;

    @Column(name = "customer_name")
    private String customerName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "customer_address")
    private String customerAddress;

    @Column(name = "phone")
    private String phone;

    @Column(name = "email")
    private String email;

    @Column(name = "doc_number")
    private String docNumber;

    @Column(name = "state")
    private String state;

    @Column(name = "document_type")
    private String documentType;
}

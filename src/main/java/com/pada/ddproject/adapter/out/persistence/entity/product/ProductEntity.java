package com.pada.ddproject.adapter.out.persistence.entity.product;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.SortNatural;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

@SuppressWarnings("java:S1068") // Suppress warning about unused private fields until logic is implemented
@Entity
@Getter
@Setter
@Builder
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "product")
public class ProductEntity {

    @Id
    @SequenceGenerator(name = "product_id_sequence", sequenceName = "product_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_id_sequence")
    private Long productId;

    private String title;

    private String description;

    private String brand;

    private String category;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY, orphanRemoval = true)
    @Builder.Default // what for
    private List<VariationEntity> variations = new ArrayList<>();

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY, orphanRemoval = true)
    @Builder.Default
    private List<CertificationEntity> certifications  = new ArrayList<>();

    private Boolean isGlobalListing;

    @SortNatural
    @Builder.Default
    //Preventing loop in hashCode
    //see more: https://stackoverflow.com/a/68605588
    @EqualsAndHashCode.Exclude
    // Good practice - use Set in ManyToMany
    // Good practice - Cascade.ALL makes no sense in ManyToMany, may be even harmful
    // https://vladmihalcea.com/the-best-way-to-use-the-manytomany-annotation-with-jpa-and-hibernate/
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    @JoinTable(name = "product__available_currencies",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "available_currency_id"))
    private SortedSet<CurrencyEntity> availableCurrencies = new TreeSet<>();

    @SortNatural
    @Builder.Default
    @EqualsAndHashCode.Exclude
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    @JoinTable(name = "product__shipping_countries",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "shipping_country_id"))
    private SortedSet<ShippingCountryEntity> shippingCountries = new TreeSet<>();

    //Good practice - bidirectional ManyToOne
    //https://medium.com/@rajibrath20/the-best-way-to-map-a-onetomany-relationship-with-jpa-and-hibernate-dbbf6dba00d3
    @ManyToOne(fetch = FetchType.LAZY)
    private ProductCatalogEntity productCatalog;

}

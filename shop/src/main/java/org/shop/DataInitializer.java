package org.shop;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * The main Data Initializer util class.
 */
@Named
public class DataInitializer {

    /** The seller initializer. */
    @Inject
    private SellerInitializer sellerInitializer;
    
    /** The product initializer. */
    @Inject
    private ProductInitializer productInitializer;
    
    /** The proposal initializer. */
    @Inject
    private ProposalInitializer proposalInitializer;
    
    /** The user initializer. */
    @Inject
    private UserInitializer userInitializer;

    /**
     * Inits the data.
     */
    @PostConstruct
    public void initData() {
        sellerInitializer.initSellers();
        userInitializer.initUsers();
        productInitializer.initProducts();
        proposalInitializer.initProposals();
    }
    
    /**
     * Sets the seller initializer.
     *
     * @param sellerInitializer the new seller initializer
     */
    public void setSellerInitializer(SellerInitializer sellerInitializer) {
        this.sellerInitializer = sellerInitializer;
    }

    /**
     * Sets the product initializer.
     *
     * @param productInitializer the new product initializer
     */
    public void setProductInitializer(ProductInitializer productInitializer) {
        this.productInitializer = productInitializer;
    }

    /**
     * Sets the proposal initializer.
     *
     * @param proposalInitializer the new proposal initializer
     */
    public void setProposalInitializer(ProposalInitializer proposalInitializer) {
        this.proposalInitializer = proposalInitializer;
    }

    /**
     * Sets the user initializer.
     *
     * @param userInitializer the new user initializer
     */
    public void setUserInitializer(UserInitializer userInitializer) {
        this.userInitializer = userInitializer;
    }
}

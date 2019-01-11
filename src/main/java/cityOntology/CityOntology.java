package cityOntology;

import agents.DataGenerator;
import jade.content.onto.BasicOntology;
import jade.content.onto.Ontology;
import jade.content.onto.OntologyException;
import jade.content.schema.ConceptSchema;

public class CityOntology extends Ontology {

    // The name identifying this ontology
    public static final String ONTOLOGY_NAME = "CityOntology";

    // VOCABULARY
    public static final String BANNER = "Banner";
    public static final String NODE_NUMBER = "NodeNumber";
    public static final String POPULATION = "Population";
    public static final String TIME_FRAME = "TimeFrame";
    public static final String IS_SOLD = "BannerSold";

    public static final String ADVERTISEMENT_SELLER = "Seller";
    public static final String SELLER_NAME = "SellerName";
    public static final String SELLER_BANNER = "SellerBanner";
    public static final String SELLER_SUBSCRIPTION_COST = "SubscriptionCost";
    public static final String SELLER_SUBSCRIBENTS = "Subscribents";
    public static final String SELLER_AUCTION_WINNER = "AuctionWinner";

    public static final String ADVERTISEMENT_BUYER = "Buyer";
    public static final String BUYER_SUBSCRIPTION_OFFER = "SubscriptionOffer";
    public static final String BUYER_SUBSCRIBED_BANNERS = "SubscribedBanners";

    public static final String DATA_GENERATOR = "DataGenerator";
    public static final String DATA_GENERATOR_NAME = "Name";
    public static final String DATA_GENERATOR_POPULATION = "Population";
    public static final String DATA_GENERATOR_LOCAL_BANNERS = "LocalBanners";

    // The singleton instance of this ontology
    private static Ontology theInstance = new CityOntology();

    // This is the method to access the singleton music shop ontology object
    public static Ontology getInstance() {
        return theInstance;
    }

    public CityOntology() {
        super(ONTOLOGY_NAME, BasicOntology.getInstance());

        try {
            add(new ConceptSchema(BANNER ), Banner.class);
            add(new ConceptSchema(NODE_NUMBER ), NodeNumber.class);
            add(new ConceptSchema(POPULATION ), Population.class);
            add(new ConceptSchema(TIME_FRAME ), TimeFrame.class);
            add(new ConceptSchema(IS_SOLD ), IsSold.class);
            add(new ConceptSchema(ADVERTISEMENT_SELLER), SellerAdvertisement.class);
            add(new ConceptSchema(SELLER_NAME ), SellerName.class);
            add(new ConceptSchema(SELLER_BANNER ), SellerBanner.class);
            add(new ConceptSchema(SELLER_SUBSCRIPTION_COST), SubscriptionCost.class);
            add(new ConceptSchema(SELLER_SUBSCRIBENTS ), Subscribents.class);
            add(new ConceptSchema(SELLER_AUCTION_WINNER ), AuctionWinner.class);
            add(new ConceptSchema(ADVERTISEMENT_BUYER), BuyerAdvertisement.class);
            add(new ConceptSchema(BUYER_SUBSCRIPTION_OFFER ), SubscriptionOffer.class);
            add(new ConceptSchema(BUYER_SUBSCRIBED_BANNERS ), SubscribedBanners.class);
            add(new ConceptSchema(DATA_GENERATOR ), DataGenerator.class);
            add(new ConceptSchema(DATA_GENERATOR_NAME ), GeneratorName.class);
            add(new ConceptSchema(DATA_GENERATOR_POPULATION ), Population.class);
            add(new ConceptSchema(DATA_GENERATOR_LOCAL_BANNERS ), LocalBanners.class);

        }
        catch (OntologyException oe){
            oe.printStackTrace();
        }
    }
}

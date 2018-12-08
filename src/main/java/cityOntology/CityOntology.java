package cityOntology;

import agents.HelloAgent;
import jade.content.onto.*;
import jade.content.schema.ConceptSchema;

public class CityOntology extends Ontology {

    // The name identifying this ontology
    public static final String ONTOLOGY_NAME = "CityOntology";

    // VOCABULARY
    public static final String OFFER = "Offer";
    public static final String AUCTION = "Auction";

    public static final String BANNER = "Banner";
    public static final String BANNER_SELLER = "Seller";
    public static final String BANNER_BUYER = "Buyer";
    public static final String BANNER_SOLD = "BannerSold";
    public static final String BANNER_WINNER = "BannerWinner";

    public static final String BANNER_SUBSCRIPTION_COST = "BannerSubscriptionCost";
    public static final String BUYER_SUBSCRIPTION_OFFER = "BuyerSubscriptionOffer";

    public static final String TRAFFIC_NODE = "TrafficNode";
    public static final String POPULATION = "Population";


    // The singleton instance of this ontology
    private static Ontology theInstance = new CityOntology();

    // This is the method to access the singleton music shop ontology object
    public static Ontology getInstance() {
        return theInstance;
    }

    public CityOntology() {
        super(ONTOLOGY_NAME, BasicOntology.getInstance());

        try {
            add(new ConceptSchema(OFFER), Offer.class);
            add(new ConceptSchema(AUCTION), Auction.class);
            add(new ConceptSchema(BANNER), Banner.class);
            add(new ConceptSchema(BANNER_BUYER), BannerBuyer.class);
            add(new ConceptSchema(BANNER_SELLER), BannerSeller.class);
            add(new ConceptSchema(BANNER_SOLD), BannerSold.class);
            add(new ConceptSchema(BANNER_WINNER), BannerWinner.class);
            add(new ConceptSchema(BANNER_SUBSCRIPTION_COST), BannerSubscriptionCost.class);
            add(new ConceptSchema(BUYER_SUBSCRIPTION_OFFER), BuyerSubscriptionOffer.class);
            add(new ConceptSchema(TRAFFIC_NODE), TrafficNode.class);
            add(new ConceptSchema(POPULATION), Population.class);


        }
        catch (OntologyException oe){
            oe.printStackTrace();
        }
    }
}

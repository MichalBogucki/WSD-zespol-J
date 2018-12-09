package controllers;

import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.wrapper.AgentController;
import jade.wrapper.ContainerController;
import jade.wrapper.StaleProxyException;

public class CityContainer {
    private static CityContainer ourInstance = new CityContainer();

    public static CityContainer getInstance() {
        return ourInstance;
    }

    public CityContainer addAgent(String nickname, String className) {
        jade.core.Runtime runtime = jade.core.Runtime.instance();
        Profile profile = new ProfileImpl();
        profile.setParameter(Profile.CONTAINER_NAME, "CityContainer");
        profile.setParameter(Profile.MAIN_HOST, "localhost");
        ContainerController container = runtime.createAgentContainer(profile);
        try {
            AgentController ag = container.createNewAgent(nickname,
                    className,
                    new Object[]{});
            ag.start();
        } catch (StaleProxyException e) {
            e.printStackTrace();
        }
        return getInstance();
    }

    private CityContainer() {
    }
}

package controllers;

import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.wrapper.AgentController;
import jade.wrapper.ContainerController;
import jade.wrapper.StaleProxyException;

public class AgentMainController {
    private static AgentMainController ourInstance = new AgentMainController();

    public static AgentMainController getInstance() {
        return ourInstance;
    }

    public AgentMainController addAgent(String nickname, String className) {
        jade.core.Runtime runtime = jade.core.Runtime.instance();
        Profile profile = new ProfileImpl();
        profile.setParameter(Profile.CONTAINER_NAME, "TestContainer");
        profile.setParameter(Profile.MAIN_HOST, "localhost");
        ContainerController container = runtime.createAgentContainer(profile);
        try {
//            classname powinno miec forme "my.agent.package.AgentClass"
            AgentController ag = container.createNewAgent(nickname,
                    className,
                    new Object[]{});
            ag.start();
        } catch (StaleProxyException e) {
            e.printStackTrace();
        }
        return getInstance();
    }

    private AgentMainController() {
    }
}

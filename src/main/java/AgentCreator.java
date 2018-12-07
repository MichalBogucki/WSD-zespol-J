import jade.core.ProfileImpl;
import jade.wrapper.AgentContainer;
import jade.wrapper.AgentController;
import jade.core.Runtime;
import jade.wrapper.ContainerController;

public class AgentCreator {
    Runtime rt = Runtime.instance();
    ProfileImpl p = new ProfileImpl(false);
    AgentController anotherName=null;
    AgentContainer container =rt.createMainContainer(p);
    container.
    anotherName = container.createNewAgent("Agent1", "jade.Agent1", null);
    anotherName.start();
}

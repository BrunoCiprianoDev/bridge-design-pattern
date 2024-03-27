import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.example.clients.Client;
import com.example.clients.IndividualClient;
import com.example.levels.Basic;
import com.example.levels.Premium;
import com.example.levels.Vip;

import static com.example.clients.IndividualClient.OVERDRAFT_FROM_INDIVIDUAL_CLIENT;

public class IndividualClientTest {

  @Test
  public void testCalculateOverdraftBasic() {
    Client client = new IndividualClient(new Basic());
    assertEquals(OVERDRAFT_FROM_INDIVIDUAL_CLIENT, client.calculateOverdraftBase());
  }

  @Test
  public void testCalculateOverdraftPremium() {
    Client client = new IndividualClient(new Premium());
    assertEquals(OVERDRAFT_FROM_INDIVIDUAL_CLIENT * 1.2f, client.calculateOverdraftBase());
  }

  @Test
  public void testCalculateOverdraftVip() {
    Client client = new IndividualClient(new Vip());
    assertEquals(OVERDRAFT_FROM_INDIVIDUAL_CLIENT * 1.4f, client.calculateOverdraftBase());
  }

}

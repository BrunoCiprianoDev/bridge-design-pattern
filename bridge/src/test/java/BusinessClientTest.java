import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.example.clients.BusinessClient;
import com.example.clients.Client;
import com.example.levels.Basic;
import com.example.levels.Premium;
import com.example.levels.Vip;

import static com.example.clients.BusinessClient.OVERDRAFT_FROM_BUSINESS_CLIENT;

public class BusinessClientTest {

  @Test
  public void testCalculateOverdraftBasic() {
    Client client = new BusinessClient(new Basic());
    assertEquals(OVERDRAFT_FROM_BUSINESS_CLIENT, client.calculateOverdraftBase());
  }

  @Test
  public void testCalculateOverdraftPremium() {
    Client client = new BusinessClient(new Premium());
    assertEquals(OVERDRAFT_FROM_BUSINESS_CLIENT * 1.2f, client.calculateOverdraftBase());
  }

  @Test
  public void testCalculateOverdraftVip() {
    Client client = new BusinessClient(new Vip());
    assertEquals(OVERDRAFT_FROM_BUSINESS_CLIENT * 1.4f, client.calculateOverdraftBase());
  }

}

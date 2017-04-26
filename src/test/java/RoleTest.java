import org.junit.Test;

import static org.junit.Assert.*;

public class RoleTest {
    @Test
    public void should_create_the_right_player_with_index() {
        Role QianFurenPlayer = new Role(1);
        Role ATuBoPlayer = new Role(2);
        Role SunXiaoMeiPlayer = new Role(3);
        Role JinBeiBeiPlayer = new Role(4);

        assertEquals("QianFuren", QianFurenPlayer.Name);
        assertEquals("ATuBo", ATuBoPlayer.Name);
        assertEquals("SunXiaomei", SunXiaoMeiPlayer.Name);
        assertEquals("JinBeibei", JinBeiBeiPlayer .Name);
    }
}
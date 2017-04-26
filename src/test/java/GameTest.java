import org.junit.Test;
import sun.jvm.hotspot.utilities.Assert;

import static junit.framework.TestCase.assertEquals;

public class GameTest {

    Game game = new Game();

    @Test
    public void should_initialize_map(){

        game.init();
        assertEquals(game.GameMap.size(), 70);
    }
}

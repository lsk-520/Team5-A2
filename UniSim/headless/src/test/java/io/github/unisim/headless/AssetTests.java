package io.github.unisim.headless;

import com.badlogic.gdx.Gdx;
import io.github.unisim.ui.BuildingMenu;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AssetTests {
    @Test
    public void testCanteenAssetExists() {
        HeadlessLauncher.main(new String[0]);
        assertTrue(Gdx.files.internal(BuildingMenu.buildings.get(0).texture).exists(),
            "The asset for the canteen building should be available");
    }
}

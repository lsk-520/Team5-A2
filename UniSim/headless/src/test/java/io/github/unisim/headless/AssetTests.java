package io.github.unisim.headless;

import com.badlogic.gdx.Gdx;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AssetTests {
    @Test
    public void testLibraryExists() {
        HeadlessLauncher.main(new String[0]);
        assertTrue(Gdx.files.internal("library.png").exists(), "The asset for the Library Building should be available");
    }
}

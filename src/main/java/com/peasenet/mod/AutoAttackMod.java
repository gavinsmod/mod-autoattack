package com.peasenet.mod;

import com.peasenet.main.GavinsMod;
import com.peasenet.mods.combat.ModAutoAttack;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AutoAttackMod implements ModInitializer {

    /**
     * Runs the mod initializer.
     */
    @Override
    public void onInitialize() {
        GavinsMod.addMod(new ModAutoAttack());
    }
}
